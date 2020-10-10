import Main.java.JavaProject.Rectangle;
import Main.java.JavaProject.Square;

public class MyFirstProgram {
    public static void main (String[] args) {
        hello("you");
        hello("Young Padavan");

        Square s = new Square(6);
        //s.l = 5;
        System.out.println("Square area with side " + s.l + " equals " + s.area());

        Rectangle r = new Rectangle(5,6);
        /*r.a = 5;
        r.b = 6;*/
        System.out.println("Rectangle area with sides " + r.a + " and " + r.b +" equals " + r.area());
    }
    public static void hello (String somebody) {
        System.out.println("Hello " + somebody + "!");
    }

}
