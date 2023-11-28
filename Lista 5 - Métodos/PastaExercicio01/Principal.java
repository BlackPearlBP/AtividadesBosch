import javax.swing.JOptionPane;

public class Principal{
    public static void main(String[] args) {
        boolean notaValida=false;
        double nota1 = 0;
        double nota2 = 0;

        while(! Validacao.validarNota(nota1, nota2)){
        nota1 = EntradaSaida.solicitarNotas("1ª");
        nota2 = EntradaSaida.solicitarNotas("2ª");
            if(notaValida==false){
                JOptionPane.showMessageDialog(null, "Nota inválida!", "ERRO!", 0);
            }
/*Sugestão, após pedir as 2 notas:
            while(! Validacao.validarNota(nota1,nota2)){
                 nota1 = EntradaSaida.solicitarNotas("1ª");
                nota2 = EntradaSaida.solicitarNotas("2ª");
            }
            APLICADO
            antes:
            while(notaValida==false){
                nota1 = EntradaSaida.solicitarNotas("1ª");
                nota2 = EntradaSaida.solicitarNotas("2ª");
                notaValida=Validacao.validarNota(nota1,nota2);
        */
        }
        double peso1 = EntradaSaida.solicitarPesos("1ª");
        double peso2 = EntradaSaida.solicitarPesos("2ª");
        double resultado = 0;

        int opcao = EntradaSaida.pedirOperacao();
        switch (opcao) {
            case 0:
                resultado=Calculo.mediaPonderada(nota1, nota2, peso1, peso2);
            break;
            case 1:
                resultado=Calculo.mediaAritmetica(nota1, nota2);
            break;
            default:
                EntradaSaida.mostrarMensagem("Operação inválida!");
            break;
        }
        Resultado.mostrarResultado(nota1, nota2, resultado, opcao);

    }
}