package br.com.scripts.homolog;

import br.com.scripts.utils.Pedidos_OMNI_Utils;

@Deprecated
public class Main_HR_B2C_ATENDIMENTO_OMNI {
//	ID_B2C_ATENDIMENTO |CODIGO_TIPO_ATENDIMENTO |CODIGO_FILIAL |STATUS_SAP |CODIGO_CLIENTE |PEDIDO   |PEDIDO_DEVOLUCAO |VALOR_ATENDIMENTO |CODIGO_VOUCHER |DATA_ATIVACAO_VOUCHER |PROTOCOLO_SAC |CODIGO_REFERENCIA_DEVOLUCAO |SITUACAO_ATUAL |MOTIVO_CANCELAMENTO |CODIGO_POSTAGEM  |SERIE_NF_ENTRADA |NUMERO_NF_ENTRADA |DIGITACAO           |PEDIDO_ENTRADA |DESC_MOTIVO_TROCA_DEVOLUCAO                                                                                                                                                                                                                                    |ID_HYBRIS_PEDIDO_DEVOLUCAO |HR_ISO_CAUSA |SAP_FORCA_REFERENCIA_DEVOLUCAO |FATURAR_CONTRA_CENTRO_CUSTO |HR_DATA_HORA_CRIACAO |ID_DEVOLUCAO_OMS |CODIGO_MODALIDADE_RESSARCIMENTO |VALOR_FRETE_RESSARCIDO |PEDIDO_OMS_ORIGINAL |CODIGO_ENTREGA_OMS_ORIGINAL |STATUS_SAP_ADIANTAMENTO |SAP_ORDEM_DEVOLUCAO |SAP_FATURA_DEVOLUCAO |SAP_REMESSA_DEVOLUCAO |EMISSAO_NF_ENTRADA |ULTIMA_MODIFICACAO |
//	-------------------|------------------------|--------------|-----------|---------------|---------|-----------------|------------------|---------------|----------------------|--------------|----------------------------|---------------|--------------------|-----------------|-----------------|------------------|--------------------|---------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------|-------------|-------------------------------|----------------------------|---------------------|-----------------|--------------------------------|-----------------------|--------------------|----------------------------|------------------------|--------------------|---------------------|----------------------|-------------------|-------------------|
//	3378               |1                       |84            |0          |137120/84      |-1070422 |-1052541         |89.99             |               |                      |400033        |NF105000038070              |5              |                    |711968307        |505              |6324              |2016-03-04 14:49:56 |               |Sempre compro vestidos e afins na hering no Tamanho P e acabei arriscando o macaquinho nesse tamanho, porém ficou apertado e desconfortável e por isso quero trocar por um numero maior.                                                                       |DV01_42124482              |4            |0                              |                            |2016-03-04 15:41:53  |                 |                                |0.00                   |                    |                            |                        |                    |                     |                      |                   |                   |
	public static void main(String[] args) {
		
		int countAtendimento = 1, idDevolucaoOMS = 1;
		
		String s = "INSERT INTO LINX_DB_TESTE_OMNI.dbo.HR_B2C_ATENDIMENTO (ID_B2C_ATENDIMENTO, CODIGO_TIPO_ATENDIMENTO, CODIGO_FILIAL, STATUS_SAP, CODIGO_CLIENTE, PEDIDO, PEDIDO_DEVOLUCAO, VALOR_ATENDIMENTO, CODIGO_VOUCHER, DATA_ATIVACAO_VOUCHER, PROTOCOLO_SAC, CODIGO_REFERENCIA_DEVOLUCAO, SITUACAO_ATUAL, MOTIVO_CANCELAMENTO, CODIGO_POSTAGEM, SERIE_NF_ENTRADA, NUMERO_NF_ENTRADA, DIGITACAO, PEDIDO_ENTRADA, DESC_MOTIVO_TROCA_DEVOLUCAO, ID_HYBRIS_PEDIDO_DEVOLUCAO, HR_ISO_CAUSA, SAP_FORCA_REFERENCIA_DEVOLUCAO, FATURAR_CONTRA_CENTRO_CUSTO, HR_DATA_HORA_CRIACAO, ID_DEVOLUCAO_OMS, CODIGO_MODALIDADE_RESSARCIMENTO, VALOR_FRETE_RESSARCIDO, PEDIDO_OMS_ORIGINAL, CODIGO_ENTREGA_OMS_ORIGINAL, STATUS_SAP_ADIANTAMENTO, SAP_ORDEM_DEVOLUCAO, SAP_FATURA_DEVOLUCAO, SAP_REMESSA_DEVOLUCAO, EMISSAO_NF_ENTRADA, ULTIMA_MODIFICACAO) VALUES (";
		String s2 =	 ", '6', '84', 0, '" + Pedidos_OMNI_Utils.CODIGO_CLIENTE + "', ";
		String s3 =  ", 0, 0, '', '', '', '100', '', 5, '', '', '', '', 0, '', '', 0, 0, 0, '', '"; 
		//idDevolucaoOMS
		String s4 = "', '', 90, '', '', 0, '', '', '', '', '')";

		for (String pedido : Pedidos_OMNI_Utils.listaPedidos) {
			StringBuilder sb = new StringBuilder();
			sb.append(s);
			sb.append(String.valueOf(countAtendimento++));
			sb.append(s2);
			sb.append(String.valueOf(pedido));
			sb.append(s3);
			sb.append(String.valueOf(idDevolucaoOMS++));
			sb.append(s4);
			
			System.out.println(sb.toString());
		}
		
		System.out.println("\n\nINSERT INTO LINX_DB_TESTE_OMNI.dbo.HR_B2C_ATENDIMENTO (ID_B2C_ATENDIMENTO, CODIGO_TIPO_ATENDIMENTO, CODIGO_FILIAL, STATUS_SAP, CODIGO_CLIENTE, PEDIDO, PEDIDO_DEVOLUCAO, VALOR_ATENDIMENTO, CODIGO_VOUCHER, DATA_ATIVACAO_VOUCHER, PROTOCOLO_SAC, CODIGO_REFERENCIA_DEVOLUCAO, SITUACAO_ATUAL, MOTIVO_CANCELAMENTO, CODIGO_POSTAGEM, SERIE_NF_ENTRADA, NUMERO_NF_ENTRADA, DIGITACAO, PEDIDO_ENTRADA, DESC_MOTIVO_TROCA_DEVOLUCAO, ID_HYBRIS_PEDIDO_DEVOLUCAO, HR_ISO_CAUSA, SAP_FORCA_REFERENCIA_DEVOLUCAO, FATURAR_CONTRA_CENTRO_CUSTO, HR_DATA_HORA_CRIACAO, ID_DEVOLUCAO_OMS, CODIGO_MODALIDADE_RESSARCIMENTO, VALOR_FRETE_RESSARCIDO, PEDIDO_OMS_ORIGINAL, CODIGO_ENTREGA_OMS_ORIGINAL, STATUS_SAP_ADIANTAMENTO, SAP_ORDEM_DEVOLUCAO, SAP_FATURA_DEVOLUCAO, SAP_REMESSA_DEVOLUCAO, EMISSAO_NF_ENTRADA, ULTIMA_MODIFICACAO) VALUES (0, '', '', 0, '', 0, 0, 0, '', '', '', '', '', 0, '', '', '', '', 0, '', '', 0, 0, 0, '', '', '', 0, '', '', 0, '', '', '', '', '')");

		
	}

}
