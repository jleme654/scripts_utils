package br.com.scripts.homolog;

import br.com.scripts.utils.Pedidos_OMNI_Utils;

@Deprecated
public class Main_HR_B2C_ATENDIMENTO_TIPO_SITUACAO {
	
	
	public static void main(String[] args) {

		int countAtendimento = 1, idDevolucaoOMS = 1;
		
		String s = "INSERT INTO LINX_DB_TESTE_OMNI.dbo.HR_B2C_ATENDIMENTO_TIPO_SITUACAO, CODIGO_TIPO_ATENDIMENTO, SITUACAO, DESC_SITUACAO, EXIGE_INTERVENCAO_WEB, INDICA_LIBERADO, EXIGE_INTERVENCAO_SAC, EXIGE_INTERVENCAO_EXPEDICAO, INDICA_CANCELAMENTO, DESC_SITUACAO_ISO, CONDICAO_PROCEGUIMENTO, MENSAGEM_PROCEGUIMENTO_AUTOMATICO, ENVIAR_CRM_PROCEGUIMENTO_AUTOMATICO, INDICA_CRM_CONCLUIDO_PROCEGUIMENTO_AUTOMATICO, CONDICAO_UTILIZACAO_ETAPA, PERMITE_ALTERAR_MODALIDADE, GERAR_LOG_PROCEGUIMENTO_AUTOMATICO)",
			   s3 = " VALUES ('",//'', '', '', 0, 0, 0, 0, 0, '', '', '', 0, 0, '', 0, 0)";
		       s4 = "', '6', '84', '" + Pedidos_OMNI_Utils.CODIGO_CLIENTE+ "', 0, 0, 0, 0, 0, '', '', '', 0, 0, '', 0, 0)";

		for (String pedido : Pedidos_OMNI_Utils.listaPedidos) {
			StringBuilder sb = new StringBuilder();
			sb.append(s);
			sb.append(s3);
			sb.append(String.valueOf(countAtendimento++));
			sb.append(s4);
			
			System.out.println(sb.toString());
		}
	}


}
