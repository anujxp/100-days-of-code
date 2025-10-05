// ConstantsAndEnums.java
// Use of final constants and a simple enum example

public class ConstantsAndEnums {
    // constant
    public static final double PI = 3.141592653589793;

    enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }

    public static void main(String[] args) {
        System.out.println("Constant PI = " + PI);

        Day today = Day.MON;
        System.out.println("Today is " + today);

        // switch on enum
        switch (today) {
            case MON -> System.out.println("Start of week");
            case FRI -> System.out.println("Almost weekend");
            default -> System.out.println("Mid-week");
        }
    }
}
