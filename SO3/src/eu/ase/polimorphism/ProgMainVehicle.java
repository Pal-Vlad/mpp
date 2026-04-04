package eu.ase.polimorphism;

public class ProgMainVehicle {
    public static void main(String[] args) {
        Vehicle v = null;
        Auto a = null;
        try {
            a = new Auto(1500, 5);

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(a.display());
        Plane p = new Plane (150000, 12, 2);
        v = a;//upcast
        System.out.println(v.display());
        v = p;//upcasting
        System.out.println(v.display());

        Vehicle v0 = null;
        p = (Plane) v0;//downcast
        //p = (Plane)a; //nu se puede
        Movement m0 = null;
        try {
            m0 = new Auto(2900, 4);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        m0.startEngine();
    }
}
