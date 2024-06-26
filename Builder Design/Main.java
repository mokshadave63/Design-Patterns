package com.phone;

public class Main {
    public static void main(String[] args) {
        PhoneBuilder ob1=new PhoneBuilder();
        ob1.setBattery(5000);
        ob1.setRam(16);

        Phone phone= ob1.getPhone();
        String s = phone.toString();
        System.out.println(s);
    }
}