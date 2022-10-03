package loopDemo;

public class loopExample {
    public static void main(String[] args) {

        // For Example
        for (int i=1;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("For Loop Done..");

        int k=1;

        //While Example
        while(k<10) {
            System.out.println("While Loop Inside.." + k);
            k+=2;
        }
        System.out.println("While Loop Inside..");
        // Do-while Example
        int j=1;
        do{
            System.out.println("Do-while Loop " + j);
            j+=2;
        }while(j<10);
        System.out.println("Do-while Loop Done..");
    }
}
