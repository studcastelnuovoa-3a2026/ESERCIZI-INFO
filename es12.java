import java.io.*;
public class es12 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int num;
int tot=0;
do{
System.out.println ("dammi il numero ");
String str= input.readLine();
num=Integer.parseInt(str);
if(num%5==0){
tot=num-5;
if(tot%10==0){


System.out.println ("contiene la cifra 5");    
}
}
}while(num!=-1);

}}

