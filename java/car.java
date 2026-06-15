package fst;

public class car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    
    public car() {
        tyres = 4;
        doors = 4;
    }

   
    public void displayCharacteristics() {
        System.out.println("Color of the Car: " + color);
        System.out.println("Make of the Car: " + make);
        System.out.println("Transmission: " + transmission);
        System.out.println("Number of tyres: " + tyres);
        System.out.println("Number of doors: " + doors);
    }

   
    public void accelerate() {
        System.out.println("Car is moving forward.");
    }

 
    public void brake() {
        System.out.println("Car has stopped.");
    }
}