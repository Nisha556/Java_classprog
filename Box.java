package Class;

public class Box {
double weidth;
double height;
double depth;
void volume()
{
	System.out.println("Volume is");
	System.out.println(weidth*height*depth);
}
}
class BoxDemo3 {
	public static void main(String args[])
	{
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		mybox1.weidth = 10;
		mybox1.height= 20;
		mybox1.depth =15;
		mybox2.weidth = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		mybox1.volume();
		mybox2.volume();
		
	}
}
