
public class FttP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vai Corinthians!!!");
		
		Calc c = new Calc();
		c.setX(10);
		c.setY(1);
		
		System.out.println(c.add());
	
	} //main

} //FttP1

class Calc {
	
	int x, y;

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	public int add() {
		
		return this.getX() + this.getY();
	
	} //add
	
} //Calc
