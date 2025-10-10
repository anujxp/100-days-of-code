package Question;

/*
 10_ToStringEqualsHashCode.java
 Demonstrates overriding toString, equals and hashCode for proper value semantics.
*/
import java.util.Objects;
class PersonVal {
    private String id; private String name;
    public PersonVal(String id,String name){this.id=id;this.name=name;}
    @Override public String toString(){return name + "[" + id + "]";}
    @Override public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof PersonVal)) return false;
        PersonVal p=(PersonVal)o;
        return Objects.equals(id,p.id) && Objects.equals(name,p.name);
    }
    @Override public int hashCode(){ return Objects.hash(id,name); }
}
public class 10_ToStringEqualsHashCode {
    public static void main(String[] args) {
        System.out.println("--- 10_ToStringEqualsHashCode ---");
        PersonVal p1 = new PersonVal("ID1","Anuj");
        PersonVal p2 = new PersonVal("ID1","Anuj");
        System.out.println(p1);
        System.out.println("equals -> " + p1.equals(p2));
    }
}
