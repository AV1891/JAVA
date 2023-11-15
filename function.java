class Main {
  public static void main(String[] args) {
    double x=9.0, y= 16.0, z;
    z= Math.sqrt(36.0);  
    System.out.printf("z = %.1f\n", z);
    z= Math.sqrt(x);  
      System.out.printf("z = %.1f\n", z);
    z= Math.sqrt(x+y);  
    System.out.printf("z = %.1f\n", z);
    System.out.printf("Square root of 100: %.1f\n", Math.sqrt(100));
    System.out.printf(" Math.sqrt(49) returns  %.1f\n", Math.sqrt(49));
    System.out.printf("Math.sqrt(Math.sqrt(625.0)) = %.1f\n", 
      Math.sqrt(Math.sqrt(625.0)) );
    }
}
