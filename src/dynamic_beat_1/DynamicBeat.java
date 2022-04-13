package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {

	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false); //사이즈 고정
		setLocationRelativeTo(null); //화면 가운데 출력
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료 버튼
		setVisible(true);
	}
}
