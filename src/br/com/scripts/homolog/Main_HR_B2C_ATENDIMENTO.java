package br.com.scripts.homolog;

import java.util.ArrayList;
import java.util.List;

import br.com.scripts.utils.Pedidos_OMNI_Utils;

public class Main_HR_B2C_ATENDIMENTO {

	/** script master
	 * 
	INSERT INTO LINX_DB_TESTE_OMNI.dbo.HR_B2C_ATENDIMENTO (ID_B2C_ATENDIMENTO, CODIGO_TIPO_ATENDIMENTO, CODIGO_FILIAL, STATUS_SAP, CODIGO_CLIENTE, PEDIDO, PEDIDO_DEVOLUCAO, VALOR_ATENDIMENTO, CODIGO_VOUCHER, DATA_ATIVACAO_VOUCHER, PROTOCOLO_SAC, CODIGO_REFERENCIA_DEVOLUCAO, SITUACAO_ATUAL, MOTIVO_CANCELAMENTO, CODIGO_POSTAGEM, SERIE_NF_ENTRADA, NUMERO_NF_ENTRADA, DIGITACAO, PEDIDO_ENTRADA, DESC_MOTIVO_TROCA_DEVOLUCAO, ID_HYBRIS_PEDIDO_DEVOLUCAO, HR_ISO_CAUSA, SAP_FORCA_REFERENCIA_DEVOLUCAO, FATURAR_CONTRA_CENTRO_CUSTO, HR_DATA_HORA_CRIACAO, ID_DEVOLUCAO_OMS, CODIGO_MODALIDADE_RESSARCIMENTO, VALOR_FRETE_RESSARCIDO, PEDIDO_OMS_ORIGINAL, CODIGO_ENTREGA_OMS_ORIGINAL, STATUS_SAP_ADIANTAMENTO, SAP_ORDEM_DEVOLUCAO, SAP_FATURA_DEVOLUCAO, SAP_REMESSA_DEVOLUCAO, EMISSAO_NF_ENTRADA, ULTIMA_MODIFICACAO)
	VALUES(90001, '6', '84', 0, '0009', 0, 0, 0, '', '', '', '', '100', 4, '', '', '', '', 0, '', '', 0, 0, 0, '', '9001', '', 0, '', '', 0, '', '', '', '', '');
*/
	
	private List<String> verifyListaPedidos(String codigoTipoAtendimento) {
       List<String> listaPedidos;//= new  ArrayList<String>();
		
		if (codigoTipoAtendimento.equalsIgnoreCase(Pedidos_OMNI_Utils.EXCHANGE_WEB_CODE)) {
			listaPedidos = Pedidos_OMNI_Utils.listaPedidosExchange_Web ;    
		} else if(codigoTipoAtendimento.equalsIgnoreCase(Pedidos_OMNI_Utils.REFUND_WEB_CODE)) {
			listaPedidos = Pedidos_OMNI_Utils.listaPedidosRefund_Web;
	    } else{
			listaPedidos = new  ArrayList<String>();
		}
		return listaPedidos;
	}

	public void get_Main_HR_B2C_ATENDIMENTO(int idDevolucaoOMS,  int idB2C_Atendimento, String codigoTipoAtendimento, String environment) {
		
		String s = "INSERT INTO LINX_DB_TESTE_" + environment + ".dbo.HR_B2C_ATENDIMENTO (ID_B2C_ATENDIMENTO, CODIGO_TIPO_ATENDIMENTO, CODIGO_FILIAL, STATUS_SAP, CODIGO_CLIENTE, PEDIDO, PEDIDO_DEVOLUCAO, VALOR_ATENDIMENTO, CODIGO_VOUCHER, DATA_ATIVACAO_VOUCHER, PROTOCOLO_SAC, CODIGO_REFERENCIA_DEVOLUCAO, SITUACAO_ATUAL, MOTIVO_CANCELAMENTO, CODIGO_POSTAGEM, SERIE_NF_ENTRADA, NUMERO_NF_ENTRADA, DIGITACAO, PEDIDO_ENTRADA, DESC_MOTIVO_TROCA_DEVOLUCAO, ID_HYBRIS_PEDIDO_DEVOLUCAO, HR_ISO_CAUSA, SAP_FORCA_REFERENCIA_DEVOLUCAO, FATURAR_CONTRA_CENTRO_CUSTO, HR_DATA_HORA_CRIACAO, ID_DEVOLUCAO_OMS, CODIGO_MODALIDADE_RESSARCIMENTO, VALOR_FRETE_RESSARCIDO, PEDIDO_OMS_ORIGINAL, CODIGO_ENTREGA_OMS_ORIGINAL, STATUS_SAP_ADIANTAMENTO, SAP_ORDEM_DEVOLUCAO, SAP_FATURA_DEVOLUCAO, SAP_REMESSA_DEVOLUCAO, EMISSAO_NF_ENTRADA, ULTIMA_MODIFICACAO)", 
			   s2 = "VALUES(",//'001', '",
			   s3 = ", '",//6', 
		       s4 = "', '84', 0, '0009', 0, 0, 0, '', '', '', '', '100', 4, '', '', '', '', 0, '', '', 0, 0, 0, '",// '9001', '', 0, '', '', 0, '', '', '', '', '')"";
		       s5 = "' ,'', 0, '', '', 0, '', '', '', '', '')";
		
		List<String> listaPedidos = verifyListaPedidos(codigoTipoAtendimento);
				
		for (@SuppressWarnings("unused") String pedido : listaPedidos) {
			StringBuilder sb = new StringBuilder();
			sb.append(s);
			sb.append(s2);
			sb.append(String.valueOf(idB2C_Atendimento++));
			sb.append(s3);
			sb.append(codigoTipoAtendimento);
			sb.append(s4);
			sb.append(Pedidos_OMNI_Utils.getDataAtual()).append("', '").append(String.valueOf(idDevolucaoOMS++));
		    sb.append(s5);
			
			System.out.println(sb.toString());
		}
			
	}

}
