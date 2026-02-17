package org.example;

public class Main {
    public static void main(String[] args) {

        // Palindrom Test
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        // Mükemmel Sayıları Bulma Test
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        // Sayıları Kelimelere Dök Test
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    // Palindrom sayıyı bulma
    public static boolean isPalindrome(int number) {

        int originalNumber = Math.abs(number);
        int reversedNumber = 0;
        int temp = originalNumber;

        while (temp > 0) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp = temp / 10;
        }

        return originalNumber == reversedNumber;
    }

    // Mükemmel sayıları bulma
    public static boolean isPerfectNumber(int number) {

        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    // Sayıları kelimelere dök
    public static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        String result = "";

        while (number > 0) {

            int digit = number % 10;

            switch (digit) {
                case 0:
                    result = "Zero " + result;
                    break;
                case 1:
                    result = "One " + result;
                    break;
                case 2:
                    result = "Two " + result;
                    break;
                case 3:
                    result = "Three " + result;
                    break;
                case 4:
                    result = "Four " + result;
                    break;
                case 5:
                    result = "Five " + result;
                    break;
                case 6:
                    result = "Six " + result;
                    break;
                case 7:
                    result = "Seven " + result;
                    break;
                case 8:
                    result = "Eight " + result;
                    break;
                case 9:
                    result = "Nine " + result;
                    break;
            }

            number = number / 10;
        }

        return result.trim();
    }
}


