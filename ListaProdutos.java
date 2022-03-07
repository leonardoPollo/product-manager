import javax.swing.JOptionPane;

public class ListaProdutos {
    
    private Produto[] produtos;
    private int i;

    public ListaProdutos(int p) {
        this.produtos = new Produto[p];
        i = 0;
    }

    public void addProduto(Produto p) {
        if (i < produtos.length) {
            produtos[i] = p;
            i++;
        }
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public int getI() {
        return i;
    }

    public double[] geraVetor() {
        double[] vetor = new double[i];

        for (int j = 0; j < i; j++) {
            if (produtos[j] instanceof FoneDeOuvido) {
                vetor[j] = produtos[j].getPreco();
            }else {
                if (produtos[j] instanceof Carro) {
                    vetor[j] = produtos[j].getPreco();
                }else {
                    if (produtos[j] instanceof Smartphone) {
                        vetor[j] = produtos[j].getPreco();
                    }
                }
            }
        }
        return vetor;
    }

    public double[] ordernar(double[] vetor) {
        double chave;
        int a;
        int e;

        for (a = 1; a < vetor.length; a++) {
            chave = vetor[a];
            for (e = a - 1; (e >= 0) && (vetor[e] > chave); e--) {
                vetor[e + 1] = vetor[e];
            }
            vetor[e + 1] = chave;
        }

        return vetor;
    }


    public void imprimeEmOrdem() {
        String imprimeee ="";
        for (int j = 0; j < i; j++) {
            for (int a = 0; a < i; a++) {
                if (ordernar(geraVetor())[j] == produtos[a].getPreco()) {
                    imprimeee += "Nome: "+produtos[a].getNome()+"\n"+"Preço: R$"+produtos[a].getPreco()+"\n\n";
                }
            }
                
            
        }
        JOptionPane.showMessageDialog(null, imprimeee, "Preço Ordenado em Crescente", JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean attInfoC(Carro c, Carro c2) {
        for (int j = 0; j < i; j++) {
            if (produtos[j].getNome().equals(c.getNome())) {
                ((Carro)produtos[j]).setMarca(c2.getMarca());
                ((Carro)produtos[j]).setNome(c2.getNome());
                ((Carro)produtos[j]).setPreco(c2.getPreco());
                ((Carro)produtos[j]).setPotencia(c2.getPotencia());
                ((Carro)produtos[j]).setKml(c2.getKml());
                ((Carro)produtos[j]).setZeroAcem(c2.getZeroAcem());
                JOptionPane.showMessageDialog(null, "Carro Atualizado com Sucesso!", "Atualizando Produto", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }return false;
    }

    public boolean attInfoS(Smartphone c, Smartphone c2) {
        for (int j = 0; j < i; j++) {
            if (produtos[j].getNome().equals(c.getNome())) {
                ((Smartphone)produtos[j]).setMarca(c2.getMarca());
                ((Smartphone)produtos[j]).setNome(c2.getNome());
                ((Smartphone)produtos[j]).setPreco(c2.getPreco());
                ((Smartphone)produtos[j]).setCPU(c2.getCPU());
                ((Smartphone)produtos[j]).setHDD(c2.getHDD());
                ((Smartphone)produtos[j]).setBateria(c2.getBateria());
                JOptionPane.showMessageDialog(null, "Smartphone Atualizado com Sucesso!", "Atualizando Produto", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }return false;
    }

    public boolean attInfoF(FoneDeOuvido c, FoneDeOuvido c2) {
        for (int j = 0; j < i; j++) {
            if (produtos[j].getNome().equals(c.getNome())) {
                ((FoneDeOuvido)produtos[j]).setMarca(c2.getMarca());
                ((FoneDeOuvido)produtos[j]).setNome(c2.getNome());
                ((FoneDeOuvido)produtos[j]).setPreco(c2.getPreco());
                ((FoneDeOuvido)produtos[j]).setDriver(c2.getDriver());
                ((FoneDeOuvido)produtos[j]).setImpe(c2.getImpe());
                ((FoneDeOuvido)produtos[j]).setFreq(c2.getFreq());
                JOptionPane.showMessageDialog(null, "Fone de Ouvido Atualizado com Sucesso!", "Atualizando Produto", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }return false;
    }

    public boolean removeProdutoN(Produto p) {
        for (int j = 0; j < i; j++) {
            if (produtos[j].getNome().equals(p.getNome())) {
                produtos[j] = produtos[i - 1];
                i--;
                JOptionPane.showMessageDialog(null, "Produto Removido com Sucesso!", "Removendo Produto", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }return false;
    }

    public boolean removeProdutoC(Produto p) {
        for (int j = 0; j < i; j++) {
            if (produtos[j].getCode() == p.getCode()) {
                produtos[j] = produtos[i - 1];
                i--;
                JOptionPane.showMessageDialog(null, "Produto Removido com Sucesso!", "Removendo Produto", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }return false;
    }

    public void imprime() {
        if (i == 0) {
            System.out.println("\nNenhum Produto Cadastrado!");
        }else {
            String print = "";
            int fones = 0;
            for (int j = 0; j < i; j++) {
                if (produtos[j] instanceof FoneDeOuvido) {
                    fones++;
                    print += "|| Fone de Ouvido "+(fones)+" ||\n"+produtos[j]+"\n\n";
                }
            }
            int carros = 0;
            for (int j = 0; j < i; j++) {
                if (produtos[j] instanceof Carro) {
                    carros++;
                    print += "|| Carro "+(carros)+" ||\n"+produtos[j]+"\n\n";
                }
            }
            int smartphones = 0;
            for (int j = 0; j < i; j++) {
                if (produtos[j] instanceof Smartphone) {
                    smartphones++;
                    print += "|| Smartphone "+(smartphones)+" ||\n"+produtos[j]+"\n\n";
                }
            }
            JOptionPane.showMessageDialog(null, print, "Lista de Produtos Cadastrados", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
