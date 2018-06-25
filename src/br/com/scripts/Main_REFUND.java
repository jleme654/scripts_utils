package br.com.scripts;

import br.com.scripts.homolog.Main_HR_B2C_ATENDIMENTO;
import br.com.scripts.homolog.Main_HR_OMNI_DEVOLUCAO;

public class Main_REFUND  {

	/**
	CODIGO_TIPO_ATENDIMENTO DESC_TIPO_ATENDIMENTO
	1                   	Troca Web
	2                       Devolução Web
	6                       Troca Omni
	7                       Devolução Omni
	*/
	
	public static void main(String[] args) {

		int idDevolucaoOMS = 9001;
		int idB2C_Atendimento = 90002;
		String codigoTipoAtendimento = "2";
		
		Main_HR_B2C_ATENDIMENTO main_HR_B2C_ATENDIMENTO = new Main_HR_B2C_ATENDIMENTO();
		main_HR_B2C_ATENDIMENTO.get_Main_HR_B2C_ATENDIMENTO(idDevolucaoOMS, idB2C_Atendimento, codigoTipoAtendimento);
		
		System.out.println();
		Main_HR_OMNI_DEVOLUCAO main_HR_OMNI_DEVOLUCAO = new Main_HR_OMNI_DEVOLUCAO();
		main_HR_OMNI_DEVOLUCAO.get_Main_HR_OMNI_DEVOLUCAO(idDevolucaoOMS,codigoTipoAtendimento);
	}


}
