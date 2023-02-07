import java.lang.System;
import java.util.Scanner;

public class DuniaRobot {
	 public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jenisRobot = input.nextInt();
        if(jenisRobot == 1){
            int numberOfParts = input.nextInt();
            int totalTransformation = input.nextInt();
            boolean isActive = input.nextBoolean();
            Bumblebee robotBumblebee = new Bumblebee (numberOfParts , isActive);
            System.out.println(robotBumblebee.toString());
            for(int i = 0 ; i < totalTransformation ; i++){
            	robotBumblebee.addTransformation();
            }
            System.out.println("Jumlah transformasi: " + robotBumblebee.getTotalTransformation());
            System.out.println("Harga robot: " + robotBumblebee.getPrice());
        }
        else if(jenisRobot == 2){
            int price = input.nextInt();
            int totalModel = input.nextInt();
            Sirik robotSirik = new Sirik(price);
            System.out.println(robotSirik.toString());
            for(int i = 0 ; i < totalModel ; i++){
            	robotSirik.addModel();
            }
            System.out.println("Jumlah model: " + robotSirik.getTotalModel());
            System.out.println("Harga robot: " + robotSirik.getPrice());
        }
        else if(jenisRobot == 3){
            long mileage = input.nextLong();
            boolean isActive = input.nextBoolean();
            WallE robotWallE = new WallE(mileage , isActive);
            System.out.println(robotWallE.toString());
            System.out.println("Jumlah mileage: " + robotWallE.getMileage());
            System.out.println("Harga robot: " + robotWallE.getPrice());
        }
    }
}