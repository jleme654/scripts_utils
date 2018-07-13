package br.com.scripts.utils;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Pedidos_OMNI_Utils {

	public static String CODIGO_CLIENTE = "0009";
	public static String DATA_HOJE = getDataAtual();// "2018-06-21 00:00:00";
	public static String EXCHANGE_WEB_CODE = "1";
	public static String REFUND_WEB_CODE = "2";

	public static String getDataAtual() {
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ");
		return dataFormat.format(new Date());
	}

	public static List<String> listaPedidosExchange_Web = Arrays.asList(
			
			"120700051",//-F1 - DELIVERY_FAILED
			"120700052",//-f1 - DELIVERY_LOST
			"120712IM"// (QUEBRA DE ESTOQUE)

			/*"137762012", // F1
			"137759047", // F1
			"23031631", // F1
			"17021820", // F1
			"19031147", // F1
			"15031916", // F1
			"5031901", // F1
			"14031756", // F1
			"14031048", // F1
			"14031029", // F1
			"2402181722", // F1
			"230211900", // F1
			"2202181312", // F1
			"2202181116", // F1
			"2018011600011", // F1
			"178829060"// F1*/	
			);

	public static List<String> listaPedidosRefund_Web = Arrays.asList(
			
			"120710IM",
			"120704IM",// (confirma se tem volume)
			"120713IM",
			"120714IM"
			
			/*"280600010"
			"00040803",//    F1
			"0102303A",//    F1
			"00030803",//    F1
			"201801310011",//    F2
			"137762012",//    F1
			"00021403",//    F1
			"23031631",//    F1
			"17021820",//    F1
			"09032033",//    F1
			"09032013",//    F1
			"00032702",//    F1
			"0902181027",//    F1
			"0802181841",//    F1
			"0802181751"//    F1 */
			);

}
