// creating class Elder for semicolon
// author Lemon

public class Elder {

	public static void main(String[] args){
		Elder nonso = new Elder();

		nonso.setfulname ("nonso okoroafor");
		nonso.setcolor ("black");
		nonso.setpost ("software engineering");
		nonso.setid (5472);

		nonso.getfulname();
		nonso.getcolor();
		nonso.getpost();
		nonso.getid();

System.out.println(nonso.getfulname());
System.out.println(nonso.getcolor());
System.out.println(nonso.getpost());
System.out.println(nonso.getid());
	


}

	private String fulname;
	private String color;
	private String post;
	private int id;

	public void setfulname(String fulname){
		this.fulname = fulname;
	} 
	public String getfulname(){
		return fulname;
	}

	public void setcolor(String color){
		this.fulname = color;
	} 
	public String getcolor(){
		return color;
	}

	public void setpost(String post){
		this.post = post;
	} 
	public String getpost(){
		return post;
	}

	public void setid(int id){
		this.id = id;
	} 
	public int getid(){
		return id;
	}
}