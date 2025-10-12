

/*
AccessParent.java
Defines fields with different access modifiers to illustrate visibility rules.
Compile together with the other two (ChildInSamePackage and classes in package other).
*/
public class AccessParent {
    public String publicField = "publicValue";
    protected String protectedField = "protectedValue";
    String defaultField = "defaultValue"; // package-private (default)
    private String privateField = "privateValue";

    public String getPrivateField() { return privateField; }
}
