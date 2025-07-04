import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestAbstractShape {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle);


        Rectangle rectangle1 = new Rectangle(3, 4);

        System.out.println(rectangle1.area());
        System.out.println(rectangle1.perimeter());
        System.out.println(rectangle1);

        Rectangle square = new Rectangle(3,3);

        System.out.println(square.area());
        System.out.println(square.perimeter());
        System.out.println(square);

        ArrayList<Shapes> shapes = new ArrayList<Shapes>();
        shapes.add(rectangle);
        shapes.add(rectangle1);
        shapes.add(square);

        for (int i = 0; i<3; i++){
            System.out.println(shapes.get(i));
        }

    }
}


