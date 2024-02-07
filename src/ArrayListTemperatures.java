import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListTemperatures {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i;
        int weekDays = 7;
        int avg;
        int total = 0;
        String userInput;
        System.out.println("Temperatures of the Week");
        System.out.println("Enter Day(Ex:Monday,Tuesday, Etc) of the week or enter Week for the temperatures of the whole week:");


        ArrayList<String> wholeWeek = new ArrayList<String>(); // List for the days of the week
        wholeWeek.add("Monday");
        wholeWeek.add("Tuesday");
        wholeWeek.add("Wednesday");
        wholeWeek.add("Thursday");
        wholeWeek.add("Friday");
        wholeWeek.add("Saturday");
        wholeWeek.add("Sunday");

        ArrayList<Integer> tempWeek = new ArrayList<Integer>(); // List of Temperatures for the week of 3-21-2022 to 3-27-2022
        tempWeek.add(76);
        tempWeek.add(80);
        tempWeek.add(80);
        tempWeek.add(87);
        tempWeek.add(90);
        tempWeek.add(91);
        tempWeek.add(86);

        userInput = scnr.next();
        while(!userInput.equals("Week")) { // If user enters week they will be prompt all the way to the bottom

            if(userInput.equals("Monday")) {                    //When user inputs the days of the week and are given the temperatures.
                System.out.println(tempWeek.get(0) + "°F");
                userInput = scnr.next();
            }
            else if(userInput.equals("Tuesday")) {
                System.out.println(tempWeek.get(1) + "°F");
                userInput = scnr.next();
            }
            else if(userInput.equals("Wednesday")) {
                System.out.println(tempWeek.get(2) + "°F");
                userInput = scnr.next();
            }
            else if(userInput.equals("Thursday")) {
                System.out.println(tempWeek.get(3) + "°F");
                userInput = scnr.next();
            }
            else if(userInput.equals("Friday")) {
                System.out.println(tempWeek.get(4) + "°F");
                userInput = scnr.next();
            }
            else if(userInput.equals("Saturday")) {
                System.out.println(tempWeek.get(5) + "°F");
                userInput = scnr.next();
            }
            else if(userInput.equals("Sunday")) {
                System.out.println(tempWeek.get(6) + "°F");
                userInput = scnr.next();
            }
        }
        for(i = 0; i < weekDays; ++i) {              //If user enters week this input will give the whole week plus the average temperature
            System.out.print(wholeWeek.get(i) + " ");
            System.out.println(tempWeek.get(i) + "°F");
        }
        for(i = 0; i<tempWeek.size(); i++)
            total = total + tempWeek.get(i);
        avg = total / tempWeek.size();
        System.out.println("Average of Temperatures of the week: " + avg + "°F");
    }
}