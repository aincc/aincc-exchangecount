package com.aincc.exchangecount.openapi;

import java.util.List;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.Source;

import com.aincc.exchangecount.ExchangeCons;
import com.aincc.exchangecount.model.KEBCurrency;
import com.aincc.exchangecount.model.KEBExchange;
import com.aincc.exchangecount.network.OpenBase;
import com.aincc.network.common.IPacket;

/**
 * 
 * <h3><b>OpenKEBExchange</b></h3></br>
 * 
 * 환율정보 요청 API
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class OpenKEBExchange extends OpenBase
{
	public KEBExchange exchange = new KEBExchange();

	@Override
	public void setPacket(IPacket packet) throws Exception
	{
		super.setPacket(packet);
	}

	@Override
	public void parse() throws Exception
	{
		// Logger.i("response : " + response);
		Source s = new Source(response);

		// class = table 통화정보 테이블
		List<Element> exchangeTable = s.getAllElementsByClass(ExchangeCons.KEBExchangeClass);
		if (null != exchangeTable && 0 < exchangeTable.size())
		{
			Element table = exchangeTable.get(0);

			// 행 정보 순환
			List<Element> trList = table.getAllElements(HTMLElementName.TR);
			for (Element tr : trList)
			{
				// 통화명 및 통화 매매 환율 정보 추출
				List<Element> names = tr.getAllElementsByClass(ExchangeCons.KEBCurrencyNameClass);
				List<Element> infos = tr.getAllElementsByClass(ExchangeCons.KEBCurrencyInfoClass);

				if (null != names && 0 < names.size() && null != infos && ExchangeCons.KEBFieldCount == infos.size())
				{
					KEBCurrency currency = new KEBCurrency(names.get(0).getTextExtractor().toString(), infos.get(0).getTextExtractor().toString(), infos.get(1).getTextExtractor().toString(), infos.get(2).getTextExtractor().toString(), infos.get(3).getTextExtractor().toString(), infos.get(4).getTextExtractor().toString(), infos.get(5).getTextExtractor().toString(), infos.get(6).getTextExtractor().toString());
					exchange.getCurrency().add(currency);
				}
			}
		}

	}
}
