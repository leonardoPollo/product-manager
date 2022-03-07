import javax.swing.JOptionPane;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        
        File produtoList = new File("Produtos.txt");

        Menu m = new Menu();

        ListaProdutos l = new ListaProdutos(20);

        try {
            FileReader pr = new FileReader(produtoList);
            BufferedReader pbr = new BufferedReader(pr);
            String linha = pbr.readLine();
            while (linha != null) {
                if (linha.contains("Carro")) {
                    linha = pbr.readLine();
                    Carro c1 = new Carro();
                    c1.setMarca(linha);
                    linha = pbr.readLine();
                    c1.setNome(linha);
                    linha = pbr.readLine();
                    c1.setPreco(Double.parseDouble(linha));
                    linha = pbr.readLine();
                    c1.setCodigo(Integer.parseInt(linha));
                    linha = pbr.readLine();
                    c1.setPotencia(Integer.parseInt(linha));
                    linha = pbr.readLine();
                    c1.setKml(Double.parseDouble(linha));
                    linha = pbr.readLine();
                    c1.setZeroAcem(Double.parseDouble(linha));
                    l.addProduto(c1);
                    linha = pbr.readLine();
                } else {
                    if (linha.contains("Smartphone")) {
                        linha = pbr.readLine();
                        Smartphone s1 = new Smartphone();
                        s1.setMarca(linha);
                        linha = pbr.readLine();
                        s1.setNome(linha);
                        linha = pbr.readLine();
                        s1.setPreco(Double.parseDouble(linha));
                        linha = pbr.readLine();
                        s1.setCodigo(Integer.parseInt(linha));
                        linha = pbr.readLine();
                        s1.setCPU(linha);
                        linha = pbr.readLine();
                        s1.setHDD(Integer.parseInt(linha));
                        linha = pbr.readLine();
                        s1.setBateria(Integer.parseInt(linha));
                        l.addProduto(s1);
                        linha = pbr.readLine();
                    } else {
                        if (linha.contains("Fone")) {
                            linha = pbr.readLine();
                            FoneDeOuvido f1 = new FoneDeOuvido();
                            f1.setMarca(linha);
                            linha = pbr.readLine();
                            f1.setNome(linha);
                            linha = pbr.readLine();
                            f1.setPreco(Double.parseDouble(linha));
                            linha = pbr.readLine();
                            f1.setCodigo(Integer.parseInt(linha));
                            linha = pbr.readLine();
                            f1.setDriver(Integer.parseInt(linha));
                            linha = pbr.readLine();
                            f1.setImpe(Integer.parseInt(linha));
                            linha = pbr.readLine();
                            f1.setFreq(linha);
                            l.addProduto(f1);
                            linha = pbr.readLine();
                        }
                    }
                }
            }
            pbr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo: "+produtoList+" Não Existe!");
        } catch (Exception e) {
            System.out.println("Não foi Possível ler "+ produtoList);
        }
        while (true) {
            try {
                String opc = JOptionPane.showInputDialog(null, "(1) Para Cadastrar um Produto\n(2) Para Mostrar Lista de Produtos\n(3) Para Remover um Produto\n(4) Para Atualizar Informações de Produtos\n(5) Para Mostrar Preço dos Produtos em Ordem\n(0) Para Finalizar\n\nDigite sua Opção:", "Menu de Opção", JOptionPane.INFORMATION_MESSAGE);
                if (opc.equals("1")) {
                    while (true) {
                        try {
                            String op = JOptionPane.showInputDialog(null, "(1) Para Adicionar um Carro\n(2) Para Adicionar um Smartphone\n(3) Para Adicionar um Fone de Ouvido\n(Cancelar) Para Voltar ao Menu\n\nDigite sua Opção:", "Adicionando Produto", JOptionPane.INFORMATION_MESSAGE);
                            if (op.equals("1")) {
                                l.addProduto(m.addCarro());
                            }else {
                                if (op.equals("2")) {
                                    l.addProduto(m.addSmartphone());
                                }else {
                                    if (op.equals("3")) {
                                        l.addProduto(m.addFone());
                                    }else {
                                        if (op.equals("0")) {
                                            break;
                                        }
                                    }
                                }
                            }        
                        } catch (NullPointerException e) {
                            break;
                        }
                    }
                }else {
                    if (opc.equals("2")) {
                        l.imprime();
                    }else {
                        if (opc.equals("3")) {
                            while (true) {
                                try {
                                    String op = JOptionPane.showInputDialog(null, "(1) Para Remover Produto pelo Nome\n(2) Para Remover Produto pelo Código\n(Cancelar) Para Voltar ao Menu\n\nDigite sua Opção:", "Removendo Produto", JOptionPane.INFORMATION_MESSAGE);
                                    if (op.equals("1")) {
                                        Produto p1 = new Produto();
                                        p1.setNome(JOptionPane.showInputDialog(null, "Digite o Nome:", "Removendo Produto", JOptionPane.INFORMATION_MESSAGE));
                                        if (l.removeProdutoN(p1) == false) {
                                            JOptionPane.showMessageDialog(null, "Não foi Possível Remover o Produto\nConfira se o Nome está escrito Corretamente!", "Removendo Produto", JOptionPane.INFORMATION_MESSAGE);
                                        }else {
                                            continue;
                                        }
                                    }else {
                                        if (op.equals("2")) {
                                            Produto p1 = new Produto();
                                            p1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Código:", "Removendo Produto", JOptionPane.INFORMATION_MESSAGE)));
                                            if (l.removeProdutoC(p1) == false) {
                                                JOptionPane.showMessageDialog(null, "Não foi Possível Remover o Produto\nConfira se o Código está escrito Corretamente!", "Removendo Produto", JOptionPane.INFORMATION_MESSAGE);
                                            }else {
                                                continue;
                                            }
                                        }
                                    }
                                } catch (NullPointerException e) {
                                    break;
                                }
                            }
                        }else {
                            if (opc.equals("4")) {
                                try {
                                    String op = JOptionPane.showInputDialog(null, "Qual Produto Voçê Deseja Atualizar as Informações?\n\n(1) Para Carro\n(2) Para Smartphone\n(3) Para Fone de Ouvido\n(Cancelar) Para Voltar ao Menu\n\nDigite sua Opção:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE);
                                    if (op.equals("1")) {
                                        Carro c = new Carro();
                                        Carro c2 = new Carro();
                                        c.setNome(JOptionPane.showInputDialog(null, "Nome do Carro que voçê deseja alterar: ", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE));
                                        c2.setMarca(JOptionPane.showInputDialog(null, "Digite a Nova Marca:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE));
                                        c2.setNome(JOptionPane.showInputDialog(null, "Digite o Novo Nome:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE));
                                        c2.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Novo Preço:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE)));
                                        c2.setPotencia(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Nova Potência:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE)));
                                        c2.setKml(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite Km/L:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE)));
                                        c2.setZeroAcem(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Novo 0 a 100km/h:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE)));
                                        if (l.attInfoC(c, c2) == false) {
                                            JOptionPane.showMessageDialog(null, "Não foi Possível Atualizar o Produto!", "Atualizando Produto", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }else {
                                        if (op.equals("2")) {
                                            Smartphone s = new Smartphone();
                                            Smartphone s2 = new Smartphone();
                                            s.setNome(JOptionPane.showInputDialog(null, "Nome do Smartphone que voçê deseja alterar: ", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE));
                                            s2.setMarca(JOptionPane.showInputDialog(null, "Digite a Nova Marca:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE));
                                            s2.setNome(JOptionPane.showInputDialog(null, "Digite o Novo Nome:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE));
                                            s2.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Novo Preço:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE)));
                                            s2.setCPU(JOptionPane.showInputDialog(null, "Digite o Novo Processador:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE));
                                            s2.setHDD(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Armazenamento:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE)));
                                            s2.setBateria(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Capacidade da Bateria:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE)));
                                            if (l.attInfoS(s, s2) == false) {
                                                JOptionPane.showMessageDialog(null, "Não foi Possível Atualizar o Produto!", "Atualizando Produto", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        }else {
                                            if (op.equals("3")) {
                                                FoneDeOuvido f = new FoneDeOuvido();
                                                FoneDeOuvido f2 = new FoneDeOuvido();
                                                f.setNome(JOptionPane.showInputDialog(null, "Nome do Fone que voçê deseja alterar: ", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE));
                                                f2.setMarca(JOptionPane.showInputDialog(null, "Digite a Nova Marca:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE));
                                                f2.setNome(JOptionPane.showInputDialog(null, "Digite o Novo Nome:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE));
                                                f2.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Novo Preço:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE)));
                                                f2.setDriver(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Tamanho do Driver:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE)));
                                                f2.setImpe(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Impendância:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE)));
                                                f2.setFreq(JOptionPane.showInputDialog(null, "Digite a Resposta de Frequência:", "Atualizando Informações", JOptionPane.INFORMATION_MESSAGE));
                                                if (l.attInfoF(f, f2) == false) {
                                                    JOptionPane.showMessageDialog(null, "Não foi Possível Atualizar o Produto!", "Atualizando Produto", JOptionPane.INFORMATION_MESSAGE);
                                                }
                                            }
                                        }
                                    }
                                } catch (NullPointerException e) {
                                    break;
                                }
                            }else {
                                if (opc.equals("5")) {
                                    l.imprimeEmOrdem();
                                }else {
                                    if (opc.equals("0")) {
                                        int sair = JOptionPane.showConfirmDialog(null, "Tem Certeza que Deseja Sair?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                                        if (sair == 1) {
                                            continue;
                                        }else {
                                            JOptionPane.showMessageDialog(null, "Programa Finalizado", "Exit", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException e) {
                break;
            }
        }
        try{
            FileWriter pw = new FileWriter(produtoList);
            for (int j = 0; j < l.getI(); j++) {
                if (l.getProdutos()[j] instanceof Carro) {
                    pw.write("Carro\n");
                    pw.write(((Carro)l.getProdutos()[j]).getMarca()+"\n");
                    pw.write(((Carro)l.getProdutos()[j]).getNome()+"\n");
                    String p = Double.toString(((Carro)l.getProdutos()[j]).getPreco());
                    pw.write(p+"\n");
                    String c = Integer.toString(((Carro)l.getProdutos()[j]).getCode());
                    pw.write(c+"\n");
                    String potencia = Integer.toString(((Carro)l.getProdutos()[j]).getPotencia());  
                    pw.write(potencia+"\n");  
                    String kml = Double.toString(((Carro)l.getProdutos()[j]).getKml()); 
                    pw.write(kml+"\n");
                    String z = Double.toString(((Carro)l.getProdutos()[j]).getZeroAcem());
                    if (j == l.getI()-1) {
                        pw.write(z);
                    }else {
                        pw.write(z+"\n");
                    }            
                }else {
                    if (l.getProdutos()[j] instanceof Smartphone) {
                        pw.write("Smartphone\n");
                        pw.write(((Smartphone)l.getProdutos()[j]).getMarca()+"\n");
                        pw.write(((Smartphone)l.getProdutos()[j]).getNome()+"\n");
                        String p = Double.toString(((Smartphone)l.getProdutos()[j]).getPreco());
                        pw.write(p+"\n");
                        String c = Integer.toString(((Smartphone)l.getProdutos()[j]).getCode());
                        pw.write(c+"\n");  
                        pw.write(((Smartphone)l.getProdutos()[j]).getCPU()+"\n");  
                        String hdd = Integer.toString(((Smartphone)l.getProdutos()[j]).getHDD()); 
                        pw.write(hdd+"\n");
                        String bateria = Integer.toString(((Smartphone)l.getProdutos()[j]).getBateria());
                        if (j == l.getI()-1) {
                            pw.write(bateria);
                        }else {
                            pw.write(bateria+"\n");
                        }
                    }else {
                        if (l.getProdutos()[j] instanceof FoneDeOuvido) {
                            pw.write("Fone\n");
                            pw.write(((FoneDeOuvido)l.getProdutos()[j]).getMarca()+"\n");
                            pw.write(((FoneDeOuvido)l.getProdutos()[j]).getNome()+"\n");
                            String p = Double.toString(((FoneDeOuvido)l.getProdutos()[j]).getPreco());
                            pw.write(p+"\n");
                            String c = Integer.toString(((FoneDeOuvido)l.getProdutos()[j]).getCode());
                            pw.write(c+"\n");  
                            String driver = Integer.toString(((FoneDeOuvido)l.getProdutos()[j]).getDriver());
                            pw.write(driver+"\n");  
                            String impe = Integer.toString(((FoneDeOuvido)l.getProdutos()[j]).getImpe()); 
                            pw.write(impe+"\n");
                            if (j == l.getI()-1) {
                                pw.write(((FoneDeOuvido)l.getProdutos()[j]).getFreq());
                            }else {
                                pw.write(((FoneDeOuvido)l.getProdutos()[j]).getFreq()+"\n");
                            }
                        }
                    } 
                }
            }
            pw.close();
        }catch (Exception e) {
            System.out.println("Não foi Possível ler "+ produtoList);
        }
    }
}
