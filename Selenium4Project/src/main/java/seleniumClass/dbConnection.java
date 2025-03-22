package seleniumClass;

public class dbConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stubImport java.sql.*;

		Connection conn = null;
		String url ="jdbc:mysql://localhost:3306;
		String dbName = "test";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "root";
		Try{
			Class.forName(driver).newInstance();// Create object of Driver
			conn = DriverManage.getConnection(url+dbName,userName,password);
			// connection will be established
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from users");
			rs.next(); //1st Row
			System.out.println(rs.getString("City"));
			rs.next();// 2nd row
			System.out.println(rs.getString(2));
			While(rs.next()){
				System.out.println(rs.getString(1)+"--"+rs.getString(2)+"--"+rs.getString(3))
			}
			System.out.println("*****************************************");
			PrepatedStatement pstmt = conn.prepareStatement("Select * from user where UserName =?);
			Pstmt.setString(1,"B");
			ResultSet rs1 = pstmt.executeQuery();
			While(rs1.next()){
				System.out.println(rs1.getString(1)+"--"+rs1.getString(2)+"--"+rs1.getString(3));
			}
		}catch(Exception e){
		}finally(
		conn.close();
	}
}
