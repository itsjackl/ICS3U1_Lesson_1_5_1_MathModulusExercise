class KmtoMiles extends ConsoleProgram {

    /**
    * Converts Km to Miles
    * @author: Jack
    */
    
    public void run() {
      
      double dblKm;
      double dblMiles;

      // Ask for Km
      dblKm = readDouble("Enter distance in kilometers: ");

      // Compute for Miles
      dblMiles = dblKm * 0.621371;

      //Output Miles
      System.out.println("The distance in miles is: " + dblMiles);
      
      
// Inline comment: No excess code, looks identical besides names and prompts
    }
  }