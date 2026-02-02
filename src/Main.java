import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<String> ListaNomes = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        ListaNomes.add("Guedes");
        ListaNomes.add("Bispo");

        menu: while(true) {

            System.out.println("""
                    O Que você deseja Realizar??
                    1-Listar Nomes
                    2-Adicionar Nome
                    3-Editar Nome  
                    4-Excluir Nome  
                    5-Sair""");
            String selecionado = scan.nextLine();

            switch (selecionado) {
                case "1":
                    selecionado = "1";
                    listar();
                    break;
                case "2":
                    selecionado = "2";
                    AdicionarNome();
                    break;
                case "3":
                    selecionado = "3";
                    Editar();
                    break;
                case "4":
                    selecionado = "4";
                    Remover();
                    break;
                case "5":
                    selecionado = "5";
                    System.out.println("Saindo");
                    break menu;
            }
        }
    }
    public static void listar (){
        System.out.println("Nomes Presentes:");
        for (int i = 0; i < ListaNomes.size(); i++) {
            System.out.println((i + 1) + " - " + ListaNomes.get(i));
        }
    }
    public static void AdicionarNome () {
        System.out.println("Digite o nome que deseja adicionar:");
        String NovoNome = scan.nextLine();
        ListaNomes.add(NovoNome);
        System.out.println("\n Lista atualizada:");
        for (int i = 0; i < ListaNomes.size(); i++) {
            System.out.println((i + 1) + " - " + ListaNomes.get(i));
        }
    }
    public static void Editar(){
        System.out.println("Nomes Presentes:");
        for (int i = 0; i < ListaNomes.size(); i++) {
            System.out.println((i + 1) + " - " + ListaNomes.get(i));
        }
        System.out.println("Digite o id do nome:");
        String escolha = scan.nextLine();
        try {
            int NumEditar = Integer.parseInt(escolha) - 1;
            if (NumEditar >= 0 && NumEditar < ListaNomes.size()){
                System.out.println("Qual será o novo nome?");
                String NovoNome = scan.nextLine();
                ListaNomes.set(NumEditar,NovoNome);
                System.out.println("\n Lista atualizada:");
                for (int i = 0; i < ListaNomes.size(); i++) {
                    System.out.println((i + 1) + " - " + ListaNomes.get(i));
                }
            }
        }
        catch (NumberFormatException e){
            System.out.println("Erro: Entrada Inválida.");
        }
    }
    public static void Remover (){
        if (ListaNomes.isEmpty()){
            System.out.println("A lista está vazia");
        }else {
            System.out.println("Nomes Presentes:");
            for (int i = 0; i < ListaNomes.size(); i++) {
                System.out.println((i + 1) + " - " + ListaNomes.get(i));
            }

            System.out.println("Digite o id do nome:");
            String escolha = scan.nextLine();
            try {
                int RemoverNumero = Integer.parseInt(escolha) - 1;
                if (RemoverNumero >= 0 && RemoverNumero < ListaNomes.size()) {
                    String NomeRemovido = ListaNomes.remove(RemoverNumero);
                    System.out.println(NomeRemovido + "foi removido da lista");
                } else {
                    System.out.println("Erro: Número Invalido");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada Inválida.");
            }
            System.out.println("\n Lista atualizada:");
            if (ListaNomes.isEmpty()) {
                System.out.println("Lista está vazia");
            } else {
                for (int i = 0; i < ListaNomes.size(); i++) {
                    System.out.println((i + 1) + " - " + ListaNomes.get(i));
                }
            }
        }
    }
}
