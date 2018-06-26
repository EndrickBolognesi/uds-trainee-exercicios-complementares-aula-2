package Exercicio_1;

abstract class Animal {
    protected Integer velocidade = 0;

    public void andar() {
        this.velocidade += 2;
        System.out.println("Andando");
     }




}
