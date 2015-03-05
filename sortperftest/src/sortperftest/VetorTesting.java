/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortperftest;

/**
 *
 * @author Ferdam-DMD-SSD
 */
public class VetorTesting {

    private Vetor vetor;
    private long tam;

    public VetorTesting(int size) {
        this.vetor = new Vetor(size);
    }

    public void randTests() {
        long ini, fim;
        
//      -------> TESTAR BOLHA  
        vetor.randomizeVet();
        System.out.println("--- BOLHA ---");
        ini = System.currentTimeMillis();
        vetor.bolhaSort();
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao: " + (fim - ini) + "\n-----------------------------");
//      -------> FIM BOLHA     

//      -------> TESTAR SELECAO  
        vetor.randomizeVet();
        System.out.println("--- SELECAO ---");
        ini = System.currentTimeMillis();
        vetor.selectionSort();
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao: " + (fim - ini) + "\n-----------------------------");
//      -------> FIM SELECAO     

//      -------> TESTAR INSERCAO  
        vetor.randomizeVet();
        System.out.println("--- INSERCAO ---");
        ini = System.currentTimeMillis();
        vetor.insertionSort();
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao: " + (fim - ini) + "\n-----------------------------");
//      -------> FIM INSERCAO  

//      -------> TESTAR MERGE ITERATIVE  
        vetor.randomizeVet();
        System.out.println("--- MERGE ITER---");
        ini = System.currentTimeMillis();
        vetor.mergeSortIt();
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao: " + (fim - ini) + "\n-----------------------------");
//      -------> FIM MERGE ITERATIVE

//      -------> TESTAR MERGE REC  
        vetor.randomizeVet();       
        System.out.println("--- MERGE REC ---");
        ini = System.currentTimeMillis();
        vetor.mergeSortR();
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao: " + (fim - ini) + "\n-----------------------------");
//      -------> FIM MERGE REC   

    }

    public void descendTests() {
        long ini, fim;
//      -------> TESTAR BOLHA  
        vetor.decrVet();
        System.out.println("--- BOLHA ---");
        ini = System.currentTimeMillis();
        vetor.bolhaSort();
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao: " + (fim - ini) + "\n-----------------------------");
//      -------> FIM BOLHA     

//      -------> TESTAR SELECAO  
        vetor.decrVet();
        System.out.println("--- SELECAO ---");
        ini = System.currentTimeMillis();
        vetor.selectionSort();
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao: " + (fim - ini) + "\n-----------------------------");
//      -------> FIM SELECAO     

//      -------> TESTAR INSERCAO  
        vetor.decrVet();
        System.out.println("--- INSERCAO ---");
        ini = System.currentTimeMillis();
        vetor.insertionSort();
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao: " + (fim - ini) + "\n-----------------------------");
//      -------> FIM INSERCAO  

//      -------> TESTAR MERGE ITERATIVE  
        vetor.decrVet();
        System.out.println("--- MERGE ITER ---");
        ini = System.currentTimeMillis();
        vetor.mergeSortIt();
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao: " + (fim - ini) + "\n-----------------------------");
//      -------> FIM MERGE ITERATIVE

//      -------> TESTAR MERGE REC  
        vetor.decrVet();
        System.out.println("--- MERGE REC ---");
        ini = System.currentTimeMillis();
        vetor.mergeSortR();
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao: " + (fim - ini) + "\n-----------------------------");
//      -------> FIM MERGE REC   
    }

}
