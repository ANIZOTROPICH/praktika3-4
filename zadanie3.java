import java.util.Scanner;
 
public class zadanie3 {
 
  static int n,m,num,nod,nok,P;
 
  public static void main (String[]  args) {
	  System.out.println("Vvedite col-vo peremennyh");
     
      Scanner s= new Scanner(System.in);
 
    n=s.nextInt(); int [] a = new  int [n];
    for(int i=0;i<a.length;i++) {
        a[i]=s.nextInt();
    }
 
  P=1;
  
    for(int i=0;i<a.length;i++) {
        if(i+1<a.length) {
            for(int j=i+1;j<=i+1;j++) {
                nod=gcd(a[i], a[j]);
                P=a[i]*a[j];
                nok=P/nod;
            }a[i+1]=nod;a[i+1]=nok;
            }
                }
 
        
    System.out.println("NOD "+n+" чисел"+" = "+nod);
     System.out.println("NOK "+n+" чисел"+" = "+nok);
 
} 
            static int gcd(int a, int b) {
              if(b==0) return a;
              else return gcd(b,a%b);
          }
  }