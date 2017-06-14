
public class TikiTaka {
    public static String verificar(int n){ //Ahora sin concatenar!
        String str="";
        for (int i = 1 ;i<=n;i++){
            if (i%15==0)
                str="Tiki-Taka";
            else if (i%3==0)
                str="Tiki";
            else if (i%5==0)
                str="Taka";
            else
                str=String.valueOf(i);
            System.out.println(str);
        }
        return str;
    }
}
