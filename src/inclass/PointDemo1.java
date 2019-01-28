class PointDemo1
{
	public static void main(String args[])
	{
		Point1 P2=new Point1(5,7);
		Point1 P3=new Point1(9,1);
		double d1;
		/*P2.setx1(5);
		P2.sety1(7);
		P3.setx2(9);
		P3.sety2(10);*/
		d1=P3.distance(P2,P3);
		System.out.println(d1);
	}
}