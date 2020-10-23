package io.github.aileben.common.tools.results.impl;

/**
 * 返回数据和总条数
 * @author fengyupeng
 *
 */
public class MessageDataResult<E> extends MessageResult{

	private static final long serialVersionUID = 2561483197294574332L;
	
	private E data;
	
	public MessageDataResult(int type,int code,String message,E data) {
		super(type, code, message);
		this.data = data;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	
}
