/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodearray2d;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ejemplodearray2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb= new Scanner (System.in);
        int [][] myArray = new int [4][4];
        for (int i=0; i<myArray.length; i++){
            for (int j=0; j<myArray.length; j++){
                myArray[i][j]=solicitaEntero();
            }
        }
        
    }
    public static int solicitaEntero(){
        Scanner kb= new Scanner (System.in);
        boolean flag;
        int n=0;
        do{
            System.out.println("Introduce un número entero");
            try{
                n=kb.nextInt();
                flag=false;
                
            }
            catch(Exception er){
                System.out.println("Lo que introdujo no es un entero, Inténtalo de nuevo");
                flag=true;
                kb.nextLine();
            }
        }while (flag);
        return n;
    }
}
