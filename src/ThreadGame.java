import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ThreadGame {
	
	private Thread game;
	private Timer timer;
	private int milisegundos,segundos;
	private volatile boolean running;
	private JLabel timerLabel;
	private long startMilis;
	
	public ThreadGame(JLabel labelTimer,Runnable runnable) {
		game = new Thread(runnable);
		timerLabel = labelTimer;
		milisegundos = 0;
		segundos = 0;
	}
	
	public boolean startGame() {
		milisegundos = 0;
		segundos = 0;
		
		if(!running) {
			running = true;
			game.start();
		}
		return false;
	}
	
	public boolean stopGame() {
		if(running) {
			running = false;
			game.interrupt();
			return true;
		}
		return false;
	}
	
	public void startTimer() {
		timer = new Timer(0,(ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				milisegundos = (int) (System.currentTimeMillis() - startMilis);
				if(milisegundos > 1000) {
					segundos++;
					milisegundos = 999;
					startMilis = System.currentTimeMillis();
				}
                timerLabel.setText(String.format("%01d:%03d", segundos, milisegundos));
			}
			
		});
		startMilis = System.currentTimeMillis();
		timer.start();
	}
	
	public void stopTimer() {
		timer.stop();
		milisegundos = 0;
		segundos = 0;
	}

	public boolean isRunning() {
		return running;
	}

	public String getTime() {
		return segundos + "." + milisegundos;
	}

}
