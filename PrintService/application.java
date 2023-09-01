package PrintService;
import java.util.Scanner;

public class application {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digit the number of elements: ");
        int n = sc.nextInt();

        sc.nextLine();

        PrintService<String> ps = new PrintService<>();

        for(int i = 1; i <= n; i++){
            System.out.printf("Digit the element %d : ", i);
            String name = sc.nextLine();
            ps.addValue(name); 

        }

        ps.print();

        String x = ps.first();
        System.out.println("\nFirst: " + x);


    }

}