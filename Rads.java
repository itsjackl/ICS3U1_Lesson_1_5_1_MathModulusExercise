class Rads extends ConsoleProgram {

  /**
  * Degrees to Radians
  * @author: Jack
  */
  
  public void run() {
    
    double dblDegrees;
    double dblRadians;

    // Ask for Degrees
    dblDegrees = readDouble("Type the number of degrees: ");
    
    // Compute Radians
    dblRadians = dblDegrees * Math.PI/180;

    // Output Radians
    System.out.println("The number of radians is: " + dblRadians);

    
// Inline comment: Onlt difference is that I used math in the form of math.pi / 180 instead of math.toradians, but same results
  }
}