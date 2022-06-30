/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

/**
 *
 * @author Alunos
 */
public class Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bola B1 = new bola("amarelo","plastico", 40.0);
        System.out.println("A cor da bola é " + B1.mostrarCor());
        B1.trocarCor("vermelho");
        System.out.println("A cor da bola é " + B1.mostrarCor());
        
        System.out.println();
        
        quadrado q3 = new quadrado(40);
        System.out.println("O lado mede: " + q3.retornarLado());
        q3.mudarLado(50);
        System.out.println("A nova medição é: " + q3.calcArea());
         
    }
    
}
