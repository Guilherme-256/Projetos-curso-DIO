
public class ParametrosInvalidosException extends Exception {
    protected int parametroUm;
    protected int parametroDois;
    public ParametrosInvalidosException(int parametroUm,int parametroDois){
    super();
    this.parametroUm = parametroUm;
    this.parametroDois = parametroDois;
    
    }
    @Override
    public String toString () {
        return "Algo deu errado\nO segundo parâmetro deve ser maior que o primeiro.";
    }
    
    }