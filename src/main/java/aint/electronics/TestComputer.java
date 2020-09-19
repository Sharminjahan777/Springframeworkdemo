package aint.electronics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.Callable;

public class TestComputer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("deviceBeanConstructor.xml");
        Computer computer = (Computer)context.getBean("computer");
        computer.processorBrandConfig();



    }
}
