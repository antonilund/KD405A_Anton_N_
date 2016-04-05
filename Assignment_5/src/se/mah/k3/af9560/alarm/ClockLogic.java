package se.mah.k3.af9560.alarm;

import java.util.Calendar;

public class ClockLogic {
	Calendar myCal = Calendar.getInstance();
	//private DigitalClockGUI digitalClockGUI;
	static boolean on = true;
	private boolean alarmOn = false;
	protected int hour;
	protected int minute;
	protected int second;
	private String time;
	private int[] alarm = { 00, 00, 00 };
	
	public ClockLogic(DigitalClockGUI digitalClockGUI) {
		// TODO Auto-generated constructor stub
	}
	private class ClockThread extends Thread {
		public void run() {
			while (on == true) {
				try {
					System.out.println("Clock is ticking");
					System.out.println(second);
					System.out.println(myCal.get(Calendar.SECOND));
					System.out.println(myCal.get(Calendar.MINUTE));

					Thread.sleep(900);
					second = myCal.get(Calendar.SECOND);
					minute = myCal.get(Calendar.MINUTE);
					hour = myCal.get(Calendar.HOUR_OF_DAY);

					//setTimeOnLabel(Integer.toString(hour));
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}




	/**
	 * Thread with while loop for updating time
	 */
	Thread clockThread = new ClockThread();


	public void activateAlarm(boolean activate) {
		alarmOn = activate;
	}

	public String getTime() {
		//time = "12:00:00";
		time = ((Integer.toString(hour)) + " : " + Integer.toString(minute) + " : " + Integer.toString(second) + ":");
		return time;
	}

	public void setAlarm(int[] newAlarm) {
		alarm = newAlarm;
	}

	public String getAlarm() {
		return String.valueOf(alarm);
	}

}
