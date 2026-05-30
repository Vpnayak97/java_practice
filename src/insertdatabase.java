package java_connect;
import  java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.PreparedStatement;
public class connect {
public static Connection getConnection() {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/COLLEGE";
	String user="root";
	String password="1239";
	return DriverManager.getConnection(url,user,password);
}
catch(Exception e) {
	e.printStackTrace();
	return null;
}
}
public static void insertStudent(int id,String name,int age ,int marks) {
	try {
		Connection con=getConnection();
		String query ="INSERT INTO student(id,studentname,age,marks)VALUES(?,?,?,?)";
		PreparedStatement  ps=con.prepareStatement(query);
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setInt(3,age);
		ps.setInt(4,marks);
		int rows=ps.executeUpdate();
		if(rows>0) {
			System.out.println("student inserted successfully");
		}
	}
	catch(Exception e ) {
		e.printStackTrace();
	}
}
public static void main(String[] args) {

	insertStudent(1,"Ram",20,100);
}
}


