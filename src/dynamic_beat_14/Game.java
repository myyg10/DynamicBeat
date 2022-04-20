package dynamic_beat_14;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.management.MBeanTrustPermission;
import javax.swing.ImageIcon;

public class Game extends Thread {

	private Image noteRouteLineImage = new ImageIcon(Main.class.getResource("../images/noteRouteLine.png")).getImage();
	private Image judgementLineImage = new ImageIcon(Main.class.getResource("../images/judgementLine.png")).getImage();
	private Image gameInfoImage = new ImageIcon(Main.class.getResource("../images/gameInfo.png")).getImage();
	private Image noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	
	private String titleName;
	private String difficulty;
	private String musicTitle;
	private Music gameMusic;
	
	ArrayList<Note> noteList = new ArrayList<Note>();
	
	public Game(String titleNmae, String difficulty, String musicTitle) {
		this.titleName = titleNmae;
		this.difficulty = difficulty;
		this.musicTitle = musicTitle;
		gameMusic = new Music(this.musicTitle, false);
	}
	
	public void screenDraw(Graphics2D g) {
		g.drawImage(noteRouteSImage, 228, 30, null);
		g.drawImage(noteRouteDImage, 332, 30, null);
		g.drawImage(noteRouteFImage, 436, 30, null);
		g.drawImage(noteRouteSpace1Image, 540, 30, null);
		g.drawImage(noteRouteSpace2Image, 640, 30, null);
		g.drawImage(noteRouteJImage, 744, 30, null);
		g.drawImage(noteRouteKImage, 848, 30, null);
		g.drawImage(noteRouteLImage, 952, 30, null);
		g.drawImage(noteRouteLineImage, 224, 30, null);
		g.drawImage(noteRouteLineImage, 328, 30, null);
		g.drawImage(noteRouteLineImage, 432, 30, null);
		g.drawImage(noteRouteLineImage, 536, 30, null);
		g.drawImage(noteRouteLineImage, 740, 30, null);
		g.drawImage(noteRouteLineImage, 844, 30, null);
		g.drawImage(noteRouteLineImage, 948, 30, null);
		g.drawImage(noteRouteLineImage, 1052, 30, null);
		g.drawImage(gameInfoImage, 0, 660, null);
		g.drawImage(judgementLineImage, 0, 580, null);
		for(int i = 0; i < noteList.size(); i++)
		{
			Note note = noteList.get(i);
			note.screenDraw(g);
		}
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString(titleName, 20, 702);
		g.drawString(difficulty, 1190, 702);
		g.setFont(new Font("Arial", Font.PLAIN, 26));
		g.setColor(Color.DARK_GRAY);
		g.drawString("S", 270, 609);
		g.drawString("D", 374, 609);
		g.drawString("F", 478, 609);
		g.drawString("Space Bar", 580, 609);
		g.drawString("J", 784, 609);
		g.drawString("K", 889, 609);
		g.drawString("L", 993, 609);
		g.setColor(Color.LIGHT_GRAY);
		g.setFont(new Font("Elephant", Font.BOLD, 30));
		g.drawString("000000", 565, 702);
		
	}
	
	public void pressS() {
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumclap.mp3", false).start();
	}
	
