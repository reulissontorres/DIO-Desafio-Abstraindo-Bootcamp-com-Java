package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {
    }

    public Curso(String titulo) {
        this.setTitulo(titulo);
    }

    public Curso(String titulo, String descricao) {
        this(titulo);
        this.setDescricao(descricao);
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this(titulo, descricao);
        this.setCargaHoraria(cargaHoraria);
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso" +
                "[titulo=" + getTitulo() +
                ", descricao=" + getDescricao() +
                ", cargaHoraria=" + cargaHoraria +
                "]";
    }
}