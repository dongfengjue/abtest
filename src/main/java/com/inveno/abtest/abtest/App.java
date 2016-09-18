package com.inveno.abtest.abtest;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;

import com.inveno.hotoday.common.thrift.color.ABDyeingReply;
import com.inveno.hotoday.common.thrift.color.ABDyeingRequest;
import com.inveno.hotoday.common.thrift.color.ABDyeingService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "app start !" );
        
        
    	String uid = Constants.UID;
		String app = Constants.PRODUCT_ID;
		String app_ver = Constants.APP_VER;
		
		System.out.println("===uid & product_id & app_ver"+uid+"&"+app+"&"+app_ver+"&");
		
		String colorABDyeingReplyStr = null;
		
		if(StringUtils.isNotBlank(uid)&&StringUtils.isNotBlank(app)&&StringUtils.isNotBlank(app_ver)){
			List<String> _types = new ArrayList<String>();
			ABDyeingRequest aBDyeingRequest = new ABDyeingRequest();
			aBDyeingRequest.setApp(app);
			aBDyeingRequest.setApp_ver(app_ver);
			_types.add("ad");
			_types.add("news");
			_types.add("biz");
			_types.add("un_know");
			
			aBDyeingRequest.set_types(_types);
			colorABDyeingReplyStr = singleDyeing(uid, aBDyeingRequest);
			
			
			ABDyeingReply aBDyeingReply = ThriftUtil.deserialize(colorABDyeingReplyStr);
					
			        	
			System.out.println("=== colorABDyeingReplyStr ==="+aBDyeingReply.toString());
		}
    }
    
    public static String singleDyeing(String uid ,ABDyeingRequest aBDyeingRequest){
		
		TFramedTransport transport = null;
		transport = new TFramedTransport(new TSocket(Constants.COLOR_THRIFT_IP.trim(), Integer.parseInt(Constants.COLOR_THRIFT_PORT.trim()), 120000));
		TProtocol protocol = new TBinaryProtocol(transport);
		ABDyeingService.Client client = new ABDyeingService.Client( protocol);
			
		try {
			
				transport.open();
				ABDyeingReply colorABDyeingReply = client.dyeing(uid,aBDyeingRequest);
				
				return ThriftUtil.serialize(colorABDyeingReply);
			
			} catch (TException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				transport.close();
			}
		
		return null;
	}
}
