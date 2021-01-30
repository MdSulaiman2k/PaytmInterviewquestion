import java.util.* ;
class Main {
  static Scanner kbd = new Scanner(System.in) ;
  public static void main(String[] args) {
    System.out.println("Enter the number : ") ;
   int n = kbd.nextInt() ;
   int cnt[] = new int[n] ;
   for(int i = 0 ; i< n ; i++)
   {
     System.out.println("Enter the value of a  : ") ;
     int a = kbd.nextInt() ;
       System.out.println("Enter the value of b  : ") ;
     int b = kbd.nextInt() ;
       System.out.println("Enter the value of c  : ") ;
     int c =  kbd.nextInt() ;
     cnt[i] =((a+b+c)/3 <= a && (a+b+c)/3 <= b)?(a+b+c) /3 : (a>b)?  b : a ;
     }
     for(int i =0 ; i < n ; i++){
       System.out.println(cnt[i]) ;
     }
   }
  }
