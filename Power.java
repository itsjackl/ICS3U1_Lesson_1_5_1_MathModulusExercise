class Power extends ConsoleProgram {

  /**
  * Given a and b, calculates a^b
  * @author: Jack
  */
  
  public void run() {
    
    double dblA;
    double dblB;
    double dblApowerB;

    // Ask for A and B
    dblA = readDouble("Enter the base of the number: ");
    dblB = readDouble("Enter the exponent of the base: ");

    // Compute A to the power of B
    dblApowerB = Math.pow(dblA, dblB);

    // Output A to the power of B
    System.out.println("The given base to the power of the given exponent is: " + dblApowerB);

    
  }
}