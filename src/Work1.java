public class Work1 {
    public static void main(String[] args) {
        byte a = 127;
        short b = 12345;
        int  c = 1;
        long d = 12312312L;

        float f = 13.123f;
        double g = 213.2;

        boolean q = true;
        char ch = 'a';

        String str = "lol";
        System.out.println(str);
        System.out.println(multiplication(2,3,4,5));
        System.out.println(check(11,10));
        positiveOrNegative(0);
        System.out.println(negative(-10));
        sayHello(" Miely otasairus!");




    }

    public static int multiplication(int a, int b, int c, int d ){
        int multi = 0;
        multi = a*(b + (c / d));
        return multi;
    }
    public static boolean check(int a,int b){
        boolean bol;
        int sum = a + b;

        if(sum >= 10 && sum <=20){
            bol = true;

        }else bol = false;
        return bol;
    }
    public static void positiveOrNegative (int a){
        if (a >=0){
            System.out.println("number is positive");
        }else System.out.println("number is negative");
    }

    public static boolean negative (int a){
        boolean bool = false;
        if (a < 0){
            bool= true;

        }
        return bool;
    }

    public static void sayHello (String name){
        System.out.println("Hello"+ name);
    }

}
