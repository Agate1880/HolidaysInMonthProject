
import java.util.Scanner;

public class Main {
    public static void main(String[] strings){

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the name of a month:");

            String month = input.nextLine().trim();

            String result;

            switch (month.toLowerCase()) {
                case "january":
                    result = "The holiday of the month " + month + "New Year's Eve";
                    //1st january.
                    break;
                case "february":
                    result = "The holiday of the month " + month + " is Valentines Day.";
                    //14th february.
                    break;
                case "march":
                    result = "The holiday of the month " + month + " is Women's Day, Good Friday ";
                    //8th march is Women's Day, Good Friday is in Movable Friday.
                    break;
                case "april":
                    result = "The holiday of the month " + month + " is Easter Sunday, Easter Monday.";
                    //Easter Sunday is Two days after Good Friday, Easter Monday is the day after Easter Sunday.
                    break;
                case "mey":
                    result = "The holiday of the month " + month + " is Labour Day, Restoration Of Independence Day,Mother's Day.";
                    //1st may, 4th may, Second sunday in may is Mother's Day
                    break;
                case "june":
                    result = "The holiday of the month " + month + " is Midsummer's Eve and Midsummer's Day.";
                    //23rd june, 24th june.
                    break;
                case "july":
                    result = "The holiday of the month " + month + " is Sea Holiday .";
                    //12th july
                    break;
                case "august":
                    result = "The holiday of the month " + month + " is Latvian Freedom Fighter's Day.";
                    //11th august.
                    break;
                case "september":
                    result = "The holiday of the month " + month + " is Father's Day.";
                    //13th september
                    break;
                case "october":
                    result = "The holiday of the month " + month + " is Teacher's Day.";
                    //4th october.
                    break;
                case "november":
                    result = "The holiday of the month " + month + " is Proclamation Day of the Republic of Latvia.";
                    //18th november.
                    break;
                case "december":
                    result = "The holiday of the month " + month + " is Christmas Eve, Christmas Day, Second Day of Christmas and New Year's Eve. ";
                    break;

                default:
                    result = "Error: invalid month.";
            }
            System.out.println(result);

            System.out.println("Do you wish to perform another action? (Yes/No)");

            if(input.next().toLowerCase().charAt(0) != 'y')
                break;

        }while(true);
    }
}
