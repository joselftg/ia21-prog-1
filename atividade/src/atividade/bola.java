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
public class bola {
    private String cor, material;
 private double circunferencia;
 
 public bola (String c, String mat, double cir){
     this.cor = c;
     this.material = mat;
     this.circunferencia = cir;
     
 }
 
 public void trocarCor(String c){
     this.cor =c;
 }
 
 public String mostrarCor(){
     return this.cor;
     
 }
}
