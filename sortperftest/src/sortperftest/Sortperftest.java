/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortperftest;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author 31410758
 */
public class Sortperftest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//        FileOutputStream f = new FileOutputStream("file.txt");
//        System.setOut(new PrintStream(f));
        testMultiple(4);

    }

    public static void testMultiple(int num) throws Exception  {
        int cont = 0;
        do {
            FileOutputStream f = new FileOutputStream("Test_number_"+(cont+1)+".txt");
            System.setOut(new PrintStream(f));
            System.out.println("||||||||||||||||||||||||| \n--------TESTE #" + (cont + 1) + "---------\n||||||||||||||||||||||||| \n");

            VetorTesting v10k = new VetorTesting(10000);
            System.out.println("\n[=== 10k - RANDOM ===]");
            v10k.randTests();
            System.out.println("\n[=== 10k - DECRESCENTE ===]");
            v10k.descendTests();

            VetorTesting v50k = new VetorTesting(50000);
            System.out.println("\n[=== 50k - RANDOM ===]");
            v50k.randTests();
            System.out.println("\n[=== 50k - DECRESCENTE ===]");
            v50k.descendTests();

            VetorTesting v100k = new VetorTesting(100000);
            System.out.println("\n[=== 100k - RANDOM ===]");
            v100k.randTests();
            System.out.println("\n[=== 100k - DECRESCENTE ===]");
            v100k.descendTests();

            VetorTesting v500k = new VetorTesting(500000);
            System.out.println("\n[=== 500k - RANDOM ===]");
            v500k.randTests();
            System.out.println("\n[=== 500k - DECRESCENTE ===]");
            v500k.descendTests();

            VetorTesting v1000k = new VetorTesting(1000000);
            System.out.println("\n[=== 1000k - RANDOM ===]");
            v1000k.randTests();
            System.out.println("\n[=== 1000k - DECRESCENTE ===]");
            v1000k.descendTests();
            cont++;

        } while (cont < num);
    }
}
