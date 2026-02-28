package eu.ase.oopaaryas;

public class ProgMainOopArrays {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("S0", new short[] {5, 5, 9});
        students[1] = new Student("S1", new short[] {9,10,9});

        for(int i = 0; i < students.length; i++) {
            System.out.println("Avg mark for student " + i + " is " + students[i].getAvgMarks());
        }

        System.out.println(students[0].toString());
//        System.out.println(students);
        Student newStudent = new Student("S0", new short[]{1, 1,1});
//        System.out.println("==" + newStudent == students[0]);
        System.out.println("equals" + newStudent.equals(students[0]));
        System.out.println("hashCoode s[0]" +students[0].hashCode());
        System.out.println("hashcode newStudent" + newStudent.hashCode());
    }
}
