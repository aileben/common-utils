package io.github.aileben.common.tools.results.operate;

import io.github.aileben.common.tools.constant.C;
import io.github.aileben.common.tools.results.Result;
import io.github.aileben.common.tools.results.exception.CommonException;
import io.github.aileben.common.tools.results.impl.MessageDataResult;
import io.github.aileben.common.tools.results.impl.MessageResult;
import io.github.aileben.common.tools.results.impl.MessageTotalDataResult;
import io.github.aileben.common.tools.utils.LoadPropertiesFileUtil;

public class R{
	
	/**
	 * 成功
	 */
	public final static Result success(int code) {
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		return new MessageResult(C.TYPE_RESULT_SUCCESS,code,message);
	}
	
	public final static <E> Result success(int code,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		return new MessageDataResult<E>(C.TYPE_RESULT_SUCCESS,code,message,data);
	}
	
	public final static <E> Result success(int code,int total,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		return new MessageTotalDataResult<E>(C.TYPE_RESULT_SUCCESS,code,message,total,data);
	}
	
	
	public final static Result success(String fileName,int code) {
		String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
		return new MessageResult(C.TYPE_RESULT_SUCCESS,code,message);
	}
	
	public final static <E> Result success(String fileName,int code,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
		return new MessageDataResult<E>(C.TYPE_RESULT_SUCCESS,code,message,data);
	}
	public final static <E> Result success(String fileName,int code,int total,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
		return new MessageTotalDataResult<E>(C.TYPE_RESULT_SUCCESS,code,message,total,data);
	}
	

	public final static Result success(int code,String message) {
		return new MessageResult(C.TYPE_RESULT_SUCCESS,code,message);
	}
	
	public final static <E> Result success(int code,String message,E data) {
		return new MessageDataResult<E>(C.TYPE_RESULT_SUCCESS,code,message,data);
	}
	
	public final static <E> Result success(int code,String message,int total,E data) {
		return new MessageTotalDataResult<E>(C.TYPE_RESULT_SUCCESS,code,message,total,data);
	}
	
	
	/**
	 * 失败
	 */	
	public final static Result fail(int code) {
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		return new MessageResult(C.TYPE_RESULT_FAIL,code,message);
	}
	
	public final static <E> Result fail(int code,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		return new MessageDataResult<E>(C.TYPE_RESULT_FAIL,code,message,data);
	}
	
	public final static <E> Result fail(int code,int total,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		return new MessageTotalDataResult<E>(C.TYPE_RESULT_FAIL,code,message,total,data);
	}
	
	
	public final static Result fail(String fileName,int code) {
		String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
		return new MessageResult(C.TYPE_RESULT_FAIL,code,message);
	}
	
	public final static <E> Result fail(String fileName,int code,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
		return new MessageDataResult<E>(C.TYPE_RESULT_FAIL,code,message,data);
	}
	public final static <E> Result fail(String fileName,int code,int total,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
		return new MessageTotalDataResult<E>(C.TYPE_RESULT_FAIL,code,message,total,data);
	}
	
	public final static Result fail(int code,String message) {
		return new MessageResult(C.TYPE_RESULT_FAIL,code,message);
	}
	
	public final static <E> Result fail(int code,String message,E data) {
		return new MessageDataResult<E>(C.TYPE_RESULT_FAIL,code,message,data);
	}
	
	public final static <E> Result fail(int code,String message,int total,E data) {
		return new MessageTotalDataResult<E>(C.TYPE_RESULT_FAIL,code,message,total,data);
	}
	
	
	/**
	 * 警告
	 */	
	public final static Result warn(int code) {
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		return new MessageResult(C.TYPE_RESULT_WARN,code,message);
	}
	
	public final static <E> Result warn(int code,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		return new MessageDataResult<E>(C.TYPE_RESULT_WARN,code,message,data);
	}
	
	public final static <E> Result warn(int code,int total,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		return new MessageTotalDataResult<E>(C.TYPE_RESULT_WARN,code,message,total,data);
	}
	
	
	public final static Result warn(String fileName,int code) {
		String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
		return new MessageResult(C.TYPE_RESULT_WARN,code,message);
	}
	
	public final static <E> Result warn(String fileName,int code,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
		return new MessageDataResult<E>(C.TYPE_RESULT_WARN,code,message,data);
	}
	public final static <E> Result warn(String fileName,int code,int total,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
		return new MessageTotalDataResult<E>(C.TYPE_RESULT_WARN,code,message,total,data);
	}
	
	
	public final static Result warn(int code,String message) {
		return new MessageResult(C.TYPE_RESULT_WARN,code,message);
	}
	
	public final static <E> Result warn(int code,String message,E data) {
		return new MessageDataResult<E>(C.TYPE_RESULT_WARN,code,message,data);
	}
	
	public final static <E> Result warn(int code,String message,int total,E data) {
		return new MessageTotalDataResult<E>(C.TYPE_RESULT_WARN,code,message,total,data);
	}
	
	/**
	 * 信息
	 */
	public final static Result info(int code) {
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		return new MessageResult(C.TYPE_RESULT_INFO,code,message);
	}
	
	public final static <E> Result info(int code,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		return new MessageDataResult<E>(C.TYPE_RESULT_INFO,code,message,data);
	}
	
	public final static <E> Result info(int code,int total,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		return new MessageTotalDataResult<E>(C.TYPE_RESULT_INFO,code,message,total,data);
	}
	
	
	public final static Result info(String fileName,int code) {
		String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
		return new MessageResult(C.TYPE_RESULT_INFO,code,message);
	}
	
	public final static <E> Result info(String fileName,int code,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
		return new MessageDataResult<E>(C.TYPE_RESULT_INFO,code,message,data);
	}
	public final static <E> Result info(String fileName,int code,int total,E data) {
		String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
		return new MessageTotalDataResult<E>(C.TYPE_RESULT_INFO,code,message,total,data);
	}
	
	
	public final static Result info(int code,String message) {
		return new MessageResult(C.TYPE_RESULT_INFO,code,message);
	}
	
	public final static <E> Result info(int code,String message,E data) {
		return new MessageDataResult<E>(C.TYPE_RESULT_INFO,code,message,data);
	}
	
	public final static <E> Result info(int code,String message,int total,E data) {
		return new MessageTotalDataResult<E>(C.TYPE_RESULT_INFO,code,message,total,data);
	}

	/**
	 * 异常
	 */
	public static void problem(int code) {
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		throw new CommonException(code,message);
	}
	
	public static void problem(String fileName,int code){
		String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
		throw new CommonException(code,message);
	}
	
	public static void problem(int code,String message){
		throw new CommonException(code,message);
	}
}
