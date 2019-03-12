package week_three;

import java.util.Scanner;
import java.util.Vector;

public class SteelPiping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int i = 0;
		while(i<n)
		{
			int m = cin.nextInt();
			int  j=0;
			Vector<Steel> v1 = new Vector<Steel>();
			while(j<m)
			{
				int len = cin.nextInt(),diameter = cin.nextInt();
				long serial = cin.nextLong();
				v1.add(new Steel(len, diameter, serial));
				j++;
			}
			Steel temp = v1.get(0);
			for (int k = 0; k < v1.size(); k++) {
				Steel st = v1.get(k);
				if(st.getLen()>=temp.getLen()&&st.getDiameter()<=temp.getDiameter())
					temp = st;
			}
			for (int k = 0; k < v1.size(); k++) {
				Steel st = v1.get(k);
				if(st.getLen()==temp.getLen()&&st.getDiameter()==temp.getDiameter()&&st.getSerial()>=temp.getSerial())
					temp = st;
			}
			System.out.println(temp.getSerial());
			i++;
		}
	}
}
class Steel
{
	private int len;
	private int diameter;
	private long serial;
	public Steel(int len,int diameter,long serial) {
		// TODO Auto-generated constructor stub
		this.len = len;
		this.diameter = diameter;
		this.serial = serial;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public long getSerial() {
		return serial;
	}
	public void setSerial(long serial) {
		this.serial = serial;
	}
}