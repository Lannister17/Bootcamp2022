package recapDemo2;

public class recapDemo2 {
    public static void main(String[] args) {
        double[] myList = {1.2,2.34,3.14,4.12,5.32,1.233};
        double total = 0;
        double max = myList[0];
        for (double number:myList) {
            if (max<number){
                max =number;
            }
            total += number;
            System.out.println(number);
        }
        System.out.println("Dizideki en büyük sayı  :" + max);
        System.out.println("Tolam sayı : " +total);
    }
}
