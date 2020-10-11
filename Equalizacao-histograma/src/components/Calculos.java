package components;

/**
 *
 * @author Walisson
 */
public class Calculos {

    public int numMaior(int valoresDasLinhas[]) {
        int numComMaiorValor = 0;
        
        for (int i = 0; i < valoresDasLinhas.length; i++) {
            if (numComMaiorValor < valoresDasLinhas[i]) {
                numComMaiorValor = valoresDasLinhas[i];
            }
        }
        return numComMaiorValor;
    }

    public int qtdeDeDadosRepetidos(int linhaDeReferencia, int valoresLinha[]) {
        int qtdeRepetidaDeDados = 0;

        for (int j = 0; j < valoresLinha.length; j++) {
            if (linhaDeReferencia == valoresLinha[j]) {
                qtdeRepetidaDeDados++;
            }
        }
        return qtdeRepetidaDeDados;
    }

    public int calculaTotalAcumulativa(double qtdeDeDados[], int valoresLinha[]) {
        int acumulativaDeDados = 0;
        
        for (int i = 0; i < qtdeDeDados.length; i++) {
            acumulativaDeDados += qtdeDeDadosRepetidos(i, valoresLinha);
            qtdeDeDados[i] = acumulativaDeDados;
        }
        return acumulativaDeDados;
    }
}
