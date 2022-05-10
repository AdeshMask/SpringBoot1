import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class Handlers {
    public static class RootHandler implements HttpHandler {
        public void handle(HttpExchange exchange) throws IOException {
            String responce = "<h1>Server Start Success if you see this message</h1>" + "<h1>Port: "+ SimpleHttpServer.port+"</h1>";
            exchange.sendResponseHeaders(200,responce.length());
            OutputStream os = exchange.getResponseBody();
            os.write(responce.getBytes());
            os.close();
        }
    }

    public static class EchoHeaderHandler implements HttpHandler {
        
    }
}
