package resources;

import br.udesc.dao.DisciplinaDao;
import br.udesc.dao.ProfessoresDao;
import br.udesc.modelo.Disciplina;
import br.udesc.modelo.Professores;

public class Inicializa {
	
	private DisciplinaDao dis = new DisciplinaDao();
	private ProfessoresDao pro = new ProfessoresDao();
	
	public Inicializa() {
		disciplina();
		professores();
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
	
	

}
