package com.zhongmeng.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtils {

    public static final String SECRET="zaojiao";
    public static  final String ISSUER="test";

    /**
     * 制做token
     * **/
    public static String genToken(Map<String,String> claims) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            JWTCreator.Builder builder= JWT.create()
                    .withIssuer(ISSUER)
                    .withExpiresAt(new Date(System.currentTimeMillis()+360000));
                claims.forEach((k,v) -> builder.withClaim(k,v));
            return builder.sign(algorithm).toString();
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e1) {
            throw new RuntimeException(e1);
        }
    }
    /**
     * 通过前台传来的token种获得用户名和密码
     * **/
    public static Map<String,String> verifyToken(String token){
        Algorithm algorithm=null;
        try {
            algorithm=Algorithm.HMAC256(SECRET);
        } catch (UnsupportedEncodingException e1) {
            throw new RuntimeException(e1);
        }
        JWTVerifier verifier=JWT.require(algorithm).withIssuer(ISSUER).build();
        DecodedJWT jwt=verifier.verify(token);
        Map<String, Claim> map=jwt.getClaims();
        Map<String,String> resultMap=new HashMap<>();
        map.forEach((k,v) -> resultMap.put(k,v.asString()));
        return resultMap;
    }
//    /**
//     * 验证token是否失效
//     * **/
//    public boolean isTokenExpired(String token){
//        try {
//            Date date=
//        }catch (){}
//    }
}
