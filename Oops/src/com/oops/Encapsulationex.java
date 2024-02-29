package com.oops;
class product{
	private int id;
	private String pname;
	private int prise;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	
}

public class Encapsulationex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p1=new product();
		p1.setId(101);
		p1.setPname("speackers");
		p1.setPrise(3000);
		System.out.println(p1.getId()+" "+p1.getPname()+" "+p1.getPrise());
	}

}
