// Compile and run with:
// javac --enable-preview --release 24 PatternSwitch.java
// java --enable-preview PatternSwitch

public class _01_PrimitivePatternMatchSwitch {
	public static void main(String[] args) {
		Object value = 42;

		// Pattern matching works for primitives as well
		String result = switch (value) {
			case Integer i -> "Integer: " + (i * 2);
			case Long l    -> "Long: " + l;
			case Double d  -> "Double: " + (d / 2);
			default        -> "Unknown type";
		};

		System.out.println(result); // Output: Integer: 84
	}
}

// Out put:  Integer: 84
