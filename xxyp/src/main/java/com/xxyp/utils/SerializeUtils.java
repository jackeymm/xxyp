package com.xxyp.utils;

import java.io.*;

public class SerializeUtils {
	
	/**
	 *  序列化为二进制数组
	 * @param obj
	 * @return
	 */
	public static byte[] serialize(Object obj){
		if(obj == null){
			return null;
		}
		byte[] bs = null;
		ObjectOutputStream oos = null;
		ByteArrayOutputStream baos = null;
		try{
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(obj);
			bs = baos.toByteArray();
		}catch(Exception e){
			
		}
		finally{
			if(baos != null){
				try {
					baos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(oos != null){
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return bs;
	}
	
	public static Object unserialize(byte[] bs){
		ByteArrayInputStream bais = null;
		ObjectInputStream ois = null;
		try{
			bais = new ByteArrayInputStream(bs);
		    ois = new ObjectInputStream(bais);
			return ois.readObject();
		}catch(Exception e){
			
		}
		finally{
			if(ois != null){
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bais != null){
				try {
					bais.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}



}
