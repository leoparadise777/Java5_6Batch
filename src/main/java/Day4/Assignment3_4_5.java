package Day4;

public class Assignment3_4_5 {

    public static void main(String[] args) {
        Car car = new Car();
        doSomething(car);
    }

    public static void doSomething(final Car aCar){
        //aCar = null;
        aCar.setColor(new Color());

        System.out.println(aCar.getColor());
    }

}
