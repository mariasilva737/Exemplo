package exemplo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDaoImplementation implements dao<Pessoa> {

	@Override
	public void adicionar(Pessoa p) {
		// TODO Auto-generated method stub
		Pessoa pessoa=p;
		String sql="INSERT INTO pessoas(Nome, Email, Telefone, Cargo, Cpf, Matricula) values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps=conexaobd.getConexao().prepareStatement(sql);
			ps.setString(1, pessoa.getNome());
			ps.setString(2, pessoa.getEmail());
			ps.setString(3, pessoa.getTelefone());
			ps.setString(4, pessoa.getCargo().toString());
			//ps.setString(4, pessoa.getData_admissao().toString());
			ps.setString(5, pessoa.getCpf());
			ps.setString(6, pessoa.getMatricula());
			
			ps.execute();
			
			System.out.println("Adicionado com sucesso");
		
		}catch(SQLException e) {
			e.printStackTrace();
		}		

	}
	
	

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa();
		
		String sql = "DELETE FROM pessoas WHERE id=?";
		try {
			
			PreparedStatement ps=conexaobd.getConexao().prepareStatement(sql);
			ps.setInt(1, p.getId());
			ps.execute();
		} catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public void update(int id, String telefone) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa();
		
		String sql = "UPDATE pessoas SET telefone =? WHERE id=?";
try {
			
			PreparedStatement ps=conexaobd.getConexao().prepareStatement(sql);
			ps.setString(1, p.getTelefone());
			ps.setInt(2, p.getId());
			ps.execute();
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		

	}

	@Override
	public void update1(int id, String email) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa();
		
		String sql = "UPDATE pessoas SET email =? WHERE id=?";
		try {
			
			PreparedStatement ps=conexaobd.getConexao().prepareStatement(sql);
			ps.setString(1, p.getEmail());
			ps.setInt(2, p.getId());
			ps.execute();
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		

	}

	@Override
	public void update2(int id, Cargo cargo) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa();
		
		String sql = "UPDATE pessoas SET cargo =? WHERE id=?";
		try {
			
			PreparedStatement ps=conexaobd.getConexao().prepareStatement(sql);
			ps.setString(1, p.getCargo().toString());
			ps.setInt(2, p.getId());
			ps.execute();
		} catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public List<Pessoa> listarTudo() {
		// TODO Auto-generated method stub
		
		List<Pessoa> list = new ArrayList<Pessoa>();
		String sql = "SELEC* FROM Pessoas";
		PreparedStatement ps;
		
		try {
			Pessoa p = new Pessoa();
			ps = conexaobd.getConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				p.setNome(rs.getString("Nome"));
				list.add(p);
				
			}
			
			rs.close();
			
		}catch(SQLException e) {e.printStackTrace();}
	
		
		return list;
	}

	@Override
	public List<Object> listar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
