
package spider;

public class Spider{

  
    public static void main(String[] args) {
      
        veiculos minivan= new veiculos(7,80,9);
        veiculos sportcar= new veiculos(2,9,35);
        Moto moto = new Moto (2,10,20,"honda");
        System.out.print("minivan pode transportar " + minivan.get_passageiros()+" passageiros " );
        System.out.println("com autonomia de "+minivan.calcular_calculo()+" quilometros " );
        System.out.print("carro esporte pode transportar "+ sportcar.get_passageiros()+" passageiros " );
        System.out.println("com uma autonomia de " + sportcar.calcular_calculo()+" quilometros " );
        System.out.print("Moto " + moto.get_marca() + " pode transportar " + moto.get_passageiros() + " passageiros ");
        System.out.println("com uma autonomia de " + moto.calcular_calculo() + " quilometros");
    }
    
}
