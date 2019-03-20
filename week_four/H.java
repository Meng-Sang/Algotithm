package week_four;
import java.util.*;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<student> set = new ArrayList<student>();
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while(n>0)
		{
			String sex = cin.next();
			double hight = cin.nextDouble();
			set.add(new student(sex, hight));
			n--;
		}
		Collections.sort(set, new Comparator<student>() {

			@Override
			public int compare(student o1, student o2) {
				// TODO Auto-generated method stub
				if(o1.sex.equals(o2.sex)&&o2.sex.equals("male"))
					return (int)((o1.hight-o2.hight)*100);
				else if(o1.sex.equals(o2.sex)&&o2.sex.equals("female"))
					return (int)((o2.hight-o1.hight)*100);
				else
					return  o2.sex.compareTo(o1.sex);
			}
		});
		for (student student : set) {
			System.out.printf("%.2f ",student.hight);
		}
		cin.close();
	}
}
class student
{
	String sex;
	double hight;
	public student(String sex, double hight) {
		super();
		this.sex = sex;
		this.hight = hight;
	}
}