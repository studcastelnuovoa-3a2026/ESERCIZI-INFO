import java.io.*;
public class es3{
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int num;
int max=0;
do{
 System.out.println ("dammi il numero ");
String str= input.readLine();
num=Integer.parseInt(str);
if(num>max){
max=num;
}   
}while(num!=-1);
 System.out.println (" il numero più  grande è " +  max);
}}