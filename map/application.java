package map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> ballot = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String candidate = fields[0];
                Integer number_of_votes = Integer.parseInt(fields[1]);

                if (ballot.containsKey(candidate)) {

                    int total_votes_candidates = ballot.get(candidate); //this is for do not lose the old value of the fields[1] - i discover it debbuging the code
                    ballot.put(candidate, number_of_votes + total_votes_candidates);

                } else {
                    ballot.put(candidate, number_of_votes);
                }

                line = br.readLine();
            }

            for (String i : ballot.keySet()) {

                System.out.println(i + ": " + ballot.get(i));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

    }
}
