package com.basics;

class Remote {

	int id;
	String name;
	
	protected void openNetflix() {
		System.out.println("netflix opened");
	}
	
}

class Mobile extends Remote{
	public void openHotstar() {
		System.out.println("hotstar opened");
	}
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.openHotstar();
		mobile.openNetflix();
	}
}


