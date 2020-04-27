package daily.dailysum;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * 연습 : 자치구단위 서울 생활인구 일별 집계표
 * ■자치구단위 서울 생활인구 일별 집계표
 * 	http://data.seoul.go.kr/dataList/datasetView.do?infId=OA-15379&srvType=S&serviceKind=1&currentPageNo=1
 * 	http://openapi.seoul.go.kr:8088/(인증키)/(요청파일타입)/SPOP_DAILYSUM_JACHI/(요청시작INDEX)/(요청종료INDEX)/(기준일ID)/(시군구코드)
 * 
 * 샘플url
 * 	XML 버젼
 * 	http://openapi.seoul.go.kr:8088/(인증키)/xml/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/20190101
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/20190101/11000
 * 
 * 	JSON 버젼
 * 	http://openapi.seoul.go.kr:8088/(인증키)/json/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/	
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/20190101
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/20190101/11000
 * 
 * ※ 한번에 1000개 까지의 데이터만 볼수 있슴
 * 
 */

/*  입력예]
 *  날짜입력: 20190101
 *  시작Index : 1
 *  끝Index: 5
 *  
 *  [XML]
 *  날짜             구ID        총생활인구수           일최대이동인구수
 *  ----------------------------------------------------------------------
 *  20190101	11000    11121182.98210      4764635.18080 
 *  20190101    11110    274919.65940        177877.95000 
 *  20190101    11140    267096.65940        149729.45840 
 *  20190101    11170    315220.18480        149329.14120 
 *  20190101    11200    351993.77950        153738.94490
 *   
 *  [JSON]
 *  날짜             구ID        총생활인구수           일최대이동인구수
 *  ----------------------------------------------------------------------
 *  20190101	11000    11121182.98210      4764635.18080 
 *  20190101    11110    274919.65940        177877.95000 
 *  20190101    11140    267096.65940        149729.45840 
 *  20190101    11170    315220.18480        149329.14120 
 *  20190101    11200    351993.77950        153738.94490 
 * 
 * 
 * Url = http://openapi.seoul.go.kr:8088/78506e766831303835364c465a7743/xml/SPOP_DAILYSUM_JACHI/1/5/
 */

// ★ 주목 ★
// XML 은 Jsoup 를 활용하여 파싱하세요
// JSON 은  jackson 을 활용하여 파싱하세요


public class DailySumMain {

		public static final String REQ_SERVICE ="SPOP_DAILYSUM_JACHI";
		public static final String API_KEY = "78506e766831303835364c465a7743";
		
		public static void main(String[] args) throws IOException {
			System.out.println("자치구단위 서울 생활인구 일별 집계표");
			
			String url_address = "";
			StringBuffer sb;
			
			int startIndex;
			int endIndex;
			int date;
			
			startIndex = 1;
			endIndex = 5;
			date = 20190101;
			
			System.out.println("[XML]");
			url_address = buildUrlAddress("xml", startIndex, endIndex, date);
			sb = readFromUrl(url_address);
			parseXML(sb.toString());
			
//			System.out.println("[JSON]");
//			url_address = buildUrlAddress("json", startIndex, endIndex, stationName);
//			sb = readFromUrl(url_address);
//			parseJSON(sb.toString());
//			
		}
		
