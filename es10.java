6
import java.io.*;
public class es10 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int n;
int tab;

do{
System.out.println ("dammi il numero ");
String str= input.readLine();
n=Integer.parseInt(str);
int i=0;
while(i<=10){ 
tab=n*i;
System.out.println (tab);
i=i+1;6

}
}while (n!=0);
}}