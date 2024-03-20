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

        int minRandom = 1;
        int maxRandom = 100;
        int length = 10;
        int[] randomNumbers = randomas(minRandom, maxRandom, length);

        System.out.println("Random numeriai:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        int sum = sumArray(randomNumbers);
        System.out.println("\nSuma: " + sum);

        double avg = avgArray(randomNumbers);
        System.out.println("Average: " + avg);

        String text = "Šiandien labai graži diena";
        tekstas(text);

        String inputTxt = "ragadunda";
        String revTxt = reversed(inputTxt);
        System.out.println("Reversed: " + revTxt);

        String inputT = "mano vardas gediminas";
        String dash = formatas("---" + inputT + "---");
        System.out.println(dash);

        String randomString = generateRndStr(10);
        System.out.println("Random String: " + randomString);

        String inputText = "A1B23C456D7E";
        System.out.println("Input Text: " + inputText);
        randomStripSplit(inputText);

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

    // Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų. Funkcija priima tris int tipo kintamuosius, min, max ir length
    public static int[] randomas(int min, int max, int length) {
        if (length <= 0) {
            System.out.println("Ilgis turi buti didesnis uz 0");
        }
        if (min >= max) {
            System.out.println("max turi buti daugiau uz min");
        }

        int[] randomArray = new int[length];

        for (int i = 0; i < length; i++) {
            int randomNum = (int) (Math.random() * (max - min + 1)) + min;
            randomArray[i] = randomNum;
        }

        return randomArray;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double avgArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static void tekstas(String inputSentence) {
        int rsk = 0;
        int tsk = 0;

        for (char c : inputSentence.toCharArray()) {
            if (Character.isLetter(c)) {
                rsk++;
            } else if (Character.isWhitespace(c)) {
                tsk++;
            }
        }

        System.out.println("Raides: " + rsk);
        System.out.println("Tarpai: " + tsk);



//        String randomText = generateRndStr(10);
//        System.out.println("Random text: " + randomText);
//        randomStripSplit(randomText);
        int length = 10;
        String text = generateRndStr (length);
        randomStripSplit(text);
        System.out.println(text);

    }

    public static String reversed(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }

        return new String(charArray);
    }

    public static String formatas(String input){
        return input;
    }

    public static String generateRndStr(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678901234567890";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random() * symbols.length()));
        }
        return text;
    }

    public static void randomStripSplit(String txt) {
        String number = "";

        for (int i = 0; i < txt.length(); i++) {
            char currentChar = txt.charAt(i);
            if (Character.isDigit(currentChar)) {
                number += currentChar;
            } else {
                if (!number.isEmpty()) {
                    System.out.println("[" + number + "]");
                    number = "";
                }
                System.out.println(currentChar);
            }
        }
        if (!number.isEmpty()) {
            System.out.println("[" + number + "]");
        }
    }

    }





