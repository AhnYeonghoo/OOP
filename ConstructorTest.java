package project;

class Data1 {
    int value;
    
}

class Data2 {
    int value;
    
    Data2(int x) {
        value = x;
    }
}

class Car {
    String color;
    String gearType;
    int door;
    
    Car() {
        this("White", "Auto", 4);
    } // default contrutor
    
    Car(String color) {
        this(color, "auto", 4);
    }
    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2(3);
        
        Car c1 = new Car();
        c1.color = "White";
        c1.gearType = "auto";
        c1.door = 4;
        
        Car c2 = new Car("White", "auto", 4);
           
        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }
}