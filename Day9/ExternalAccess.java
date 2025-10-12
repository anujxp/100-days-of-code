


import Question.AccessParent;

/*
other.ExternalAccess
This class is in a different package (other).
It demonstrates what is accessible from an external class that is NOT a subclass.
*/
public class ExternalAccess {
    public void showAccess() {
        AccessParent p = new AccessParent();
        System.out.println("ExternalAccess (non-subclass in different package) can access:");
        System.out.println("publicField = " + p.publicField);
        // The following fields are NOT accessible and are commented out to keep code compilable:
        // System.out.println("protectedField = " + p.protectedField); // NOT accessible (not subclass)
        // System.out.println("defaultField = " + p.defaultField);     // NOT accessible (package-private)
        // System.out.println("privateField = " + p.privateField);     // NOT accessible (private)
        System.out.println("privateField (via public getter) = " + p.getPrivateField());
    }

    public static void main(String[] args) {
        ExternalAccess e = new ExternalAccess();
        e.showAccess();
    }
}
