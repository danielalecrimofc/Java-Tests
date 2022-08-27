public class App {
    public static void main(String[] args) {
        // Exemplos:
        // Iphone 12, tela de 6.1, 256gb
        // Galaxy Note 20 Ultra, tela de 6.9, 256gb
        // Xiaomi Mi 11 Pro, tela de 6.81, 128gb
        // <tipoVariavel> nomeVariavel = valor
        
        Celular celularA = new Celular();
        
        celularA.nome = "iphone 12";
        celularA.tamanhotela = 6.1f;
        celularA.armazenamento = 256;
        celularA.sistemaoperacional = "IOS";
        
        System.out.printf("%s com tamanho de %.1f polegadas,armazenamento "
                           + "de %d GB e sistema operacional %s !"
                            ,celularA.nome,celularA.tamanhotela,celularA.armazenamento,
                            celularA.sistemaoperacional);
    }
}
