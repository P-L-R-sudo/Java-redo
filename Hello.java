class Hello {
    public static void main(Strings[] args) {
        int num1 = 1;
        int num2 = 4;
        int result = num1 + num2;
        System.out.println(result);

        int i = 7;
        float f = (int) i;
        System.out.println(f);

        int num3 = 222;
        int resultss = num3++;
        int results = num3--;
        System.out.println(results);
        System.out.println(resultss);

        double x = 6.6;
        double y = 5.5;
        boolean b = (x <= y);
        System.out.println(b);

        // Finding biggest num using conditional statements.
        int num4 = 70;
        int num5 = 33;
        int num6 = 222;

        if (num4 > num5 && num4 > num6)
            System.out.println(num4);
        else if (num5 > num4 && num5 > num6)
            System.out.println(num5);
        else
            System.out.println(num6);
    }

}
