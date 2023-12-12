package br.com.designpattern.builder.solucao;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = Animal.builder()
                .nome("Totó")
                .dono("Fernando")
                .raca("Pincher")
                .build();
        System.out.println(animal);
    }
}
