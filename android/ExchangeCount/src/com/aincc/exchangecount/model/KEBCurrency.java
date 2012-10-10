package com.aincc.exchangecount.model;

/**
 * 
 * <h3><b>KEBCurrency</b></h3></br>
 * 
 * 통화 정보 (KEB)
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class KEBCurrency
{
	/**
	 * 통화명
	 */
	private String hname;

	/**
	 * 통화약자
	 */
	private String init;

	/**
	 * 매매기준율
	 */
	private String standard;

	/**
	 * 현금 매도
	 */
	private String buy;

	/**
	 * 현금 매매
	 */
	private String sell;

	/**
	 * 송금
	 */
	private String send;

	/**
	 * 수금
	 */
	private String receive;

	/**
	 * 수표 매도
	 */
	private String checkSell;

	/**
	 * 미화 환산율
	 */
	private String usdRate;

	/**
	 * 
	 * @since 1.0.0
	 * @param hname
	 * @param standard
	 * @param buy
	 * @param sell
	 * @param send
	 * @param receive
	 * @param checkSell
	 * @param usdRate
	 */
	public KEBCurrency(String hname, String standard, String buy, String sell, String send, String receive, String checkSell, String usdRate)
	{
		String info = hname.trim();
		int limit = info.length();
		for (int ii = limit - 1; ii > 0; ii--)
		{
			// Logger.i(">>> [" + info.charAt(ii) + "]");
			if (Character.isSpaceChar(info.charAt(ii)))
			{
				// Logger.i(">>> [" + info.charAt(ii) + "] find seperator");
				this.init = info.substring(ii).trim();
				limit = ii;
				break;
			}
		}
		this.hname = info.substring(0, limit).trim();

		this.standard = standard;
		this.buy = buy;
		this.sell = sell;
		this.send = send;
		this.receive = receive;
		this.checkSell = checkSell;
		this.usdRate = usdRate;
	}

	/**
	 * @return the hname
	 */
	public String getHname()
	{
		return hname;
	}

	/**
	 * @return the init
	 */
	public String getInit()
	{
		return init;
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
	 * @return the checkSell
	 */
	public String getCheckSell()
	{
		return checkSell;
	}

	/**
	 * @return the usdRate
	 */
	public String getUsdRate()
	{
		return usdRate;
	}

}
