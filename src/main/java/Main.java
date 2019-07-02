import beans.Address;
import beans.House;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("beans");

        Address address1 = applicationContext.getBean(Address.class);
        System.out.println(address1);

        House house = applicationContext.getBean(House.class);
        System.out.println(house);
        Address address2=house.getAddress();

        //True because this is singlton and we have 1 reference
        System.out.println(address1==address2);


        ApplicationContext applicationContext1=new ClassPathXmlApplicationContext("config.xml");
    }
}
