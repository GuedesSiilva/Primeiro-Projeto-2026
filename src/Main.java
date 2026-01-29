import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<String> ListaNomes = new ArrayList<>();
    public static void main(String[] args) {

        ListaNomes.add("Guedes");

        Scanner scan = new Scanner(System.in);

        System.out.println("O Que você deseja Realizar?? \n 1-Listar Nomes \n 2-Adicionar Nome \n 3-Editar Nome \n 4-Excluir Nome \n");
        String selecionado = scan.nextLine();

        switch (selecionado) {
            case "1":
                selecionado = "1";
                listar ();
                break;
            case "2":
                selecionado ="2";

                break;
            case "3":
                selecionado = "3";

                break;
            case "4":
                selecionado = "4";
                Remover();
                break;
        }
    }
    public static void listar (){
        for(String Nomes : ListaNomes){
            System.out.println("Nomes Presentes:");
            System.out.println(Nomes + "\n");
        }
    }
    public static void Remover (){
        int N = 0;
        for (String Nomes : ListaNomes) {
            System.out.println("Nomes Presentes:");
            System.out.println(N+1 + "-" + Nomes + "\n");
        }
    }
}
