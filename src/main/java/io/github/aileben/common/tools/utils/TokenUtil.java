package io.github.aileben.common.tools.utils;

import java.util.Date;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import io.github.aileben.common.tools.constant.C;
import io.github.aileben.common.tools.results.Result;
import io.github.aileben.common.tools.results.operate.R;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;

/**
 * 创建一个token
 * 
 * @author fengyupeng
 *
 */
public class TokenUtil {

	private static final String JWT_SECRET_KEY = "jwt.secret"; 
	private static String JWT_SECERT;
	/**
	 * arithmetic
	 */
	private static final String ARITHMETIC_KEY = "arithmetic"; 
	private static String ARITHMETIC;

	/**
	 * token失效时间
	 */
	private static final String JWT_OTHER_SESSION_KEY = "jwt.session";
	private static long TTL_MILLIS;

	/**
	 * token加密算法
	 */
	private static final String SIGN_KEY = "sign";
	private static SignatureAlgorithm SIGN_ALGORITHM = SignatureAlgorithm.HS256;

	static {
		TTL_MILLIS = Long.parseLong(LoadFileUtil.loadProperties(C.JWT, JWT_OTHER_SESSION_KEY));
		ARITHMETIC = LoadFileUtil.loadProperties(C.JWT, ARITHMETIC_KEY);
		JWT_SECERT = LoadFileUtil.loadProperties(C.JWT, JWT_SECRET_KEY);
		SIGN_ALGORITHM = SignatureAlgorithm.forName(LoadFileUtil.loadProperties(C.JWT, SIGN_KEY));
	}
	

	/**
	 * 生成Token和token有效时间
     * @param id  jwt的唯一身份标识，主要用来作为一次性token,从而回避重放攻击。可以用uuid随机码
     * @param iss jwt签发者 
     * @param subject jwt所面向的用户。payload中记录的public claims。当前环境中就是用户的登录名。
     * @return token， token是一次性的。是为一个用户的有效登录周期准备的一个token。用户退出或超时，token失效。
	 * @return
	 */
	public final static String build(String id, String issuer, String subject) {
		// 获取当前时间
		long nowMillis = System.currentTimeMillis();
		// 当前时间
		Date now = new Date(nowMillis);
		// 生成secretKey
		SecretKey secretKey = secretKey();
		JwtBuilder builder = Jwts.builder().setId(id).setIssuer(issuer).setSubject(subject).setIssuedAt(now) // 设置token生效时间
				.signWith(SIGN_ALGORITHM, secretKey);
		long expMillis = nowMillis + TTL_MILLIS;
		// token的失效时间。
		Date expDate = new Date(expMillis);
		builder.setExpiration(expDate);
		return builder.compact();
	}
	
	/**
	 * 刷新token
	 */
	public final static String refreshToken(String token,String id) {
		Claims claims = null;
		try {
			claims = parse(token);
		} catch (Exception e) {
			return token;
		}
		return build(id, claims.getIssuer(), claims.getSubject());
	}

	
	private final static SecretKey secretKey() {
		try {
			byte[] encodeKey = JWT_SECERT.getBytes("UTF-8");
			SecretKey key = new SecretKeySpec(encodeKey, 0, encodeKey.length, ARITHMETIC);
			return key;
		} catch (Exception ex) {
			return null;
		}

	}

	public final static Result check(String token) {
		try {
			Claims claims = parse(token);
			return R.success(C.JWT,2000,claims);
		} catch (ExpiredJwtException e) {
			return R.fail(C.JWT,5000);
		} catch (SignatureException e) {
			return R.fail(C.JWT,5001);
		} catch (Exception e) {
			return R.fail(C.JWT,5002);
		}
	}

	/**
	 * 校验token
	 * 
	 * @return
	 */
	private final static Claims parse(String token) throws ExpiredJwtException, SignatureException, Exception {
		SecretKey secretKey = secretKey();
		Claims claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
		return claims;
	}

}
