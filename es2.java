import java.io.*;
public class es2{
public static void main (String[] args) throws Exception{
 BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
 int codice;
 int err=0;
do {
System.out.println ("dammi il codice");
String str= input.readLine();
codice=Integer.parseInt(str);
switch (codice) {
case 400:
System.out.println("bad request");
break;
case 401:
System.out.println("Unauthorized");
break;
case 403:
System.out.println(" Forbidden");
break;
case 404:
System.out.println(" errore");
err=err+1;
break;case 200:
System.out.println(" corretto");
break;
default:
System.out.println("codice non valido");
}
}while (err<3);
}}