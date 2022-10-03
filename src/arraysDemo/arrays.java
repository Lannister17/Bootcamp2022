package arraysDemo;

public class arrays {
    public static void main(String[] args) {
        String student1 = "Efe";
        String student2 = "Engin";
        String student3 = "Aras";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("--------------------------------");

        String[] students = new String[3];
        students[0]="Engin";
        students[1]="Efe";
        students[2]="Derin";

        for (int i=0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("---------------------------------");

        for (String student:students){
            System.out.println(student);
        }

    }
}
