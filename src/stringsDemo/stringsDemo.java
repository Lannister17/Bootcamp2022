package stringsDemo;

import java.util.Locale;

public class stringsDemo {
    public static void main(String[] args) {
        String message = "Bügün hava çok güzel.";
        System.out.println(message);
        /*System.out.println("Mesaj Karakter sayısı : " + message.length());
        System.out.println("5. Karakter : " +message.charAt(4));
        System.out.println(message.concat(" Yaşasın !"));
        System.out.println(message);
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));

        char[] karakterler = new char[5];
        message.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(message.indexOf("."));
        System.out.println(message.length());*/
        String newMessage = message.replace(' ','-');
        System.out.println(newMessage);
        System.out.println(newMessage.substring(3,5));

        for (String kelime : newMessage.split("-")) {
            System.out.println(kelime);
        }
        System.out.println("----------------------------------------");
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        String message2 = "         Bügün hava çok güzel.       ";
        System.out.println(message2.trim());
    }
}
