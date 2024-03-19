public class Main {
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 6;
        int sumResult = sudetis(n1, n2);
        System.out.println("Sum: " + sumResult);

        double piSquared = PISq();
        System.out.println("Pi squared: " + piSquared);

        int nr1 = 2;
        int nr2 = 2;
        int productResult = sandauga(nr1, nr2);
        System.out.println("Product: " + productResult);

        int[] arr = {6, 7, 8, 9, 6, 3, 2, 4};
        printArr(arr);

        int min = 10;
        int max = 50;
        int randomNum = getRandom(min, max);
        System.out.println("Skaicius: " + randomNum);

        int[] randArr = randArr (5, 9, 10)


    }

    public static int sudetis(int int1, int int2) {
        int sum = int1 + int2;
        return sum;
    }

    public static double PISq() {
        return 9.8596;
    }

    public static int sandauga(int nr1, int nr2) {
        int product = nr1 * nr2;
        return product;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int getRandom(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
//    Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų. Funkcija priima tris int tipo kintamuosius, min, max ir length
    public static int sestas(int min, int max, int lenght){
        for (int i = 0; i < lenght; i++) {
            System.out.println(arr[i] + " ");

        }
    }


}
