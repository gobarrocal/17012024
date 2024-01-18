public class switchCase {
    
    public static void main(String[] args) {
        //...
    
    int diaDaSemana = 4;
//numero para escolher o dia da semana
    String nomeDia;

switch (diaDaSemana){
 case 1:
 //caso 1 = domingo
    nomeDia = "Domingo";
    break;
case 2:
//caso 2 = segunda
    nomeDia = "Segunda";
    break;
case 3:
    nomeDia = "Terça";
    break;
case 4: 
    nomeDia = "Quarta";
    break;
case 5:
    nomeDia = "Quinta";
    break;
case 6:
    nomeDia = "Sexta";
    break;
case 7:
    nomeDia = "Sábado";
    break;
default:
    nomeDia = "Dia inválido";
}
    System.out.println("O dia da semana é " + nomeDia);

}
}
