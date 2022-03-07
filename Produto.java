public class Produto {

    protected String marca;
    protected String nome;
    protected double preco;
    protected int codigo;

    public Produto(String marca, String nome, double preco, int codigo) {
        this.marca = marca;
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    private int geraCodigo() {
        codigo = (int) (Math.random()*2001)+1001;
        return codigo;
    }

    public int getGeraCodigo() {
        geraCodigo();
        return codigo;
    }

    public int getCode() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public Produto() {

    }

}
