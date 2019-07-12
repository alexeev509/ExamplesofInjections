import beans.Address;
import beans.CarProtypeExample;
import beans.House;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("beans");

        Address address1 = applicationContext.getBean(Address.class);
        System.out.println(address1);

        House house1 = applicationContext.getBean(House.class);
        System.out.println(house1);
        Address address2 = house1.getAddress();

        //True because this is singlton and we have 1 reference
        System.out.println(address1==address2);


        ApplicationContext applicationContext1=new ClassPathXmlApplicationContext("config.xml");
        Address address3 = applicationContext1.getBean(Address.class);
        System.out.println(address3);
        House house2 = applicationContext1.getBean(House.class);
        System.out.println(house2);


        //Example of scope pototype
        CarProtypeExample car1 = applicationContext.getBean(CarProtypeExample.class);
        CarProtypeExample car2 = applicationContext.getBean(CarProtypeExample.class);
        System.out.println(car1 == car2);

    }
}
