/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author ASUS
 */
public class Pertemuan1 {

    public static void main(String[] args) {
        String nama = "Muhammad Syafa Misbakhul Ula";
        String prodi = "Teknik Informatika";
        biodata(nama,prodi);
        
        double sudutDerajat = 60.5;
        Trigonometri(sudutDerajat);

        int hasil = penjumlahan (20,25,05);
        System.out.println("ini hasil penjumlahan " + hasil);
        
        hasil = perkalian (20,4);
        System.out.println("ini hasil perkalian " +hasil);
        
        hasil = pengurangan (75,77);
        System.out.println("ini hasil pengurangan " +hasil);
        
        hasil = pembagian (277,5);
        System.out.println("ini hasil pembagian " +hasil);
        
        hasil = perkalianpengurangan(247,22,177);
        System.out.println("ini hasil perkalian pengurangan "+hasil);
        
        hasil = penjumlahanpembagian(2007,21,175);
        System.out.println("ini hasil penjumlahan pembagian "+hasil);
    }
    
     public static void biodata(String nama,String prodi){
        System.out.println("......");
        System.out.println("Nama :"+nama);
        System.out.println("Prodi :"+prodi);
        System.out.println("......");
    }
     
    
     public static int penjumlahan(int a, int b, int c){
         return a+b+c;
     }
     
     public static int perkalian(int a, int b){
         return a*b;
     }
     
     public static int pengurangan(int a, int b){
         return a-b;
     }
     
     public static int pembagian(int a, int b){
         return a/b;
     }
     
      public static int perkalianpengurangan(int a, int b, int c){
         return a*b-c;
     }
      
      public static int penjumlahanpembagian(int a, int b, int c){
         return a+b/c;
     }
      public static void Trigonometri(double sudutDerajat){   
        double sudutRadian = Math.toRadians(sudutDerajat);
        
        double nilaiSin = Math.sin(sudutRadian);
        double nilaiCos = Math.cos(sudutRadian);
        double nilaiTan = Math.tan(sudutRadian);
        
        System.out.println("hasil Sin: " +nilaiSin);
        System.out.println("hasil Cos: " +nilaiCos);
        System.out.println("hasil Tan: " +nilaiTan);
    }
}
