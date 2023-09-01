package com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        
        
        NumberFormat us1 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String us = us1.format(payment);
        
        NumberFormat india1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = india1.format(payment);
        
        NumberFormat china1 = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        String china = china1.format(payment);
        
        NumberFormat fr1 = NumberFormat.getCurrencyInstance(new Locale("sk", "SK"));
        String fr = fr1.format(payment);
        
        System.out.println("US: " +us);
        System.out.println("India: " +india);
        System.out.println("China: " +china);
        System.out.println("France: " +fr);
    }
}