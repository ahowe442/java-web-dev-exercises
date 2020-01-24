package exercises.technology;

public class Computer {
    private String name;
    private int memory;
    private int serialNumber;
    private String processor;
    private String owner;

    public Computer(String name, int memory, int serialNumber, String processor, String owner) {
        this.name = name;
        this.memory = memory;
        this.serialNumber = serialNumber;
        this.processor = processor;
        this.owner = "Apple";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getOwner(){
        return owner; }
    public void setOwner(String owner){
        this.owner =  owner;
    }

    public Boolean needsUpdate(){
        if (this.memory < 2){
            return true;
        }else {
            return false;
        }
    }
    public boolean checkEmail(){
        System.out.println("computer.checkEmail() called");
        return true;
    }

    public boolean saveDocument(){
        System.out.println("computer.saveDocument() called ");
        return true;
    }
}
