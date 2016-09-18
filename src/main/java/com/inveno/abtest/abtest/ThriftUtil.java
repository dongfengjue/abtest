package com.inveno.abtest.abtest;

import org.apache.thrift.TDeserializer;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TCompactProtocol;

import com.inveno.hotoday.common.thrift.color.ABDyeingReply;

/**
 * @author chenbing
 * @createtime 2016年9月5日
 * @see 
 * @since v1.0
 */
public class ThriftUtil {
	
	public static ABDyeingReply deserialize(String str){
		
			ABDyeingReply aBDyeingReply = new ABDyeingReply();
			// 反序列化 取出来 thrift TCompactProtocol 压缩规则
			TDeserializer deserializer = new TDeserializer(new TCompactProtocol.Factory());
		
			try {
				deserializer.deserialize(aBDyeingReply, str.getBytes());
			} catch (TException e) {
				e.printStackTrace();
				aBDyeingReply = null;
			}
			
			return aBDyeingReply;
	}
	
	public static String serialize(ABDyeingReply aBDyeingReply){
		
		String colorABDyeingReplyStr = "";
		
		try {
			// thrift 序列化
			TSerializer serializer = new TSerializer(new TCompactProtocol.Factory());
			colorABDyeingReplyStr = new String(serializer.serialize(aBDyeingReply));
			
		} catch (TException e) {
			e.printStackTrace();
		}
		
		return colorABDyeingReplyStr;
	}
	
}
