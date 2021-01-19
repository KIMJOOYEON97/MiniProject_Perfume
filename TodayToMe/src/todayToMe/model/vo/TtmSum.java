package todayToMe.model.vo;

import java.util.ArrayList;
import java.util.List;

public class TtmSum {

	//총점을 계산하는 곳
	static int addPrice = 0;
	static int addTemp = 0;
	static int addSocial = 0;
	static int addIndividual = 0;
	
	
	public TtmSum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void addPrice(int num) {
		addPrice += num;
	}
	public static void addTemp(int num) {
		addTemp += num;
	}
	public static void addSocial(int num) {
		addSocial += num;
	}
	public static void addIndividual(int num) {
		addIndividual += num;
	}
	public static int getAddPrice() {
		return addPrice;
	}
	public static void setAddPrice(int addPrice) {
		TtmSum.addPrice = addPrice;
	}
	public static int getAddTemp() {
		return addTemp;
	}
	public static void setAddTemp(int addTemp) {
		TtmSum.addTemp = addTemp;
	}
	public static int getAddSocial() {
		return addSocial;
	}
	public static void setAddSocial(int addSocial) {
		TtmSum.addSocial = addSocial;
	}
	public static int getAddIndividual() {
		return addIndividual;
	}
	public static void setAddIndividual(int addIndividual) {
		TtmSum.addIndividual = addIndividual;
	}

}
