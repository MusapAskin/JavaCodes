package com.company;

import java.util.Scanner;

/*This program takes the average of the entered
 temperatures and writes the lowest and highest temperature.
 */
public class AverageTemperature {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double[] temperatur = new double[30];
        int i,day1,day2;
        double total,average,min,max;
        total = 0.0;

        for ( i=0; i<7; i++){
            System.out.println("Day: "+(i+1)+" tempeture: ");
            temperatur[i] = keyboard.nextDouble();
            total += temperatur[i];
        }
        average = total/30;
        System.out.println("November average = "+average);
        min = temperatur[0];
        max = temperatur[0];
        day1 = 0; day2 = 0;
        for ( i=1; i<30; i++){
            if(min >temperatur[i]){
                min = temperatur[i];
                day1 = i;
            }
            if(max<temperatur[i]){
                max = temperatur[i];
                day2 = i;
            }
        }
        System.out.println("Min temp = "+min+", Day = "+(day1+1));
        System.out.println("Max temp = "+max+", Day = "+(day2+1));
    }
}
