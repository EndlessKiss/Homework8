

public class Main {
    public static void main(String[] args) {
        int[] integer = new int[]{1, 2, 3};
        double[] fractional = {1.57, 7.654, 9.986};
        int[] my = {4, 5, 6};
        System.out.println(integer[0] + ", " + integer[1] + ", " + integer[2]);
        System.out.println(fractional[0] + ", " + fractional[1] + ", " + fractional[2]);
        System.out.println(my[0] + ", " + my[1] + ", " + my[2]);
        System.out.println(integer[2] + ", " + integer[1] + ", " + integer[0]);
        System.out.println(fractional[2] + ", " + fractional[1] + ", " + fractional[0]);
        System.out.println(my[2] + ", " + my[1] + ", " + my[0]);
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 != 0) {
                System.out.println(integer[i] + 1);
            }
        }


    }

}
