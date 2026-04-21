import java.io.*;
public class es10 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int n;
int tab=0;
int i=0;
do{
System.out.println ("dammi il numero ");
String str= input.readLine();
n=Integer.parseInt(str);
while(i<=10){
tab=t*i;
System.out.println (tab);
i=i+1;

}

}
while (n!=0);
}}