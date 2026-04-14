import java.io.*;
public class es7 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int n;
int g=10;
int nm;
int i=0;
String nome;
System.out.println ("dammi il numero di squadre");
String str= input.readLine();
n=Integer.parseInt(str);   
while(i<n){   
int j=0;
String nmax="";
while(j<g){
System.out.println ("dammi il n di maglia");
String str1= input.readLine();
nm=Integer.parseInt(str1); 
System.out.println ("dammi il nome");
nome= input.readLine();
if(nm==10){
  nmax=nome;
}
j++;

}
System.out.println ("il  giocatore con maglia n 10 " + nmax);
i++;
}


}}   

