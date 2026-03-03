import java.io.*;
public class es1{
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int n=1;
String giorno;
int i=0;
while(i<n){
System.out.println ("dammi il giorno");
giorno= input.readLine();
switch (giorno) {
case "lunedi","martedi","mercoledi","giovedi","venerdi":
System.out.println("giorno lavorativo");
break;
case "sabato","domenica":
System.out.println("weekend");
break;
default:
System.out.println("errore");
}
i=i+1;



}}}