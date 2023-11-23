import java.util.*;

public class Main {
    public static void main(String[] args) {

        Solo<Integer> val = new Solo<Integer>(12);
        Solo<String> sol = new Solo<String>("Beni");


        int nombre = val.getValeur();

        System.out.println(sol.getValeur());

    }
}