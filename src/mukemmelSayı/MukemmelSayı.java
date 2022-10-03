package mukemmelSayı;

public class MukemmelSayı {
    //Bölenlerinin toplamı kendisine eşit olan sayılara mükemmel sayılar denir..
    public static void main(String[] args) {
        int number = 6;
        int total = 0;

        for (int i=1; i<number;i++){
            if (number % i == 0){
                total = total + i;
            }
        }
        System.out.println(total);

        if (total == number){
            System.out.println(number + " Mükemmel Sayıdır!");
        }else {
            System.out.println(number + " Mükemmel Sayı Değildir!");
        }
    }
}
