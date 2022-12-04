import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWellington = new Dev();
        devWellington.setNome("Wellington");
        devWellington.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Wellington: " + devWellington.getConteudosInscritos());;
        devWellington.progredir();
        devWellington.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Wellington: " + devWellington.getConteudosInscritos());;
        System.out.println("Conteúdos concluídos Wellington: " + devWellington.getConteudosConcluidos());;
        System.out.println("XP: " + devWellington.calcularXp());
        
        System.out.println("-------------------");
        
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());;
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());;
        System.out.println("Conteúdos concluídos João: " + devJoao.getConteudosConcluidos());;
        System.out.println("XP: " + devJoao.calcularXp());
        
    }
}
