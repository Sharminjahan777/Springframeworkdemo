package aint.electronics;

public class Laptop {

    public String model;
    public int ramSize;

    public Laptop(){}
    public Laptop(String model){
        this.model= model;
}

        public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }


    public void laptopConfig(){
        System.out.println("Laptop Config: "+ model);
    }
}
