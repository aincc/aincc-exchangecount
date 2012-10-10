package com.aincc.exchangecount.model;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * 
 * <h3><b>KEBExchange</b></h3></br>
 * 
 * 환율 정보 (KEB)
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
@Root(name = "naver")
public class KEBExchange
{
	/**
	 * 통화 리스트
	 */
	@ElementList
	private List<KEBCurrency> currency = new ArrayList<KEBCurrency>();

	/**
	 * @return the currencies
	 */
	public List<KEBCurrency> getCurrency()
	{
		return currency;
	}
}
