public class _03_EnhancedDepricatedAnnot {
    @Deprecated(since = "9", forRemoval = true)
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }

    public static void main(String[] args) {
        _03_EnhancedDepricatedAnnot demo = new _03_EnhancedDepricatedAnnot();
        demo.oldMethod(); // Warning: This method is deprecated
    }
}
