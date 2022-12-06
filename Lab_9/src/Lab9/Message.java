package Lab9;

import java.io.Serializable;

import Lab9.Protocol;

public class Message implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	private byte id;
	public byte getID() {
		return id;
	}
	
	protected Message() {
		assert( false );
	}
	
	protected Message( byte id ) {
		
		assert( Protocol.validID( id )== true );
		
		this.id = id;
	}
}