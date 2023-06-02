public class Laptop implements InterfaceLaptop{

    private Processor processor;
    private RAM ram;
    private HardDisk harddisk;
    private Motherboard motherboard;
    private OperationSystem operationsystem;
    private Color color;
    private int cost;

    public Laptop(Processor processor, RAM ram, HardDisk harddisk, Motherboard motherboard, OperationSystem operationsystem, Color color, int cost) {
        this.processor = processor;
        this.ram = ram;
        this.harddisk = harddisk;
        this.motherboard = motherboard;
        this.operationsystem = operationsystem;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void setCost() {
        if (this.processor == processor.AMD_Ryzen_7_7700X){
            this.cost = 70000;
        }
        else if (this.processor == processor.AMD_Ryzen_9_7845HX){
            this.cost = 60000;
        }
        else if (this.processor == processor.AMD_Ryzen_9_7950X){
            this.cost = 50000;
        }
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public Laptop getLaptop() {
        return new Laptop(processor, ram, harddisk, motherboard, operationsystem, color, cost);
    }

    @Override
    public String toString() {
        return String.format("CPU: %s, ОЗУ: %s, HDD: %s, OS: %s, Цвет: %s, Цена: %d р.\n", this.processor, this.ram, this.harddisk, this.operationsystem, this.color, this.cost);
    }
}