package org.example;

public class Carro extends Veiculo {
    public String modelo;
    public String cor;
    public String fabricante;

    // Método para atribuir valores ao fabricante e modelo
    public void setValores(String fabricante, String modelo, String cor, int numeroDeRodas, String tipoPropulsao) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.numeroDeRodas = numeroDeRodas;
        this.tipoPropulsao = tipoPropulsao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Numero de rodas: " + numeroDeRodas);
        System.out.println("Tipo de propulsão: " + tipoPropulsao);


    }


}
