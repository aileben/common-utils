package io.github.aileben.common.tools.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.ex.ConfigurationException;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

public class LoadFileUtil {
	/**
	 * 用具load文件数据，例如json格式文件
	 * @param name
	 * @return
	 */
	public static String loadFile(final String name) {
		
		URL url = Resources.getResource(name);
		String result = "";
		try {
			result = Resources.asCharSource(url,Charsets.UTF_8).read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * load Properties 文件
	 * @param fileName
	 * @param code
	 * @return
	 */
	public static String loadProperties(final String fileName,String code){
		final InputStream is = LoadFileUtil.class.getClassLoader().getResourceAsStream(fileName);
		final Reader in = new InputStreamReader(is);
		final PropertiesConfiguration config = new PropertiesConfiguration();
		try {
			config.read(in);
		}catch (IOException | ConfigurationException ex){
			ex.printStackTrace();
		}
		return config.getString(code);
	}


	/**
	 * load Properties 文件
	 * @param fileName
	 * @param code
	 * @return
	 */
	public static String loadProperties(final String fileName,int code){
		return loadProperties(fileName,String.valueOf(code));
	}

}
