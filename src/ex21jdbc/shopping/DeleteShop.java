package ex21jdbc.shopping;

import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;
//성공♥
public class DeleteShop extends IConnectImpl{
	
	public DeleteShop() {
		super("KOSMO", "1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{call ShopDeleteGoods(?,?)}");
			
			csmt.setString(1, scanValue("삭제할제품 일련번호"));
			csmt.registerOutParameter(2, Types.NUMERIC);
			csmt.execute();
		}
		catch (Exception e) {
			System.out.println("삭제 중 오류발생");
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new DeleteShop().execute();
	}
}
