public class Main {
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 6;
        sudetis(n1, n2);
        // System.out.println(9.8596);
        System.out.println(PISq());
        double res = PISq();
        System.out.println(res);

        int nr1 = 2;
        int nr2 = 2;
        sandauga(nr1, nr2);

        int[] arr = {6, 7, 8, 9, 6, 3, 2, 4};
        printArr(arr);

        int min = 10;
        int max = 50;
        int randomNum = getRandom(min, max);



    }

    public static int sudetis(int int1, int int2) {
        int sudetis = int1 + int2;
        System.out.println(sudetis);
        return sudetis;
    }

    public static double PISq() {
        return 9.8596;
    }

    public static int sandauga(int nr1, int nr2) {
        int sandauga = nr1 * nr2;
        System.out.println(sandauga);
        return sandauga;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int getRandom(int min, int max){
        return min + (int) (Math.random() * (max - min + 1));

    }

}
