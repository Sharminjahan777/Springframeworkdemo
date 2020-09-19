package aint.electronics;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDevice {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("deviceBean.xml");
        Desktop desktop=(Desktop)context.getBean("desktop");
        desktop.showDeviceConfig();

       /* Desktop desktop = new Desktop();
        desktop.setDeviceName(new Device(15, 32));
        desktop.showDeviceConfig(); */
    }
}
