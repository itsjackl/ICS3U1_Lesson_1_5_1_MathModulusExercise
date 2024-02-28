class AreaSin extends ConsoleProgram {

  /**
  * Calculating area with two sides and the contained angle
  * @author: Jack
  */
  
  public void run() {
    
    double dblSideX;
    double dblSideY;
    double dblAngleXY;
    double dblAreaXYZ;

    // Get sides X, Y and angle XY
    dblSideX = readDouble("Enter one side of the triangle: ");
    dblSideY = readDouble("Enter the other side of the triangle: ");
    dblAngleXY = readDouble("Enter the contained angle between the two given sides: ");

    // Compute area XYZ
    dblAreaXYZ = (dblSideX * dblSideY * Math.sin(Math.toRadians(dblAngleXY))) / 2;

    // Output area XYZ
    System.out.println("The area of the triangle is: " + dblAreaXYZ);


// Inline comment: No excess code, looks identical besides names and prompts


    
  }
}