we use switch statement for a larger if else if else code in a cleaner way

public class Main{
    public static void main(String[] args) {
        //        int value = 3;
        //        if(value == 1) {
        //            System.out.println("Value was 1");
        //        } else if(value == 2) {
        //            System.out.println("Value was 2");
        //        } else {
        //            System.out.println("Was not 1 or 2");
        //        }

        int switchValue = 6;    //6 goes to the default case

        switch(switchValue) {
            case 1: //after case is what we want to test
                System.out.println("Value was 1");
                break;  //break, keep going to the next case, without break we will print out everything

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:   //for 3, 4, 5 we can use in the same line
                System.out.println("was a 3 or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:    //default like else
                System.out.println("Was not 1,2,3, 4 or 5");
                break;
        }
    }
}

// Create a new switch statement using char instead of int
// create a new char variable
// create a switch statement testing for
// A, B, C, D, or E
// display a message if any of these are found and then break
// Add a default which displays a message saying not found

char charValue = 'G';
switch(charValue) {
    case 'A':
        System.out.println("A was found");
        break;
    case 'B':
        System.out.println("B was found");
        break;
    case 'C': case 'D' : case 'E':
        System.out.println(charValue + " was found");
        break;

    default:
        System.out.println("Could not find A, B, C, D or E");
        break;
}

String month = "JuNE";
switch(month.toUpperCase()) {
    case "JANUARY":
        System.out.println("Jan");
        break;
    case "JUNE":
        System.out.println("Jun");
        break;
    default:
        System.out.println("Not sure");
}
 
