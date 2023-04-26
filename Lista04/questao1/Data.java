// Implemente a classe Data com as seguintes especificações:
// Nome da classe: Data
// Atributos: dia, mês, ano;
// Métodos:
// inicializarData(),
// verificarData(),
// set/get,
// imprimirData(), no formato dd/mm/yyyy
// imprimirDataExtenso(), no formato 16 de outubro de 2022.

package questao1;

class Data{
	private int dia, mes, ano;
	private boolean valido=false;
	private final String[] nomeMeses = {"Janeiro","Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}; 

	private boolean verificarData(int dd, int mm, int aa){
		boolean valido = true;
		if(dd<=0 || dd>31) valido=false;
		if(mm<=0 || mm>12) valido=false;
		this.valido=valido;
		return valido;
	}
	
	public boolean inicializarData(int d, int m, int a){
		boolean retorno = verificarData(d, m, a);
		if(retorno){
			dia = d;
			mes = m;
			ano = a;
		} 
		return retorno;
	}

	public void imprimirData(){
		String texto;
		if (valido){
			texto = ano<0? dia+"/"+mes+"/"+(ano*(-1))+" A.C.": dia+"/"+mes+"/"+ano;
		} else {
			texto = "Essa data não é válida";
		}
		System.out.println(texto);
	}

	public void imprimirDataExtenso(){
		if(!valido){
			System.out.println("Essa data não é válida");
			return;
		}
		for(int x=0; x<12;x++){
			if((x+1)==mes){
				String texto;
				texto = ano<0? dia+" de "+nomeMeses[x]+" de "+ (ano*(-1))+ " A.C.": dia+" de "+nomeMeses[x]+" de "+ano;
				System.out.println(texto);
				break;
			}
		}
		return;
	}
}