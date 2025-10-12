


/*
ChildInSamePackage.java
A subclass in the same package: can access public, protected, and default members.
*/
public class ChildInSamePackage extends AccessParent {
    public void showAccess() {
        System.out.println("ChildInSamePackage can access:");
        System.out.println("publicField = " + publicField);
        System.out.println("protectedField = " + protectedField);
        System.out.println("defaultField = " + defaultField);
        // privateField is not directly accessible here
        System.out.println("privateField (via getter) = " + getPrivateField());
    }

    public static void main(String[] args) {
        ChildInSamePackage c = new ChildInSamePackage();
        c.showAccess();
    }
}
