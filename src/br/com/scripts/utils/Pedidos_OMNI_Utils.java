package br.com.scripts.utils;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Pedidos_OMNI_Utils {
	
	public static String CODIGO_CLIENTE = "0009";
	public static String DATA_HOJE = getDataAtual();//"2018-06-21 00:00:00";
	
	public static String getDataAtual () {
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ");
		return dataFormat.format(new Date());
	}
	
	public static List<String> listaPedidos = Arrays.asList(
			//"00040803",//    F1
			//"0102303A",//    F1
			//"00030803",//    F1
			//"852.12NCCI",//    F1
			//"201801310011",//    F2
			"137762012",//    F1
			//"125.13MNAN",//    F1
			//"125.13MMVD",//    F1
			//"125.139NAN",//    F1
			//"852.137DSP",//    F1
			//00102803    01
			"137759047",//    F1
			//"00021403",//    F1
			//23031631    F2
			"23031631",//    F1
//			0102303A    F2
//			17021820    F2
//			00012303    F2
//			00050803    F2
			"17021820",//    F1
			//"125.13NNDF",//    F1
//			00082003A    F2
//			00072003A    F2
			"19031147",//    F1
			"15031916",//    F1
			"5031901",//    F1
			"14031756",//    F1
			"14031048",//    F1
			"14031029",//    F1
//			14030001    F2
//			13031813    01
//			13031736    01
			//"09032033",//    F1
			//"09032013",//    F1
			//73181607    01
			//"125.132HZT",//    F1
			//"00032702",//    F1
			"2402181722",//    F1
			"230211900",//    F1
			//180223001    01
			"2202181312",//    F1
			"2202181116",//    F1
			//1802191625    01
			//"0902181027",//    F1
			//"0802181841",//    F1
		//	"0802181751",//    F1
			//02070003    F2
			//1801291407    02
			"2018011600011",//    F1
			"178829060"//    F1
			);

}
