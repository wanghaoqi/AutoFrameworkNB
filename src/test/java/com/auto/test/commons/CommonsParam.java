package com.auto.test.commons;

import java.util.Map;

import com.auto.test.util.ParamTool;

/**
 * @author gaohuan
 *
 * 2016年9月14日下午8:22:56
 */
public class CommonsParam {
	public static Map<String,Object>getloginParm(){		
		return ParamTool.login_param();
	}	
	
	
	public static Map<String,Object> getsearchParm(){
		
		return ParamTool.createSearch_param();
	}
}
