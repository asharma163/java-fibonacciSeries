public class Fibonacci{
  public static void main (String[] args){
    int[] s=new int[40];                         //memory allocation.
    s[0]=0;
    s[1]=1;
    System.out.print(s[0]+" "+s[1]);
    for(int i=2;i<40;i++){                     // not fron zero because first two terms already printed.
      s[i]=s[i-1]+s[i-2];
    System.out.print(" "+s[i]);               //space for proper indentation.
    }
  }
}
    
      
