package Day4;

public class Circle extends Shape{

    float r;

    public Circle(float r) {
        this.r = r;
        calArea();
    }

    @Override
    float calArea() {
        return this.area = (float) (Math.PI * Math.pow(r, 2));
    }
}
