import java.net.*;
import java.io.*;

public class OpenCommercial {
	/** Prompts the user for the name X of a company (a single string), opens
	   *  the Web site corresponding to www.X.com, and prints the first five lines
	   *  of the Web page in reverse order.
	   *  @param arg is not used.
	   *  @exception Exception thrown if there are any problems parsing the 
	   *             user's input or opening the connection.
	   */
	  public static void main(String[] arg) throws Exception {

	    BufferedReader keyboard;
	    String inputLine;

	    keyboard = new BufferedReader(new InputStreamReader(System.in));

	    System.out.print("Please enter the name of a company (without spaces): ");
	    System.out.flush();        /* Make sure the line is printed immediately. */
	    inputLine = keyboard.readLine();
	    URL u=new URL("http://www."+inputLine+".com");
	    BufferedReader in=new  BufferedReader(new InputStreamReader(u.openStream()));
	    String array[]=new String[5];
	    for (int i=4;i>=0;i--) {
	    array[i]=in.readLine();
	    }
	    for (int i=0;i<=4;i++) {
	    System.out.println(array[i]);
	    }
	  }
}