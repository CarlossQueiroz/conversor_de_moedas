package br.com.conversorDeMoedas.Servicos;

import java.util.Scanner;

public class MenuOpcoes {

    private Scanner scanner;
    private String[] moedas = {"USD","EUR","GBP","ARS","AUD","CHF"};

    public MenuOpcoes(){
        this.scanner = new Scanner(System.in);
    }

    public void menuMoedas(){
        System.out.println("**** CONVERSOR DE MOEDAS ****");
        for (int i = 0; i < this.moedas.length; i++) {
            System.out.println((i+1)+" - " + moedas[i]);
        }
    }

    public int inputValido(String mensagem){
        System.out.println(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida! Digite um número:");
            scanner.next();
        }

        return scanner.nextInt();
    }

    public String lerMoeda(String tipo){
        String mensagem = String.format("Digite o número da moeda %s: ",tipo);
        int escolha=0;
        do {
            escolha = inputValido(mensagem);
        }while (escolha<1 || escolha>moedas.length);

        return this.moedas[escolha-1];
    }

    public double lerValorConversao(){
        double valor=0;
        while(valor<=0){
            System.out.println("Quanto deseja converter:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida!");
                scanner.next();
            }
            valor = scanner.nextDouble();
        }

        return valor;
    }

    public boolean stop() {
        System.out.print("\nDeseja realizar outra conversão? (s/n): ");
        scanner.nextLine();
        String resposta = scanner.nextLine().trim().toLowerCase();

        if (resposta.equals("n")) {
            System.out.println("Saindo do programa...");
            scanner.close();
            return false;
        }

        return true;
    }

}
