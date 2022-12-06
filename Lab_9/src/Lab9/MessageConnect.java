package Lab9;

import java.io.Serializable;

import Lab9.Message;
import Lab9.Protocol;



public class MessageConnect extends Message implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public String userNic;
	public String userFullName;
	
	public MessageConnect( String userNic, String userFullName )
	{
		super( Protocol.CMD_CONNECT );
		this.userNic = userNic;
		this.userFullName = userFullName;
	}
	
}