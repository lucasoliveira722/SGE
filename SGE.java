import java.util.Scanner;

public class SGE {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = null;

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.nextLine();

        String login = nome.charAt(0) + "_" + sobrenome;
        System.out.println("Seu login é: " + login);

        boolean senhaPadrao = false;

        while (senhaPadrao == false) {

            System.out.println("Insira uma senha:");
            senha = scanner.nextLine();

            if (senha.length() >= 8 && senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+")) {
                System.out.println("Senha está dentro do padrão, direcionando para login");
                senhaPadrao = true;
            } else {
                System.out.println("Senha está fora do padrão, digite uma nova:");
            }
        }

        boolean doLogin = false;

        while (doLogin == false){

            System.out.println("Insira seu login:");
            String vLogin = scanner.nextLine();

            System.out.println("Insira sua senha:");
            String vSenha = scanner.nextLine();

            if (vLogin.equals(login) && vSenha.equals(senha)){
                System.out.println("Login realizado com sucesso!");
                doLogin = true;
            }else{
                System.out.println("Login ou senha errados... tente novamente!");
            }

        }

    }
}