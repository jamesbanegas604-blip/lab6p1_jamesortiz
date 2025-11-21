/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_jamesortiz;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author james
 */
public class Lab6p1_jamesortiz {
    static Scanner leer = new Scanner(System.in);
    static Random r = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean valid = true;
       while (valid){
           switch (menu()){
               case 1 : {
                   System.out.println("ingrese el tamaño del arreglo ) no puede ser menor a 5 y mayor a 20)");
                   int size = leer.nextInt();
                   while (size < 5 || size > 20){
                       System.out.println("Valor invalido, ingrese un tamaño valido");
                       size = leer.nextInt();
                   }
                   int [] numero = lecturaramdom(size);
                   System.out.println("Array origina :");
                   imprimir(numero);
                   System.out.println("Mayor a menor :");
                   imprimir(mayormenor(numero));
                   imprimir(menoramayor(numero));        
                   break;
               }
               case 2 : {
                   System.out.println("ingrese el tamaño");
                   int size = leer.nextInt();
                   int [] numero = lecturaramdom(size);
                   int[] numero2 = lecturaramdom(size);
                    System.out.println("Arreglo 1:");
                    imprimir(numero);
                    System.out.println("Arreglo 2:");
                    imprimir(numero2);
                    System.out.println("Suma paralela:");
                    imprimir(sumapralelo(numero, numero2));
                    break;
                   
                   
               } 
               case 3: {
                   break;
               } case 4 :{
                   valid = false;
               }
               default : {
                   System.out.println("opcon no valida");
                   break;
               }
           }
           
       }
        // TODO code application logic here
    }
    public static int menu(){
        System.out.println("--- menu ---");
        System.out.println("1. opcion 1");
        System.out.println("2. opcion 2");
        System.out.println("3. opcion 3");
        System.out.println("Elige una opcion");
        int opc = leer.nextInt();
        return opc;
    }
     public static int[] lecturaramdom(int size) {
        int[] tem = new int[size];
        for (int i = 0; i < tem.length; i++) {
            tem[i] = 1 + r.nextInt(99);
        }
        return tem;
    }
    public static void imprimir(int[] x) {
        
        for (int i = 0; i < x.length; i++) {
            System.out.print("["+ x[i]+"]");
        }
        System.out.println();
    }
    public static int [] mayormenor(int [] x){
            int[] temp = x.clone();
            for (int i = 0; i < temp.length - 1; i++) {
                for (int j = 0; j < temp.length - 1 - i; j++) {
                    if (temp[j] > temp[j + 1]) {
                        int aux = temp[j];
                        temp[j] = temp[j + 1];
                        temp[j + 1] = aux;
                    }
                }
            }
            return temp;
    }
     public static int [] menoramayor(int [] x){
            int[] temp = x.clone();
            for (int i = 0; i < temp.length - 1; i++) {
                for (int j = 0; j < temp.length - 1 - i; j++) {
                    if (temp[j] > temp[j + 1]) {
                        int aux = temp[j];
                        temp[j] = temp[j + 1];
                        temp[j + 1] = aux;
                    }
                }
            }
            return temp;
    }
    public static int[] sumapralelo(int[] x, int[] y) {
        int[] temp = new int[x.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = x[i] * y[i];
        }
        return temp;
    }
     
     
        
    
    
      
}
