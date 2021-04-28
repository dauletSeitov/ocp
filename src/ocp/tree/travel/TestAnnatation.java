package ocp.tree.travel;

@Fuckable(getName = "ololo")
//@FunctionalInterface
public class TestAnnatation {

   // final static int ok;
    @Fuckable(getName = "ololo", gender = true, list = {"jhg","jhg"})
    public static void main(String[] args) {

    }

}


@interface Fuckable {
    String getName();
    String[] list() default {};
    boolean gender() default false;
    String value() default "";

    int ok =4;
}