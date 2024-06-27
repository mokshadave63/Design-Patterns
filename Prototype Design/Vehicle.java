package prototype;
import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable {
    private List<String> vehicleList;

    public Vehicle(){
        this.vehicleList=new ArrayList<String>();
    }

    public Vehicle(List<String> list){
        this.vehicleList=list;
    }

    public void insertData(){
        vehicleList.add("Honda Amaze");
        vehicleList.add("Toyota Innova");
        vehicleList.add("Suzuki Breeza");
        vehicleList.add("Hyundai Palisade");
        vehicleList.add("Skoda KashaQ");
    }

    public void modify(){
        String s=(String)this.vehicleList.get(0);
        System.out.println(s);
    }

    public List<String> getVehicleList(){
        return this.vehicleList;
    }

    public Object clone() throws CloneNotSupportedException{
        List<String> templist=new ArrayList<String>();
        for(String s:this.vehicleList){
            templist.add(s);
        }
        return new Vehicle(templist);
    }
}
