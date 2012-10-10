package com.aincc.exchangecount.model;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class NVParseSample
{
	public static String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

	static
	{
		xml += "<naver service=\"exchange\">";
		xml += "<last_update>20121009175721</last_update>";
		xml += "<exchange_count>37</exchange_count>";
		xml += "<currency>";
		xml += "<hname>미국</hname>";
		xml += "<standard>1111.50</standard>";
		xml += "<buy>1130.95</buy>";
		xml += "<sell>1092.05</sell>";
		xml += "<send>1122.30</send>";
		xml += "<receive>1100.70</receive>";
		xml += "<sign>USD</sign>";
		xml += "<change_val>-0.50</change_val>";
		xml += "</currency>";
		xml += "<currency>";
		xml += "<hname>일본</hname>";
		xml += "<standard>1419.18</standard>";
		xml += "<buy>1444.01</buy>";
		xml += "<sell>1394.35</sell>";
		xml += "<send>1433.08</send>";
		xml += "<receive>1405.28</receive>";
		xml += "<sign>JPY</sign>";
		xml += "<change_val>-3.00</change_val>";
		xml += "</currency>";
		xml += "</naver>";
	}

	/**
	 * @since 1.0.0
	 * @param args
	 */
	public static void main(String[] args)
	{
		Serializer serial = new Persister();
		try
		{
			NVExchange exchange = serial.read(NVExchange.class, xml);
			System.out.println("last_update : " + exchange.getLast_update());
			System.out.println("exchange_count : " + exchange.getExchange_count());
			for (NVCurrency c : exchange.getCurrency())
			{
				System.out.println("==========================");
				System.out.println("hname : " + c.getHname());
				System.out.println("sell : " + c.getSell());
				System.out.println("buy : " + c.getBuy());
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
