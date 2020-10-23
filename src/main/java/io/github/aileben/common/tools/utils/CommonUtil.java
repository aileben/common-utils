package io.github.aileben.common.tools.utils;

import java.util.Random;
import java.util.UUID;

/**
 * UUID方法
 * @author fengyupeng
 *
 */
public class CommonUtil {

	/**
	 * 返回32位UUID
	 * @return
	 */
	public static final String generate() {
		return UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
	}
	
	/**
	 * 生成一个随机数字字符串
	 */
	public static final String getNewRandomCode(int codeLen) {
		Random randomCode = new Random();
		StringBuilder builder = new StringBuilder();
		while (codeLen-- > 0) {
			int charCode = randomCode.nextInt(9);
			builder.append(charCode);
		}
		return builder.toString();
	}
}

