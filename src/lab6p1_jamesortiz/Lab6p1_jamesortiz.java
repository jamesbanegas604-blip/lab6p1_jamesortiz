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
                   System.out.println("menor a mayor :");
                   imprimir(menoramayor(numero));  
                   System.out.println("mayor a menor");
                   imprimir(mayormenor(numero));
                   break;
               }
               case 2 : {
                   System.out.println("ingrese el tamaño");
                   int size = leer.nextInt();
                   while (size < 2){
                       System.out.println("ingresse un valor valido");
                   }
                   int[] numero = lecturaramdom(size);
                   int[] numero2 = lecturaramdom(size);
                    System.out.println("Arreglo 1:");
                    imprimir(numero);
                    System.out.println("Arreglo 2:");
                    imprimir(numero2);
                    System.out.println("Suma paralela:");
                    System.out.println(sumapralelo(numero, numero2));
                    break;
                   
                   
               } 
               case 3: {
                   System.out.println("ingrese el tamaño");
                   int size = leer.nextInt();
                   while (size < 2){
                       System.out.println("ingresse un valor valido");
                   }
                   int[] numero = lecturaramdom(size);
                   System.out.println("arreglo original: ");
                   imprimir(numero);
                   
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
    public static int [] mayormenor(int [] lis){
            
            for (int i = 0 ; i>lis.length-1 ; i++) {
                for (int j = i+1; j < lis.length-1; j++) {
                    if (lis[i] < lis[j+1]) {
                        int aux = lis[i];
                        lis[i] = lis[j+1];
                        lis[j+1] = aux;
                    }
                }
            }
            return lis;
    }
     public static int [] menoramayor(int [] x){
            int[] temp = x;
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
    public static int sumapralelo(int[] x, int[] y) {
        int[] temp = new int[x.length];
        int acum=0;
        for (int i = 0; i < temp.length; i++) {
            temp[i] = x[i] * y[i];
            acum += temp[i];
        }
        return acum;
    }
    public static int[] PRIMOS(int[] x) {
            
            int cont = 0;
            for (int i = 0; i < x.length; i++) {
                if (esPrimo(x[i])) {
                    cont++;
                }
            }
           
           
           
            int[] temp = new int[cont];
            int pos = 0;
            for (int i = 0; i < x.length; i++) {
                if (esPrimo(x[i])) {
                    temp[pos++] = x[i];
                }
            }
            

            return temp;
        }

        public static boolean esPrimo(int n) {
            if (n <= 1) return false;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
            }}
            return true;
        }
        
     
     
        
    
    
      
}
