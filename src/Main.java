
public class Main {
    public static void welcome(){
        System.out.println("Welcome to SmartManagement System");
    }
    public static void WelcomeUser(String name){
        System.out.println("Welcome to "+name);
    }

    public static int Multiply(int a,int b){
        return a*b;
    }
    public static void print(int[] nums) {
        for (int no : nums) {
            System.out.println("No "+no);
        }
    }
    public static void Menu(String... names){
        for(String name :names){
            System.out.println("Here are names "+name);

        }
    }
    public static void main(String[] args) {

        Student simport=new Student();
        simport.setName("Fatima");
        simport.setAge(5);
        System.out.println(simport.toString());
        int[] nums = {5, 10, 15};
        print(nums);

welcome();
int responsemultiply=Multiply(6,5);
System.out.println("RESPONSE "+responsemultiply);
Menu("burger","pizza","cake");
WelcomeUser("fatima");
WelcomeUser("fatima");
        // =======================
        // ARRAY DECLARATIONS
        // =======================
        int[] arr = {10, 20, 30, 40, 50};
        int[] num = {5, 15, 25, 35, 45};

        String[] employenames = {"Fatima", "Ali", "Hamza"};
        Double[] employesalary = {1500.00, 1200.00, 200.0};

        // =======================
        // BASIC VARIABLES
        // =======================
        int id = 101;
        String name = "Fatima";
        char gender = 'F';
        int age = 26;
        float height = 5.5F;
        double salary = 45000;
        boolean isActive = true;
        String city = "Islamabad";

        // =======================
        // PRINT BASIC INFO
        // =======================
        System.out.println("Student Info");
        System.out.println("id  " + id);
        System.out.println("Name  " + name);
        System.out.println("City  " + city);
        System.out.println("Gender  " + gender);
        System.out.println("Salary  " + salary);
        System.out.println("Height  " + height);
        System.out.println("Active " + isActive);

        // =======================
        // STRING METHODS
        // =======================
        System.out.println("String length of name " + name.length());
        System.out.println("String contains 'ALI' " + name.contains("ALI"));
        System.out.println("Name Upper Case " + name.toUpperCase());

        // =======================
        // TYPE CASTING
        // =======================
        int new_height = (int) height;
        System.out.println("New height " + new_height);

        double new_age = age; // implicit casting
        System.out.println("New age " + new_age);

        // =======================
        // IF-ELSE
        // =======================
        if (salary == 500) {
            System.out.println("Salary is 500");
        } else {
            System.out.println("Salary is greater than 500");
        }

        // =======================
        // TERNARY OPERATOR
        // =======================
        String response = (salary < 900)
                ? "less salary"
                : (salary > 1000)
                ? "More Salary"
                : "Salary is normal";

        System.out.println("Response is here " + response);

        // =======================
        // LOOPING - EMPLOYEES
        // =======================
        for (String empname : employenames) {
            System.out.println("Employee Name: " + empname);
        }

        for (double empsalary : employesalary) {
            System.out.println("Employee Salary: " + empsalary);
        }

        // =======================
        // HIGHEST & LOWEST SALARY
        // =======================
        double maxSalary = employesalary[0];
        double minSalary = employesalary[0];

        for (int i = 0; i < employesalary.length; i++) {
            if (employesalary[i] > maxSalary) {
                maxSalary = employesalary[i];
            }
            if (employesalary[i] < minSalary) {
                minSalary = employesalary[i];
            }
        }

        System.out.println("HIGHEST salary: " + maxSalary);
        System.out.println("LOWEST salary: " + minSalary);

        // =======================
        // ARRAY PRINTING
        // =======================
        for (int a : arr) {
            System.out.println("Array value: " + a + " | Length: " + arr.length);
        }

        System.out.println("First Element: " + nums[0] +
                " | Last Element: " + nums[nums.length - 1]);

        // =======================
        // SUM OF ARRAY
        // =======================
        int sum = 0;
        for (int numsum : nums) {
            sum += numsum;
        }
        System.out.println("Total Sum: " + sum);

        // =======================
        // EVEN COUNT
        // =======================
        int evennumCount = 0;
        for (int evenum : nums) {
            if (evenum % 2 == 0) {
                evennumCount++;
            }
        }
        System.out.println("Total Even Numbers: " + evennumCount);

        // =======================
        // REVERSE ARRAY
        // =======================
        System.out.print("Reverse Array: ");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // =======================
        // SWITCH - DAY
        // =======================
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            default:
                System.out.println("Day not exist");
        }

        // =======================
        // SWITCH - OPERATOR
        // =======================
        int a = 90;
        int b = 0;
        char operator = '+';

        switch (operator) {
            case '*':
                System.out.println("Result: " + (a * b));
                break;

            case '+':
                System.out.println("Result: " + (a + b));
                break;

            default:
                System.out.println("Only Sum & Multiplication allowed");
        }

        // =======================
        // SWITCH EXPRESSION (JAVA 14+)
        // =======================
        int month = 4;

        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid month";
        };

        System.out.println("Season: " + season);

        // =======================
        // METHOD CALLS
        // =======================
        showname("Mamoona");
        showcity();
boolean isAge=agecheck(12);
System.out.println(isAge);
    }

    // =======================
    // METHODS
    // =======================
    public static void showname() {
        System.out.println("Student Info Fatima");
    }

    static void showname(String name) {
        System.out.println("Student Info " + name);
    }
static boolean agecheck(int age){
        String response=(age>=10 && age<=18)?"Adult":(age<10?"baby":"Not size Available");
        System.out.println("Response is here " + response);
        return true;
}
    public static void showcity() {
        System.out.println("City is RWP");
    }
}