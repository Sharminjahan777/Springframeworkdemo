package aint.electronics;

public class Computer {
    private String processorBrand;
    private int processorCapacity;

    public Computer(){}
    public Computer(String processorBrand){
        this.processorBrand = processorBrand;
    }
    public Computer(int processorCapacity){
        this.processorCapacity = processorCapacity;
    }
    public Computer(String processorBrand, int processorCapacity){
        this.processorBrand = processorBrand;
        this.processorCapacity = processorCapacity;
    }

    public void processorBrandConfig(){
        System.out.println("Computer was assembled with CPU of brand: " + processorBrand);
    }
    public void processorCapacityConfig(){
        System.out.println("Computer was assembled with CPU capacity of: " + processorCapacity);
    }
    public void processorBrandNCapacityConfig(){
        System.out.println("Computer was assembled with CPU brand and capacity of: " + processorBrand + "  and "+processorCapacity);
    }
}
