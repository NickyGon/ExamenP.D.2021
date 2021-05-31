package ejercicios.interpreterIV;

public class TerminalI extends AbstractExpresion{
    public TerminalI(int amountChar){
        this.amountChar=amountChar;
    }


    @Override
    public void interpreter(Context context) {
        if (context.input.length()>1 && context.input.charAt(1)=='V'){
            context.output=context.output+"4";
        } else {
            int sum=0;
            for (int i=0;i<context.input.length();i++){
                sum++;
            }
            context.output=context.output+sum;
        }
        context.input=context.input.substring(0,amountChar);
    }
}
