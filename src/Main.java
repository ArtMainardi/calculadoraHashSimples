import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        HashCreator hash = new HashCreator();
        String origem, hashFinal;
        int option;

        do{
            System.out.println("============================");
            System.out.println("===== CALCULADORA HASH =====");
            System.out.println("============================");
            System.out.println("1- Criar um hash \n"
                            + "0- Sair"
            );
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Digite o texto que você quer codificar: ");
                    sc.nextLine();
                    origem = sc.nextLine();
                    hashFinal = hash.hashing(origem);
                    System.out.println("\nTexto de origem: " + origem);
                    System.out.println("Texto codificado: " + hashFinal);
                    continuar();
                    break;
                default:
                    System.out.println("ERROR: opção digitada inválida!");
            }
        }while(option != 0);
    }

    public static void continuar(){
        System.out.println("Pressione ENTER para continuar");
        sc.nextLine();
        System.out.println("\n\n\n\n");
    }
}