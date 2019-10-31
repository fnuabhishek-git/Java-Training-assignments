package rectangle;

public class Rectangle {


        int len = 10;
        int bred = 20;

    public Rectangle() {

    }

    public Rectangle(int len, int bred) {
        this.len = len;
        this.bred = bred;
    }

    public void calArea(){
            System.out.println("Area of the current object is " + this.len*this.bred);
        }
    }

class AreaCalculatorManager {
    public void printAreaofObjects(){

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(40,50);
        Rectangle r3 = new Rectangle(35, 20);
        Rectangle r4 = new Rectangle(20, 30);


        r1.calArea();
        r2.calArea();
        r3.calArea();
        r4.calArea();

//call each reactangle instance calArea() method



    }
}


