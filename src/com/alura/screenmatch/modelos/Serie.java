package com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean activa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String lost, int i, boolean b, int i1, int i2, int i3, int i4) {
    }

    public Serie(String nombre, int fechaDeLanzamiento, boolean incluidoEnElPlan, int temporadas, boolean activa, int episodiosPorTemporada, int minutosPorEpisodio) {
        super(nombre, fechaDeLanzamiento, incluidoEnElPlan);
        this.temporadas = temporadas;
        this.activa = activa;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Título serie= '" + this.getNombre() + "' (" + this.getFechaDeLanzamiento() + ")";
    }

}
