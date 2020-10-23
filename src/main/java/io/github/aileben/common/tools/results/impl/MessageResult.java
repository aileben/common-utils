package io.github.aileben.common.tools.results.impl;

import io.github.aileben.common.tools.results.abs.AbsResult;

/**
 * 无token结果集
 * @author fengyupeng
 *
 */
public class MessageResult extends AbsResult{
	
	private static final long serialVersionUID = 1041649114986641702L;
	
	public MessageResult() {}
	
	public MessageResult(int type,int code,String message) {
		super(type, code, message);	
	}
	
}
