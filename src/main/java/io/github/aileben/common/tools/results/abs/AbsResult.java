package io.github.aileben.common.tools.results.abs;

import java.util.UUID;

import io.github.aileben.common.tools.results.Result;

/**
 * 抽象结果集，用户返回json格式数据，
 * @author fengyupeng
 *
 */
public class AbsResult implements Result{

	private static final long serialVersionUID = -8564317802372171889L;

	private String seqId = UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
	
	private int type;
	
	private int code;
	
	private String message;
	
	public AbsResult(int type,int code,String message) {
		this.type = type;
		this.code = code;
		this.message = message;
	}

	public AbsResult() {
		
	}

	public String getSeqId() {
		return seqId;
	}

	public int getType() {
		return type;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public void setSeqId(String seqId) {
		this.seqId = seqId;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
