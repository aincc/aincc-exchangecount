package com.aincc.exchangecount.model;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * 
 * <h3><b>NVExchange</b></h3></br>
 * 
 * 환율 정보 (Naver)
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
@Root(name = "naver")
public class NVExchange
{
	@Attribute
	private String service;

	@Element
	private String last_update;

	@Element
	private String exchange_count;

	@ElementList(inline = true)
	private List<NVCurrency> currency;

	/**
	 * @return the service
	 */
	public String getService()
	{
		return service;
	}

	/**
	 * @return the last_update
	 */
	public String getLast_update()
	{
		return last_update;
	}

	/**
	 * @return the exchange_count
	 */
	public String getExchange_count()
	{
		return exchange_count;
	}

	/**
	 * @return the currencies
	 */
	public List<NVCurrency> getCurrency()
	{
		return currency;
	}

}
