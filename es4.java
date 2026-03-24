import java.io.*;
public class es4 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int num;
do{
System.out.println ("dammi il numero ");
String str= input.readLine();
num=Integer.parseInt(str);    
switch (num) {
case 1:
System.out.println("ciao");
break;
case 2:
System.out.println("benvenuto");
break;
case 3:
System.out.println("esci");
break;
default:
System.out.println("errore");



}}while(num!=3);

    

}}
