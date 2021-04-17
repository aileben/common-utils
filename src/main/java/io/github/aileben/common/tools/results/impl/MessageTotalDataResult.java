package io.github.aileben.common.tools.results.impl;

/**
 * @author fengyupeng
 */
public class MessageTotalDataResult<E> extends MessageResult {

	private static final long serialVersionUID = -5011452050161829717L;

	private int total;

	private E data;
	
	public MessageTotalDataResult() {}

	public MessageTotalDataResult(int type,int code,String message,int total,E data) {
		super(type, code, message);
		this.total = total;
		this.data = data;
	}

	public int getTotal() {
		return total;
	}

	public E getData() {
		return data;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setData(E data) {
		this.data = data;
	}
}
