/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class comprar {
    public String nombre1, nombre2;
    public int prod1, prod2, desc1, desc2, valor1, valor2, total;

    public void comprar(String nombre1, String nombre2, int prod1, int prod2, int desc1, int desc2, int valor1, int valor2, int total) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.prod1 = prod1;
        this.prod2 = prod2;
        this.desc1 = desc1;
        this.desc2 = desc2;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.total = total;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public int getProd1() {
        return prod1;
    }

    public int getProd2() {
        return prod2;
    }

    public int getDesc1() {
        return desc1;
    }

    public int getDesc2() {
        return desc2;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public int getTotal() {
        return total;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setProd1(int prod1) {
        this.prod1 = prod1;
    }

    public void setProd2(int prod2) {
        this.prod2 = prod2;
    }

    public void setDesc1(int desc1) {
        this.desc1 = desc1;
    }

    public void setDesc2(int desc2) {
        this.desc2 = desc2;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
     public int calculo1 (int prod1, int desc1, int valor1){
     
     desc1= (prod1*5)/100;
     valor1=prod1-desc1;
     return valor1;
     }
     
     public int calculo2 (int prod2, int desc2, int valor2){
     
     desc2= (prod2*8)/100;
     valor2=prod2-desc2;
     return valor2;
              
     }
   
     public int calculo3 (int prod1, int prod2, int desc1, int desc2, int valor1, int valor2, int total){
     
     desc1= (prod1*5)/100;
     valor1=prod1-desc1;
     desc2= (prod2*8)/100;
     valor2=prod2-desc2;
     total= valor1 + valor2;
     return total;
     
     } 
    
}
