class Hours extends ConsoleProgram {

  /**
  * Converts hours to days and hours
  * @author: Jack
  */
  
  public void run() {
    
    int intHours;
    int intDays;
    int intHoursLeftOver;

    // Ask for hours
    intHours = readInt("Enter the number of hours: ");
    
    // Compute hours to hours and days
    intDays = intHours / 24;
    intHoursLeftOver = intHours % 24;
    
    // Output days and hours
    System.out.println(intHours + " hour(s) is equal to " + intDays + " day(s) and " + intHoursLeftOver + " hour(s)");

    
  }
}