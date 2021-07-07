A char occupies two bytes of memoryy or 16 bits and thus has a width of 16.
  the reason it is not just a single byte is that it allows you to store Unicode characters.
 // https://unicode-table.com/en/
  
A boolean value allows for two choices True or False, Yes or No, 1 or 0.
 
//code
 public class Main {

    public static void main(String[] args) {

        char myChar = 'D'; //only 1 character, can not be DD
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
    }
}
 
