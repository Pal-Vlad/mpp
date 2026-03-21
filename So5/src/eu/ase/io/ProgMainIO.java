package eu.ase.io;

import java.io.*;

public class ProgMainIO {
    public static void main(String[] args) {
        double[] prices  = new double[] {19.99, 8.76, 15.89};
        int[] units = new int[] {12, 8, 9};
        String[] descriptions = new String[] {"t-Shirt", "Mug", "Pen"};

        DataOutputStream out = null;

        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            BufferedOutputStream bos= new BufferedOutputStream(fos);
            out = new DataOutputStream(bos);

            for(int i = 0; i < descriptions.length; i++) {
                out.writeUTF(descriptions[i]);
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
            }

            out.close();

            DataInputStream in = null;

            in = new DataInputStream(new BufferedInputStream(new FileInputStream("test.txt")));

            String desc;
            double price;
            int unit;
            double total = 0.0;
            try {
                while(true) {
                    desc = in.readUTF();
                    price = in.readDouble();
                    unit = in.readInt();
                    total += price * unit;

                    System.out.println("Head record " + desc + ", units " + unit + ", price " + price);
                }

            } catch (EOFException eofe) {
                System.out.println("Total " + total);
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter ("invoice.txt"));
            for(int i = 0; i < descriptions.length; i++) {
                bw.write(descriptions[i] + ", " + prices[i] + ", " + units[i]);
                bw.newLine();
            }

            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("invoice.txt"));
            String line;
            total = 0.0;
            while((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                desc = parts[0];
                price = Double.parseDouble(parts[1]);
                unit = Integer.parseInt(parts[2]);

                total += unit*price;

                System.out.print("Head record " + desc + ", units " + unit + ", price " + price);
            }
            System.out.print("Total " + total);
            br.close();

        } catch(IOException e) {
            e.printStackTrace();
        }


    }
}
