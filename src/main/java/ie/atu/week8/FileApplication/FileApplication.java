package ie.atu.week8.FileApplication;

import java.io.*;
import java.util.Scanner;

class CreateFile
{
    public static void main ( String[] args ) throws IOException
    {

        // Get filename and create the file
        FileWriter writer = null;
        Scanner scan = new Scanner( System.in );
        String fileName = "AppFile.txt";
        System.out.print("Enter Filename-->");

        try
        {
            fileName = scan.next();
            writer = new FileWriter("AppFile.txt");
        }
        catch  ( IOException iox )
        {
            System.out.println("Error in creating file");
        }

        try
        {
            writer.write( "This is some text to test my work\n"  );
            writer.close();
        }
        catch ( IOException iox )
        {
            System.out.println("Problem writing " + fileName );
        }
        try{
            PrintWriter File = new PrintWriter("AppFile.txt");
            File.close();
        }
        catch ( IOException iox )
        {
            System.out.println("Problem writing " + fileName );
        }
    }
}