
public class maru extends MyFrame{
	public void run() {
		int x=50;
		int y=50;
		int h=50;
		int w=50;
		int r=255;
		int g=0;
		int b=0;
		
		while(true) {
			while(x<=180) {
				clear();
				setColor(r,g,b);
				fillOval(x,y,h,w);
				x+=5;
				h+=5;
				w+=8;
				
				b +=9;
				
				
				sleep(0.01);
				
			}
			while(y<=180) {
				clear();
				setColor(r,g,b);
				fillOval(x,y,h,w);
				y+=5;
				h-=5;
				w-=8;
				
				r-=9;
				sleep(0.01);
				
			}
			while(x>=50) {
				clear();
				setColor(r,g,b);
				fillOval(x,y,h,w);
				x-=5;
				h+=8;
				w+=5;
				
				b-=9;
				g+=9;
				sleep(0.01);
				
			}
			while(y>=50) {
				clear();
				setColor(r,g,b);
				fillOval(x,y,h,w);
				y-=5;
				h-=8;
				w-=5;
				
				g-=9;
				r+=9;
				sleep(0.01);
				
			}
		}
	}

}
