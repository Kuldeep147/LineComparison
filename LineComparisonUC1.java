package com.bzl.line;
import java.util.Scanner;

public class LineComparisonUC1 {
    public static double x1;
    public static double y1;
    public static double x2;
    public static double y2;
    public static double len;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x1 : ");
        x1 = sc.nextInt();
        System.out.println("Enter value of y1 : ");
        y1 = sc.nextInt();
        System.out.println("Enter value of x2 : ");
        x2 = sc.nextInt();
        System.out.println("Enter value of y2 : ");
        y2 = sc.nextInt();
        len = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of given line is : "+len);
    }
}