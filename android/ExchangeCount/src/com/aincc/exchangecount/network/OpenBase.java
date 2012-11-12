package com.aincc.exchangecount.network;

import com.aincc.network.common.IPacket;
import com.aincc.network.http.HttpTrans;
import com.aincc.util.Logger;

/**
 * 
 * <h3><b>OpenBase</b></h3></br>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public abstract class OpenBase extends HttpTrans
{

	/**
	 * packet builder
	 * 
	 * @since 1.0.0
	 */
	protected PacketBuilder pb = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.baru.core.network.BaseTrans#setPacket(com.baru.core.network.IPacket)
	 */
	@Override
	public void setPacket(IPacket packet) throws Exception
	{
		super.setPacket(packet);
		setResponse(packet.toString());
		// Logger.d(response);
		try
		{
			parse();
			Logger.i(getParam().getRequestKey() + " response parse OK.");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			Logger.e(getParam().getRequestKey() + "response parse Error!");
		}
	}

	/**
	 * 서브클래스에서 응답결과 파싱처리를 구현한다.
	 * 
	 * @since 1.0.0
	 */
	abstract public void parse() throws Exception;
}
