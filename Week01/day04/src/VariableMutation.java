public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10

        System.out.println(a += 10);




        int b = 100;
        // make it smaller by 7


        System.out.println(b -= 7);




        int c = 44;
        // please double c's value


        System.out.println(c *= 2);




        int d = 125;
        // please divide by 5 d's value


        System.out.println(d /= 5);




        int e = 8;
        // please cube of e's value


        System.out.println(e *= e);




        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        if (f1 > f2){
            boolean bigger = true;
            System.out.println(bigger);
        }
        else {
            boolean bigger = false;
            System.out.println(bigger);
        }




        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        if ((g2 *= 2) > g1) {
            boolean bigger = true;
            System.out.println(bigger);
        }
        else {
            boolean bigger = false;
            System.out.println(bigger);
        }



        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        h %= 11;
        boolean divisor;
        if (h == 0) {
             divisor = true;
        } else {
            divisor = false;
        }
        System.out.println(divisor);



        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        if (i1 > (i2*=i2) && i1 < (i2*=i2*=i2)) {
            boolean value = true;
            System.out.println(value);
        } else {
            boolean value = false;
            System.out.println(value);
        }



        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        int div1;
        int div2;
        div1 = j % 3;
        div2 = j % 5;
        if ((div1 == 0) || (div2 == 0)) {
            divisor = true;
        } else {
            divisor = false;
        }
        System.out.println(divisor);


        String k = "Apple";
        //fill the k variable with its cotnent 4 times
        k = k + k + k + k;

        System.out.println(k);
    }
}