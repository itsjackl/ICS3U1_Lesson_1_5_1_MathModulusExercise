class Circumference extends ConsoleProgram {

  /**
  * Calculate the circumference of a circle given its radius
  * @author: Jack Lai
  */
  
  public void run() {
    
    double dblRadius;
    double dblCircumference;

    // Ask for the radius
    dblRadius = readDouble("Type the radius of the circle here: ");

    // Compute the circumference
    dblCircumference = 2 * Math.PI * dblRadius;

    // Output results
    System.out.println("The circumference of the circle is: " + dblCircumference);
    
  }
}