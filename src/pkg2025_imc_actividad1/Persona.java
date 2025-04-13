/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2025_imc_actividad1;

import javax.swing.JOptionPane;

/**
 *
 * @author mcruz
 */
public class Persona {
  
    //atributos
    private float peso;
    private float estatura;
    private float imc;
    
    //métodos

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc() {
        this.imc = getPeso() / (getEstatura() * getEstatura());
    }
    
    public void mostrarImc(){
        JOptionPane.showConfirmDialog(null, "Su Índice de Masa Corporal es: " + getImc());
        
        if(getImc()<18.5) {
            JOptionPane.showConfirmDialog(null, "Usted tiene Bajo Peso");
        }else if(getImc() >=18.5 && getImc()<=24.9){
            JOptionPane.showConfirmDialog(null, "Usted tiene Peso Normal");
        }else if(getImc() >=25 && getImc()<=29.9){
            JOptionPane.showConfirmDialog(null, "Usted tiene Sobrepeso");
        }else if(getImc() >=30 && getImc()<=34.9){
            JOptionPane.showConfirmDialog(null, "Usted tiene Obesidad grado I");
        }else if(getImc() >=35 && getImc()<=39.9){
            JOptionPane.showConfirmDialog(null, "Usted tiene Obesidad grado II");
        }else{
            JOptionPane.showConfirmDialog(null, "Usted tiene Obesidad grado III");  
        }
    }
    
}
