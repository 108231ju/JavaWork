package phonebook06.db;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// CONTROLLER 객체
//   어플리케이션의 동작! 데이터 처리(CRUD)! (Business logic 담당)


public class PhonebookManager implements Pb, Closeable{

	// TODO : DB 를 위한 변수들 선언	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	// singleton적용
	private PhonebookManager() {

		// TODO:
		
		
		// JDBC 프로그래밍
		
		try {
			//  클래스 로딩
			Class.forName(DRIVER);
			System.out.println("드라이버 로딩 성공");
			//  연결 Connection
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("Connection 성공");
			//  Statement (필요하다면) 생성
			
			System.out.println("Statement 생성 성공");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		

	}

	private static PhonebookManager instance = null;

	public static PhonebookManager getInstance() {
		if (instance == null) {
			instance = new PhonebookManager();
		}
		return instance;
	} // end getInstance()

	// 전화번호부 생성 등록
	@Override
	public int insert(String name, String phoneNum, String memo) {
		
		// 매개변수 검증 : 이름 필수
		if (name == null || name.trim().length() == 0) {
			throw new PhonebookException("insert() 이름입력오류: ", Pb.ERR_EMPTY_STRING);
		}

		int cnt = 0;

		// TODO
		// SQL_INSERT 사용하여 INSERT
		try {
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNum);
			pstmt.setString(3, memo);
			cnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		// PreparedStatement 사용..
		

		return cnt;
	}

	@Override
	public PhonebookModel[] selectAll() {
		
		// TODO
		// SQL_SELECT_ALL 사용
		
		List<PhonebookModel>list = new ArrayList<PhonebookModel>();
		try {
	//		pstmt.close();
			pstmt = conn.prepareStatement(SQL_SELECT_ALL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new PhonebookModel(rs.getInt(COL_LABEL_UID),
				rs.getString(COL_LABEL_NAME),
				rs.getString(COL_LABEL_PHONENUM),
				rs.getString(COL_LABEL_MEMO),
				rs.getDate(COL_LABEL_REGDATE)));
				
				
			}
		}
		 catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list.toArray(new PhonebookModel[list.size()]);
	}	

	// 특정 uid 의 데이터 검색 리턴
	// 못찾으면 null 리턴
	@Override
	public PhonebookModel selectByUid(int uid) {

		// TODO 

		return null; // 못찾으면 null 리턴
	}// end selectByUid()

	@Override
	public int updateByUid(int uid, String name, String phoneNum, String memo) {

		// 매개변수 검증
		if (uid < 1)
			throw new PhonebookException("update() uid 오류: " + uid, Pb.ERR_UID);

		if (name == null || name.trim().length() == 0) // 이름 필수
			throw new PhonebookException("update() 이름입력 오류: ", Pb.ERR_EMPTY_STRING);

		

		// TODO
		// SQL_UPDATE_BY_UID  사용
		int cnt = 0;

		
		try {
			pstmt = conn.prepareStatement(SQL_UPDATE_BY_UID);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNum);
			pstmt.setString(3, memo);
			pstmt.setInt(4, uid);
			
			cnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		// PreparedStatement 사용..
		

		return cnt;
	}
	@Override
	public int deleteByUid(int uid) {
		// 매개변수 검증
		if (uid < 1)
			throw new PhonebookException("deleteByUid() uid 오류: " + uid, Pb.ERR_UID);

		int cnt = 0;
		
		// TODO
		// SQL_DELETE_BY_UID 사용


		
		try {
			pstmt = conn.prepareStatement(SQL_DELETE_BY_UID);
		
			pstmt.setInt(1, uid);
			
			cnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		// PreparedStatement 사용..
		

		return cnt;
	}

	// 현재 데이터중 가장 큰 uid 값을 찾아서 리턴
	private int getMaxUid() {
		int maxUid = 0;

		// TODO : 옵션

		return maxUid;
	}


	@Override
	public void close() throws IOException {

		// TODO
		// ResultSet
		// Statement 
		// Connection
		// 들 close()..

	}

} // end PhonebookManager

// 예의 클래스 정의
// 예외발생하면 '에러코드' + '에러메세지'를 부여하여 관리하는게 좋다.
class PhonebookException extends RuntimeException {

	private int errCode = Pb.ERR_GENERIC;

	public PhonebookException() {
		super("Phonebook 예외 발생");
	}

	public PhonebookException(String msg) {
		super(msg);
	}

	public PhonebookException(String msg, int errCode) {
		super(msg);
		this.errCode = errCode;
	}

	// Throwable 의 getMessage 를 오버라이딩 가능
	@Override
	public String getMessage() {
		String msg = "ERR-" + errCode + "]" + Pb.ERR_STR[errCode] + " " + super.getMessage();
		return msg;
	}

} // end PhonebookException
