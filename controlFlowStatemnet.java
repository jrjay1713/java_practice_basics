import java.util.Scanner;

class ifstatement{
    public void ifcheck(int input){
        
        if(input > 0)
        {
            System.out.println("it is a positive Value");
        } else if (input == 0){

            System.out.println("it is Zero buddy ! ");
        } else{
            System.out.println("it is a negative value");
        }
    }
}

class switchStatement{
    String switchcases(int input){
        String dayName;
        switch(input){
            case 1:
            dayName = "monday";
            break;
            case 2:
            dayName = "tuesday";
            break;

            case 3:
            dayName = "wednesday";
            break;

            case 4:
            dayName = "thusday";
            break;

            case 5: 
            dayName = "friday";
            break;

            case 6:
            dayName = "saturday";
            break;

            case 7:
            dayName = "sunday";
            break;

            default :
            dayName = "Invalid Day";

        }
        return dayName;
    }
}

public class controlFlowStatemnet {
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The value You want to check : ");
        int number = scanner.nextInt();
        System.out.println("Enterv the day Number : ");
        int day = scanner.nextInt();

        ifstatement myif = new ifstatement();
        myif.ifcheck(number);

        switchStatement daySwitch = new switchStatement();
        String dayName = daySwitch.switchcases(day);

        System.out.println(dayName);

        scanner.close();
    }
}