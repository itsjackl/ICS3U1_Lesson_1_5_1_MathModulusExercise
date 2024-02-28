class Cos3rd extends ConsoleProgram {

  /**
  * Use cosine law to find the 3rd side of the triangle
  * @author: Jack
  */
  
  public void run() {
    
    double dblSideA;
    double dblSideB;
    double dblSideC;
    double dblAngleAB;
    
    // Ask for Side A, B and Angle AB
    dblSideA = readDouble("Enter one side of the triangle: ");
    dblSideB = readDouble("Enter the other side of the triangle: ");
    dblAngleAB = readDouble("Enter the contained angle between the two given sides: ");

    // Compute Side C
    dblSideC = Math.sqrt((dblSideA * dblSideA) + (dblSideB * dblSideB) - (2 * dblSideA * dblSideB * Math.cos(Math.toRadians(dblAngleAB))));

    // Output side C
    System.out.println("The ungiven side of the triangle is: " + dblSideC);
    
  }
}