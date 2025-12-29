/** 
* プログラム名：
* 作成者： 
* 作成日： Mon Dec 29 05:33:14 GMT+09:00 2025
*/
public class Final extends Turtle {
	public static void main(  String[] args){
		Turtle.startTurtle(new Final(),args);
	}
	public void start() {
		hide();
		window.size(800,600);
		ImageTurtle player = new ImageTurtle("kappa.png");
		player.scale(0.1);
		player.warp(400,500);

		ImageTurtle cucumber = new ImageTurtle("cucumber.png");
		cucumber.scale(0.1);
		cucumber.warp(300,400);

		ImageTurtle rain = new ImageTurtle("rain.png");
		rain.scale(0.05);
		rain.warp(400,500);

		ImageTurtle con1 = new ImageTurtle("con1.png");
		con1.scale(0.1);
		con1.warp(400,200);
		
		while(true){
			sleep(0.025);
			
			if(key() == 37){
				player.warp(player.getX() - 10,player.getY());
			}
			if(key() == 39){
				player.warp(player.getX() + 10,player.getY());
			}
			
			rain.move(0,7);
			cucumber.move(0,4);
			con1.move(0,9);
			
			if(rain.getY()>600){
				rain.warp(random(800),0);
			}
			if(cucumber.getY()>600){
				cucumber.warp(random(800),-200);
			}
			if(con1.getY()>600){
				con1.warp(random(800),-100);
			}
			
			/*if(player.distance(rain)<40){
				rain.warp(random(800),0);
			}
			if(player.distance(cucumber)<40){
				cucumber.warp(random(800),-200);
			}
			if(player.distance(con1)<40){
				con1.warp(random(800),-100);
			}*/
			update();
		}
	}//         @(50, 50) [open]
	
}