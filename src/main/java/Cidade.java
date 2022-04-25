public class Cidade {
    private int codigo;
    private String descricao;
    private String uf;
    private int qtdAlunos;

    public Cidade(int codigo, String descricao, String uf) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
        this.qtdAlunos = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUf() {
        return uf;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void adicionaNovoEstudante() {
        qtdAlunos += 1;
    }

    public void exibeDados() {
        System.out.println("-----------------------");
        System.out.println("CIDADE");
        System.out.println("Código da cidade: " + codigo);
        System.out.println("Descrição da cidade: " + descricao);
        System.out.println("UF da cidade: "+ uf);
        System.out.println("A quantidade de alunos matriculados no momento nesta cidade é de " + qtdAlunos + " aluno(s)");
        System.out.println("-----------------------");
    }
}
