package geometric_exercise;

import java.util.List;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        List<interfacee> list = new ArrayList<>();
            list.add(new square(2.0));
            list.add(new circle(2.5));

        List<square> listSquare = new ArrayList<>();
            listSquare.add(new square(1.0));
            listSquare.add(new square(3.0));

        List<circle> listCircle = new ArrayList<>();
            listCircle.add(new circle(3.7));
            listCircle.add(new circle(8.2));

    System.out.println("Total area of the circles: " + totalArea(listCircle));
    System.out.println("Total area of the squares: " + totalArea(listSquare));
       
        

    }

     public static double totalArea(List<? extends interfacee> list){
            double sum = 0.0;
            for (interfacee s : list){
                sum = sum + s.getArea();
                
            }
            return sum;
        }


}
