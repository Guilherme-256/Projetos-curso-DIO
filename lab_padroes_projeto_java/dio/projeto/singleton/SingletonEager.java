package lab_padroes_projeto_java.dio.projeto.singleton;

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
