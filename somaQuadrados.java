public class mySomaQuadrados {
    public static void main(String[] args) {
        int n = 0,m = 0,j=0,rec=0,quadSoma=0;
        do{
            n++;
            m++;
            j++;
            rec += (n * m);
            quadSoma += n;
        }while(j<=9);
        
        System.out.println("Soma dos quadrados é igual a: "+ rec);
        
        System.out.println("Quadrado da soma é igual a:" + (quadSoma*quadSoma));
        
        System.out.println("A diferença entre a soma dos quadrados e o quadrado da soma é:" + (quadSoma*quadSoma));
    }
}
