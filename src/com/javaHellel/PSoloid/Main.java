package com.javaHellel.PSoloid;

public class Main {

    public static void main(String[] args) {
        int fN = 4;
        int sN = 1;
        int tN = 5;
        if ((fN > sN ) && (fN > tN )) {
            System.out.println("first " + fN);
        } else if ((sN > fN) && (sN > tN )){
            System.out.println("second " + sN);
        } else if ((tN > fN) && (tN > sN )){
            System.out.println("third " + tN);
        }

        String str = "Monday";

        switch (str){
            case "Monday":
                System.out.println("Monday");
                break;
//            case 1:
//                System.out.println("Tuesday");
//                break;
//            case 2:
//                System.out.println("Wednesday");
//                break;
            default:
                System.out.println("Other day");
                break;
        }
        System.out.println("End");



    }
}
