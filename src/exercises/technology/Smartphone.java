package exercises.technology;

public class Smartphone extends Computer {
    private double versionNumber;

    public Smartphone(String name, int memory, int serialNumber, String processor, String owner, double versionNumber) {
        super(name, memory, serialNumber, processor, owner);
        this.versionNumber = versionNumber;
    }

    public double getVersionNumber() {
        return versionNumber;
    }

    public boolean makeCall(){
        System.out.println("smartphone.makeCall() called, Smartphone calls a number");
        return true;
    }
}
