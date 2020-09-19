package aint.electronics;

public class Desktop {

    public Device deviceName;

    public Desktop(){}
    public Desktop(Device deviceName){
        this.deviceName= deviceName;
    }

    public void setDeviceName(Device deviceName){
        this.deviceName= deviceName;
    }

    public Device getDeviceName(){
        return deviceName;
    }
    public void showDeviceConfig(){
        System.out.println("Your Purchased Device Config is : " + deviceName.getDeviceMonitorSize()+ " Inch monitor and "+deviceName.getDeviceRamSize()+ "GB RAM ");
    }
}
