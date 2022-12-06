package Lab9;

import java.io.Serializable;

import Lab9.Message;
import Lab9.Protocol;


public class MessageDisconnect extends Message implements Serializable 
{
	
	private static final long serialVersionUID = 1L;
	
	public MessageDisconnect() 
	{
		super( Protocol.CMD_DISCONNECT );
	}
	
}

