/* 
2022 객체 지향 프로그래밍 과제
컴퓨터공학부 202102423 이보민
 */

package kWave;

import java.util.ArrayList; // 컬렉션 프레임워크 사용
import java.util.Scanner;
import java.io.*; // 파일 입력

interface Continent{ // 인터페이스
	void whatContinent(); // 추상 메소드
}

interface English{
	void english();
}

abstract class Country implements Continent, English{ // 추상 클래스	
	public abstract void explain();
	public abstract void popularity();
	public abstract void prefer();

}

class Usa extends Country{ // 오버라이딩
	public void explain() { //추상 메소드 구현
		System.out.println("미합중국이라고도 불리우며 북아메리카 대륙과 태평양 지역에 위치한 연방국");
	}
	public void popularity() {
		System.out.println("인구 : 3억 3,400만 (세계 3위)");
	}
	public void prefer() {
		System.out.println("가장 선호하는 한류 : K-Pop (12.7%)");
	}
	
	
	@Override
	public void whatContinent() {
		System.out.println("북아메리카");
		
	}
	@Override
	public void english() {
		System.out.println("영문 : The United States of America");
        System.out.println();			
	}
}

class Bra extends Country{ // 오버라이딩
	public void explain() { //추상 메소드 구현
		System.out.println("남아메리카에 위치한 연방국임과 동시에 남반구에서 가장 넓은 나라");
	}
	public void popularity() {
		System.out.println("인구 : 2억 1,500만 (세계 7위)");
	}
	public void prefer() {
		System.out.println("가장 선호하는 한류 : K-Pop (20.0%)");
	}
	
	
	@Override
	public void whatContinent() {
		System.out.println("남아메리카");
		
	}
	@Override
	public void english() {
		System.out.println("영문 : Federative Republic of Brazil");
        System.out.println();			
	}
}

class Fra extends Country{ // 오버라이딩
	public void explain() { //추상 메소드 구현
		System.out.println("대서양과 지중해에 걸친 서유럽의 본토와 전 세계 대향에 산재한 다수의 해외 영토로 구성된 공화국");
	}
	public void popularity() {
		System.out.println("인구 : 6,500만 (세계 22위)");
	}
	public void prefer() {
		System.out.println("가장 선호하는 한류 : K-Pop (12.8%)");
	}
	
	
	@Override
	public void whatContinent() {
		System.out.println("유럽");
		
	}
	@Override
	public void english() {
		System.out.println("영문 : La République Française / The French Republic");
        System.out.println();			
	}
}

class Unk extends Country{ // 오버라이딩
	public void explain() { //추상 메소드 구현
		System.out.println("대서양과 지중해에 걸친 서유럽의 본토와 전 세계 대향에 산재한 다수의 해외 영토로 구성된 공화국");
	}
	public void popularity() {
		System.out.println("인구 : 6,800만 (세계 21위)");
	}
	public void prefer() {
		System.out.println("가장 선호하는 한류 : K-Pop (11.0%)");
	}
	
	
	@Override
	public void whatContinent() {
		System.out.println("유럽");
		
	}
	@Override
	public void english() {
		System.out.println("영문 : The United Kingdom of Great Britain and Northern Ireland");
        System.out.println();			
	}
}

class Chn extends Country{ // 오버라이딩
	public void explain() { //추상 메소드 구현
		System.out.println("중국인민공화국이라고도 불리우며 아시아에 위치한 국가");
	}
	public void popularity() {
		System.out.println("인구 : 14억 2,000만 (세계 1위)");
	}
	public void prefer() {
		System.out.println("가장 선호하는 한류 : 한식 (15.2%)");
	}
	
	
	@Override
	public void whatContinent() {
		System.out.println("아시아");
		
	}
	@Override
	public void english() {
		System.out.println("영문 : China");
        System.out.println();			
	}
}

class Jpa extends Country{ // 오버라이딩
	public void explain() { //추상 메소드 구현
		System.out.println("일본국, 동아시아의 일본 열도와 오세아니아 북부 일대에 위치한 국가");
	}
	public void popularity() {
		System.out.println("인구 : 1억 2,500만 (세계 11위)");
	}
	public void prefer() {
		System.out.println("가장 선호하는 한류 : 한식 (29.0%)");
	}
	
	
	@Override
	public void whatContinent() {
		System.out.println("아시아");
		
	}
	@Override
	public void english() {
		System.out.println("영문 : Japan");
        System.out.println();			
	}
}

