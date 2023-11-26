package exercícios;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Hugostoso", 29);
		Funcionario f2 = new Funcionario("Biscoitinho", 26);
		Funcionario f3 = new Funcionario("Well", 27);
		Funcionario f4 = new Funcionario("Luah", 30);

		Set<Funcionario> f = new TreeSet<>(new OrdenaPorIdade());
		f.add(f1);
		f.add(f2);
		f.add(f3);
		f.add(f4);

		Iterator<Funcionario> iterador = f.iterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
		}

	}

}
