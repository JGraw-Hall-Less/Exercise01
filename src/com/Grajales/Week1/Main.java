package com.Grajales.Week1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String city= "Columbus";
        int zipcode= 43215;
        float temperature[]={32,25,27,40,45};
        float sum = 0;
        for(int t=0; t<=4; t++){
            sum += temperature[t];
        }
        float avg=sum / 5;
        System.out.println("City: "+city+"| Zip Code: "+zipcode+"| Average High Temperature: "+avg);

    }
}
