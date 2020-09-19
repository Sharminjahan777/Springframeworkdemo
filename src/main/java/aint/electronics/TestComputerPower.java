package aint.electronics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComputerPower {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("deviceBeanInterface.xml");
        Count count = (Calculator)context.getBean("count");
        count.computingPower();
    }
}
