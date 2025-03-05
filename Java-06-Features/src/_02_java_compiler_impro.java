import javax.tools.*;
import java.io.*;
import java.util.Arrays;

public class _02_java_compiler_impro {
    public static void main(String[] args) {
        String source = "public class HelloWorld { public static void main(String[] args) { " +
                "System.out.println(\"Hello, World!\"); } }";
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager
                (null, null, null);

        try (Writer writer = new StringWriter()) {
            // Create a source file
            Iterable<? extends JavaFileObject> compilationUnits = fileManager.
                    getJavaFileObjectsFromStrings(Arrays.asList("HelloWorld.java"));
            compiler.getTask(writer, fileManager, null, null, null, 
                    compilationUnits).call();

            // Output compilation results
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
