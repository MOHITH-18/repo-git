package org.bnm;

/**
 * Hello world!
 */
public class  {
    static boolean isPrime(int num){
        if(num<=1)
            return false;
        for(int i=2; i<=num/2;i++){
            if(num%1==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int limit =50;
        boolean print=True;
        system.out.println("the prime nos limit up to "+limit+":");
        for(int i=2; i<=limit;i++){
            if(isPrime(i)){
                if(print){
                    system.out.println(i+ "prime number");
                }
                print =!print;
            }
        }
      
    }
}
