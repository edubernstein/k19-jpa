package br.com.k19.jpa.grana;

public class TelaGeraDados implements Tela {
	private Tela	anterior;
	
	public TelaGeraDados(Tela anterior) {
		thisanterior = anterior;
	}
	
	@Override
	public Tela mostra () {
	Systemoutprintln ( " >>> " + thisgetNome () + " <<<" ) ;
	Systemoutprintln () ;
	Systemoutprintln ( " Gerando dados ... " ) ;
	EntityManager manager = GranagetEntityManager () ;
	ReceitaRepositorio receitaRepositorio =
	new ReceitaRepositorio ( manager ) ;
	DespesaRepositorio despesaRepositorio =
	new DespesaRepositorio ( manager ) ;
	managergetTransaction ()begin () ;
	/* Receitas */
	for ( int i = 0; i < 36; i ++) {
	Receita receita = new Receita () ;
	receitasetNome ( " Salário K19 " ) ;
	receitasetTipo ( " Salário " ) ;
	receitasetValor (8000.0) ;
	Calendar data = new GregorianCalendar (2014 , 0 , 10) ;
	dataadd ( CalendarMONTH , i ) ;
	receitasetData ( data ) ;
	receitaRepositorioadiciona ( receita ) ;
	}
	for ( int i = 0; i < 36; i ++) {
	Receita receita = new Receita () ;
	receitasetNome ( " VA " ) ;
	receitasetTipo ( " Vale Alimentação " ) ;
	receitasetValor (400.00) ;
	Calendar data = new GregorianCalendar (2014 , 0 , 15) ;
	dataadd ( CalendarMONTH , i ) ;
	receitasetData ( data ) ;
	receitaRepositorioadiciona ( receita ) ;
	}
	for ( int i = 0; i < 36; i ++) {
	Receita receita = new Receita () ;
	receitasetNome ( " VR " ) ;
	receitasetTipo ( " Vale Refeição " ) ;
	receitasetValor (500.0) ;
	Calendar data = new GregorianCalendar (2014 , 0 , 20) ;
	dataadd ( CalendarMONTH , i ) ;
	receitasetData ( data ) ;
	receitaRepositorioadiciona ( receita ) ;
	}
	for ( int i = 0; i < 36; i ++) {
	Receita receita = new Receita () ;
	receitasetNome ( " Aluguel Casa BH " ) ;
	receitasetTipo ( " Aluguel " ) ;
	receitasetValor (1000.0) ;
	Calendar data = new GregorianCalendar (2014 , 0 , 1) ;
	dataadd ( CalendarMONTH , i ) ;
	receitasetData ( data ) ;
	receitaRepositorioadiciona ( receita ) ;
	}
	/* Despesas */
	for ( int i = 0; i < 36; i ++) {
	Despesa despesa = new Despesa () ;
	despesasetNome ( " Aluguel Apto SP " ) ;
	despesasetTipo ( " Aluguel " ) ;
	despesasetValor (1800.0) ;
	Calendar data = new GregorianCalendar (2014 , 0 , 1) ;
	dataadd ( CalendarMONTH , i ) ;
	despesasetData ( data ) ;
	despesaRepositorioadiciona ( despesa ) ;
	}
	for ( int i = 0; i < 36; i ++) {
	Despesa despesa = new Despesa () ;
	despesasetNome ( " Compras Supermercado " ) ;
	despesasetTipo ( " Alimentação " ) ;
	despesasetValor (1000.0) ;
	Calendar data = new GregorianCalendar (2014 , 0 , 10) ;
	dataadd ( CalendarMONTH , i ) ;
	despesasetData ( data ) ;
	despesaRepositorioadiciona ( despesa ) ;
	}
	for ( int i = 0; i < 36; i ++) {
	Despesa despesa = new Despesa () ;
	despesasetNome ( " Combustível " ) ;
	despesasetTipo ( " Transporte " ) ;
	despesasetValor (400.00) ;
	Calendar data = new GregorianCalendar (2014 , 0 , 15) ;
	dataadd ( CalendarMONTH , i ) ;
	despesasetData ( data ) ;
	despesaRepositorioadiciona ( despesa ) ;
	}
	for ( int i = 0; i < 36; i ++) {
	Despesa despesa = new Despesa () ;
	despesasetNome ( " Cinema " ) ;
	despesasetTipo ( " Lazer " ) ;
	despesasetValor (200.0) ;
	Calendar data = new GregorianCalendar (2014 , 0 , 20) ;
	dataadd ( CalendarMONTH , i ) ;
	despesasetData ( data ) ;
	despesaRepositorioadiciona ( despesa ) ;
	}
	managergetTransaction ()commit () ;
	managerclose () ;
	Systemoutprintln ( " Dados gerados " ) ;
	Systemoutprintln () ;
	return thisanterior ;
	}
	
	@Override
	public String getNome() {
		return " Gera Dados ";
	}
}
