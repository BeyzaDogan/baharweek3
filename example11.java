/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
import java.util.Scanner;
import java.util.Random;

public class example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random rnd = new Random();
        int[] dizi = new int[1000];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(1000);
            System.out.println(binarysearch(0, 999, 0, dizi));

        }
    }

    public static int binarysearch(int element, int high, int low, int[] dizi) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (dizi[mid] < element) {
                low = mid + 1;
            } else if (dizi[mid] > element) {
                high = mid - 1;

            } else if (dizi[mid] == element) {
                return mid;
            }
        }

        return -1;
    }
}
