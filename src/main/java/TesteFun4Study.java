import java.util.Scanner;

public class TesteFun4Study {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // criacao do scanner
        // criacao da cidade 1
        Cidade cidade1 = addCidade(sc);
        cidade1.exibeDados();

        // criacao dos estudantes da cidade 1
        Estudante estudante1 = addEstudante(sc, cidade1); // estudante1 irá pertencer à cidade1
        atualizaSenha(sc, estudante1);
        estudante1.exibeDados();

        Estudante estudante2 = addEstudante(sc,cidade1);
        atualizaSenha(sc, estudante2);
        estudante2.exibeDados();

        // criacao da cidade 2
        Cidade cidade2 = addCidade(sc);
        cidade2.exibeDados();

        // criacao dos estudantes da cidade2
        Estudante estudante3 = addEstudante(sc, cidade2);
        atualizaSenha(sc, estudante3);
        estudante3.exibeDados();

        Estudante estudante4 = addEstudante(sc, cidade2);
        atualizaSenha(sc, estudante4);
        estudante4.exibeDados();

        sc.close(); // encerra o scanner
    }

    public static Cidade addCidade(Scanner sc) {  // metodo para a criacao da cidade, com o intuito de nao precisar repetir
        System.out.println("Escreva o código da cidade: " );
        int codigoCidade = sc.nextInt();
        sc.nextLine(); // para nao dar quebra de linha
        System.out.println("Escreva a descrição: ");
        String descricaoCidade = sc.nextLine();
        System.out.println("Escreva a UF: ");
        String ufCidade = sc.nextLine();
        return new Cidade(codigoCidade, descricaoCidade, ufCidade); // retorna a criacao do objeto
    }

    public static Estudante addEstudante(Scanner sc, Cidade cidade) {  // metodo para a criacao do estudante, com o intuito de nao precisar repetir
        System.out.println("Escreva o código do estudante: " );
        int codigoEstudante = sc.nextInt();
        sc.nextLine(); // para nao dar quebra de linha
        System.out.println("Escreva o nome do estudante: ");
        String nomeEstudante = sc.nextLine();
        System.out.println("Escreva a data de nascimento: ");
        String dataNascimento = sc.nextLine();
        System.out.println("Escreva o email: ");
        String email = sc.nextLine();
        System.out.println("Escreva a senha: ");
        String senha = sc.nextLine();
        return new Estudante(codigoEstudante, nomeEstudante, dataNascimento, email, senha, cidade); // retorna a criacao do objeto
    }

    public static void atualizaSenha(Scanner sc, Estudante estudante) {  // metodo para a atualizacao da senha
        System.out.println("Digite sua senha atual: ");
        String senha = sc.nextLine();

        if (senha.equals(estudante.getSenha())) { // se a senha inicial for de fato igual a senha recebida pelo input do usuario, solicita a nova senha
            System.out.println("Digite sua nova senha: ");
            String novaSenha = sc.nextLine();
            System.out.println("Digite a nova senha novamente: ");
            String novaSenhaRepetida = sc.nextLine();
            if (novaSenha.equals(novaSenhaRepetida)) { // se a nova senha for igual a senha repetida, a senha nova se tornará a senha atual
                System.out.println("\u001B[32mSua senha foi atualizada com sucesso!\u001B[0m");
                estudante.setSenha(novaSenha);
            } else { // caso as senhas nao forem iguais, mostra a mensagem de erro
                System.out.println("\u001B[31mErro: as senhas não são iguais.\u001B[0m");
            }
        } else { // se a senha recebida pelo input nao for igual a senha inicial, mostra o erro
            System.out.println("\u001B[31mErro: a senha está incorreta.\u001B[0m");
        }
    }
}
