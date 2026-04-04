package eu.ase.polimorphism;

public class Plane extends Vehicle{
    private float capacity;
    private int enginesNo;

    public Plane(int weight, float capacity, int enginsNo) {
        super(weight);
        this.capacity = capacity;
        this.enginesNo = enginsNo;
    }

    @Override
    public String display() {
        return new String("Plane-ewight: " + this.getWeight() + ", capacity: " + this.capacity + ", engines no: " + this.enginesNo);
    }
}
