package Management;

import Cars.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock_Admin {
    ArrayList<Car> VehiclesInStock=new ArrayList<>();

    public void Option(){
        System.out.println("Select the option you want run");
        System.out.println("1. List Vehicles by manufacturer");
        System.out.println("2. Search for vehicles");
        System.out.println("3. List vehicles by price range");
        System.out.println("4. List vehicles by discount price");

        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        switch (number){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;

            default:
                System.out.println("error");
        }

    }
    public void SearchForVehicle(String vehicle){

    }
    public void listVehiclesByManufacturer(String manufacture) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : this.VehiclesInStock) {
            if (car.getManufacture().equals(manufacture)){
                
            }
        }

    }
}
