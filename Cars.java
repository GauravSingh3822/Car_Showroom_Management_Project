import java.util.Scanner;

public class Cars extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    String car_type;
    int car_price;
    String car_Transmission;

    @Override
    public void get_details() {
        System.out.println("Car Color" + car_color);
        System.out.println("Car Fuel Type:" + car_fuel_type);
        System.out.println("Car Type:" + car_type);
        System.out.println("Car Price" + car_price);
        System.out.println("Car Transmission Name:" + car_Transmission);
    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        System.out.println("*********************|| ENTER CAR DETAILS ||*****************************************");
        System.out.println();
        System.out.print(" Car Name. ");
        car_name=sc.nextLine();
        System.out.print("Car Color: ");
        car_color=sc.nextLine();
        System.out.print("Car Fuel Type: ");
        car_fuel_type=sc.nextLine();
        System.out.print("Car price: ");
        car_price=sc.nextInt();
        System.out.print("Car Transmission Name: ");
        car_Transmission=sc.nextLine();
        total_car_in_stock++;
    }
}
