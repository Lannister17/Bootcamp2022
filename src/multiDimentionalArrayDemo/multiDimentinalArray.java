package multiDimentionalArrayDemo;

public class multiDimentinalArray {
    public static void main(String[] args) {
        String [] [] city = new String[3][3];

        city [0] [0] = "İSTABUL";
        city [0] [1] = "BURSA";
        city [0] [2] = "BİLECİK";
        city [1] [0] = "ANKARA";
        city [1] [1] = "KONYA";
        city [1] [2] = "KAYSERİ";
        city [2] [0] = "DİYARBAKIR";
        city [2] [1] = "ŞANLIURFA";
        city [2] [2] = "GAZİANTEP";

        for (int i=0;i<city.length;i++){
            System.out.println("--------------------");
            for (int j=0;j< city.length;j++){
                System.out.println(city [i] [j]);
            }
        }
    }
}
