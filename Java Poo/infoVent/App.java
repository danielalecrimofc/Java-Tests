public class App {
    public static void main(String[] args) {
        // Ventilador de Mesa Mondial 40 cm 8 Pás de 127v
        
        Ventilador ventiladora = new Ventilador();
        
        ventiladora.tipo = "Ventilador de Mesa";
        ventiladora.marca = "Mondial";
        ventiladora.tamanho = 40;
        ventiladora.qntdpas = 8;
        ventiladora.voltagem = 127;
        
        System.out.printf(" %s da marca %s com %d cm de tamanho,%d Pás e %dv",ventiladora.tipo,ventiladora.marca,ventiladora.tamanho,ventiladora.qntdpas,ventiladora.voltagem);
    }
}
