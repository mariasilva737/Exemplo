package exemplo;

import java.util.List;

//import java.awt.List;

public interface dao<Pessoa> {
	public void adicionar(Pessoa p);
	public void deletar(int id);
	public void update (int id, String telefone);
	public void update1 (int id, String email);
	public void update2 (int id, Cargo cargo);
	public List<exemplo.Pessoa> listarTudo();
	public List<Object> listar(int id); 
	

}
