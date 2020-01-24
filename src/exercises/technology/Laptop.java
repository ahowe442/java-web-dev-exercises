package exercises.technology;

public class Laptop extends Computer {
    private String monitor;
    private String printer;

    public Laptop(String name, int memory, int serialNumber, String processor, String owner, String monitor, String printer) {
        super(name, memory, serialNumber, processor, owner);
        this.monitor = monitor;
        this.printer = printer;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getPrinter() {
        return printer;
    }
    public boolean printDocument(){
        System.out.println("laptop.printDocument() called, Laptop prints document");
        return true;
    }


}
