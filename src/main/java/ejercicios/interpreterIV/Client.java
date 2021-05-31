package ejercicios.interpreterIV;

public class Client {
    public static void main (String []args){
        String interpretar="I II III IV";
        // 1 2 3 4 5 1

        RomanInterpreter parser = new RomanInterpreter(interpretar);

        String interpretado=parser.interpretar();
        System.out.println(" Interpretar: "+interpretar);
        System.out.println(" Interpretado: "+interpretado);




    }
}
