package com.aincc.exchangecount;

/**
 * 
 * <h3><b>ExchangeCons</b></h3></br>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class ExchangeCons
{
	// 네이버를 통해서만 접근이 가능함. 외부접근은 차단.
	// public static final String serviceUri = "http://www.naver.com/include/timesquare/widget/exchange.xml";

	public static final String KEBServiceUri = "http://community.fxkeb.com";
	public static final String KEBCommandUri = "/fxportal/jsp/RS/DEPLOY_EXRATE/fxrate_all.html";
	public static final String KEBExchangeClass = "table";
	public static final String KEBCurrencyNameClass = "table_05";
	public static final String KEBCurrencyInfoClass = "table_04";
	public static final int KEBFieldCount = 7;
}
