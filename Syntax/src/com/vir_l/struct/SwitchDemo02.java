package com.vir_l.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "V";

        switch (name){
            case "C":
                System.out.println("Clem");
                break;
            case "V":
                System.out.println("Virl");
                break;
            default:
                System.out.println("null");
        }
    }
}
