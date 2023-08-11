import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    static String reverseString(String str){
        String rev = "";
        for(int i = str.length() - 1 ; i >=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }
    
    public static void main(String[] args) {
        // int n = 'a'; // a = 97, b = 98, A -> 65
        // System.out.println(n);
        
        // int : -10^9 to +10^9
        // char : 0 to 65535
        
        // char c = (char)64;
        // System.out.println(c);
        
        /*
        
        '0' -> 48 
        '1' -> 49 
        '2' -> 50
        
        ..
        '9' ->
        
        */
        
        // if( 'a' < 'b'){ // 97 < 98
        //     System.out.println("Hi");
        // }
        
        /* STRINGS */
        // "Hello" = {'H', 'e', 'l', 'l', 'o'}
        
        // arr.length;
        // str.length();
        
        //String str = "Hello";
        //System.out.println(str.length());
        // access character at ith index : str.charAt(i);
        //System.out.println(str.charAt(0));
        
        
        //String str = "Hello";
        // print each character line by line of this string. 
        /*
        H
        e 
        l 
        l 
        o 
        */
        
        /*
        String str = "Hello";
        for(int i = 0; i < str.length(); i++){
            int n = str.charAt(i);
            System.out.println(str.charAt(i) + "->" + n);
        }*/
        
        
        /*
        static array : access - arr[i], update - arr[i]
        arrayList : access - al.get(i), update - al.set(i, value)
        string : access - str.charAt(i), update - CANNOT UPDATE EXISTING INDICES
        
        */
        
        /*
        String str = "Hello";
        str = str + " World";
        System.out.println(str);*/
        
        /*
        String str = "Hello";
        str = str + 'G';
        System.out.print(str);*/
        
        
        
        // String : "sdVFweQAmC" : uppercase : 5 
        // String : "Hello Scaler" : uppercase : 2
        // Q. Give a string. Count the number of uppercase characters 
        /*
        A - 65 
        .. 
        Z - 90 
        
        a - 97 
        .. 
        z - 122 */
        
        /*
        String str = "Hello Scaler";
        int upperCount = 0;
        int lowerCount = 0;
        for(int i = 0; i < str.length(); i++){
            char current_char = str.charAt(i);
            int ascii_curr = current_char;
            if(ascii_curr >= 'A' && ascii_curr <= 'Z'){
                upperCount++;
            } else if(ascii_curr >= 'a' && ascii_curr <= 'z') {
                lowerCount++;
            }
        }
        System.out.println(upperCount);
        System.out.println(lowerCount);*/
        /*
        H -> 72 : yes. count++ 
        e -> 101 : no. 
        l -> 108. no 
        l -> 108 . no 
        o -> 111 . no 
        SPACE -> 32. yes. count++
        S -> 83 . yes. count++; */
        
        
        /*
        Given a string. Convert all uppercase characters 
        to lowercase and print the new string.
        
        "Hello Scaler" -> "hello scaler"
        */
        
        /*
        String str = "Hello Scaler";
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                
                // A(65) -> a(97) : 65 + 32 = 97
                // B(66) -> b(98) : 66 + 32 = 98
                // ..
                // Z(90) -> z(122) : 90 + 32 = 122
                
                // Adding 32 to ASCII value of capital characters. 
                // gives us the corresponding lowercase characters
                
                
                char newChar = (char)(str.charAt(i) + 32); // 72+ 32 = 104 (h)
                newStr = newStr + newChar;
            } else { // add a non-uppercase char directly to the new string
                newStr = newStr + str.charAt(i);
            }
            
        }*/
        
        //System.out.println(newStr);
        
        
        // Reverse a string. 
        
        /* "H(0)e(1)l(2)l(3)o(4)" 
        l = 0, r = 4. 
        swap str.charAt(l), str.charAt(r)
        "Hello" -> "oellH"
        */
        
        
        //System.out.println(reverseString("Hello"));
        
        
        /*
        
        naman : naman
        malayalam : malayalam 
        dad : dad 
        
        scaler : relacs 
        mama : amam
        
        */
        https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
        // Given a string. Determine if it is palindrome
        
        String str= "malayalam";
        //System.out.println(reverseString(str));
        
        // first.equals(second)
        if(str.equals(reverseString(str))){
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT A PALINDROME");
        }
        
        /* Monday, Wednesday. Thursday midnight */
        /*
        1. Rs. 1000 Amazon Voucher + 1:1 30 minute call with me/ 500 Amazon gift voucher
        2. Rs. 800 Amazon Voucher + 1:1 30 minute call with me/ 500 Amazon gift voucher
        3. Rs 750 Amazon Voucher + 1:1 30 minute call with me/ 500 Amazon gift voucher
        4. 1:1 30 minute call with me/ 500 Amazon gift voucher
        5. 1:1 30 minute call with me/ 500 Amazon gift voucher
        */
        
        
        
        
        
        
        
        
        
        
        
    }
}
