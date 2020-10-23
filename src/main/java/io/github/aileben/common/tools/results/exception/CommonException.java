package io.github.aileben.common.tools.results.exception;

import io.github.aileben.common.tools.results.Result;


/**
 * 异常信息
 * @author fypeng
 */
public class CommonException extends Exception{

	private static final long serialVersionUID = 1379659528682508908L;

	private Result info;
	
	public CommonException(Result info) {
		this.info = info;
	}

	public Result getInfo() {
		return info;
	}

	public void setInfo(Result info) {
		this.info = info;
	}
}
