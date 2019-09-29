package composition;

public class Animal {
	
	private Head head;
	private Body body;
	
	
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	
	
	public Body getBody() {
		return body;
	}
	public void setBody(String type, int legs) {
		this.body = new Body(type, legs);
	}
	
	

}
