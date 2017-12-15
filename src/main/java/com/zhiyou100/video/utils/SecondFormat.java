package com.zhiyou100.video.utils;

public class SecondFormat {

	public static String secondFormat(Integer seconds){
		
		int temp=0;
		StringBuffer sb=new StringBuffer();
		temp = seconds/3600;
		sb.append((temp<10)?"0"+temp+":":""+temp+":");

		temp=seconds%3600/60;
		sb.append((temp<10)?"0"+temp+":":""+temp+":");

		temp=seconds%3600%60;
		sb.append((temp<10)?"0"+temp:""+temp);
		
		return sb.toString();
	}
	
}
