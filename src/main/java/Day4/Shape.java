package Day4;

public abstract class Shape implements Comparable<Shape> {

    float area;
    abstract float calArea();

    public float getArea() {
        return area;
    }

    @Override
    public int compareTo(Shape o){
        return (int)(this.area - o.area);
    }

}
