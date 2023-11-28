public class Principal {
    public static void main(String[] args) {
        
        int opcao=EntradaSaida.solicitarOpcaoMenu();
        do{
            switch (opcao) {
                case 0:
                    Alunos a = new Alunos();
                    a.nome=EntradaSaida.solicitarCaracteristicas("o nome");
                    a.idade=EntradaSaida.solicitarCaracteristicas("a idade");
                    a.serie=EntradaSaida.solicitarCaracteristicas("a serie");
                    Notas n= new Notas();
                    n.descricaoNota=EntradaSaida.solicitarDadosNota("a descrição");
                    n.nota=EntradaSaida.solicitarDadosNota("a descrição");
                    //cadastrar alunos e notas
                    break;
                case 1:
                    //dados de todos alunos
                    break;
                case 2:
                    //dados de aluno especifico
                    break;
                case 3:
                    //alterar nome de um aluno
                    break;
                case 4:
                    //Adicione mais uma nota a um aluno
                    break;
                case 5:
                    //calcular media
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while(opcao!=6);
    }
}
