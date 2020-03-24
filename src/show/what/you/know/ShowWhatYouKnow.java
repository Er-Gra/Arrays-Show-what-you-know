/*
 * March 24th, 2020
 * Erika Graham
 * mark average using arrays and loops
 */
package show.what.you.know;

import java.util.Scanner;

public class ShowWhatYouKnow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedinput = new Scanner (System.in); //Scanner initialized
        
        double finalMark = 0;   //variable for the average mark
        //prompt to the user and array for the marks
        System.out.println("Please enter five marks: ");
        double [ ] marks = new double [5];
        for (int i=0;i<=4;i++){ //loop to promp the user 5 times for 5 marks
            marks[i]= keyedinput.nextDouble();
        }
        for (int i=0;i<=4;i++){
            finalMark = finalMark + marks[i];   //loop to add the 5 marks in the array
        }
        
        finalMark = finalMark / 5;  //calculation to get the average mark
        //calculations to round the average mark to two decimal places
        finalMark = finalMark * 100;    
        finalMark = Math.round(finalMark);
        finalMark = finalMark / 100;
        //output to the user, average mark rounded to two decimal places
        System.out.println("Your average mark is: "+finalMark);
        //Scanner closed
        keyedinput.close();

    }
    
}
