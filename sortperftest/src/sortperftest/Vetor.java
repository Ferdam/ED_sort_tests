/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortperftest;

/**
 *
 * @author 31410758
 */
public class Vetor {

    private int[] randVet;
    private int[] tempVet;

    public Vetor(int size) {
        this.randVet = new int[size];
    }

    public int[] randomizeVet() {
        for (int i = 0; i < randVet.length; i++) {
            randVet[i] = (int) (Math.random() * 100000);
        }
        return randVet;
    }

    public void decrVet() {
        for (int i = 0; i < randVet.length; i++) {
            randVet[i] = randVet.length - i;
        }
    }

    public void cresVet() {
        for (int i = 0; i < randVet.length; i++) {
            randVet[i] = i;
        }
    }

    public void bolhaSort() {
        for (int i = 0; i < randVet.length; i++) {
            for (int j = 0; j < randVet.length - 1 - i; j++) {
                if (randVet[j] > randVet[j + 1]) { //troca
                    int aux = randVet[j];
                    randVet[j] = randVet[j + 1];
                    randVet[j + 1] = aux;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < randVet.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < randVet.length; j++) {
                if (randVet[j] < randVet[index]) {
                    index = j;
                }
            }

            int smallerNumber = randVet[index];
            randVet[index] = randVet[i];
            randVet[i] = smallerNumber;
        }
    }

    public void insertionSort() {

        int j, i;
        int x;
        for (j = 0; j < randVet.length; j++) {
            x = randVet[j];
            for (i = j - 1; i >= 0 && randVet[i] > x; i--) {
                randVet[i + 1] = randVet[i];
            }
            randVet[i + 1] = x;
        }

    }

    public void mergeSortIt() {
        int[] from = randVet, to = new int[randVet.length];
        for (int blockSize = 1; blockSize < randVet.length; blockSize *= 2) {
            for (int start = 0; start < randVet.length; start += 2 * blockSize) {
                mergeI(from, to, start, start + blockSize, start + 2 * blockSize);
            }
            int[] temp = from;
            from = to;
            to = temp;
        }
        if (randVet != from) {
            for (int k = 0; k < randVet.length; k++) {
                randVet[k] = from[k];
            }
        }
    }

    public void mergeI(int[] from, int[] to, int lo, int mid, int hi) {
        // DK: cannot just return if mid >= a.length, but must still copy remaining elements!
        // DK: add two tests to first verify "mid" and "hi" are in range
        if (mid > from.length) {
            mid = from.length;
        }
        if (hi > from.length) {
            hi = from.length;
        }
        int i = lo, j = mid;
        for (int k = lo; k < hi; k++) {
            if (i == mid) {
                to[k] = from[j++];
            } else if (j == hi) {
                to[k] = from[i++];
            } else if (from[j] < from[i]) {
                to[k] = from[j++];
            } else {
                to[k] = from[i++];
            }
        }
        // DO NOT copy back
        // for (int k = lo; k < hi; k++)
        //   a[k] = aux[k];
    }

    public void mergeSortR() {
        mergeSortRec(0, randVet.length, randVet);
    }

    public void mergeSortRec(int p, int n, int vet[]) {
        if (p < n - 1) {
            int q = (p + n) / 2;
            mergeSortRec(p, q, vet);
            mergeSortRec(q, n, vet);
            int i, j, k, w[];
            w = new int[n - p];
            i = p;
            j = q; // preciso guardar o inicio e o meio dos vetores 
            k = 0;
            while (i < q && j < n) {
                if (vet[i] <= vet[j]) {
                    w[k++] = vet[i++];
                } else {
                    w[k++] = vet[j++];
                }
            } // testa caso resta algum elemento no vetores 
            while (i < q) {
                w[k++] = vet[i++];
            }
            while (j < n) {
                w[k++] = vet[j++];
            }
            for (i = p, j = 0; i < n; i++, j++) {
                vet[i] = w[j];
            }
        }
    }


//    public void quickSortR() {
//        quickSort(0, randVet.length, randVet);
//    }
    @Override
    public String toString() {
        String saida = "";
        for (int i = 0; i < randVet.length; i++) {
            saida += "[" + i + "]= " + randVet[i] + " | ";
        }
        return saida;
    }

}
