package TemperatureConverter.Src.temperature;

import java.util.Scanner;
public class TempConvertC {
      /*
         *  (F-32)/1.8
         */


     public  static void main(String[] args){

        Scanner object = new Scanner(System.in);
        System.out.println("PLease enter temperature in Fahrenheit");
        double user_entry = object.nextDouble();
        double temp_convertCalc = (user_entry -32);
        System.out.println("The temperature you have entered in Celsius is " + temp_convertCalc);
      
     }
}