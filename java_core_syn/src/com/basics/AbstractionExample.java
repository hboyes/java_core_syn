package com.basics;

@FunctionalInterface
interface InterfaceDemo {
	void displayNetflix();
	//you can have n number of default and static methods
	
	default void displayAllNewsChannels() {
		System.out.println("View list of news channels");
	}
	default void displayAllMusicChannels() {
		System.out.println("View list of music channels");
	}
	static void displayHomePage() {
		System.out.println("Homepage");
	}
}

abstract class AbstractDemo{
	
	abstract public void showChannels(); 
		
	public void display() {
		System.out.println("Display TV channels");
	}
}

public class AbstractionExample extends AbstractDemo implements InterfaceDemo {

	@Override
	public void showChannels() {
		System.out.println("List of TV channels..");
	}

	@Override
	public void displayNetflix() {
		System.out.println("List of netflix users");
	}
}

class Main {
	public static void main(String[] args) {
		AbstractionExample abs = new AbstractionExample();
		abs.display();
		abs.showChannels();
		abs.displayAllMusicChannels();
		abs.displayAllNewsChannels();
		abs.displayNetflix();
	}
}
