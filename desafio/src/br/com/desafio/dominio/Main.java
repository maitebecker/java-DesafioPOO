package br.com.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso("curso java","descricao curso java", 8);
		Curso curso2 = new Curso("curso javascript", "descricao curso javascript", 4);
		Mentoria mentoria = new Mentoria("mentoria de java", "descricao mentoia java", LocalDate.now());
				
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Decrição Botcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMaite = new Dev();
		devMaite.setNome("Maite");
		devMaite.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Maite: " + devMaite.getConteudosInscritos());
		
		devMaite.progredir();
		devMaite.progredir();
		System.out.println("-");
		System.out.println("Conteudos inscritos Maite: " + devMaite.getConteudosInscritos());
		System.out.println("Conteudos concluidos Maite: " + devMaite.getConteudosConcluidos());
		System.out.println("XP: " + devMaite.calcularTotalXp());
		
		System.out.println("-----------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
		
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
		System.out.println("Conteudos concluidos Joao: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
	}

}
