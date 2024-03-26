import br.com.alura.calculos.FiltroRecomendacao;
import br.com.alura.modelos.Episodio;
import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;

import java.io.File;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(4);
        favorito.avalia(2);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());

        Serie serie = new Serie("Vikings", 2016);
        serie.setTemporadas(8);
        serie.setEpisodiosPorTemporada(20);
        serie.setMinutosPorEpisodio(50);

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(serie);
        primeiro.setTotalVisualizacoes(50);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(favorito);
        filtro.filtrar(serie);
        filtro.filtrar(primeiro);

        Filme interestelar = new Filme("Interestelar", 2001);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(favorito);
        filmes.add(interestelar);

        System.out.println("Tamanho da lista: " +filmes.size());
        System.out.println("Primeiro Filme: " +filmes.get(0));
        System.out.println(filmes);
    }

}