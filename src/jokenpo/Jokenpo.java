/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jokenpo;
import java.util.Random;
import java.util.Scanner;

    public class Jokenpo{
	
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        int numeroJogador;
        int escolhaComputador;
        int pontosJogador = 0;
        int pontosComputador = 0;
       
        System.out.println ("**Bem vindo ao Jokenpo**");
        System.out.println ("O melhor de 3 tentativas vence!!");
        
        for(int i = 0; i < 3; i++){
       
            System.out.println ("Faca a sua jogada");
            System.out.println ("1 - Pedra");
            System.out.println ("2 - Papel");
            System.out.println ("3 - Tesoura");
                

            numeroJogador = leitor. nextInt();
            escolhaComputador = gerador.nextInt(3)+1;

            switch(escolhaComputador){
                case 1: 
                    System.out.println ("Computador escolheu pedra");
                    break;
                case 2: 
                    System.out.println ("Computador escolheu papel");
                    break;
                case 3: 
                    System.out.println ("Computador escolheu tesoura");
                    break;
            }
            if(numeroJogador == escolhaComputador){
                System.out.println("Empate.");

            }
            else if((numeroJogador - escolhaComputador)== -1 ||
                   (numeroJogador - escolhaComputador)== 2){
                 System.out.println("Computador vencedor.");
                 pontosComputador++; 
            }
           else {
                 System.out.println("Jogador vencedor.");
                 pontosJogador++;
            }
            if (pontosJogador ==2){
                System.out.println ("JOGADOR VENCEDOR DO JOGO!");
            }
            else if (pontosComputador ==2){
                System.out.println ("COMPUTADOR VENCEDOR DO JOGO!");	
            }
            
            
    }
    }
    }
        

