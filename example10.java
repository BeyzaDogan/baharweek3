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

public class example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1000);

            System.out.println(linearsearch(0, array));

        }
    }

    public static int linearsearch(int element, int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == element) {
                return i;

            }
        }
        return -1;

    }

}


