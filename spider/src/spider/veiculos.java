package spider;


public class veiculos {
  private int passageiros;
  private int combustivel;
  private int consumo;
  
  public veiculos(int pass, int comb, int cons){
      this.passageiros= pass;
      this.combustivel=comb;
      this.consumo=cons;
   }
  public int calcular_calculo(){
      return(this.combustivel*this.consumo);
     
  }
  public int get_passageiros(){
      return this.passageiros;
  }
}
