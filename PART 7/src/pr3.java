import java.util.*;
class Account {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int we;
    double inc;
    Boolean czs;
    static void Pr3() {
        System.out.println("Fill the Form:");
    }
    void info() {
        System.out.println("Enter Your Name : ");
        name = sc.next();
        System.out.println("Enter Your Age : ");
        age = sc.nextInt();
        System.out.println("Enter Your Net Monthly Income : ");
        inc = sc.nextDouble();
        System.out.println("Enter Your Total Work Experience : ");
        we = sc.nextInt();
        System.out.println("Are you an Indian Citizen?: ");
        czs = sc.nextBoolean();
    }
    void check() {
        if (age >= 21 && age <= 60) {
            System.out.println("Your Age is : " + age);
        } else if (inc >= 15000) {
            System.out.println("Your Monthly Income is: " +inc);
        } else if (we >= 1) {
            System.out.println("Your Work Experience is : " + we);
        } else if (czs == true) {
            System.out.println("You have an Indian Citizenship ");
        }
    }
}
public class pr3 extends Account {

    public static void main(String[] args) {
        int count = 0;
        ArrayList a = new ArrayList<>();
        ArrayList<pr3> personHolder = new ArrayList<pr3>();
        pr3.Pr3();
        for (int i = 1; i <= 5; i++) {
            personHolder.add(new pr3());
        }

        for (pr3 p : personHolder) {
            p.info();
            p.check();
            if (p.age >= 21 && p.age <= 60 && p.inc >= 15000 && p.we >= 1 && p.czs == true) {
                System.out.println("You are eligible.");
                System.out.println("Your Name is : " + p.name);
                count++;
                a.add(p.name);
            } else {
                System.out.println("You are not eligible.");
            }
        }
        System.out.println("The number of eligible candidates : " + count);
        System.out.println("The number of not eligible candidates : " + (5 - count));
        System.out.println("All eligible candidates are : " + a);
    }
}