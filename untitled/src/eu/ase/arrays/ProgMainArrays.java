package eu.ase.arrays;

public class ProgMainArrays {
    public static void main(String Args[]) {
        int []v;
        v = new int[5];
        int []n = {10, 20, 30};
        n[0] =10;
        n[1] =20;
        for(int i = 0; i < v.length-1;i++) {
            System.out.println("i: " + i + " val: " + v[i]);
        }
        v[3] = 20;
        v[4] = 40;
        for(int x: v) {
            System.out.println(x);
        }

        int[] v2 = v;
        v2 = java.util.Arrays.copyOf(v, v.length);
        System.arraycopy(v, 0, v2, 0, v.length);
        modifyArray(v);
        System.out.println("v dupa modificare: " + v);
        for(int x: v) {
            System.out.println(x);
        }
    }
    public static void modifyArray(int[] arr) {
        arr[0] = 999;
    }
}
