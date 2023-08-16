import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static class ScalerStudent {
        String name; // null
        boolean isActive; // false
        double psp; // 0.0
        int contact; // 0

        void display() {
            System.out.println("Name = " + name);
            System.out.println("isActive = " + isActive);
            System.out.println("psp = " + psp);
            System.out.println("contact = " + contact);
            
        }


        
 
    }

    
    public static void main(String[] args) {
        ScalerStudent student1 = new ScalerStudent();
        student1.name = "Joseph";
        student1.psp = 100;
        student1.isActive = true;
        student1.contact = 1234;

        student1.display();

        System.out.println("------------");

        ScalerStudent student2 = new ScalerStudent();
        student2.name = "Neel";
        student2.psp = 99.9;
        student2.isActive = false;
        student2.contact = 9876;

        student2.display();


        
    }
}
