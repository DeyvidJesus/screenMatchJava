package br.com.alura.calculos;

public class FiltroRecomendacao {
    public void filtrar(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Vale a pena assitir!");
        } else {
            System.out.println("Pra adicionar na lista.");
        }
    }
}
