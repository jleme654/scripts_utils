package br.com.scripts.homolog;

import java.util.ArrayList;
import java.util.List;

import br.com.scripts.utils.Pedidos_OMNI_Utils;

public class Main_HR_OMNI_DEVOLUCAO{
	
	/**
	 * script master
	 * @param args
	 */
/*	
	INSERT INTO LINX_DB_TESTE_OMNI.dbo.HR_OMNI_DEVOLUCAO
	(CODIGO_SITE, PEDIDO, CODIGO_ENTREGA, NOVO_PEDIDO, [DATA], TIPO_OPERACAO, CODIGO_CLIENTE, ID_ENDERECO_COBRANCA, QTDE_TOTAL, VALOR_TOTAL, DESCONTO, VALOR_FRETE, STATUS_OMS, CODIGO_FILIAL, PEDIDO_OMS, ID_DEVOLUCAO_OMS, ID_HYBRIS_PEDIDO_TROCA, ID_HYBRIS_PEDIDO_DEVOLUCAO, CODIGO_POSTAGEM_REVERSO, MODALIDADE_RESSARCIMENTO, MENSAGEM_TROCA_DEVOLUCAO, VALOR_RESSARCIMENTO, CODIGO_VALE_GERADO, REEMBOLSO_CODIGO_BANCO, REEMBOLSO_NOME_TITULAR, REEMBOLSO_CPF_CNPJ, REEMBOLSO_AGENCIA, REEMBOLSO_AGENCIA_DV, REEMBOLSO_CONTA, REEMBOLSO_CONTA_DV, REEMBOLSO_TIPO_CONTA, PROCESSADO, MENSAGEM_CRITICA_IMPORTACAO, DATA_HORA_INSERT)
	VALUES('001', '137762012', 'F1', '', '2018-06-21 00:00:00', 6, '0009', '', 1, 19, 0, 0, 'DELIVERED', '84', '', '1', '', '', '', '', '', 10, '', '', '', '', '', '', '', '', '', 0, '', '2018-06-21 00:00:00');
*/

	/*	-- DEVOLUCAO - TOPP ---
	INSERT INTO LINX_DB_TESTE_OMNI.dbo.HR_OMNI_DEVOLUCAO
	(CODIGO_SITE, PEDIDO, CODIGO_ENTREGA, NOVO_PEDIDO, [DATA], TIPO_OPERACAO, CODIGO_CLIENTE, ID_ENDERECO_COBRANCA, QTDE_TOTAL, VALOR_TOTAL, DESCONTO, VALOR_FRETE, STATUS_OMS, CODIGO_FILIAL, PEDIDO_OMS, ID_DEVOLUCAO_OMS, ID_HYBRIS_PEDIDO_TROCA, ID_HYBRIS_PEDIDO_DEVOLUCAO, CODIGO_POSTAGEM_REVERSO, MODALIDADE_RESSARCIMENTO, MENSAGEM_TROCA_DEVOLUCAO, VALOR_RESSARCIMENTO, CODIGO_VALE_GERADO, REEMBOLSO_CODIGO_BANCO, REEMBOLSO_NOME_TITULAR, REEMBOLSO_CPF_CNPJ, REEMBOLSO_AGENCIA, REEMBOLSO_AGENCIA_DV, REEMBOLSO_CONTA, REEMBOLSO_CONTA_DV, REEMBOLSO_TIPO_CONTA, PROCESSADO, MENSAGEM_CRITICA_IMPORTACAO, DATA_HORA_INSERT)
	VALUES('001', '137762012', 'F1', '', '2018-06-21 00:00:00', 6, '0009', '', 1, 19, 0, 0, 'DELIVERED', '84', '', '9001', '', '', '', '', '', 10, '', '', '', '', '', '', '', '', '', 0, '', '2018-06-21 00:00:00');

*/	
	
	private List<String> verifyListaPedidos(String codigoTipoAtendimento) {
		List<String> listaPedidos;// = new ArrayList<String>();

		if (codigoTipoAtendimento.equalsIgnoreCase("1")) {
			listaPedidos = Pedidos_OMNI_Utils.listaPedidosExchange_Web;
		} else if (codigoTipoAtendimento.equalsIgnoreCase("2")) {
			listaPedidos = Pedidos_OMNI_Utils.listaPedidosRefund_Web;
		} else {
			listaPedidos = new ArrayList<String>();
		}
		return listaPedidos;
	}

	public void get_Main_HR_OMNI_DEVOLUCAO(int idDevolucaoOMS, String codigoTipoAtendimento, String environment) {
		
		String s = "INSERT INTO LINX_DB_TESTE_" + environment + ".dbo.HR_OMNI_DEVOLUCAO (CODIGO_SITE, PEDIDO, CODIGO_ENTREGA, NOVO_PEDIDO,[DATA],TIPO_OPERACAO,CODIGO_CLIENTE, ID_ENDERECO_COBRANCA, QTDE_TOTAL, VALOR_TOTAL, DESCONTO, VALOR_FRETE, STATUS_OMS, CODIGO_FILIAL, PEDIDO_OMS, ID_DEVOLUCAO_OMS, ID_HYBRIS_PEDIDO_TROCA, ID_HYBRIS_PEDIDO_DEVOLUCAO, CODIGO_POSTAGEM_REVERSO, MODALIDADE_RESSARCIMENTO, MENSAGEM_TROCA_DEVOLUCAO, VALOR_RESSARCIMENTO, CODIGO_VALE_GERADO, REEMBOLSO_CODIGO_BANCO, REEMBOLSO_NOME_TITULAR, REEMBOLSO_CPF_CNPJ, REEMBOLSO_AGENCIA, REEMBOLSO_AGENCIA_DV, REEMBOLSO_CONTA, REEMBOLSO_CONTA_DV, REEMBOLSO_TIPO_CONTA, PROCESSADO, MENSAGEM_CRITICA_IMPORTACAO, DATA_HORA_INSERT)",
		       s2 = "VALUES('001', '",
		       s3 = "', 'F1','', '" + Pedidos_OMNI_Utils.DATA_HOJE + "', 6, '0009', '', 1, 19, 0, 0, 'DELIVERED', '84', '', '",
		       s4 = "', '', '', '', '', '', 10, '', '', '', '', '', '', '', '', '', 0, '', '" + Pedidos_OMNI_Utils.DATA_HOJE + "')";
			
		List<String> listaPedidos = verifyListaPedidos(codigoTipoAtendimento);
		       
		for (String pedido : listaPedidos) {
			StringBuilder sb = new StringBuilder();
			sb.append(s);
			sb.append(s2);
			sb.append(pedido);
			sb.append(s3);
			sb.append(String.valueOf(idDevolucaoOMS++));
			sb.append(s4);
			
			System.out.println(sb.toString());
		}
			
	}
    

}
