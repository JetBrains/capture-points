import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> run = CompletableFuture.runAsync(() -> {
            System.out.println("run"); // set a breakpoint here
        });
        CompletableFuture.<String>supplyAsync(() -> {
            return "hello"; // set a breakpoint here
        })
                .thenAcceptAsync(s -> {
                    new Exception().printStackTrace(); // set a breakpoint here
                })
                .thenRunAsync(() -> {
                    System.out.println("ds"); // set a breakpoint here
                }).get();
    }
}
