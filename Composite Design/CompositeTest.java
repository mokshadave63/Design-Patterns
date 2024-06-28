
public class CompositeTest {
    public static void main(String[] args) {
        System.out.println("Moksha Dave 22BCP366");

        Component hd = new leaf(4000,"harddrive");
        Component mouse = new leaf(500,"Mouse");
        Component monitor = new leaf(8000,"Monitor");
        Component ram = new leaf(3000,"RAM");
        Component cpu = new leaf(4000,"CPU");
        Composite ph = new Composite("peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("Motherboard");
        Composite computer = new Composite("Computer");
        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(cabinet);
        computer.addComponent(ph);
        computer.ShowPrice();
    }
}