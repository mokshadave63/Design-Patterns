package prototype;
import java.util.*;
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle a=new Vehicle();
        a.insertData();

        Vehicle b=(Vehicle)a.clone();
        System.out.println("A: "+ a.getVehicleList());
        System.out.println("B: "+ b.getVehicleList());
        b.getVehicleList().remove("Suzuki Breeza");
        System.out.println("B: "+ b.getVehicleList());

        List<String> list=b.getVehicleList();
        list.add("Tesla model X");

        System.out.println("A: "+ a.getVehicleList());
        System.out.println("B: "+ b.getVehicleList());

        b.modify();
    }
}
