
class MessageSendingThread extends Thread {
	String message;
	
	public MessageSendingThread(String str, int prio) {
		message = str;
		setPriority(prio);
	}
	
	public void run() {
		for(int i=0; i<1000000; i++) {
			System.out.println(message + "(" + getPriority() + ")");
			try {
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MessageSendingThread tr1 = new MessageSendingThread("First", Thread.MAX_PRIORITY);
		MessageSendingThread tr2 = new MessageSendingThread("Second", Thread.NORM_PRIORITY);
		MessageSendingThread tr3 = new MessageSendingThread("Third", Thread.MIN_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();
	}
}
