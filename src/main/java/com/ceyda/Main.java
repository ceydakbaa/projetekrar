package com.ceyda;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Java Veri Tipleri Projesi
       /* int i = 10;
        System.out.println("int i :"+ 10);

        double number= 9.8;
        System.out.println("double number :"+ 9.8);

        float a = 3.17f;
        System.out.println("float number:"+ 3.17f);

        boolean trueorfalse= true;
        System.out.println("booleon :"+ true);
        String name = "Ceyda";
        System.out.println("String :"+ name);
        final int sayı;
        sayı=4;
        System.out.println("final int sayı :"+ sayı);
*/
        /*Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz :");
        String isim = scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz :");
        int yas = scan.nextInt();


        System.out.println("Merhabalar, ben "+ isim + " yaşım "+ yas);
        scan.close();
*/
        /*double number1=8;
        double number2=12;

        double cıkarma= number2-number1;
        System.out.println("Çıkarma :"+ cıkarma);
        double toplama= number1+number2;
        System.out.println("Toplama :"+ toplama);
        double carpma=number1*number2;
        System.out.println("Çarpma :"+ carpma);
        double bolme= number2/number1;
        System.out.println("Bölme :"+ bolme);
*/
        /*Scanner scan= new Scanner(System.in);
        System.out.println("Sayı Giriniz :");
        int number= scan.nextInt();
        if (number>0){
                System.out.println("Sayı Pozitiftir.");
        }else if(number<0){
            System.out.println("Sayı Negatiftir.");
        }else{
            System.out.println("Sayı Sıfıra Eşittir.");
        }
         */
        /*Scanner scan= new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        int number= scan.nextInt();
        if(number %2==0){
            System.out.println("Sayı çifttir.");
        }else{
            System.out.println("Sayı tektir.");
        }
       */
        /*for(int i =1; i<=100; i++){
            System.out.println(i);
        }
         */
        /*int i=100;
        while (i>=0){
            System.out.println(i);
            i--;
         */
       /* int [] numbers={3,5,7,9,11};
        for(int i=0; i<5; i++){
            System.out.println(numbers[i]);
        }
        */
       /* Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayıyı gir : ");
        int number1= scan.nextInt();
        System.out.println("İkinci sayıyı gir : ");
        int number2= scan.nextInt();
        System.out.println("Üçüncü sayıyı gir : ");
        int number3= scan.nextInt();
        int enbüyüksayı= Math.max(number1, Math.max(number3,number2));
        System.out.println("En Büyük Sayı : "+ enbüyüksayı);
*/
        Scanner scan= new Scanner(System.in);
        System.out.println("Pozitif bir değer giriniz : ");
        int a =scan.nextInt();
        int toplam=0;
        for (int i=1; i<a; i++){
            toplam+=i;
        }
        System.out.println("1'den "+ a +" ya kadar olan sayıların toplamı :" + toplam);

    }
}