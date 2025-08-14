package br.com.ddmdros.array;

/**
 * @author rodrigo.pires
 */
public class ebac2_BubbleSortFixo {

    public static void main(String args[]) {
        int[] vet = {8, 9, 3, 5, 1};
        int aux = 0; //variavel auxiliar
        int i = 0; // contador

        System.out.println("Vetor desordenado: ");
        for(i = 0; i<5; i++){
            System.out.println(" "+vet[i]);
        }
        System.out.println(" ");

        for(i = 0; i<5; i++){
            for(int j = 0; j<4; j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for(i = 0; i<5; i++){
            System.out.println(" "+vet[i]);
        }
    }

}