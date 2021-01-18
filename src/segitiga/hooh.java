package segitiga;
import java.util.Scanner;
public class hooh {
    
    Scanner io = new Scanner(System.in);
    double alas, tinggi, total;
    
   void isi(){
       System.out.println("Masukkan alas segitiga   : ");
       alas = io.nextDouble();
       
       System.out.println("Masukkan tinggi segitiga : ");
       tinggi = io.nextDouble();
} 
   void hitung(){
       total = alas * tinggi / 2;
  } 
   void hasil(){
       System.out.println("=======================================");
       System.out.println("Hasil luas segitiga      : "+total);
   }
}
