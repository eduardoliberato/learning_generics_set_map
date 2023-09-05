package set;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class application {
    
    public static void main(String[] args) {

        Set<student> set = new HashSet<>();
        

        Scanner sc = new Scanner(System.in);

       

        System.out.println("How many students for course A?");
        int s_a = sc.nextInt();
        for(int i = 0; i < s_a ; i++){
            System.out.println("what is the user code?");
            int number_code = sc.nextInt();
            set.add(new student(number_code));
        }

        System.out.println("How many students for course B?");
        int s_b = sc.nextInt();
         for(int i = 0; i < s_b ; i++){
            System.out.println("what is the user code?");
            int number_code = sc.nextInt();
            set.add(new student(number_code));
        }

        System.out.println("How many students for course C?");
        int s_c = sc.nextInt();
         for(int i = 0; i < s_c ; i++){
            System.out.println("what is the user code?");
            int number_code = sc.nextInt();
            set.add(new student(number_code));
        }

        System.out.println("Total students: " + set.size());

    
    sc.close();


    }
}
