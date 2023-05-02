package main;

import sp.fateczl.lucas.listaInt.Lista;

public class Principal {
    public static void main(String[] args) throws Exception {
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Lista listaL = new Lista();
        Lista listaV = new Lista();

        for (int i = 0; i < vetor.length; i++) {
            int valor = vetor[i];
            if (listaV.contains(listaL, valor)) { 
                listaL.addLast(valor); 
            } else {
                listaV.addLast(valor); 
                if (valor % 2 == 0) {
                    listaL.add(2, valor); 
                } else {
                    listaL.add(1, valor); 
                }
            }
        }

        System.out.println(listaL);
    }
}
