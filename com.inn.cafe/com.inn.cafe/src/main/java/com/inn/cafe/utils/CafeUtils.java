package com.inn.cafe.utils;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.google.common.base.Strings;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CafeUtils {
	
	private CafeUtils() {
		
	}
	
	public static ResponseEntity<String> getResponseEntity(String message,HttpStatus httpStatus){
		return new ResponseEntity<String>("{\"message\":\""+message+"\"}",httpStatus);
	}
	
	public static String getUUID() {
		Date date = new Date();
		long time = date.getTime();
		return "BILL-"+time;
	}
	
	public static JSONArray getJsonArrayFromString(String data) throws JSONException{
		JSONArray jsonArray = new JSONArray(data);
		return jsonArray;
	}
	
	public static Map<String,Object> getMapFromJson(String data){
		if(!Strings.isNullOrEmpty(data))
			return new Gson().fromJson(data, new TypeToken<Map<String,Object>>(){
				
			}.getType());
		
		return new HashMap<String, Object>();
	}
	
	public static boolean isFileExist(String path) {
		log.info("inside isFIleExist {}",path);
		try {
			File file=new File(path);
			
			return (file!=null && file.exists()) ? true:false;
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return false;
	}
}
