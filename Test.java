/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.*;
/**
 *
 * @author desy
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*
        //Latihan1
        System.out.println("----------- Latihan 1 ------------");
        System.out.println("hello world");
        
        System.out.println("----------- Latihan 2 ------------");
        Scanner input = new Scanner(System.in);
        String oyi;
        oyi = input.next();
        System.out.println(oyi);
        double iyo;
        iyo = input.nextDouble();
        System.out.println(iyo);
        
        System.out.println("----------- Latihan 3 ------------");
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Masukkan a = ");
        a= input.nextInt();
        System.out.print("Masukkan b = ");
        b= input.nextInt();
        c=a+b;
        System.out.println(c);
        
        System.out.println("----------- Latihan 4 ------------");
        Scanner input = new Scanner(System.in);
        String kataku;
        System.out.print("Masukkan Kataku : ");
        kataku = input.nextLine();
        System.out.println(kataku);
        
        System.out.println("----------- Latihan 5 ------------");
        Scanner input = new Scanner(System.in);
        int banyak_bebek,banyak_teman, sisa, masing;
        System.out.print("Masukkan Banyak Bebek : ");
        banyak_bebek = input.nextInt();
        System.out.print("Masukkan Banyak Teman : ");
        banyak_teman = input.nextInt();
        masing = banyak_bebek / banyak_teman;
        sisa = banyak_bebek % banyak_teman;
        System.out.println("Masing-masing Teman Mendapatkan Bebek "+masing);
        System.out.println("Sisa Bebek Pak Dengklek adalah "+sisa);
        
     System.out.println("----------- Latihan 6 ------------");
        Scanner input = new Scanner(System.in);
        //int alas, tinggi;
        double alas, tinggi;
        double luas;
        System.out.print("Masukkan Alas : ");
        alas = input.nextInt();
        System.out.print("Masukkan Tinggi : ");
        tinggi = input.nextInt();
        //luas = alas*tinggi*1.0/2;
         luas = alas * tinggi /2;
        //System.out.printf("Jadi luas segitiga Pak Dengklek adalah %.7f",luas);
       // System.out.printf("Jadi luas segitiga Pak Dengklek adalah %.2f ---- %f ",luas,tinggi);
       System.out.println("Jadi luas segitiga Pak Dengklek adalah "+ luas);
       
        System.out.println("----------- Latihan 7 ------------");
     Scanner input = new Scanner(System.in);
     int a,b,c,d,e,f,g,h,i;
        System.out.println("Masukkan data : ");
        a=input.nextInt(); b=input.nextInt(); c=input.nextInt();
        d=input.nextInt(); e=input.nextInt(); f=input.nextInt();
        g=input.nextInt(); h=input.nextInt(); i=input.nextInt();
        System.out.println("Matriks hasil : ");
        System.out.println(a +" "+ d +" "+ g);
        System.out.println(b +" "+ e +" "+ h);
        System.out.println(c +" "+ f +" "+ i);
        
     System.out.println("----------- Latihan 8 ------------");
     Scanner input = new Scanner(System.in);
     int d1, d2;
             double luas;
        System.out.print("Masukkan nilai D1 : ");
        d1 = input.nextInt();
        System.out.print("Masukkan nilai D2 : ");
        d2 = input.nextInt();
        luas = d1*d2/2;
        System.out.println("Jadi luas Layang-layang adalah "+luas);
        System.out.printf("Jadi luas Layang-layang adalah %.2f ",luas);
        
     
     System.out.println("----------- Latihan 9 ------------");
     Scanner input = new Scanner(System.in);
     double desy, nadya, galih, udin, rian, rata;
        System.out.print("Masukkan Nilai Desy : ");
        desy = input.nextDouble();
        System.out.print("Masukkan Nilai Nadya : ");
        nadya = input.nextDouble();
        System.out.print("Masukkan Nilai Galih : ");
        galih = input.nextDouble();
        System.out.print("Masukkan Nilai Udin : ");
        udin = input.nextDouble();
        System.out.print("Masukkan Nilai Rian : ");
        rian = input.nextDouble();
        
        rata = desy+nadya+galih+udin+rian/5;
        System.out.println("Rata-ratanya adalah "+rata);
        */
     System.out.println("----------- Latihan 10 ------------");
     Scanner input = new Scanner(System.in);
     int a,b,c,d,e,f,g,h,i,k,l,m,n,o,p,q,r,s, hasil;
     
        System.out.println("Masukkan Data 1 : ");
        a=input.nextInt(); b=input.nextInt(); c=input.nextInt();
        d=input.nextInt(); e=input.nextInt(); f=input.nextInt();
        g=input.nextInt(); h=input.nextInt(); i=input.nextInt();
        
        System.out.println("Masukkan Data 2 : ");
        k=input.nextInt(); l=input.nextInt(); m=input.nextInt();
        n=input.nextInt(); o=input.nextInt(); p=input.nextInt();
        q=input.nextInt(); r=input.nextInt(); s=input.nextInt();
        
        System.out.println("Hasil = \n"+ (a+k) +" "+(b+l)+" "+(c+m)
        +"\n"+ (d+n) +" "+(e+o)+" "+(f+p) 
        +"\n"+ (g+q) +" "+(h+r)+" "+(i+s));
       
     
    }
    
}