	public void releaseS() {
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressD() {
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumsnare.mp3", false).start();
	}
	
	public void releaseD() {
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressF() {
		noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumchihat.mp3", false).start();
	}
	
	public void releaseF() {
		noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressSpace() {
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumcrash.mp3", false).start();
	}
	
	public void releaseSpace() {
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressJ() {
		noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumohihat.mp3", false).start();
	}
	
	public void releaseJ() {
		noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressK() {
		noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumkick.mp3", false).start();
	}
	
	public void releaseK() {
		noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressL() {
		noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumride.mp3", false).start();
	}
	
	public void releaseL() {
		noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	@Override
	public void run() {
		dropNotes();
	}
	
	public void close() {
		gameMusic.close();
		this.interrupt();
	}
	
	public void dropNotes() {
		Beat[] beats = null;
		if(titleName.equals("Stuff - AShamaluevMusic")) {
			int startTime = 13000 - Main.REACH_TIME * 1000;
			int gap = 200;
			beats = new Beat[] {
					new Beat(startTime, "Space"), //시작
					new Beat(startTime + gap * 4, "S"),  //4
					new Beat(startTime + gap * 10, "K"), //6
					new Beat(startTime + gap * 12, "S"), //2
					new Beat(startTime + gap * 16, "K"), //4
					new Beat(startTime + gap * 20, "S"), //4
					new Beat(startTime + gap * 26, "K"), //6
					new Beat(startTime + gap * 28, "S"), //2
					new Beat(startTime + gap * 29, "K"), //1
					
					new Beat(startTime + gap * 32, "L"), //시작
					new Beat(startTime + gap * 36, "S"), //4
					new Beat(startTime + gap * 42, "K"), //6
					new Beat(startTime + gap * 44, "S"), //2
					new Beat(startTime + gap * 48, "K"), //4
					new Beat(startTime + gap * 52, "S"), //4
					new Beat(startTime + gap * 58, "K"), //6
					new Beat(startTime + gap * 60, "S"), //2
					new Beat(startTime + gap * 61, "K"), //1
					
					new Beat(startTime + gap * 64, "L"), //시작
					new Beat(startTime + gap * 66, "J"), //2
					new Beat(startTime + gap * 68, "S"), //2
					new Beat(startTime + gap * 70, "J"), //2
					new Beat(startTime + gap * 72, "J"), //2
					new Beat(startTime + gap * 74, "K"), //2
					new Beat(startTime + gap * 76, "S"), //2
					new Beat(startTime + gap * 78, "J"), //2
					new Beat(startTime + gap * 80, "K"), //2
					new Beat(startTime + gap * 82, "J"), //2
					new Beat(startTime + gap * 84, "S"), //2
					new Beat(startTime + gap * 86, "J"), //2
					new Beat(startTime + gap * 88, "J"), //2
					new Beat(startTime + gap * 90, "K"), //2
					new Beat(startTime + gap * 92, "S"), //2
					new Beat(startTime + gap * 93, "K"), //1
					
					new Beat(startTime + gap * 96, "L"), //시작
					new Beat(startTime + gap * 98, "J"), //2
					new Beat(startTime + gap * 100, "S"), //2
					new Beat(startTime + gap * 102, "J"), //2
					new Beat(startTime + gap * 104, "J"), //2
					new Beat(startTime + gap * 106, "K"), //2
					new Beat(startTime + gap * 108, "S"), //2
					new Beat(startTime + gap * 110, "J"), //2
					new Beat(startTime + gap * 112, "K"), //2
					new Beat(startTime + gap * 114, "J"), //2
					new Beat(startTime + gap * 116, "S"), //2
					new Beat(startTime + gap * 118, "J"), //2
					new Beat(startTime + gap * 120, "J"), //2
					new Beat(startTime + gap * 122, "K"), //2
					new Beat(startTime + gap * 124, "S"), //2
					new Beat(startTime + gap * 125, "K"), //1
					
					new Beat(startTime + gap * 128, "L"), //1
					
					// 쉬어가기
					
					new Beat(startTime + gap * 192, "Space"), //시작
					new Beat(startTime + gap * 196, "S"),  //4
					new Beat(startTime + gap * 202, "K"), //6
					new Beat(startTime + gap * 204, "S"), //2
					new Beat(startTime + gap * 208, "K"), //4
					new Beat(startTime + gap * 212, "S"), //4
					new Beat(startTime + gap * 218, "K"), //6
					new Beat(startTime + gap * 220, "S"), //2
					new Beat(startTime + gap * 221, "K"), //1
					
					new Beat(startTime + gap * 224, "L"), //시작
					new Beat(startTime + gap * 228, "S"), //4
					new Beat(startTime + gap * 234, "K"), //6
					new Beat(startTime + gap * 236, "S"), //2
					new Beat(startTime + gap * 240, "K"), //4
					new Beat(startTime + gap * 244, "S"), //4
					new Beat(startTime + gap * 250, "K"), //6
					new Beat(startTime + gap * 252, "S"), //2
					new Beat(startTime + gap * 253, "K"), //1
			};
		}
		else if(titleName.equals("Bold - AShamaluevMusic")) {
			int startTime = 1000 - Main.REACH_TIME * 1000;
			beats = new Beat[] {
					new Beat(startTime, "Space"),
			};
		}
		else if(titleName.equals("Vip - AShamaluevMusic")) {
			int startTime = 1000 - Main.REACH_TIME * 1000;
			beats = new Beat[] {
					new Beat(startTime, "Space"),
			};
		}
		int i = 0;
		gameMusic.start();
		while(i < beats.length && !isInterrupted()) {
			boolean dropped = false;
			if(beats[i].getTime() <= gameMusic.getTime()) {
				Note note = new Note(beats[i].getNoteName());
				note.start();
				noteList.add(note);
				i++;
				dropped = true;
			}
			if(!dropped) {
				try {
					Thread.sleep(5);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
 }
