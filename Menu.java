import javax.swing.JOptionPane;

public class Menu {
    
    public Menu() {

    }

    public Carro addCarro() {
        Carro c2 = new Carro();
        String marca = JOptionPane.showInputDialog(null, "Marca do Carro:", "Adicionando Carro", JOptionPane.INFORMATION_MESSAGE);
        if (marca == null | marca.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Carro", JOptionPane.WARNING_MESSAGE);
            addCarro();
        }else {
            c2.setMarca(marca);
        }
        String nome = JOptionPane.showInputDialog(null, "Nome do Carro:", "Adicionando Carro", JOptionPane.INFORMATION_MESSAGE);
        if (nome == null | nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Carro", JOptionPane.WARNING_MESSAGE);
            addCarro();
        }else {
            c2.setNome(nome);
        }
        String preco = JOptionPane.showInputDialog(null, "Preço do Carro:", "Adicionando Carro", JOptionPane.INFORMATION_MESSAGE);
        if (preco == null | preco.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Carro", JOptionPane.WARNING_MESSAGE);
            addCarro();
        }else {
            double pre = Double.parseDouble(preco);
            c2.setPreco(pre);
        }
        c2.setCodigo(c2.getCodigo());
        String potencia = JOptionPane.showInputDialog(null, "Potência do Carro:", "Adicionando Carro", JOptionPane.INFORMATION_MESSAGE);
        if (potencia == null | potencia.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Carro", JOptionPane.WARNING_MESSAGE);
            addCarro();
        }else {
            int hp = Integer.parseInt(potencia);
            c2.setPotencia(hp);
        }
        String kml = JOptionPane.showInputDialog(null, "Km/L do Carro:", "Adicionando Carro", JOptionPane.INFORMATION_MESSAGE);
        if (kml == null | kml.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Carro", JOptionPane.WARNING_MESSAGE);
            addCarro();
        }else {
            double km = Double.parseDouble(kml);
            c2.setKml(km);
        }
        String zeroacem = JOptionPane.showInputDialog(null, "0 a 100km/h do Carro:", "Adicionando Carro", JOptionPane.INFORMATION_MESSAGE);
        if (zeroacem == null | zeroacem.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Carro", JOptionPane.WARNING_MESSAGE);
            addCarro();
        }else {
            double zc = Double.parseDouble(zeroacem);
            c2.setZeroAcem(zc);
        }

        JOptionPane.showMessageDialog(null, "Carro Adicionado com Sucesso", "Adicionando Carro", JOptionPane.INFORMATION_MESSAGE);
        return c2;
    }

    public Smartphone addSmartphone() {
        Smartphone s2 = new Smartphone();
        String marca = JOptionPane.showInputDialog(null, "Marca do Smartphone:", "Adicionando Smartphone", JOptionPane.INFORMATION_MESSAGE);
        if (marca == null | marca.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Smartphone", JOptionPane.WARNING_MESSAGE);
            addSmartphone();
        }else {
            s2.setMarca(marca);
        }
        String nome = JOptionPane.showInputDialog(null, "Nome do Smartphone:", "Adicionando Smartphone", JOptionPane.INFORMATION_MESSAGE);
        if (nome == null | nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Smartphone", JOptionPane.WARNING_MESSAGE);
            addSmartphone();
        }else {
            s2.setNome(nome);
        }
        String preco = JOptionPane.showInputDialog(null, "Preço do Smartphone:", "Adicionando Smartphone", JOptionPane.INFORMATION_MESSAGE);
        if (preco == null | preco.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Smartphone", JOptionPane.WARNING_MESSAGE);
            addSmartphone();
        }else {
            double pre = Double.parseDouble(preco);
            s2.setPreco(pre);
        }
        s2.setCodigo(s2.getCodigo());
        String cpu = JOptionPane.showInputDialog(null, "Processador do Smartphone:", "Adicionando Smartphone", JOptionPane.INFORMATION_MESSAGE);
        if (cpu == null | cpu.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Smartphone", JOptionPane.WARNING_MESSAGE);
            addSmartphone();
        }else {
            s2.setCPU(cpu);
        }
        String hdd = JOptionPane.showInputDialog(null, "Armazenamento do Smartphone:", "Adicionando Smartphone", JOptionPane.INFORMATION_MESSAGE);
        if (hdd == null | hdd.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Smartphone", JOptionPane.WARNING_MESSAGE);
            addSmartphone();
        }else {
            int hd = Integer.parseInt(hdd);
            s2.setHDD(hd);
        }
        String bateria = JOptionPane.showInputDialog(null, "Capacidade da Bateria:", "Adicionando Smartphone", JOptionPane.INFORMATION_MESSAGE);
        if (bateria == null | bateria.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Smartphone", JOptionPane.WARNING_MESSAGE);
            addSmartphone();
        }else {
            int bt = Integer.parseInt(bateria);
            s2.setBateria(bt);
        }

        JOptionPane.showMessageDialog(null, "Smartphone Adicionado com Sucesso", "Adicionando Smartphone", JOptionPane.INFORMATION_MESSAGE);
        return s2;
    }

