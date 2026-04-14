
import java.io.*;
public class es8 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int n;
int gare=8;
int t;
int i=0;
String nome;
int tmin=0;
System.out.println ("dammi il numero di gare");
String str= input.readLine();
n=Integer.parseInt(str);   
while(i<n){   
int j=0;
tmin=99999;
String nmax="";
while(j<gare){
System.out.println ("dammi il tempo");
String str1= input.readLine();
t=Integer.parseInt(str1); 
System.out.println ("dammi il nome");
nome= input.readLine();
if(t<tmin){
    tmin=t;
  nmax=nome;
}

j++;

}
System.out.println ("l'atleta con il tempo migliore è " + nmax);
System.out.println ("il tempo migliore è " + tmin);
i++;
}


}}   

    

