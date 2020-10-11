package components;

/**
 *
 * @author Walisson
 */
public class EqualizadorDeVetores {
    
    public Calculos equalizador = new Calculos();
    
    public int[] vetorDeLinhaDePixel = {0, 0, 4, 6, 8, 8, 4, 7, 8, 9, 9, 4, 3, 2, 3, 8, 2, 2, 1, 0};
    public int numMaior = equalizador.numMaior(vetorDeLinhaDePixel);
    public double[] qtde = new double[numMaior + 1];
    public double[] calculaPorcetagem = new double[qtde.length];
    public int calculaAcumulativa = equalizador.calculaTotalAcumulativa(qtde, vetorDeLinhaDePixel);
    public double[] resultadoFinal = new double[qtde.length];
    
    public EqualizadorDeVetores() {
        
        System.out.println("Vetor sem equalização - Entrada de uma linha de 20 pixels: ");
        System.out.print("[");
        for(int i = 0; i < vetorDeLinhaDePixel.length; i++) {
            System.out.print(vetorDeLinhaDePixel[i] + ", ");
        }
        System.out.println("]");
        
        for (int i = 0; i < qtde.length; i++) {
            calculaPorcetagem[i] = qtde[i] / calculaAcumulativa;
        }

        for (int i = 0; i < resultadoFinal.length; i++) {
            resultadoFinal[i] = Math.round(calculaPorcetagem[i] * numMaior);
        }

        for (int j = 0; j < vetorDeLinhaDePixel.length; j++) {
            vetorDeLinhaDePixel[j] = (int) resultadoFinal[vetorDeLinhaDePixel[j]];
        }  
    }
    
    public void vetorEqualizado() {
        System.out.println("Vetor equalizado:");
        System.out.print("[");
        for (int j = 0; j < vetorDeLinhaDePixel.length; j++) {
            System.out.print(vetorDeLinhaDePixel[j] + ", ");
        }
        System.out.println("]");
    }
}
