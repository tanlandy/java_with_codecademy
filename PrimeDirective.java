//Your prime directive: Build a PrimeDirective.java program that creates an ArrayList of all prime numbers in an array.


// Import statement:

import java.util.ArrayList;


class PrimeDirective {
  
  // Add your methods here:
  public boolean isPrime(int number){
    if ( number == 2) {
      return true;
    }

    if ( number < 2 ){
      return false;
    }
    
    for ( int i = 2 ; i < number ; i++){
      if ( number % i == 0 ){
        return false;
      } 
    }
    return true;
  }

  // a method check arraylist 
  // returns an ArrayList of integers
  // has a parameter numbers, which is an array of ints
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    // new ArrayList to store primes
    ArrayList<Integer> primes = new ArrayList<Integer>();
    // use a for each loop to check each number in numbers
    for (int number : numbers){
      if (isPrime(number)){
        primes.add(number);
      }
    }
    return primes;

  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    // check the method
    System.out.println(pd.isPrime(97));
    // check the ArrayList
    System.out.println(pd.onlyPrimes(numbers));

  }  

}
