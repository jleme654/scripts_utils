package br.com.scripts;

import br.com.scripts.homolog.Main_HR_B2C_ATENDIMENTO;
import br.com.scripts.homolog.Main_HR_OMNI_DEVOLUCAO;

public class Main_General  {

	/**
	CODIGO_TIPO_ATENDIMENTO DESC_TIPO_ATENDIMENTO
	1  Troca Web
	2  Devolução Web
	6  Troca Omni
	7  Devolução Omni
	
	Obs.: A Troca Web é quando o ecom faz a troca de um fullfilment que foi despachado pelo próprio ecom (Nota Dev com
referencia a nota de saída). A Troca Omni é quando o ecom faz a troca de um fullfilment que foi despachado/entregue por outra
loja (Nota Dev sem referencia a nota de saída). A Devolução Web e Omni seguem a mesma lógica.
	
	*/
	
	public static void main(String[] args) {

		int idDevolucaoOMS = 9020;
		int idB2C_Atendimento = 90020;
		String codigoTipoAtendimento = "2"; // REFUND
		String environment = "OMNI"; // HLG: OM | STG: Y
		
		Main_HR_B2C_ATENDIMENTO main_HR_B2C_ATENDIMENTO = new Main_HR_B2C_ATENDIMENTO();
		main_HR_B2C_ATENDIMENTO.get_Main_HR_B2C_ATENDIMENTO(idDevolucaoOMS, idB2C_Atendimento, codigoTipoAtendimento, environment);
		
		System.out.println();
		Main_HR_OMNI_DEVOLUCAO main_HR_OMNI_DEVOLUCAO = new Main_HR_OMNI_DEVOLUCAO();
		main_HR_OMNI_DEVOLUCAO.get_Main_HR_OMNI_DEVOLUCAO(idDevolucaoOMS,codigoTipoAtendimento, environment);
	}


}
