package classes;

public class Pesquisa {

    //Atributos
    private Espectador respostaPesquisa[];
    private int cont = 0; //controla quantidade de respostas

    public Pesquisa() {
        respostaPesquisa = new Espectador[50];
        cont = 0;
    }

    public int quantidadeEspectadoresConsultados() {
        return cont;
    }

    public Espectador[] getRespostaPesquisa() {
        return respostaPesquisa;
    }

    public boolean adiciona(Espectador novoEspectador) {
        if (cont < respostaPesquisa.length) {
            respostaPesquisa[cont] = novoEspectador;
            cont++;
            return true;
        }
        return false;
    }

    public int[] ocorrencias() {
        int resultado[] = new int[5];
        for (int i = 0; i < cont; i++) {
            switch (respostaPesquisa[i].getOpiniao()) {
                case 'A':
                    resultado[0]++;
                    break;
                case 'B':
                    resultado[1]++;
                    break;
                case 'C':
                    resultado[2]++;
                    break;
                case 'D':
                    resultado[3]++;
                    break;
                case 'E':
                    resultado[4]++;
                    
            }
        }
        return resultado;
      
    }
      public String dados(){
        int totais[]=ocorrencias();
        StringBuilder saida=new StringBuilder("\n");
        String valores[]={"A(Ótimo)","\nB(Bom)","\nC(Regular)","\nD(Ruim)","\nE(Péssimo)"};
        for(int i=0;i<totais.length;i++){
        saida.append(valores[i]).append("=").append(totais[i]);
        }
        
     
         return saida.toString();
        }

}
