package Lista05.contato;

import java.util.Calendar;

public class Data{
	private int dia, mes, ano;
	private boolean valido=false;
	private final String[] nomeMeses = {"Janeiro","Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}; 
	
	Data(int d, int m, int a){
		if(verificarData(d, m, a)){
			dia = d;
			mes = m;
			ano = a;
		} else {
			dia = 0;
			mes = 0;
			ano = 0;
		}
	}

	Data(){
		this(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
	}

	Data(int dia){
		this(dia, Calendar.getInstance().get(Calendar.MONTH));
	}

	Data(int dia, int mes){
		this(dia, mes, Calendar.getInstance().get(Calendar.YEAR));
	}

	private boolean verificarData(int dd, int mm, int aa){
		boolean valido = true;
		if(dd<=0 || dd>31) valido=false;
		if(mm<=0 || mm>12) valido=false;
		this.valido=valido;
		return valido;
	}

	public int getDia(){
		return dia;
	}

	public int getMes(){
		return mes;
	}

	public int getAno(){
		return ano;
	}

	public boolean getValido(){
		return valido;
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

	// boolean isPrevious(Data outraData): retorna verdadeiro se a data, que passamos
	// por parâmetro, é anterior a data do objeto;
	public boolean isPrevious(Data outra){
		if(!this.valido && !outra.valido) return false;

		if (outra.ano < this.ano) return true;
		else if(outra.ano == this.ano){
			if(outra.mes < this.mes) return true;
			else if(outra.mes == this.mes){
				if (outra.dia<this.dia) return true;
			}
		}
		return false;
	}
}