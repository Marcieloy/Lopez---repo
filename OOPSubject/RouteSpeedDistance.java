import java.util.*;

public class RouteSpeedDistance 
{
   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in);
      double speed, distance = 0, timeOfArrival;
      System.out.print("Enter the speed: ");
      speed = scan.nextDouble();
      emallToCarcar();
      
      System.out.println("Is Barili obstructed?");
      System.out.println("1) Yes \n2) No");
      System.out.print("Select an option: ");
      

      int choice = scan.nextInt();

      if (choice == 1) 
      {
         emallToCarcar();
         
         System.out.println("Route 4.1 - Sibonga");
         System.out.println("Is Dumanjug obstructed?");
         System.out.println("1) Yes \n2) No");
         System.out.print("Select an option: ");
         choice = scan.nextInt();
         
         if (choice == 1) 
         {
            distance = 103;
            emallToCarcar();
            
            System.out.println("Route 4.1 - Sibonga");
            System.out.println("Route 5 - Argao");
            System.out.println("Route 5.1 - Ronda");
            System.out.println("Route 5.1 - Alcantara");
         } 
         
         else if (choice == 2) 
         {
            distance = 100;
            emallToCarcar();
            
            System.out.println("Route 4.1 - Sibonga");
            System.out.println("Route 4.2.1 - Dumanjug");
            System.out.println("Route 4.2.2 - Alcantara");
         }
      } 
      
      else if (choice == 2) 
      {
         distance = 84.9;
         emallToCarcar();
         
         System.out.println("Route 4.1 - Barili");
         System.out.println("Route 4.1.1 - Dumanjug");
         System.out.println("Route 4.1.2 - Alcantara");
      }

      timeOfArrival = distance / speed;
      System.out.println("End - Moalboal");
      System.out.printf("Speed: %.0f km/hr\n", speed);
      System.out.printf("Distance: %.2f km\n", distance);
      System.out.printf("Possible time of arrival: %.2f hours", timeOfArrival);
   }

   public static void emallToCarcar() 
   {
      System.out.println("\nStart - Cebu City (Emall)");
      System.out.println("Route 1 - Minglanilla");
      System.out.println("Route 2 - San Fernando");
      System.out.println("Route 3 - Carcar");
   }
}