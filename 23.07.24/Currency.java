import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat nfUS=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfIN=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat nfFR=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat nfCH=NumberFormat.getCurrencyInstance(Locale.CHINA);

        String us=nfUS.format(payment);
        String india=nfIN.format(payment);
        String france=nfFR.format(payment);
        String china=nfCH.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
