import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class car extends Vehicle implements KeyListener{
	public car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x+10,y+25,15,15);
		frame.fillOval(x+35,y+25,15,15);
		frame.fillRect(x,y+15,60,15);
		frame.fillRect(x+10,y,40,20);

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// 文字が入力された場合
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// キーを押されたとき
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=-8;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=8;
		}
		
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			vy=-8;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			vy=+8;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// キーを離した時
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=0;
		}
		
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			vy=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			vy=0;
		}
	}
}