class Tai extends Country{ // 오버라이딩
	public void explain() { //추상 메소드 구현
		System.out.println("동아시아에 위치한 타이완 섬과 푸젠성 진마 지구를 통치하는 공화국");
	}
	public void popularity() {
		System.out.println("인구 : 2,300만 (세계 56위)");
	}
	public void prefer() {
		System.out.println("가장 선호하는 한류 : 한식 (20.5%)");
	}
	
	
	@Override
	public void whatContinent() {
		System.out.println("아시아");
		
	}
	@Override
	public void english() {
		System.out.println("영문 : Taiwan");
        System.out.println();			
	}
}

class Tha extends Country{ // 오버라이딩
	public void explain() { //추상 메소드 구현
		System.out.println("동남아시아에 위치한 적도와 인접한 국가");
	}
	public void popularity() {
		System.out.println("인구 : 7,000만 (세계 20위)");
	}
	public void prefer() {
		System.out.println("가장 선호하는 한류 : 한식 (20.5%)");
	}
	
	
	@Override
	public void whatContinent() {
		System.out.println("아시아");
		
	}
	@Override
	public void english() {
		System.out.println("영문 : Kingdom of Thailand");
        System.out.println();			
	}
}

class Aus extends Country{ // 오버라이딩
	public void explain() { //추상 메소드 구현
		System.out.println("오세아니아 지역에 위치한 영연방 왕국");
	}
	public void popularity() {
		System.out.println("인구 : 2,500만 (세계 53위)");
	}
	public void prefer() {
		System.out.println("가장 선호하는 한류 : 한식 (13.3%)");
	}
	
	
	@Override
	public void whatContinent() {
		System.out.println("아시아");
		
	}
	@Override
	public void english() {
		System.out.println("영문 : Commonwealth of Australia");
        System.out.println();			
	}
}

class Uae extends Country{ // 오버라이딩
	public void explain() { //추상 메소드 구현
		System.out.println("아라비아 반도 남동부 페르시아 만과 접하고 있는 연방국");
	}
	public void popularity() {
		System.out.println("인구 : 960만 (세계 93위)");
	}
	public void prefer() {
		System.out.println("가장 선호하는 한류 : 한식 (9.8%)");
	}
	
	
	@Override
	public void whatContinent() {
		System.out.println("중동");
		
	}
	@Override
	public void english() {
		System.out.println("영문 : The United Arab Emirates(UAE)");
        System.out.println();			
	}
}


class MyThread extends Thread{
	@Override
	public void run() {
		ArrayList<String> list = new ArrayList<String>(); // 참조 타입
		list.add("미국 / K-Pop : 12.7% / 한식 : 10.3% / 자동차, 애니메이션 : 4.8% ");
		list.add("브라질 / K-Pop : 20.0% / IT : 9.2% / 전쟁위험, 북한 : 7.0% ");
		list.add("아르헨티나 / K-Pop : 16.3% / IT : 10.3% / 태권도 : 8.5% ");
		int cnt = 0;
		while(true) {
			try { // 예외 처리
				System.out.println("(Thread) " + list.get(cnt));
				cnt++;
			}
			catch(Exception e) {
				break;
			}
		}
	}
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		ArrayList<String> list = new ArrayList<String>(); // 참조 타입
		list.add("프랑스 / K-Pop : 12.8% / 한류스타 : 8.0% / 한식, IT : 7.0% ");
		list.add("영국 / K-Pop : 11.0% / 햔식 : 8.5% / 영화 : 7.5% ");
        list.add("튀르키예 / 한국전쟁 : 14.8% / 드라마 : 12.4% / K-Pop : 9.4% ");
		int cnt = 0;
		while(true) {
			try {
				System.out.println("(Runnable) " + list.get(cnt));
				cnt++;
			}
			catch(Exception e) {
				break;
			}
		}
	}
}

public class App {
    static void show(Country s) {
		s.explain();
		s.popularity();
		s.prefer();
		s.whatContinent();
		s.english();
	}

    static int squidGameT = 2282020;
    static int nowOurSchoolT = 560780;
    static int seaVillT = 300580;
    static int myNameT = 194140;
    

    static int tAdd() { // static 메소드
        int timeSum = squidGameT + nowOurSchoolT + seaVillT + myNameT;
        return timeSum;
    }

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String countryPick = null;

