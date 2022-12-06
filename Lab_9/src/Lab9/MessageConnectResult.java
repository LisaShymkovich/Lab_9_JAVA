package Lab9;

import java.io.Serializable;

import Lab9.MessageResult;
import Lab9.Protocol;


public class MessageConnectResult extends MessageResult implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public MessageConnectResult( String errorMessage ) { // Error
		super( Protocol.CMD_CONNECT, errorMessage );
	}
	
	public MessageConnectResult() { // No error
		super( Protocol.CMD_CONNECT );
	}
}