
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.util.Random;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private ArrayList<JLabel> keys,keyPress;
	private ArrayList<String> palabras,palabra;
	private ArrayList<Character> textoEscrito;
	private ThreadGame game;
	private KeyEvent event;
	private boolean start;

	/**
	 * Create the frame.
	 */
	public Ventana() {
		start = false;
		keys = new ArrayList<JLabel>();
		keyPress = new ArrayList<JLabel>();
		palabras = new ArrayList<String>();
		palabra = new ArrayList<String>();
		textoEscrito = new ArrayList<Character>();
		palabras.add("LAPIZ");
		palabras.add("CABEZA");
		palabras.add("SUPERCALIFRAGILISTICOESPIALIDOSO");
		palabras.add("GASOLINA");
		palabras.add("SISTEMA SOLAR");
		palabras.add("ESTERNOCLEIDOMASTOIDEO");
		palabras.add("IMPOSTOR");
		palabras.add("CALIFICACION");
		palabras.add("YOYO");
		palabras.add("VOLCAN DE PARANGARICUTIRIMICUARO");
		
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				tecla(e);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		setTitle("Juego de Palabras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(127, 255, 0));
		panel.setBorder(new EmptyBorder(40, 100, 40, 100));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Esperando...");
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 40));
		panel.add(lblNewLabel, BorderLayout.WEST);
		
		JLabel timerLabel = new JLabel("0");
		timerLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 55));
		panel.add(timerLabel, BorderLayout.EAST);
		
		JLabel lblNewLabel_4 = new JLabel("¡Presiona ENTER para empezar a jugar!");
		lblNewLabel_4.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblNewLabel_4.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		panel.add(lblNewLabel_4, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 204, 255));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(60, 60, 60, 60));
		panel_2.setBackground(new Color(255, 255, 0));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(102, 204, 255));
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(3, 9, 0, 0));
		
		JLabel BotonA = new JLabel("A");
		BotonA.setOpaque(true);
		BotonA.setBackground(new Color(250, 250, 210));
		BotonA.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonA.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonA.setHorizontalAlignment(SwingConstants.CENTER);
		BotonA.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonA);
		keys.add(BotonA);
		
		JLabel BotonB = new JLabel("B");
		BotonB.setOpaque(true);
		BotonB.setBackground(new Color(250, 250, 210));
		BotonB.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonB.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonB.setHorizontalAlignment(SwingConstants.CENTER);
		BotonB.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonB);
		keys.add(BotonB);
		
		JLabel BotonC = new JLabel("C");
		BotonC.setOpaque(true);
		BotonC.setBackground(new Color(250, 250, 210));
		BotonC.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonC.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonC.setHorizontalAlignment(SwingConstants.CENTER);
		BotonC.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonC);
		keys.add(BotonC);
		
		JLabel BotonD = new JLabel("D");
		BotonD.setOpaque(true);
		BotonD.setBackground(new Color(250, 250, 210));
		BotonD.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonD.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonD.setHorizontalAlignment(SwingConstants.CENTER);
		BotonD.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonD);
		keys.add(BotonD);
		
		JLabel BotonE = new JLabel("E");
		BotonE.setOpaque(true);
		BotonE.setBackground(new Color(250, 250, 210));
		BotonE.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonE.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonE.setHorizontalAlignment(SwingConstants.CENTER);
		BotonE.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonE);
		keys.add(BotonE);
		
		JLabel BotonF = new JLabel("F");
		BotonF.setOpaque(true);
		BotonF.setBackground(new Color(250, 250, 210));
		BotonF.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonF.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonF.setHorizontalAlignment(SwingConstants.CENTER);
		BotonF.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonF);
		keys.add(BotonF);
		
		JLabel BotonG = new JLabel("G");
		BotonG.setOpaque(true);
		BotonG.setBackground(new Color(250, 250, 210));
		BotonG.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonG.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonG.setHorizontalAlignment(SwingConstants.CENTER);
		BotonG.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonG);
		keys.add(BotonG);
		
		JLabel BotonH = new JLabel("H");
		BotonH.setOpaque(true);
		BotonH.setBackground(new Color(250, 250, 210));
		BotonH.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonH.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonH.setHorizontalAlignment(SwingConstants.CENTER);
		BotonH.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonH);
		keys.add(BotonH);
		
		JLabel BotonI = new JLabel("I");
		BotonI.setOpaque(true);
		BotonI.setBackground(new Color(250, 250, 210));
		BotonI.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonI.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonI.setHorizontalAlignment(SwingConstants.CENTER);
		BotonI.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonI);
		keys.add(BotonI);
		
		JLabel BotonJ = new JLabel("J");
		BotonJ.setOpaque(true);
		BotonJ.setBackground(new Color(250, 250, 210));
		BotonJ.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonJ.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonJ.setHorizontalAlignment(SwingConstants.CENTER);
		BotonJ.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonJ);
		keys.add(BotonJ);
		
		JLabel BotonK = new JLabel("K");
		BotonK.setOpaque(true);
		BotonK.setBackground(new Color(250, 250, 210));
		BotonK.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonK.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonK.setHorizontalAlignment(SwingConstants.CENTER);
		BotonK.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonK);
		keys.add(BotonK);
		
		JLabel BotonL = new JLabel("L");
		BotonL.setOpaque(true);
		BotonL.setBackground(new Color(250, 250, 210));
		BotonL.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonL.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonL.setHorizontalAlignment(SwingConstants.CENTER);
		BotonL.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonL);
		keys.add(BotonL);
		
		JLabel BotonM = new JLabel("M");
		BotonM.setOpaque(true);
		BotonM.setBackground(new Color(250, 250, 210));
		BotonM.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonM.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonM.setHorizontalAlignment(SwingConstants.CENTER);
		BotonM.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonM);
		keys.add(BotonM);
		
		JLabel BotonN = new JLabel("N");
		BotonN.setOpaque(true);
		BotonN.setBackground(new Color(250, 250, 210));
		BotonN.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonN.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonN.setHorizontalAlignment(SwingConstants.CENTER);
		BotonN.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonN);
		keys.add(BotonN);
		
		JLabel BotonÑ = new JLabel("Ñ");
		BotonÑ.setOpaque(true);
		BotonÑ.setBackground(new Color(250, 250, 210));
		BotonÑ.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonÑ.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonÑ.setHorizontalAlignment(SwingConstants.CENTER);
		BotonÑ.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonÑ);
		keys.add(BotonÑ);
		
		JLabel BotonO = new JLabel("O");
		BotonO.setOpaque(true);
		BotonO.setBackground(new Color(250, 250, 210));
		BotonO.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonO.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonO.setHorizontalAlignment(SwingConstants.CENTER);
		BotonO.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonO);
		keys.add(BotonO);
		
		JLabel BotonP = new JLabel("P");
		BotonP.setOpaque(true);
		BotonP.setBackground(new Color(250, 250, 210));
		BotonP.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonP.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonP.setHorizontalAlignment(SwingConstants.CENTER);
		BotonP.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonP);
		keys.add(BotonP);
		
		JLabel BotonQ = new JLabel("Q");
		BotonQ.setOpaque(true);
		BotonQ.setBackground(new Color(250, 250, 210));
		BotonQ.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonQ.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonQ.setHorizontalAlignment(SwingConstants.CENTER);
		BotonQ.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonQ);
		keys.add(BotonQ);
		
		JLabel BotonR = new JLabel("R");
		BotonR.setOpaque(true);
		BotonR.setBackground(new Color(250, 250, 210));
		BotonR.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonR.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonR.setHorizontalAlignment(SwingConstants.CENTER);
		BotonR.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonR);
		keys.add(BotonR);
		
		JLabel BotonS = new JLabel("S");
		BotonS.setOpaque(true);
		BotonS.setBackground(new Color(250, 250, 210));
		BotonS.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonS.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonS.setHorizontalAlignment(SwingConstants.CENTER);
		BotonS.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonS);
		keys.add(BotonS);
		
		JLabel BotonT = new JLabel("T");
		BotonT.setOpaque(true);
		BotonT.setBackground(new Color(250, 250, 210));
		BotonT.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonT.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonT.setHorizontalAlignment(SwingConstants.CENTER);
		BotonT.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonT);
		keys.add(BotonT);
		
		JLabel BotonU = new JLabel("U");
		BotonU.setOpaque(true);
		BotonU.setBackground(new Color(250, 250, 210));
		BotonU.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonU.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonU.setHorizontalAlignment(SwingConstants.CENTER);
		BotonU.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonU);
		keys.add(BotonU);
		
		JLabel BotonV = new JLabel("V");
		BotonV.setOpaque(true);
		BotonV.setBackground(new Color(250, 250, 210));
		BotonV.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonV.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonV.setHorizontalAlignment(SwingConstants.CENTER);
		BotonV.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonV);
		keys.add(BotonV);
		
		JLabel BotonW = new JLabel("W");
		BotonW.setOpaque(true);
		BotonW.setBackground(new Color(250, 250, 210));
		BotonW.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonW.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonW.setHorizontalAlignment(SwingConstants.CENTER);
		BotonW.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonW);
		keys.add(BotonW);
		
		JLabel BotonX = new JLabel("X");
		BotonX.setOpaque(true);
		BotonX.setBackground(new Color(250, 250, 210));
		BotonX.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonX.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonX.setHorizontalAlignment(SwingConstants.CENTER);
		BotonX.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonX);
		keys.add(BotonX);
		
		JLabel BotonY = new JLabel("Y");
		BotonY.setOpaque(true);
		BotonY.setBackground(new Color(250, 250, 210));
		BotonY.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonY.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonY.setHorizontalAlignment(SwingConstants.CENTER);
		BotonY.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonY);
		keys.add(BotonY);
		
		JLabel BotonZ = new JLabel("Z");
		BotonZ.setOpaque(true);
		BotonZ.setBackground(new Color(250, 250, 210));
		BotonZ.setFont(new Font("Microsoft JhengHei", Font.BOLD, 50));
		BotonZ.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonZ.setHorizontalAlignment(SwingConstants.CENTER);
		BotonZ.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(BotonZ);
		keys.add(BotonZ);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(20, 60, 20, 100));
		panel_4.setBackground(new Color(173, 255, 47));
		contentPane.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel BotonEspacio = new JLabel("[___________________________]");
		BotonEspacio.setBackground(new Color(250, 250, 210));
		BotonEspacio.setOpaque(true);
		BotonEspacio.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonEspacio.setFont(new Font("Arial Black", Font.PLAIN, 40));
		BotonEspacio.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(BotonEspacio, BorderLayout.WEST);
		keys.add(BotonEspacio);
		
		JLabel BotonBorrado = new JLabel("Borrado");
		BotonBorrado.setBackground(new Color(250, 250, 210));
		BotonBorrado.setOpaque(true);
		BotonBorrado.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		BotonBorrado.setFont(new Font("Arial Black", Font.PLAIN, 30));
		panel_4.add(BotonBorrado, BorderLayout.EAST);
		keys.add(BotonBorrado);
		
		////////////////////////////////////////
		
		game = new ThreadGame(timerLabel,new Runnable() {
			@Override
			public void run() {
				synchronized (Thread.currentThread()) {
					Random random = new Random();
					JLabel label;
					while(game.isRunning()) {
						if(event != null) {
							clearColorKey();
							switch(event.getKeyCode()) {
								case 65:
									label = keys.get(keys.indexOf(BotonA));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 66:
									label = keys.get(keys.indexOf(BotonB));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 67:
									label = keys.get(keys.indexOf(BotonC));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 68:
									label = keys.get(keys.indexOf(BotonD));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 69:
									label = keys.get(keys.indexOf(BotonE));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 70:
									label = keys.get(keys.indexOf(BotonF));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 71:
									label = keys.get(keys.indexOf(BotonG));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 72:
									label = keys.get(keys.indexOf(BotonH));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 73:
									label = keys.get(keys.indexOf(BotonI));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 74:
									label = keys.get(keys.indexOf(BotonJ));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 75:
									label = keys.get(keys.indexOf(BotonK));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 76:
									label = keys.get(keys.indexOf(BotonL));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 77:
									label = keys.get(keys.indexOf(BotonM));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 78:
									label = keys.get(keys.indexOf(BotonN));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 0:
									label = keys.get(keys.indexOf(BotonÑ));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 79:
									label = keys.get(keys.indexOf(BotonO));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 80:
									label = keys.get(keys.indexOf(BotonP));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 81:
									label = keys.get(keys.indexOf(BotonQ));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 82:
									label = keys.get(keys.indexOf(BotonR));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 83:
									label = keys.get(keys.indexOf(BotonS));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 84:
									label = keys.get(keys.indexOf(BotonT));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 85:
									label = keys.get(keys.indexOf(BotonU));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 86:
									label = keys.get(keys.indexOf(BotonV));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 87:
									label = keys.get(keys.indexOf(BotonW));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 88:
									label = keys.get(keys.indexOf(BotonX));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 89:
									label = keys.get(keys.indexOf(BotonY));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 90:
									label = keys.get(keys.indexOf(BotonZ));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 32:
									label = keys.get(keys.indexOf(BotonEspacio));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
								case 8:
									label = keys.get(keys.indexOf(BotonBorrado));
									label.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
									keyPress.add(label);
									break;
									
							}
							
							if(start) {
								if(event.getKeyCode() != 8) {
									textoEscrito.add((char) event.getKeyCode());
								} else if(textoEscrito.size() != 0) {
									textoEscrito.remove(textoEscrito.size()-1);
								}
								
								String text = unirTexto(textoEscrito);
								
								lblNewLabel.setText(text);
								if(comprobarPalabra(text)) {
									palabra.remove(0);
									String tiempoCompletado = game.getTime();
									game.stopTimer();
									JOptionPane.showMessageDialog(getContentPane(),"Has completado la palabra en " + tiempoCompletado + " segundos","Juego de Palabras",JOptionPane.PLAIN_MESSAGE);
									iniciarRonda(lblNewLabel_4,lblNewLabel);
								}
							}
							
							if(!start && event.getKeyCode() == 10) {
								start = true;
								iniciarRonda(lblNewLabel_4,lblNewLabel);
							}
							event = null;
						}
					}
				}
			}
		});
		game.startGame();
	}
	
	public void tecla(KeyEvent event) {
		this.event = event;
	}
	
	public void clearColorKey() {
		for(JLabel l : keyPress) {
			l.setBackground(new Color(250, 250, 210));
		}
	}
	
	public void iniciarRonda(JLabel palabraLabel, JLabel teclado) {
		textoEscrito.clear();
		Random random = new Random();
		String text = palabras.get(random.nextInt(10));
		palabra.add(text);
		palabraLabel.setText(text);
		teclado.setText("");
		
		game.startTimer();
	}
	
	public boolean comprobarPalabra(String texto) {
		if(texto.equalsIgnoreCase(palabra.get(0))) {
			return true;
		}
		return false;
	}
	
	public String unirTexto(ArrayList<Character> arrayList) {
		StringBuilder builder = new StringBuilder();
	    for (char letra : arrayList) {
	    	builder.append(letra);
	    }
	    return builder.toString();
	}

}
