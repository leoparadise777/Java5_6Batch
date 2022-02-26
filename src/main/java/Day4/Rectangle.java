package Day4;

public class Rectangle extends Shape{

    float x, y;

    public Rectangle(float x, float y) {
        this.x = x;
        this.y = y;
        calArea();
    }

    @Override
    float calArea() {
        return this.area = x * y;
    }
}
