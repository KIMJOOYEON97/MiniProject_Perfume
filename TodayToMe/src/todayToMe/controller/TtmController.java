package todayToMe.controller;

import java.util.List;

import todayToMe.io.TtmIO;

public class TtmController {

	//입력출력클래스 필드로 선언
	private TtmIO ttmIO = new TtmIO();
	
	//이름 입력
	public void insertName(String name) {
		ttmIO.insertName(name);
	}
	
	//이름 출력
	public String loadName() {
		return ttmIO.loadName();
	}

}
