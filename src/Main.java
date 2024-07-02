import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aulas sobre a linguagem Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Aulas sobre a linguagem Python");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("mentorara sobre a linguagem java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWill = new Dev();
        devWill.setNome("Will");
        devWill.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Will: "+devWill.getConteudosInscritos());
        devWill.progredir();
        devWill.progredir();
        devWill.progredir();
        System.out.println("--Progrediu--");
        System.out.println("Conteudos Incritos Will: "+devWill.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Will: "+devWill.getConteudosConcluidos());
        System.out.println("XP:"+devWill.calcularTotalXp());

        System.out.println("------------");

        Dev devChris = new Dev();
        devChris.setNome("Chris");
        devChris.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Chris: "+devChris.getConteudosInscritos());
        devChris.progredir();
        System.out.println("--Progrediu--");
        System.out.println("Conteudos Incritos Chris: "+devChris.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Chris: "+devChris.getConteudosConcluidos());
        System.out.println("XP:"+devChris.calcularTotalXp());



    }
}
