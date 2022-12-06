package Lab9;

import java.io.Serializable;

import Lab9.Message;
import Lab9.Protocol;


public class MessageLetter extends Message implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public String ord;
	public String address;
	
	public MessageLetter( String ord, String txt ) {
		
		super( Protocol.CMD_ORDER );
		this.ord = ord;
		this.address = txt;
	}
	
}