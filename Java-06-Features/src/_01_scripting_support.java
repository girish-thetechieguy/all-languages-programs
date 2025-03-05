import javax.script.*;
public class _01_scripting_support {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        try {
            // Evaluate a JavaScript expression
            String script = "var x = 10; var y = 20; x + y;";
            Object result = engine.eval(script);
            System.out.println("Result of script: " + result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
