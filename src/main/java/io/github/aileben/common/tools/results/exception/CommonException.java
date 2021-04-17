package io.github.aileben.common.tools.results.exception;

import io.github.aileben.common.tools.constant.C;

import java.util.UUID;


/**
 * 异常信息
 * @author fypeng
 */
public class CommonException extends RuntimeException{

	private static final long serialVersionUID = 1379659528682508908L;

	private String seqId = UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
	private int type;
	private int code;
	private String message;

	public CommonException(){}

	public CommonException(int code,String message){
		this.code = code;
		this.message = message;
		this.type = C.TYPE_RESULT_PROBLEM;
	}


	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
