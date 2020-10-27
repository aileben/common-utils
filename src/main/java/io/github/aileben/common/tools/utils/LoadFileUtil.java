package io.github.aileben.common.tools.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

public class LoadFileUtil {
	/**
	 * 用具load文件数据，例如json格式文件
	 * @param name
	 * @return
	 */
	public static String loadFile(final String name) throws IOException{
		URL url = Resources.getResource(name);
		String result = Resources.asCharSource(url,Charsets.UTF_8).read();
		return result;
	}

	/**
	 * load Properties 文件
	 * @param fileName
	 * @param code
	 * @return
	 */
	public static String loadProperties(final String fileName,String code)throws IOException{
		final InputStream is = LoadFileUtil.class.getClassLoader().getResourceAsStream(fileName);
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
