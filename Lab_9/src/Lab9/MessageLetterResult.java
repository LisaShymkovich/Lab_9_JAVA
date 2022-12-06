package Lab9;

import java.io.Serializable;

import Lab9.MessageResult;
import Lab9.Protocol;


public class MessageLetterResult extends MessageResult implements Serializable {

	private static final long serialVersionUID = 1L;
	
//	public MessageLetterResult( String errorMessage ) { //Error
//		
//		super( Protocol.CMD_LETTER, errorMessage );
//	}
//	
	public MessageLetterResult() 
	{ // No errors
		
		super( Protocol.CMD_ORDER );
	}
}