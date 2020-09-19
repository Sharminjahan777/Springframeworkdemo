package aint.electronics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestLaptop {
    public static void main(String[] args) {
        //Laptop lenovo = new Laptop("Yoga700");
        //lenovo.laptopConfig();

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("laptopBeanFactorySetter.xml"));
        Laptop lenovo =(Laptop)beanFactory.getBean("laptop");
        lenovo.laptopConfig();
    }
}
