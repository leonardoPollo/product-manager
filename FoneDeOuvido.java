public class FoneDeOuvido extends Produto{

    private int driver;
    private int impe;
    private String freq;

    public FoneDeOuvido(String marca, String nome, double preco, int codigo, int driver, int impe, String freq) {
        super(marca, nome, preco, codigo);
        this.driver = driver;
        this.impe = impe;
        this.freq = freq;
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

    public int getDriver() {
        return driver;
    }

    public void setDriver(int driver) {
        this.driver = driver;
    }

    public int getImpe() {
        return impe;
    }

    public void setImpe(int impe) {
        this.impe = impe;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    public FoneDeOuvido() {
        
    }

    @Override
    public String toString() {
    return "Marca: "+marca +"\nNome: "+nome+"\nPreço: R$ "+preco+"\nCódigo: "+codigo+"\nDriver: "+driver+" mm"+"\nImpedância: "+impe+" Ohms"+"\nFrequência: "+freq+" Khz";
    }
    
}
