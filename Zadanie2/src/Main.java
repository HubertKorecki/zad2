import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert your age:");
        int age = sc.nextInt();
        System.out.println("Are you from Warsaw? yes/no");
        String city = sc.next();
        System.out.println("What day of the week is it?");
        String dayOfWeek = sc.next();

        int discount = 0;

        if (age < 10) {
            discount = 100;
        }else if (age <= 18){
            discount += 50;
        }
        if (city.equals("yes")) {
            discount = discount + 10;
        }

        if (dayOfWeek.equals("Thursday")) {
            discount = 100;
        }

        int finalPrice = (40 - (40*discount/100));

        System.out.println("Data:   Age: " + age + ", IsFromWarsaw: " + city + ", DayOfTheWeek: " + dayOfWeek + "\nDiscount: " + discount + "%\nTicket Price: " + finalPrice);
    }
}