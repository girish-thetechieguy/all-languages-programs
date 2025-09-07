
// javac --enable-preview --release 24 FlexibleConstructor.java
// java --enable-preview FlexibleConstructor

public class _02_FlxibleConstructorBody {
	private final String name;

	// New: we can place code *before* calling super/this
	public _02_FlxibleConstructorBody(String name) {
		System.out.println("Validating name before calling super/this");
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Name cannot be blank");
		}
		this.name = name;
	}

	public static void main(String[] args) {
		new _02_FlxibleConstructorBody("Java 24"); // Works fine-- O/P Validating name before calling super/this
		// new FlexibleConstructor("");     // Throws exception before init -- No constructor
	}
}
