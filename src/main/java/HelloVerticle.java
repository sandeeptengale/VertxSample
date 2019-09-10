import io.vertx.core.Vertx;

public class HelloVerticle {
    public static void main(String[] args) {
        System.out.println("Hello");
        Vertx.vertx()
                .createHttpServer()
                .requestHandler(req -> req.response().end("Hello world"))
                .listen(8080, handler -> {
                    if (handler.succeeded()) {
                        System.out.println("http://localhost:8080");
                    } else {
                        System.err.println("Failed to Listen to 8080");
                    }
                });
    }
}
