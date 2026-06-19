import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<HashModel> memory = new ArrayList<>();
    static HashCreator hash = new HashCreator();

    public static void main(String[] args) {
        int option;

        do{
            System.out.println("============================");
            System.out.println("===== CALCULADORA HASH =====");
            System.out.println("============================");
            System.out.println("1- Criar um hash \n"
                            + "2- Listar todos os hash's salvos \n"
                            + "0- Sair"
            );
            option = sc.nextInt();

            switch (option){
                case 1:
                    cadastrarHash();
                    break;
                default:
                    System.out.println("ERROR: opção digitada inválida!");
            }
        }while(option != 0);
    }

    // Procedimento para criar um hash:
    public static void cadastrarHash(){
        String origem, hashFinal, salvar;

        System.out.println("Digite o texto que você quer codificar: ");
        sc.nextLine();
        origem = sc.nextLine();
        hashFinal = hash.hashing(origem);
        System.out.println("\nTexto de origem: " + origem);
        System.out.println("Texto codificado: " + hashFinal);

        System.out.println("\nDeseja salvar esse hash? (s/n)");
        salvar = sc.nextLine();
        if(salvar.equals("s")){
            memory.add(new HashModel(origem, hashFinal));
            System.out.println("Hash salvo!");
        }
        continuar();
    }

    // Procedimento que aguarda confirmação do usuário para continuar + espaçamento
    public static void continuar(){
        System.out.println("Pressione ENTER para continuar");
        sc.nextLine();
        System.out.println("\n\n\n\n");
    }
}