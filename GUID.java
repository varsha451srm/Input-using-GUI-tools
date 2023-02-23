import javax.swing.JOptionPane;
class GUID
{ 
 public static void main(String [] args)
  {
   String s =JOptionPane.showInputDialog("Enter the text");
   JOptionPane.showMessageDialog(null,"The entered string is:" +s);
  }
}
class GUID2
{
	public static void main(String [] args)
	{
		int a,b,c,d,e,f,sum;
		double avg;
		a=Integer.parseInt(JOptionPane.showInputDialog("Enter the marks in 1st subject"));
		b=Integer.parseInt(JOptionPane.showInputDialog("Enter the marks in 2nd subject"));
		c=Integer.parseInt(JOptionPane.showInputDialog("Enter the marks in 3rd subject"));
		d=Integer.parseInt(JOptionPane.showInputDialog("Enter the marks in 4th subject"));
		e=Integer.parseInt(JOptionPane.showInputDialog("Enter the marks in 5th subject"));
		f=Integer.parseInt(JOptionPane.showInputDialog("Enter the marks in 6th subject"));
		sum=a+b+c+d+e+f;
		avg=sum/6;
		String s=String.valueOf(sum);
		String p=String.valueOf(avg);
		JOptionPane.showMessageDialog(null,"Sum of Marks:"+sum);
	    JOptionPane.showMessageDialog(null,"Average of Marks: "+avg);
	}
}
class GUID3
{
   public static void main(String [] args)
    {
      double r,a,v;
      r=Double.parseDouble(JOptionPane.showInputDialog("Enter area of sphere"));
      a=4*3.14*r*r;
      v=4/3*3.14*r*r*r;
      String s;
      s="Surface area of Sphare is :" + a;
      s=s+"Volume of Sphere is :"+v;
      JOptionPane.showMessageDialog(null,s);
    }
}
		