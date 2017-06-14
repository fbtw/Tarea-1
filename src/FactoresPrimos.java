import java.util.ArrayList;
import java.util.List;

public class FactoresPrimos {

    public static List<Integer> generar(int n){
        int i,N=n;                  //N: número inicial, n: número disminuyente
        System.out.print(n+" = ");
        ArrayList<Integer> lista=new ArrayList<>();
        for (i=2;i<N;i++){
                while ((n%i==0)&&(esprimo(i))){
                    lista.add(i);
                    n /= i;
                }
        }
        imprimir(lista);
        return lista;
    }
    private static void imprimir(List<Integer> lista){
        for (int i : lista){
            System.out.print(i+" ");
        }

    }
    private static boolean esprimo(long x) {
        for (int i = 2; i < (x / 2); i++)
            if (x % i == 0)
                return false;
        return true;
    }
}
