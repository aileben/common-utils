package io.github.aileben.common.tools.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadPropertiesFileUtil {


	/**
	 * load Properties 文件
	 * @param fileName
	 * @param code
	 * @return
	 */
	public static String loadProperties(final String fileName,String code)throws IOException{
		final InputStream is = LoadPropertiesFileUtil.class.getClassLoader().getResourceAsStream(fileName);
		final Properties config = new Properties();
		config.load(is);
		return config.getProperty(code);
	}


	/**
	 * load Properties 文件
	 * @param fileName
	 * @param code
	 * @return
	 */
	public static String loadProperties(final String fileName,int code){
		try {
			return loadProperties(fileName,String.valueOf(code));
		}catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
