public class Carro extends Produto {
    
    private int potencia;
    private double kml;
    private double zeroAcem;

    public Carro(String marca, String nome, double preco, int codigo, int potencia, double kml, double zeroAcem) {
        super (marca, nome, preco, codigo);
        this.potencia = potencia;
        this.kml = kml;
        this.zeroAcem = zeroAcem;
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

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getKml() {
        return kml;
    }

    public void setKml(double kml) {
        this.kml = kml;
    }

    public double getZeroAcem() {
        return zeroAcem;
    }

    public void setZeroAcem(double zeroAcem) {
        this.zeroAcem = zeroAcem;
    }



    public Carro() {
        
    }

    @Override
    public String toString() {
    return "Marca: "+marca +"\nNome: "+nome+"\nPreço: R$ "+preco+"\nCódigo: "+codigo+"\nPotência: "+potencia+" cv"+"\nKm/L: "+kml+"\n0 a 100km/h: "+zeroAcem+"s";
    }
}
