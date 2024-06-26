package com.phone;

public class PhoneBuilder {
    private double srcSize =3;
    private String processor="A-17 Bionic";
    private int ram=4;
    private int battery=4000;
    private String os="Android";


    public PhoneBuilder setSrcSize(double srcSize) {
        this.srcSize = srcSize;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public Phone getPhone(){
        return new Phone(srcSize,processor,ram,battery,os);
    }
}
