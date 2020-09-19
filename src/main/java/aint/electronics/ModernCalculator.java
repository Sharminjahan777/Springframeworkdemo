package aint.electronics;

import org.springframework.beans.factory.annotation.Autowired;

public class ModernCalculator implements Count {

    private Device device;
    public ModernCalculator(){}
    public ModernCalculator(Device device){

        this.device= device;
    }
    @Autowired
    public void setDevice(Device device){
        this.device = device;
    }
    public void computingPower() {
        int totalRamSize = device.getDeviceRamSize() + 16;
        System.out.println("Modern Computing power : " + device.getDeviceMonitorSize()+ " monitor size in inch " +totalRamSize+ " and Ram size in GB ");
    }
}
