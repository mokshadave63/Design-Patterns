import java.util.*;
import java.util.List;
interface Component
{
    void ShowPrice();
}
class leaf implements Component
{
    int price;
    String name;

    public leaf(int price, String name){
        this.name = name;
        this.price = price;
    }

    public void ShowPrice(){
        System.out.println(name+":"+price);
    }

}
class Composite implements Component
{
    String name;
    List<Component> components = new ArrayList<>();
    public Composite(String name){
        this.name = name;
    }
    public void addComponent(Component comm){
        components.add(comm);
    }
    public void ShowPrice(){
        System.out.println(name);
        for (Component c:components){
            c.ShowPrice();
        }
    }
}
public class ComputerPart {
}