		public static String buildUrlAddress(String reqType, int startIndex, int endIndex, int date) throws IOException{
			// 만약 URL 에 한글이 들어가야 하는 경우는 반드시 URL 인코딩을 해주어야 한다
			// java.net.URLEncoder 임포트
			// java.io.UnsupportedEncodingException 임포트
			
			String url_address = String.format("http://openapi.seoul.go.kr:8088/%s/%s/SPOP_DAILYSUM_JACHI/%d/%d/%d/11000",
	                API_KEY, reqType, REQ_SERVICE, startIndex, endIndex, date);
			
			System.out.println(url_address);
			
			return url_address;
		}
		
		
		public static StringBuffer readFromUrl(String urlAddress) {
			StringBuffer sb = new StringBuffer();
			
			URL url = null;
			HttpURLConnection conn = null;
			
			InputStream in = null;
			InputStreamReader reader = null;   // byte 스트림 --> 문자기반 Reader
			BufferedReader br = null; 
			
			char [] buf = new char[512];
			try {
				url = new URL(urlAddress);
				conn = (HttpURLConnection)url.openConnection();  // Connection 객체 생성
				
				if(conn != null) {
					conn.setConnectTimeout(2000);  // 2초이내에 '연결' 이 수립안되면
												// java.net.SocketTimeoutException 발생
					
					conn.setRequestMethod("GET");  // GET 방식 request
					// "GET", "POST" ...
					conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
					conn.setUseCaches(false);  // 캐시사용안함
					
					System.out.println("request 시작: " + urlAddress);
					conn.connect();    // request 발생 --> 이후 response 받을때까지 delay
					System.out.println("response 완료");
					
					// response 받은후 가장 먼저 response code 값 확인
					int responseCode = conn.getResponseCode();
					System.out.println("response code : " + responseCode);
					// 참조 : https://developer.mozilla.org/ko/docs/Web/HTTP/Status
					if(responseCode == HttpURLConnection.HTTP_OK) {
						
						in = conn.getInputStream();  // InputStream <- HttpURLConnection 
						reader = new InputStreamReader(in, "utf-8"); // InputStreamReader <- InputStream
						br = new BufferedReader(reader);  // BufferedReader <- InputStreamReader
						
						int cnt;  // 읽은 글자 개수
						while((cnt = br.read(buf)) != -1) {
							sb.append(buf, 0, cnt);  // response 받은 텍스트를 StringBuffer 에 추가
						}
						
					} else {
						System.out.println("response 실패");
						return null;
					}
				} else {
					System.out.println("conn null");
					return null;
				}
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(conn != null) conn.disconnect();   // 작업 끝나고 Connection 해제
			}
			
			
			return sb;
		}
		
		public static void parseXML(String xmlText) {
			  // XML 파싱
		    DocumentBuilderFactory dbFactory;
		    DocumentBuilder dBuilder;

	        try {
	            // DOM parser 객체 생성
	            dbFactory = DocumentBuilderFactory.newInstance();
	            dBuilder = dbFactory.newDocumentBuilder();
	            
	            // String -> InputStream 변환
	            InputStream stream = new ByteArrayInputStream(xmlText.getBytes("utf-8"));  // UnsupportedEncodingException 처리
	            
	            // org.w3c.dom.Document : DOM 객체
	            Document dom = dBuilder.parse(stream);  // SAXException, IOException

	            // 사실 굳이 String 을 안거치고, 바로 아래와 같이 해도 되었다.
	            //  Document doc = dBuilder.parse(conn.getInputStream());  // 곧바로 InputStream 으로부터 받아 파싱
	            
	            Element docElement = dom.getDocumentElement();   // dom 의 최상위 document element 
	            docElement.normalize();   // 흩어진 text node 들을 정렬하는 등의 절차, XML 파싱하기전에 꼭 normalize() 부터 해주자
	            
	            NodeList nList = dom.getElementsByTagName("row");  // 서울시 지하철 역사 정보<row>~</row> 로 구성됨
	            
	            // 테스트
	            System.out.println("<row> 개수 : " +  nList.getLength());
	            
	            System.out.println();
	            for(int i = 0; i < nList.getLength(); i++) {
	            	Node node = nList.item(i);   // Node 는 interface 다.  DOM 의 다양한 Node객체들은 Node를 구현(상속)받은 객체들이다
	            	
	            	// 당연히 element node 이겠지만, 체크해보자
	            	if(node.getNodeType() != Node.ELEMENT_NODE) continue; 
	            	
	            	Element rowElement = (Element)node;  // node 를 Element로 형변환
	            	
	            	int strdId = Integer.parseInt(
	            			rowElement.getElementsByTagName("STDR_DE_ID").item(0).getChildNodes().item(0).getNodeValue());
	            	String signguCode = 
	            			rowElement.getElementsByTagName("SIGNGU_CODE_SE").item(0).getChildNodes().item(0).getNodeValue();
	            	String  totLvpop =
	                        rowElement.getElementsByTagName("TOT_LVPOP_CO").item(0).getChildNodes().item(0).getNodeValue();
	            	String  dailMxmm=
	                        rowElement.getElementsByTagName("DAIL_MXMM_MVMN_LVPOP_CO").item(0).getChildNodes().item(0).getNodeValue();
	            	
	            	System.out.println(strdId + ": " + signguCode + " " + totLvpop + " " + dailMxmm);
	            } // end for
	            
	            
	        } catch (ParserConfigurationException e) {
	            e.printStackTrace();
	        } catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} // end parseXML()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO

	

} // end class
