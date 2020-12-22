package ex21jdbc.shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;

import ex21jdbc.connect.IConnectImpl;

//완료♥
public class InsertShop extends IConnectImpl{
	
	public InsertShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		
		//1. 쿼리문 작성
		String sql = "";
		sql += "INSERT INTO sh_goods (g_idx, goods_name, goods_price, p_code) "
				+ " VALUES (goods_seq.nextval, ? ,?, ?)";
		try {
			//2.prepared 객체 생성
			psmt = con.prepareStatement(sql);
			
			String name = scanValue("상품명");
			String price = scanValue("상품가격");
			String code = scanValue("상품코드");
			
			psmt.setString(1, name);
			psmt.setInt(2, Integer.parseInt(price));
			psmt.setInt(3, Integer.parseInt(code));
			
			int affected = psmt.executeUpdate();
			System.out.println("상품입력 성공");
		}
		catch (Exception e) {
			System.out.println("상품입력 중 예외발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}

	
	public static void main(String[] args) {
		new InsertShop().execute();
	}
	
}
