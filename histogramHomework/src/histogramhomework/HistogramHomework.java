
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histogramhomework;

import java.util.Scanner;

/**
 *
 * @author Paul
 */
public class HistogramHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in); 
        int ten=0,twenty=0,thirty=0,fourty=0,fifty=0,sixty=0,seventy=0,eighty=0,nintey=0,hundred=0;
        int num = 1;
        while (num>0 && num<100) {
            System.out.println("enter ur digits home slice:");
            num = in.nextInt();
            if(num>0 && num <10){
                ten++;
            }
            if(num>10 && num <20){
                twenty++;
            }
            if(num>20 && num <30){
                thirty++;
            }
            if(num>30 && num <40){
                fourty++;
            }
            if(num> 40&& num <50){
                fifty++;
            }
            if(num>50 && num <60){
                sixty++;
            }
            if(num> 60&& num <70){
                seventy++;
            }
            if(num>70 && num <80){
                eighty++;
            if(num>80 && num <90){
                nintey++;
            }
            }
            if(num>90 && num <100){
                hundred++;
            }
            }
        System.out.println();
        System.out.print("1-10     |");
            for(int k=0;k<ten;k++){
                System.out.print("*");
       
                        }
            System.out.println();
            System.out.print("20-30     |");
            for(int k=0;k<twenty;k++){
                System.out.print("*");
       
                        }
            System.out.println();
            System.out.print("30-40     |");
            for(int k=0;k<thirty;k++){
                System.out.print("*");
       
                        }
            System.out.println();
            System.out.print("40-50     |");
            for(int k=0;k<fifty;k++){
                System.out.print("*");
       
                        }
            System.out.println();
            System.out.print("50-60     |");
            for(int k=0;k<sixty;k++){
                System.out.print("*");
       
                        }
            System.out.println();
            System.out.print("60-70     |");
            for(int k=0;k<seventy;k++){
                System.out.print("*");
       
                        }
            System.out.println();
            System.out.print("70-80     |");
            for(int k=0;k<eighty;k++){
                System.out.print("*");
       
                        }
            System.out.println();
            System.out.print("80-90     |");
            for(int k=0;k<nintey;k++){
                System.out.print("*");
       
                        }
            System.out.println();
            System.out.print("90-100     |");
            for(int k=0;k<hundred;k++){
                System.out.print("*");
       
                        }
            }
        }

