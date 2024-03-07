
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTVUWXYZ";
        String lower = "abcdefghijklmnopqrstvuwxyz";
        String num = "0123456789";
        String specialchar = "<>,.?/}][{+-_)(*&$%#!^+=";
        String combination = upper + lower + num + specialchar;
        int len = 8;
        char[] password = new char[len];
        Random r = new Random();
        for (int i = 0; i < len; i++) {
            password[i] = combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Passworf is  -->  " + new String(password));
    }

}
