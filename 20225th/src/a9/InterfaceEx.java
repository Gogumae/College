package a9;

interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}

interface MobilePhoneInterface extends PhoneInterface {
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface {
	public void play();
	public void stop();
}

class PDA {
	public int calculate(int x, int y) {
	return x + y; }
}

class Smartphone extends PDA implements MobilePhoneInterface, MP3Interface {
	@Override
	public void sendCall() {
		System.out.println("RingRing");
	}
	@Override
	public void receiveCall() {
		System.out.println("Here's call");
	}
	@Override
	public void sendSMS() {
		System.out.println("Send SMS");
	}
	@Override
	public void receiveSMS() {
		System.out.println("Receiving SMSs");
	}
	@Override
	public void play() {
		System.out.println("Starting Music");
	}
	@Override
	public void stop() {
		System.out.println("Stop Music");
	}
	public void schedule() {
		System.out.println("Your Schedule");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		Smartphone phone = new Smartphone();
		phone.printLogo();
		phone.receiveCall();
		phone.stop();
		System.out.println("521 + 566 = " + phone.calculate(521,566));
		phone.schedule();
	}
}