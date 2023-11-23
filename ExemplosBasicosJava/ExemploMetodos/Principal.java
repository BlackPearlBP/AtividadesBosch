public class Principal{
    public static void main(String[] args) {
        double numero1 = EntradaSaida.solicitarNumeros("1º");
        double numero2 = EntradaSaida.solicitarNumeros("2º");
        double resultado = 0;
        boolean opcaoInvalida=false;

        int opcao = EntradaSaida.pedirOperacao();

        switch (opcao) {
            case 1:
                resultado=Calculo.somar(numero1, numero2);
            break;

            case 2:
                resultado=Calculo.subtrair(numero1, numero2);
            break;

            case 3:
                resultado=Calculo.multiplicar(numero1, numero2);
            break;

            case 4:
            if(numero2!=0){
                resultado=Calculo.dividir(numero1, numero2);
            }
            else{
                EntradaSaida.mostrarMensagem("Não é possível dividir por zero!");
            }
            break;
        
            default:
                EntradaSaida.mostrarMensagem("Operação inválida");
                opcaoInvalida=true;
            break;
        }
        if(numero2!=0 && opcao!=4 || opcaoInvalida==false){
        EntradaSaida.mostrarResultado(numero1, numero2, opcao, resultado);
        }
}
}