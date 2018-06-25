package br.com.scripts.staging;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.scripts.utils.Pedidos_OMNI_Utils;

public class Main {
	
	public static void main(String[] args) {
		/**
		 * ids devolucao OMS
		 */
		for (int i = 9001; i < 9017; i++) {
			System.out.println("'" + String.valueOf(i) + "',");
		}
		
		/**
		 * lista de pedidos
		 */
//		for (String pedido : Pedidos_OMNI_Utils.listaPedidos) {
//			System.out.println("'" + pedido + "',");
//		}
//		
	
		/**
		 * testes simple date format
		 */
		/*
		//"2018-06-21 00:00:00";		
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ");
		System.out.println(dataFormat.format(new Date()));
		*/
	}

}
