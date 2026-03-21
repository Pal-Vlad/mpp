package eu.ase.io;

public class InvoiceItem {
    private String description;
    private int unit;
    private double price;

    public InvoiceItem(String description, int unit, double price) {
        this.description = description;
        this.unit = unit;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public int getUnit() {
        return unit;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Invoice " + this.description + this.unit+ this.price;
    }

}
