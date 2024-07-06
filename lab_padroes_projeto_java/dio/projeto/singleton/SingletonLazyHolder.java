package lab_padroes_projeto_java.dio.projeto.singleton;

public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstancia() {  
        return InstanceHolder.instancia;
    }
}
