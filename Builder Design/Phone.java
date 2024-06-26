package com.phone;
public class Phone {
    private double srcSize;
    private String processor;
    private int ram;
    private int battery;
    private String os;

    public Phone(double srcSize, String processor, int ram, int battery, String os) {
        this.srcSize = srcSize;
        this.processor = processor;
        this.ram = ram;
        this.battery = battery;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "srcSize=" + srcSize +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", battery=" + battery +
                ", os='" + os + '\'' +
                '}';
    }
}
