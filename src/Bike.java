public class Bike {
    int wheelNumber;
    String wheelShape;

    public Bike (int wheelNumber, String wheelShape) {
        this.wheelNumber = wheelNumber;
        this.wheelShape = wheelShape;
    }

    public String toString() {
        return "Wheel shape is " + wheelShape + " wheel number is " + wheelNumber ;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public String getWheelShape() {
        return wheelShape;
    }

    public void setWheelShape(String wheelShape) {
        this.wheelShape = wheelShape;
    }



}
