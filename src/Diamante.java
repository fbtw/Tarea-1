import java.lang.*;

/**
 * Created by fborja on 14/6/17.
 */
public class Diamante {

    private static String lineaAsterisco(int n){
        String s="*";
         while(n>0) {
            s+="**";
            n--;
        }
        return s;
    }
    private static String lineaEspacio(int n){
        String s="";
        while(n>0) {
            s+=" ";
            n--;
        }
        return s;
    }
    private static String lineaRotulada(int n){
        StringBuilder sb = new StringBuilder(lineaAsterisco(n));
        if (n<4) sb=(sb.replace(n-1,n+2,"FB!"));
        else sb=(sb.replace(n-3,n+4,"FELIPE!"));
        return sb.toString();
    }
    public static String isóseles(int x){
        int ast,esp=x;
        String sa="",se="";
        while(esp>0) {
            ast=x-esp;
            sa=lineaAsterisco(ast);
            se=lineaEspacio(esp);
            System.out.println(se+sa);
            esp--;
        }
        return se+sa;
    }
    public static String isóselesTruncado(int x){
        int esp,ast=x-1;
        String sa="",se="";
        while(ast>=0) {
            esp=x-ast;
            sa=lineaAsterisco(ast);
            se=lineaEspacio(esp);
            System.out.println(se+sa);
            ast--;
        }
        return se+sa;
    }
    public static String rombo(int x){
        String s;
        isóseles(x);
        s=lineaAsterisco(x);
        System.out.println(s);
        s=isóselesTruncado(x);
        return s;
    }
    public static String romboRotulado(int x){
        String s;
        isóseles(x);
        s=lineaRotulada(x);
        System.out.println(s);
        s=isóselesTruncado(x);
        /*
        StringBuilder s= new StringBuilder();
        System.out.println("7.- "+n+":");
        while(n>0) {        //triángulo
            m=n-1;
            while (m>0){
                System.out.print(" ");
                m--;
            }
            if (n==x)s.append("*");
            else s.append("**");
            if (n!=1) System.out.println(s);
            n--;
        }
        */

        /*
        while(n<(x-1)) {        //triángulo inverso
            m=n+1;
            while (m>0){
                System.out.print(" ");
                m--;
            }
            s.setLength(s.length() - 2);
            System.out.println(s);
            n++;
        }
        */
        return s;
    }
}
