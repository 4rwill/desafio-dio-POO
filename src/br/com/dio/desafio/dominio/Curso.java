package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    //attributes
   private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
   //constructor
    public Curso() {
    }

    //getters and setters

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //toString

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
