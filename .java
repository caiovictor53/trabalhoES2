# trabalhoES2
Trabalho da disciplina Engenharia de Software 2
	git commit Fiz nada
	

public class Forma {	
	private String cor;				// variaveis privadas
	private boolean preenchido;
	protected	static int numFormas=0; // variavel do tipo protected por causa do contador
	
	
	public Forma(){}	////	construtor vazio
	public Forma(String cor, boolean preenchido){//	depois criei um  outro construtor com parametros
		this.cor	=	cor;
		this.preenchido	=	preenchido;
		numFormas++;
		
	}
	public int QtdeFormas(){ // chamada de metodo estatico para contar as formas 
		return this.numFormas++;
	}
	public String getCor() {  // sobrescrita de metodos
		return cor;
	}
	public void setCor(String cor) { // sobrecarga de metodos
		this.cor = cor;
	}
	public boolean isPreenchido() {
		return preenchido;
	}
	public void setPreenchido(boolean preenchido) {
		this.preenchido = preenchido;
	}
	@Override
	public String toString() {	// vai mostrar na tela
		return "Forma [cor=" + cor + "]";
	}
	
}
