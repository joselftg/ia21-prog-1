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
public class quadrado{
 private double lado;
 
 public quadrado (double LD){
    this.lado = LD;
 }
 public void mudarLado (double LD){
     this.lado = LD;
 }
 public double retornarLado (){
     return this.lado;
 }
 
 public double calcArea(){
     return lado*lado;
 }
     
}


