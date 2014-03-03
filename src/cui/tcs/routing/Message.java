package cui.tcs.routing;

public class Message {

	private String header;
	private String payload;
	
	public void setHeader(String header){
		this.header =  header;
	}
	
	public void setPayload(String payload){
		this.payload = payload;
	}
	
	public String getHeader(){
		return header;
	}
	
	public String getPayload(){
		return payload;
	}
}
