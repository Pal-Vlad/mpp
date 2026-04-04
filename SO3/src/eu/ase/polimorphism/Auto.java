package eu.ase.polimorphism;
//diamond problem(C++)
public class Auto extends Vehicle{
    private int doorsNo;
    public Auto (){

    }
    public Auto(int weight, int doorsNo) throws Exception {
        super(weight);
        if(doorsNo < 0) {
            throw new Exception("Doors number can not be less than 0.");
        }
        this.doorsNo = doorsNo;



    }
    public int getDoorsNo() {
        return this.doorsNo;
    }
    public void setDoorsNo(int doorsNo) throws Exception {
        if(doorsNo < 0) {
            throw new Exception("Dorrs cant be negative");
        }
        this.doorsNo = doorsNo;
    }

    @Override
    public String display() {
        return new String("Auto - weight: " + this.getWeight() + "Vehicle - doors" + this.doorsNo);
    }
}
