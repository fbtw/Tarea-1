
public class Triangulo {

    public static String asterisco(){
        String s="*";
        System.out.println(s);
        return s;
    }
    public static String linea(int n){
        String s="";
        while(n>0) {
            s+="*";
            n--;
        }
        System.out.println(s);
        return s;
    }
    public static String triangulo_truncado(int n){
        String s= "";
        while(n>0) {
            s=linea(n);
            n--;
        }
        return s;
    }
    public static String triangulo(int n){ //triángulo rectángulo
        String s ="";
        int c=0;
        while(c<=n) {
            s=linea(c);
            c++;
        }
        return s;
    }
}
