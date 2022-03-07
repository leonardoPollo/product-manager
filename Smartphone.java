public class Smartphone extends Produto {

    private String cpu;
    private int hdd;
    private int bateria;

    public Smartphone(String marca, String nome, double preco, int codigo, String cpu, int hdd, int bateria) {
        super(marca, nome, preco, codigo);
        this.cpu = cpu;
        this.hdd = hdd;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
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

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        getGeraCodigo();
        return codigo;
    }

    public int getCode() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCPU() {
        return cpu;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public int getHDD() {
        return hdd;
    }

    public void setHDD(int hdd) {
        this.hdd = hdd;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public Smartphone() {

    }

    @Override
    public String toString() {
    return "Marca: "+marca +"\nNome: "+nome+"\nPreço: R$ "+preco+"\nCódigo: "+codigo+"\nProcessador: "+cpu+"\nArmazenamento: "+hdd+" GBs"+"\nCapacidade Bateria: "+bateria+" mAh";
    }
}
