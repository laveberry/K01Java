package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class UpdateShop extends IConnectImpl{
	
	public UpdateShop() {
		super("KOSMO", "1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{call ShopUpdateGoods(?,?,?,?,?)}");
			
			csmt.setString(1, scanValue("상품명"));
			csmt.setString(2, scanValue("가격"));
			csmt.setString(3, scanValue("제품코드")); 
			csmt.setString(4, scanValue("일련번호")); //Primary key
			csmt.registerOutParameter(5, Types.NUMERIC); //반환타입 - 숫자
			
			//실행하기
			csmt.execute();
			
			//실행 후 결과값 자바 콘솔에 출력하기!
			int row = csmt.getInt(5);
			
			if(row==0) {
				System.out.println("해당상품 없음");
			}
			else {
				System.out.println(row+"개의 상품 수정됨");
			}
		}
		catch (SQLException e) {
			System.out.println("수정 중 오류발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new UpdateShop().execute();
	}
}
