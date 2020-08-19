package exemplo;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p = new Pessoa("Maria", "maria@gmail.com", "98765432", Cargo.diretor, "123.456.789-10", "123456");
		
		PessoaDaoImplementation dao = new PessoaDaoImplementation();
		
		dao.adicionar(p);

	}

}
