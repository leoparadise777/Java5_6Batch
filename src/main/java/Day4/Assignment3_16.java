package Day4;

import java.util.*;

public class Assignment3_16 {
    public static void main(String[] args) {
        Circle circle = new Circle((float) 4.2);
        Rectangle rectangle = new Rectangle(6, 8);

        Set<Shape> s = new TreeSet<>();
        s.add(circle);
        s.add(rectangle);

        for(Shape a : s){
            System.out.println(a.getArea());
        }

    }
}
