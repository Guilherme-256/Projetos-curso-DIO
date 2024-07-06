package lab_padroes_projeto_java.dio.projeto;

import lab_padroes_projeto_java.dio.projeto.facade.Facade;
import lab_padroes_projeto_java.dio.projeto.singleton.SingletonEager;
import lab_padroes_projeto_java.dio.projeto.singleton.SingletonLazy;
import lab_padroes_projeto_java.dio.projeto.singleton.SingletonLazyHolder;
import lab_padroes_projeto_java.dio.projeto.strategy.Comportamento;
import lab_padroes_projeto_java.dio.projeto.strategy.ComportamentoAgresivo;
import lab_padroes_projeto_java.dio.projeto.strategy.ComportamentoDefensivo;
import lab_padroes_projeto_java.dio.projeto.strategy.ComportamentoNormal;
import lab_padroes_projeto_java.dio.projeto.strategy.Robo;

public class Test {
    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgresivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();
        
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Guilherme", "14558899");
    }
}
