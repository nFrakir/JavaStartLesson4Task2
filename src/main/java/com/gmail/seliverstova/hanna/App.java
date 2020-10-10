package com.gmail.seliverstova.hanna;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        double ax = 0;
        double ay = 0;
        double bx = 4;
        double by = 4;
        double cx = 6;
        double cy = 1;
        double da;
        double db;
        double dc;

        System.out.println("Input x and press Enter");
        x = sc.nextDouble();
        System.out.println("Input y and press Enter");
        y = sc.nextDouble();

        da = (ax - x)*(by - ay) - (ay - y)*(bx - ax);
        db = (bx - x)*(cy - by) - (by - y)*(cx - bx);
        dc = (cx - x)*(ay - cy) - (cy - y)*(ax - cx);

        if (((da >= 0) && (db >= 0) && (dc >= 0)) || ((da <= 0) && (db <= 0) && (dc <= 0))) {
            System.out.println("Dot is inside triangle");
        } else {
            System.out.println("Dot is outside triangle");
        }
    }
}
