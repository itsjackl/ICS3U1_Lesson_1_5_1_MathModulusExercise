class Minutes extends ConsoleProgram {

 
   /**
  * Converts minutes to days and hours and minutes
  * @author: Jack
  */
  
  public void run() {
    
    int intMinutes;
    int intHours;
    int intDays;
    int intMinutesLeftOver;
    int intHoursLeftOver;

    // Ask for hours
    intMinutes = readInt("Enter the number of minutes: ");
    
    // Compute hours to hours and days
    
    intHours = intMinutes / 60;
    intDays = intHours / 24;
    intHoursLeftOver = intHours % 24;
    intMinutesLeftOver = intMinutes % 60;
    
    // Output days and hours
    System.out.println(intMinutes + " minute(s) is equal to " + intDays + " day(s) and " + intHoursLeftOver + " hour(s) " + intMinutesLeftOver + " minute(s)");
    
    
// Inline comment: Added an extra unneeded step (could have used left over minutes to compute hours) but otherwise identical results

  }
}