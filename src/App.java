import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá usuário, bem vindo. Por favor digite seu sobrenome:");
        String sobrenome = sc.nextLine();
        System.out.println("Muito prazer Sr. " + sobrenome + " e qual seu primeiro nome?");
        String nome = sc.nextLine();
        System.out.println( "Seu nome é " + nome + " " + sobrenome);
        int letrasNome = nome.length();
        int letrasSobrenome = sobrenome.length();
        int numeroLetrasTot = letrasNome + letrasSobrenome;
        System.out.println( "Uma curiosidade, seu nome completo tem " + numeroLetrasTot + " letras. :D");
        sc.close();
    }
}