    public FoneDeOuvido addFone() {
        FoneDeOuvido f2 = new FoneDeOuvido();
        String marca = JOptionPane.showInputDialog(null, "Marca do Fone de Ouvido:", "Adicionando Fone de Ouvido", JOptionPane.INFORMATION_MESSAGE);
        if (marca == null | marca.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Fone de Ouvido", JOptionPane.WARNING_MESSAGE);
            addFone();
        }else {
            f2.setMarca(marca);
        }
        String nome = JOptionPane.showInputDialog(null, "Nome do Fone de Ouvido:", "Adicionando Fone de Ouvido", JOptionPane.INFORMATION_MESSAGE);
        if (nome == null | nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Fone de Ouvido", JOptionPane.WARNING_MESSAGE);
            addFone();
        }else {
            f2.setNome(nome);
        }
        String preco = JOptionPane.showInputDialog(null, "Preço do Fone de Ouvido:", "Adicionando Fone de Ouvido", JOptionPane.INFORMATION_MESSAGE);
        if (preco == null | preco.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Fone de Ouvido", JOptionPane.WARNING_MESSAGE);
            addFone();
        }else {
            double pre = Double.parseDouble(preco);
            f2.setPreco(pre);
        }
        f2.setCodigo(f2.getCodigo());
        String driver = JOptionPane.showInputDialog(null, "Tamanho do Driver:", "Adicionando Fone de Ouvido", JOptionPane.INFORMATION_MESSAGE);
        if (driver == null | driver.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Fone de Ouvido", JOptionPane.WARNING_MESSAGE);
            addFone();
        }else {
            int d = Integer.parseInt(driver);
            f2.setDriver(d);
        }
        String impe = JOptionPane.showInputDialog(null, "Impendância do Fone:", "Adicionando Fone de Ouvido", JOptionPane.INFORMATION_MESSAGE);
        if (impe == null | impe.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Fone de Ouvido", JOptionPane.WARNING_MESSAGE);
            addFone();
        }else {
            int imp = Integer.parseInt(impe);
            f2.setImpe(imp);
        }
        String freq = JOptionPane.showInputDialog(null, "Resposta de Frequência:", "Adicionando Fone de Ouvido", JOptionPane.INFORMATION_MESSAGE);
        if (freq == null | freq.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!\nTente Novamente", "Adicionando Fone de Ouvido", JOptionPane.WARNING_MESSAGE);
            addFone();
        }else {
            f2.setFreq(freq);
        }

        JOptionPane.showMessageDialog(null, "Fone de Ouvido Adicionado com Sucesso", "Adicionando Fone de Ouvido", JOptionPane.INFORMATION_MESSAGE);
        return f2;
    }
}
