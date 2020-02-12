/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg1;
import java.util.Scanner;
/**
 *
 * @author LEGION
 */
public class Pemilihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tugas;
        int UTS;
        int UAS;
        int total1, total2, total3,nilaiakhir;
        
      do{
        System.out.print("Masukkan Nilai Tugas : ");
        tugas =sc.nextInt();
        
        if (tugas < 0 ||tugas > 100 ){
            System.out.println("Input yang anda masukkan salah");
        }
        else {
            System.out.println("-----");
            
        }
        
      }
      while (tugas <0 || tugas>100);
      
      do{
          System.out.print("Masukkan Nilai UTS :");
          UTS=sc.nextInt();
          
          if (UTS < 0 || UTS > 100){
              System.out.println("Input yang anda masukkan salah");
          }
          else{
              System.out.println("-----");
              
          }
      }
      while (UTS < 0 || UTS>100);
      
      do{
          System.out.print("Masukkan NIlai UAS : ");
          UAS = sc.nextInt();
          
          if(UAS < 0 || UAS > 100){
              System.out.println("Input yang anda masukkan salah ");
          }
          else{
              System.out.println("-----");
              
          }
      }
      while (UAS < 0 || UAS > 100);
      
      total1 = tugas*20/100;
      total2 = UTS*35/100;
      total3 = UAS*45/100;
      nilaiakhir = tugas+UTS+UAS;
      
        System.out.println(" Total Nilai Anda Adalah " +nilaiakhir);   
    }  
}
