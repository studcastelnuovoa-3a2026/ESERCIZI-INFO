import java.io.*;
public class es11 {
public static void main (String[] args) throws Exception{
BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
int n;
int s=0;
int i=0;
int v=0;
do{
System.out.println ("dammi il numero ");
String str= input.readLine();
n=Integer.parseInt(str);

while(i<=n){
s=s+i;
System.out.println (s);

i=i+1;

}
}
while (n!=-1);
}}

}
