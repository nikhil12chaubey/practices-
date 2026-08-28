import java.util.Scanner;

public class ModularExponentiation {

    static long powerMod(long a, long b, long M) {
        long result = 1;

        a = a % M;

        while (b > 0) {

            // If b is odd
            if (b % 2 == 1) {
                result = (result * a) % M;
            }

            // Square a
            a = (a * a) % M;

            // Divide b by 2
            b = b / 2;
        }

