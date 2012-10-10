package com.aincc.exchangecount.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 * <h3><b>NVCurrency</b></h3></br>
 * 
 * 통화 정보 (Naver)
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
@Root(name = "currency")
public class NVCurrency
{
	/**
	 * 통화명
	 */
	@Element
	private String hname;

	/**
	 * 매매기준율
	 */
	@Element
	private String standard;

	/**
	 * 현금 매도
	 */
	@Element
	private String buy;

	/**
	 * 현금 매매
	 */
	@Element
	private String sell;

	/**
	 * 송금
	 */
	@Element
	private String send;

	/**
	 * 수금
	 */
	@Element
	private String receive;

	/**
	 * 통화기호
	 */
	@Element
	private String sign;

	/**
	 * 전일대비
	 */
	@Element
	private String change_val;

	/**
	 * @return the hname
	 */
	public String getHname()
	{
		return hname;
	}

	/**
	 * @return the standard
	 */
	public String getStandard()
	{
		return standard;
	}

	/**
	 * @return the buy
	 */
	public String getBuy()
	{
		return buy;
	}

	/**
	 * @return the sell
	 */
	public String getSell()
	{
		return sell;
	}

	/**
	 * @return the send
	 */
	public String getSend()
	{
		return send;
	}

	/**
	 * @return the receive
	 */
	public String getReceive()
	{
		return receive;
	}

	/**
	 * @return the sign
	 */
	public String getSign()
	{
		return sign;
	}

	/**
	 * @return the change_val
	 */
	public String getChange_val()
	{
		return change_val;
	}

}
