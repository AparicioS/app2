package resources;

import javax.persistence.EntityManagerFactory;

import br.udesc.dao.DisciplinaDao;
import br.udesc.dao.JPAUtil;
import br.udesc.dao.ProfessoresDao;
import br.udesc.dao.ServicoDao;
import br.udesc.dao.ServicosUsuarioDao;
import br.udesc.dao.UsuarioDao;
import br.udesc.modelo.Disciplina;
import br.udesc.modelo.Professores;
import br.udesc.modelo.Servico;
import br.udesc.modelo.ServicoUsuarioAutorizado;
import br.udesc.modelo.Usuario;

public class Inicializa {
	

	private DisciplinaDao dis = new DisciplinaDao();
	private ProfessoresDao pro = new ProfessoresDao();
	private UsuarioDao usu = new UsuarioDao();
	private ServicosUsuarioDao su = new ServicosUsuarioDao();
	private ServicoDao sd = new ServicoDao();
	
	public Inicializa() {
		if(JPAUtil.getEntityManager() == null) {
		disciplina();
		professores();
		usuario();
		}
	}
	
	public void disciplina() {
		
		Disciplina d1 = new Disciplina();
		Disciplina d2 = new Disciplina();
		
		d1.setDs_disciplina("Engenharia de software orientada a serviços");
		d2.setDs_disciplina("Inteligencia computacional");
		
		dis.salvar(d1);
		dis.salvar(d2);
	}
	
	public void professores() {
		
		Professores p1 = new Professores();
		Professores p2 = new Professores();
		
		p1.setNomeProfessor("Adilson");
		p1.setTitulo("Dr");
		p2.setNomeProfessor("Fernando");
		p2.setTitulo("Dr");
		
		pro.salvar(p1);
		pro.salvar(p2);
		
	}
	
	public void usuario (){
		
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		Usuario u3 = new Usuario();
		
		u1.setNome("Luciano");
		u1.setSenha("123");
		
		u2.setNome("Aparicio");
		u2.setSenha("123");
		
		u3.setNome("Adilson");
		u3.setSenha("123");
		
		usu.salvar(u1);
		usu.salvar(u2);
		usu.salvar(u3);
		
		Servico s1 = new Servico();
		Servico s2 = new Servico();
		Servico s3 = new Servico();
		
		s1.setNomeServico("criar_turma");
		s2.setNomeServico("registrar_cronograma");
		s3.setNomeServico("registrar_avaliacao");
		
		sd.salvar(s1);
		sd.salvar(s2);
		sd.salvar(s3);
		
		ServicoUsuarioAutorizado sua1 = new ServicoUsuarioAutorizado();
		ServicoUsuarioAutorizado sua2 = new ServicoUsuarioAutorizado();
		ServicoUsuarioAutorizado sua3 = new ServicoUsuarioAutorizado();
		
		sua1.setAutorizado(true);
		sua1.setServico(s1);
		sua1.setUsuario(u1);
		
		sua2.setAutorizado(true);
		sua2.setServico(s2);
		sua2.setUsuario(u2);
		
		sua3.setAutorizado(true);
		sua3.setServico(s3);
		sua3.setUsuario(u3);
		
		su.salvar(sua1);
		su.salvar(sua2);
		su.salvar(sua3);

		
		
	}
	
	

}
