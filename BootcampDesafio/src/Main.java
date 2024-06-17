import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {
        Conteudo javaBasico = new Curso("Java Básico", "Lógica de Programação", 40);
        Conteudo javaIntermediario = new Curso("Java Intermediário", "POO", 40);
        Conteudo git = new Mentoria("Git", "Principais Comandos Git");

        Bootcamp bootcamp = new Bootcamp("Java", "Java Básico ao Avançado");
        bootcamp.getConteudos().add(javaBasico);
        bootcamp.getConteudos().add(javaIntermediario);
        bootcamp.getConteudos().add(git);
        
        Dev ana = new Dev("Ana");
        Dev joao = new Dev("João");

        ana.inscreverBootcamp(bootcamp);
        System.out.println(ana.getConteudosInscritos());
        System.out.println("-");
        ana.progredir();
        System.out.println(ana.getConteudosInscritos());
        System.out.println(ana.getConteudosConcluidos());
        System.out.println("XP Total: " + ana.calcularTotalXp());

        System.out.println("--------");

        joao.inscreverBootcamp(bootcamp);
        System.out.println(joao.getConteudosInscritos());
        System.out.println("-");
        joao.progredir();
        joao.progredir();
        joao.progredir();
        System.out.println(joao.getConteudosInscritos());
        System.out.println(joao.getConteudosConcluidos());
        System.out.println("XP Total: " + joao.calcularTotalXp());
    }
}