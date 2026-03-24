import java.io.*;
public class es5 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int num;
int n;
do {
System.out.println ("dammi il numero ");
String str= input.readLine();
num=Integer.parseInt(str);
switch (num) {
case 1:
System.out.println("dammi un numero");
break;
case 2:
System.out.println("controlla se è pari");
break;
case 3:
System.out.println("controlla se è dispari");
break;
default:
System.out.println("num non valido");




} }while (num!=0);
    



}}
