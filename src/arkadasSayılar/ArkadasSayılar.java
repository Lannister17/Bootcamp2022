package arkadasSayılar;

public class ArkadasSayılar {
    public static void main(String[] args) {
        int number1 = 220,number2= 284;
        int total1 =0,total2 =0;

        for (int i=1;i<number1;i++){
            if (number1 % i ==0){
                total1 = total1 + i;
            }
        }

        for (int j=1;j<number2;j++){
            if (number2 % j == 0){
                total2 = total2 + j;
            }
        }


        if (total1 == number2 && total2 == number1){
            System.out.println(+number1+ " ve " + number2 +" Arakadas sayılardır..");
        }else {
            System.out.println(+number1 + " ve " + number2 + " Arakadas sayılar değildir..");
        }
    }
}
