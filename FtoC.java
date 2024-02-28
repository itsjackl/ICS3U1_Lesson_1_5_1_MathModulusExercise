class FtoC extends ConsoleProgram {

  /**
  * Fahrenheit to Celsius
  * @author: Jack
  */
  
  public void run() {
    
    double dblF;
    double dblC;

    // Ask for F
    dblF = readDouble("Enter degrees in Fahrenheit: ");

    // Compute for C
    dblC = (5 / 9) * (dblF - 32);

    // Output C
    System.out.println("The degrees in Celsius is: " + dblC);
    
    
// Inline comment: No excess code, looks identical besides names and prompts
  }
}