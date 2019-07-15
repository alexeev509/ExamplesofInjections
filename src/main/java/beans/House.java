package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class House {

    private Address address;

    private Integer coutOfFloors;

    //new House(ad,18);
    @Autowired
    public House(Address address, @Value("18") Integer coutOfFloors) {
        this.address = address;
        this.coutOfFloors = coutOfFloors;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getCoutOfFloors() {
        return coutOfFloors;
    }

    public void setCoutOfFloors(Integer coutOfFloors) {
        this.coutOfFloors = coutOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "address=" + address +
                ", coutOfFloors=" + coutOfFloors +
                '}';
    }
}
