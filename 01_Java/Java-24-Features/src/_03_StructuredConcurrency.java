// javac --enable-preview --release 24 StructuredConcurrency.java
// java --enable-preview StructuredConcurrency

import java.util.concurrent.*;
import java.util.concurrent.StructuredTaskScope;

public class _03_StructuredConcurrency {
	static String fetchUser() throws InterruptedException {
		Thread.sleep(200); // Simulate delay
		return "User: Alice";
	}

	static String fetchOrder() throws InterruptedException {
		Thread.sleep(300); // Simulate delay
		return "Order: #1234";
	}

	public static void main(String[] args) throws Exception {
		try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
			StructuredTaskScope.Subtask<String> user  = scope.fork(() -> fetchUser());
			StructuredTaskScope.Subtask<String> order = scope.fork(() -> fetchOrder());

			scope.join();            // Wait for both
			scope.throwIfFailed();   // Propagate errors if any

			System.out.println(user.get() + " | " + order.get());
		}
	}
}

// OP: User: Alice | Order: #1234