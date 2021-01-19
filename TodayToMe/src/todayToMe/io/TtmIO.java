package todayToMe.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TtmIO {
	
	//이름 저장하는 공간
	public static String name = "";
	
	//이름입력
	public String insertName(String inputname) {
		name = inputname;
		return name;	
	}
	
	//이름을 가져옴
	public String loadName() {
		return name;
	}
}
