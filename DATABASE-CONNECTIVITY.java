# DATABASE-CONNECTIVITY
package oxygen.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class NewIndiaCorporation {
	static int b,h,j=0;
	static String a;
	float c;
	void db()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/veni","root","");
			Statement stmt=con.createStatement();
			stmt.execute("INSERT INTO emply values('"+a+"','"+b+"','"+h+"','"+c+"')");
			//stmt.execute("DELETE * from emply where name=v");
		}
catch(SQLException e)
		{
	System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
	System.out.println(e);
		}
	}
void calculate()
{	
	if(b>=50)	
	{
		c=(int) ((40*b)+(h*1.5));
		System.out.println("employee"+" "+"basepay"+" "+"hours"+" "+"salary");
		System.out.println(a+"   "+b+"   "+h+"   "+c);
}
	else if(b==50)
	{
		c=40*b;
		System.out.println("employee"+" "+"basepay"+" "+"hours"+" "+"salary");
		System.out.println(a+"   "+b+"  "+h+"    "+c);
    }
	}
	public static void main(String args[]) {
		NewIndiaCorporation n=new NewIndiaCorporation();
		while(j!=4)
		{
Scanner s=new Scanner(System.in);
		System.out.println("enter employee name:");
		 a=s.next();
		System.out.println("enter the basepay:");
		b=s.nextInt();
		System.out.println("enter the hours:");
		 h=s.nextInt();
		if(h>60 || b<50)
		{
			System.out.println("invalid");
			}
		else
		{
			n.calculate();
			n.db();
		}
j++;
		}
}
}
OUTPUT:
enter employee name:
abc
enter the basepay:
60
enter the hours:
50
employee basepay hours salary
abc   60   50   2475.0
enter employee name:
def
enter the basepay:
70
enter the hours:
60
employee basepay hours salary
def   70   60   2890.0
enter employee name:
a
enter the basepay:
40
enter the hours:
70
invalid
enter employee name:
bnm
enter the basepay:
70
enter the hours:
80
invalid

