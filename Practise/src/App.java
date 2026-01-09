
public class App {
    public static void main(String[] args) throws Exception {

        // Example 2: Display attendance for 5 students. for loop

        for (int student = 1; student <= 10; student++) {
            // System.out.println("student" + student + "is present");
        }

        // Example 3: Add marks of 3 subjects. for loop

        int Total = 0;
        int marks[] = { 70, 80, 90 };

        for (int i = 0; i < marks.length; i++) {
            Total = Total + marks[i];
        }
        System.out.println("Total Marks = " + Total);

        // Display all student names. for each

        String students[] = { "jhon", "jack", "max", "tom" };

        for (String name : students) {
            // System.out.println("student name: " + name);
        }

        // Calculate total salary paid to employees.

        int salary[] = { 50000, 60000, 70000 };
        int totalsalary = 0;

        for (int amount : salary) {
            totalsalary = totalsalary + amount;
        }

        System.out.println("Total salary = " + totalsalary);

        // User can try until the correct PIN is entered. while loop
        int pin = 1234;
        int enteredpin = 1234;

        while (pin != enteredpin) {
            System.out.println("Wrong PIN. Try again");

        }
        System.out.println("PIN Accepted");

        // Show download until it reaches 100%.

        int progress = 0;

        while (progress <= 100) {
            System.out.println("Download Progress:  " + progress + "%");

            progress += 20;
        }

        System.out.println("Download Completed");


        // do while ATM menus and application dashboards.

        int choice = 1;

        do{
               System.out.println("1. Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.println("Menu shown");

            choice++; // simulated input change
        }
        while(choice <= 3);

    }
}
