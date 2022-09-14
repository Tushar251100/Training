import java.util.Scanner;
public class Day1 {
    static boolean isLeapYear(int year){
        boolean out = (((year % 4 == 0) && !(year % 100 == 0)) || year % 400 == 0) ? true : false;
        return out;
    }

    static int greatestNumber(int a,int b, int c){
        int greatest=0;
        if(a>b){
            if(a>c) greatest = a;
        } else if (b>c) greatest = b;
        else greatest = c;
        return greatest;
    }

    static void switcher(String name){
        name = name.toLowerCase();
        switch(name){
            case "tushar":
                System.out.println("Hello " + name + " let's get trained.");
                break;
            case "deepika":
                System.out.println("Hello " + name + ", you are a great trainer.");
                break;
            case "ritika":
                System.out.println("Hello " + name + ", you are a great trainer.");
                break;
            default:
                System.out.println("Hello " + name);
        }
    }

    static boolean dora(int row, int col, int tnum){
        if(tnum > row*col){
            return false;
        }
        if(tnum<=row && tnum>0){
            return true;
        } else if (tnum%row == 0 || tnum%row == 1) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.println("Task 1: Check For Leap Year");
        System.out.println("Enter the year to check: ");
        int year = sc.nextInt();
        String result = isLeapYear(year) ? "Is Leap Year" : "Not a Leap Year";
        System.out.println(result);
        System.out.println("----------------------------------------------------------\n\n");

        System.out.println("Task 2: Greatest Of three Numbers");
        System.out.println("Enter the numbers to check: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int greatest = greatestNumber(a,b,c);
        System.out.println(Integer.toString(greatest) + " is the greatest number.");
        System.out.println("----------------------------------------------------------\n\n");

        System.out.println("Task 3: Switch Case");
        System.out.println("Enter your name");
        sc.nextLine();
        String name = sc.nextLine();
        switcher(name);
        System.out.println("----------------------------------------------------------\n\n");


        System.out.println("Task 4: Dora's Mango tree");
        System.out.println("Enter the row count: ");
        int row = sc.nextInt();
        System.out.println("Enter the column count: ");
        int col = sc.nextInt();
        System.out.println("Enter the tree number: ");
        int tnum = sc.nextInt();
        String res = (dora(row,col,tnum)) ? "Is a Mango Tree": "Not a Mango Tree.";
        System.out.println(res);
    }
}
