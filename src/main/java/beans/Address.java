package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private String nameOfTheStreet;

    private Integer numberOfTheHouse;

    //Address ad=new Address("toreza",45);
    public Address(@Value("Toreza") String nameOfTheStreet,
                   @Value("45") Integer numberOfTheHouse) {
        this.nameOfTheStreet = nameOfTheStreet;
        this.numberOfTheHouse = numberOfTheHouse;
    }


    public String getNameOfTheStreet() {
        return nameOfTheStreet;
    }

    public void setNameOfTheStreet(String nameOfTheStreet) {
        this.nameOfTheStreet = nameOfTheStreet;
    }

    public Integer getNumberOfTheHouse() {
        return numberOfTheHouse;
    }

    public void setNumberOfTheHouse(Integer numberOfTheHouse) {
        this.numberOfTheHouse = numberOfTheHouse;
    }

    @Override
    public String toString() {
        return "Address{" +
                "nameOfTheStreet='" + nameOfTheStreet + '\'' +
                ", numberOfTheHouse=" + numberOfTheHouse +
                '}';
    }
}
