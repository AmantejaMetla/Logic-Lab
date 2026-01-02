package mypackage;

public class AccessDemo {
    public void publicMethod() {
        System.out.println("Public method");
    }
    
    protected void protectedMethod() {
        System.out.println("Protected method");
    }
    
    void defaultMethod() {
        System.out.println("Default method");
    }
    
    private void privateMethod() {
        System.out.println("Private method");
    }
}

//Assume same packapge but seperate file

package mypackage;

class TestAccess {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();
        demo.publicMethod();      // Works
        demo.protectedMethod();   // Works
        demo.defaultMethod();     // Works
        // demo.privateMethod();  // error: private not accessibl
    }
}