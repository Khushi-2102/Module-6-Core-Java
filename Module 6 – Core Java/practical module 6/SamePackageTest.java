package core;

class MyPackage {
    // Class with different access modifiers
    public static class AccessDemo {
        public String publicVar = "Public Variable";
        protected String protectedVar = "Protected Variable";
        String defaultVar = "Default Variable"; // no modifier
        private String privateVar = "Private Variable";

        public void publicMethod() {
            System.out.println("Public Method");
        }

        protected void protectedMethod() {
            System.out.println("Protected Method");
        }

        void defaultMethod() {
            System.out.println("Default Method");
        }

        private void privateMethod() {
            System.out.println("Private Method");
        }

        public void accessPrivate() {
            privateMethod();
            System.out.println(privateVar);
        }
    }

    // Same package test
    public static class SamePackageTest {
        public static void test() {
            AccessDemo obj = new AccessDemo();

            System.out.println("=== Same Package Access ===");
            System.out.println(obj.publicVar);
            System.out.println(obj.protectedVar);
            System.out.println(obj.defaultVar);
            // System.out.println(obj.privateVar); // Not accessible

            obj.publicMethod();
            obj.protectedMethod();
            obj.defaultMethod();
            // obj.privateMethod(); // Not accessible

            obj.accessPrivate(); // Access private via public method
        }
    }
}

// Simulating package otherpackage
class OtherPackageTest extends MyPackage.AccessDemo {
    public static void test() {
        MyPackage.AccessDemo obj = new MyPackage.AccessDemo();

        System.out.println("\n=== Different Package Access ===");
        System.out.println(obj.publicVar);
        // System.out.println(obj.protectedVar); // Not accessible via reference
        // System.out.println(obj.defaultVar);   // Not accessible
        // System.out.println(obj.privateVar);   // Not accessible

        obj.publicMethod();
        // obj.protectedMethod(); // Not accessible via reference
        // obj.defaultMethod();   // Not accessible
        // obj.privateMethod();   // Not accessible

        // Access protected members via inheritance
        OtherPackageTest childObj = new OtherPackageTest();
        System.out.println(childObj.protectedVar); // Accessible
        childObj.protectedMethod();                // Accessible
    }
}

// Main class
public class SamePackageTest {
    public static void main(String[] args) {
        MyPackage.SamePackageTest.test();  // Access within same package
        OtherPackageTest.test();           // Access from different package
    }
}
