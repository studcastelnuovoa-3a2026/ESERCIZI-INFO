import java.io.*;
public class es6 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int num;
do {
System.out.println ("dammi il numero del contatore");
String str= input.readLine();
num=Integer.parseInt(str);
switch (num) {
case 1:
System.out.println("aumento il contatore" + num+1);
break;
case 2:
System.out.println("diminuisci il contatore" + num-1);
break;
case 3:
System.out.println(num);
break;
default:
System.out.println("num non valido");




} }while (num!=0);
    



}}                                                





