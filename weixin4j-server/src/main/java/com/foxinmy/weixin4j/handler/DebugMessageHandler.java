package com.foxinmy.weixin4j.handler;

import com.foxinmy.weixin4j.exception.WeixinException;
import com.foxinmy.weixin4j.request.WeixinRequest;
import com.foxinmy.weixin4j.response.TextResponse;
import com.foxinmy.weixin4j.response.WeixinResponse;

public class DebugMessageHandler implements WeixinMessageHandler {

	public static final DebugMessageHandler global = new DebugMessageHandler();

	private DebugMessageHandler() {

	}

	@Override
	public boolean canHandle(WeixinRequest request, Object message)
			throws WeixinException {
		return true;
	}

	@Override
	public WeixinResponse doHandle(WeixinRequest request, Object message)
			throws WeixinException {
		return new TextResponse(message.toString());
	}
}
