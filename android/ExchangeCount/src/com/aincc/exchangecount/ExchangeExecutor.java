package com.aincc.exchangecount;

import com.aincc.exchangecount.network.OpenParam;
import com.aincc.exchangecount.network.OpenTask;
import com.aincc.exchangecount.openapi.OpenKEBExchange;
import com.aincc.network.NetHttpProcessor;
import com.aincc.network.common.BaseTransEx;
import com.aincc.network.common.INetworkListener;
import com.aincc.network.common.NetworkDefine;

/**
 * 
 * <h3><b>ExchangeExecutor</b></h3></br>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class ExchangeExecutor
{
	private volatile static ExchangeExecutor instance;

	/**
	 * private constructor
	 * 
	 * @since 1.0.0
	 */
	private ExchangeExecutor()
	{

	}

	/**
	 * 
	 * @since 1.0.0
	 * @return the service executor instance
	 */
	public static ExchangeExecutor getInstance()
	{
		if (null == instance)
		{
			synchronized (ExchangeExecutor.class)
			{
				if (null == instance)
				{
					instance = new ExchangeExecutor();
				}
			}
		}
		return instance;
	}

	/**
	 * 
	 * @since 1.0.0
	 */
	public void cancelAll()
	{
		NetHttpProcessor.getInstance().cancelAll();
	}

	/**
	 * 환율정보 요청 (KEB)
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 */
	public void getKEBExchange(String requestKey, INetworkListener listener)
	{
		OpenKEBExchange tr = new OpenKEBExchange();
		tr.setCommandUri(ExchangeCons.KEBCommandUri);

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_EUCKR);
		tr.setParam(param);

		OpenTask<OpenKEBExchange, BaseTransEx> task = new OpenTask<OpenKEBExchange, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(ExchangeCons.KEBServiceUri, listener, task);
	}
}
