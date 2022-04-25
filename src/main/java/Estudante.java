public class Estudante {
    private int codigoEstudante;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private Cidade cidadeEstudante;

    public Estudante(int codigoEstudante, String nome, String dataNascimento, String email, String senha, Cidade cidadeEstudante) {
        this.codigoEstudante = codigoEstudante;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.cidadeEstudante = cidadeEstudante;
        this.cidadeEstudante.adicionaNovoEstudante();
    }

    public int getCodigoEstudante() {
        return codigoEstudante;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Cidade getCidadeEstudante() {
        return cidadeEstudante;
    }

    public void setCodigoEstudante(int codigoEstudante) {
        this.codigoEstudante = codigoEstudante;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCidade(Cidade cidade) {
        this.cidadeEstudante = cidadeEstudante;
    }

    public void exibeDados() {
        System.out.println("-----------------------");
        System.out.println("ESTUDANTE");
        System.out.println("Código do estudante: " + codigoEstudante);
        System.out.println("Nome do estudante: " + nome);
        System.out.println("Data de nascimento: "+ dataNascimento);
        System.out.println("E-mail: "+ email);
        System.out.println("Senha atual: " + senha);
        cidadeEstudante.exibeDados();
    }
}


