import java.util.Scanner;

public class myCalculoSal {
    public static void main(String[] args) {
        int horasTrab;
        final int diasMes = 23;
        double precHora,salBruto,desContos=0.0,iNss,impRenda,sindC;
        
        //Instânciando objeto para números inteiros
        Scanner recH = new Scanner(System.in);
        //Instânciando objeto para números float
        Scanner recPH = new Scanner(System.in);
        
        System.out.println("Quantas horas você trabalha no dia ?:");
        horasTrab = recH.nextInt();
        
        System.out.println("Quanto você ganha por hora trabalhada ?:");
        precHora = recH.nextFloat();
        
        salBruto = precHora * (horasTrab * diasMes);
        System.out.println("O seu salário bruto é:R$ " + salBruto);
        
        impRenda = salBruto * 0.11;
        System.out.println("O seu salário com o imposto de renda descontado é:R$ " + (salBruto - impRenda));
        
        iNss = salBruto * 0.08;
        System.out.println("O seu salário com o INSS descontado é:R$ " + (salBruto - iNss));
        
        sindC = salBruto * 0.05;
        System.out.println("O seu salário com a taxa do Sindicato  descontada é:R$ " + (salBruto - sindC));
        
        desContos = (salBruto - (salBruto - impRenda))+(salBruto - (salBruto - iNss))+(salBruto - (salBruto - sindC));
        
        System.out.printf("Ao todo foram descontados :R$%.2f \n",desContos);
        
        System.out.printf("Seu salário liquído sem os descontos é:R$.2f",(salBruto - desContos));
        
        
    }
}
