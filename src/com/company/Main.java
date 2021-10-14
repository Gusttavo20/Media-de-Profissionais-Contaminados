package com.company;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaSim = new Scanner(System.in);
        Scanner entradaNao = new Scanner(System.in);
        Scanner entradaNome = new Scanner(System.in);

        int idade;
        String resposta, nome;
        double media, contSim = 0, contNao = 0, profissionais = 0, cont = 0;;

        while (profissionais <= 10){

            System.out.println("Informe seu nome: ");
            nome = entrada.next();
            System.out.println("Informe sua idade? ");
            idade = entrada.nextInt();
            System.out.println("Você testou positivo para o covid-19: ");
            resposta = entrada.next();

            if ((idade >= 18 & idade <= 45) & (resposta.equals("Sim"))){
                contSim++;
            }else if ((idade >= 46 & idade <= 65) & (resposta.equals("Nao"))){
                contNao++;
            }if((idade >= 45 & idade <= 65) & (resposta.equals("Sim"))){
                cont++;
            }


            profissionais++;


        }
        media = (cont / 10)*100;

        System.out.println("Respostas Sim = " + contSim);
        System.out.println("Respostas Não = " + contNao);
        System.out.println("A média de profissionais que se contaminaram com idade entre 45 e 65 anos é de: " + media + "% ");
    }

}


