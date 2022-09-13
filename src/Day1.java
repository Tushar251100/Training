public class Day1 {
    static boolean isLeapYear(int year){
        boolean out = (((year % 4 == 0) && !(year % 100 == 0)) || year % 400 == 0) ? true : false;
        return out;
    }

    static int greatestNumber(int a,int b, int c){
        int greatest;
        if(a>b && a>c) greatest = a;
        else if (b>c) greatest = b;
        else greatest = c;
        return greatest;
    }




    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
    }
}
