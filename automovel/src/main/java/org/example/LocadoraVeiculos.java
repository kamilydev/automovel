package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LocadoraVeiculos {
    public static void main(String[] args) {

        int opcao = 0;

        List<Carro> listaCarros = new ArrayList<Carro>();
        List<Bicicleta> listaBicicleta = new ArrayList<Bicicleta>();

        //Iniciando leitura de dados para inserção
        Scanner scanner = new Scanner(System.in);


        System.out.println("## Escolha qual das opções de veículo será cadastrada ##");
        System.out.println("Opção 1 - Cadastra carro");
        System.out.println("Opção 2 - Cadastra bicicleta");
        System.out.println("Opção 0 - Sair do programa");
        System.out.println("_______________________");

        System.out.print("Digite aqui sua opção: ");
        opcao = Integer.parseInt(scanner.nextLine());

        // Solicita o fabricante do carro
        System.out.print("Digite o fabricante do Veículo: ");
        String fabricante = scanner.nextLine();

        // Solicita o modelo do carro
        System.out.print("Digite o modelo do Veículo: ");
        String modelo = scanner.nextLine();

        // Solicita a cor do carro
        System.out.print("Digite a cor do Veículo: ");
        String cor = scanner.nextLine();

        // Solicita o tipo de propulsão do carro
        System.out.print("Digite o tipo de propulsão do Veículo: ");
        String tipoPropulsao = scanner.nextLine();

        // Solicita o numero de rodas do carro
        System.out.print("Digite o número de rodas do Veículo: ");
        int numeroDeRodas = scanner.nextInt();



        if(opcao == 1){
            Carro c = new Carro();

            c.setValores( fabricante, modelo, cor, numeroDeRodas, tipoPropulsao);

            // Exibe as informações do carro
            System.out.println("\nInformações do Veículo:");
            c.exibirInformacoes();

        } else if(opcao == 2) {
            Bicicleta b = new Bicicleta();

            b.setValores( fabricante, modelo, cor, numeroDeRodas, tipoPropulsao);

            // Exibe as informações do carro
            System.out.println("\nInformações do Veículo:");
            b.exibirInformacoes();
        }else{
            scanner.close();
            System.out.print("Aplicação encerrada");
        }


    }

}