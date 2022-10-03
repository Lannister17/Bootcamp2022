package sesliHarfler;

public class SesliHarfler {
    public static void main(String[] args) {
        char letter = 'A';

        switch (letter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Ince Sesli Harf");
                break;
            default:
                System.out.println("Geçersiz Harf girdiniz..");
                break;
        }
    }
}
