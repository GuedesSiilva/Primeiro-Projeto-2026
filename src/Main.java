import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "Guedes";
        String nome2 = "Bispo";

        ArrayList<String> lista = new ArrayList<>();

        lista.add(nome);
        lista.add(nome2);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        lista.add(sc.nextLine());

        imprimir(lista);
    }
    public static void imprimir(ArrayList<String> lista){
        for (String nomeLista : lista){
            System.out.printf(nomeLista +"\n");
        }
    }
}
