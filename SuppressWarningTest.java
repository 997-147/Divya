// Java program to illustrate suppress warning annotation

// Class 1
class DeprecatedTest {
    @Deprecated
    public void display() {
        System.out.println("Deprecatedtest display()");
    }
}

// Class 2
class SuppressWarningTest {
  
    @SuppressWarnings({"checked", "deprecation"})
    public static void main(String []args) {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.display();
    }
}