		do {
			System.out.println("나라를 입력하세요 [미국 / 브라질 / 프랑스 / 영국 / 중국 / 일본 / 대만 / 태국 / 호주 / 아랍에미리트 ] '다음'을 입력하면 다음 단계로 : ");
			countryPick = scanner.nextLine();

			if ( countryPick.equals("미국") ) {
				System.out.println("--미국---");
				Usa usa = new Usa(); // 생성자
				show(usa);
			}
	
			else if ( countryPick.equals("브라질") ) {
				System.out.println("---브라질---");
				Bra bra = new Bra(); // 생성자
				show(bra);
			}
	
			else if ( countryPick.equals("프랑스") ) {
				System.out.println("---프랑스---");
				Fra fra = new Fra(); // 생성자
				show(fra);
			}
	
			else if ( countryPick.equals("영국") ) {
				System.out.println("---영국---");
				Unk unk = new Unk(); // 생성자
				show(unk);
			}
	
			else if ( countryPick.equals("중국") ) {
				System.out.println("---중국---");
				Chn chn = new Chn(); // 생성자
				show(chn);
			}
	
			else if ( countryPick.equals("일본") ) {
				System.out.println("---일본---");
				Jpa jpa = new Jpa(); // 생성자
				show(jpa);
			}
	
			else if ( countryPick.equals("대만") ) {
				System.out.println("---대만---");
				Tai tai = new Tai(); // 생성자
				show(tai);
			}
	
			else if ( countryPick.equals("태국") ) {
				System.out.println("---태국---");
				Tha tha = new Tha(); // 생성자
				show(tha);
			}
	
			else if ( countryPick.equals("호주") ) {
				System.out.println("---호주---");
				Aus aus = new Aus();
				show(aus);
			}
	
			else if ( countryPick.equals("아랍에미리트") ) {
				System.out.println("---아랍에미리트---");
				Uae uae = new Uae();
				show(uae);
			}
	
			else if ( countryPick.equals("다음")) {
				break;
			}
	
			else {
				System.out.println("잘못된 입력입니다.");
			}
		} while (countryPick.equals("다음") == false);
		
		System.out.println();
		System.out.println("---넷플릭스 한국 컨텐츠 누적 시청시간---");
		int result = tAdd();
		System.out.println(result + "('000) 시간");
		System.out.println();

		System.out.println("---넷플릭스 한국 컨텐츠 개별 누적 시청시간---");
		Integer sqt = new Integer(2300000); // Wrapper 객체
		Integer nos = new Integer(370000);
        Integer svt =  new Integer(301000);
		System.out.println("오징어 게임 : 약 " + sqt + "('000) 시간");
        System.out.println("지금 우리 학교는 : 약 " + nos + "('000) 시간");
        System.out.println("갯마을 차차차 : 약 " + svt + "('000) 시간");
		System.out.println();

		System.out.println("---권역별 한류 인식 현황---");
		ArrayList<String> list = new ArrayList<String>();
        list.add("중국 / 한식 : 15.2% / 드라마 : 13.0% / 뷰티 : 9.0% ");
        list.add("일본 / 한식 : 29.0% / K-Pop : 21.4% / 한류스타 : 7.8% ");
        list.add("대만 / 한식 : 20.5% / 드라마 : 14.0% / IT : 11.3% ");
        list.add("호주 / 한식 : 13.3% / K-Pop : 9.8% / 드라마 : 6.3% ");
		Thread t = new MyThread(); // 다중스레드(Thread 클래스)
		t.start();
		int cnt = 0;
		while(true) {
			try {
				System.out.println("(Thread) " + list.get(cnt));
				cnt++;
			}
			catch(Exception e) {
				break;
			}
		}
        System.out.println();
		list.add("아랍에미리트 / 한식 : 9.8% / K-Pop : 8.5% / 드라마 : 8.3% ");
        list.add("남아프리카공화국 / IT : 11.3% / K-Pop :10.0% / 영화 : 7.8% ");
		Runnable r = new MyRunnable(); // 다중스레드(Runnable 인터페이스)
		Thread t_1 = new Thread(r);
		t_1.start();
	
		int cnt_1 = 2;
		while(true) {
			try {
				System.out.println("(Runnable) " + list.get(cnt_1));
				cnt_1++;
			}
			catch(Exception e) {
				break;
			}
        }

        BufferedReader bReader = null;
        String favKWave = null;
		String inputFilePath = System.getProperty("user.dir");
		inputFilePath += "/src/kWave/favoriteKWave.txt";

        try {
            bReader = new BufferedReader(new FileReader(inputFilePath));
        } catch (FileNotFoundException e) { // 예외 처리
            e.printStackTrace();
        }

        try {
            while ((favKWave = bReader.readLine()) != null) {
				System.out.println(favKWave);
			}
        } catch (IOException e){ // 예외 처리
            e.printStackTrace();
        }

		Writer writer = null;
		String str1 = null;
		String str2 = null;
		String outputFilePath = System.getProperty("user.dir");
		outputFilePath += "/src/kWave/output.txt";


		try {
			writer = new FileWriter(outputFilePath);
			str1 = "지금까지 한류에 대해 알아보았습니다.\n";
			str2 = "컴퓨터공학부\n202102423\n이보민";
			writer.write(str1);
			writer.write(str2);
			writer.flush();
			writer.close();
		} catch (Exception e) { // 예외 처리
			e.printStackTrace();
		}

    }
}
