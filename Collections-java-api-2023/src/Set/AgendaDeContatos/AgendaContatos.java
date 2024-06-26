package Set.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
//atributo
private Set<Contato> contatosSet;

public AgendaContatos() {
    this.contatosSet = new HashSet<>();
}

public void adicionarContato(String nome, int numero){
contatosSet.add(new Contato(nome, numero));
}

public void exibirContatos(){
System.out.println(contatosSet);
}

public Set<Contato> pesquisarPorNome(String nome){
Set<Contato> contatosPorNome = new HashSet<>();
for (Contato c : contatosSet) {
    if (c.getNome().startsWith(nome)) {
        contatosPorNome.add(c);
    }
}
return contatosPorNome;
}

public Contato atualizarNumeroContato(String nome, int novoNumero){
Contato contatoAtualizado = null;
for (Contato c : contatosSet) {
    if (c.getNome().equalsIgnoreCase(nome)) {
        c.setNumero(novoNumero);
        contatoAtualizado = c;
        break;
    }
} 
return contatoAtualizado;
}
// Teste do funcionamento das classes

public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContatos();

    agendaContatos.adicionarContato("Camila", 123456);
    agendaContatos.adicionarContato("Camila", 65484561);
    agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
    agendaContatos.adicionarContato("Camila DIO", 654987);
    agendaContatos.adicionarContato("Maria Silva", 1111111);

agendaContatos.exibirContatos();

System.out.println(agendaContatos.pesquisarPorNome("Camila"));

System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 555555));

agendaContatos.exibirContatos();
}
}
