public class Carro {
    String marca;
    String modelo;
    int qntdpass;
    double capCombustivel;
    double consCombustivel;
    
    public Carro(String marca,String modelo,int qntdpass,double capCombustivel,
    double consCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.qntdpass = qntdpass;
        this.capCombustivel = capCombustivel;
        this.consCombustivel = consCombustivel;
    }
    
    public Carro(){
        
    }
    
    public Carro(String marca,String modelo,int qntdpass){
        this.marca = marca;
        this.modelo = modelo;
        this.qntdpass = qntdpass;
    }
    
    public Carro(String marca,String modelo){
        this(marca,modelo,5);
    }
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet","Cobalt");
        
        Carro carro2 = new Carro("Fiat","Touro");
        
        System.out.println(carro1.qntdpass);
        
        System.out.println(carro2.qntdpass);
    }
}
