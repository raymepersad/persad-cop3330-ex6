/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 6 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.*/

package org.example;
import java.util.Calendar;

public class practiceexample6 {
    private int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    int calculateRetirementYearsLeft(int currentAge, int ageOfRetirement) {
        return ageOfRetirement - currentAge;
    }

    int calculateYearForRetirement(int currentAge, int ageOfRetirement) {
        int retirementYearsLeft = ageOfRetirement - currentAge;
        return currentYear + retirementYearsLeft;
    }

    public String provideRetirementInfo(int currentAge, int ageOfRetirement){
        int retirementYearsLefted=calculateRetirementYearsLeft(currentAge,ageOfRetirement);
        int yearOfTheRetirement=calculateYearForRetirement( currentAge, ageOfRetirement);
        return"You have " + retirementYearsLefted + " years left until you can retire."+"\n"+
                "It's " + currentYear + ", so you can retire in " + yearOfTheRetirement + ".";
    }
}
