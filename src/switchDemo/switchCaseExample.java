package switchDemo;

public class switchCaseExample {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("Mükemmel : Gectiniz..");
                break;
            case 'B':
                System.out.println("Cok güzel : Geçtiniz..");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz..");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz..");
                break;
            case 'F':
                System.out.println("Malesef : Kaldınız..");
                break;
            default:
                System.out.println("Gerçersiz not girdiniz..");
        }

    }
}
