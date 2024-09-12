import java.util.Scanner;

public class CarTester{
    public Car addCar(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the car's name: ");
        String name = input.nextLine();
        System.out.print("Please enter cars miles: ");
        double miles = input.nextDouble();
        System.out.print("Please enter cars gallons: ");
        double gallons = input.nextDouble();
        Car car = new Car(name, miles, gallons);
        return car;
    }
    
    public static void main(String[] args){
        CarTester tester = new CarTester();
        Car a = tester.addCar();
        System.out.println(a.toString());
        System.out.println("------NEXT CAR-------------------------------------------");
        Car b = tester.addCar();
        System.out.println(b.toString());
    }
}

/*
Output pasted below:
Please enter the car's name: Honda Civic
Please enter cars miles: 234
Please enter cars gallons: 100
Honda Civic averaged 2.3 m/g
------NEXT CAR-------------------------------------------
Please enter the car's name: Toad Mobile
Please enter cars miles: 13
Please enter cars gallons: 7
Toad Mobile averaged 1.9 m/g
*/
