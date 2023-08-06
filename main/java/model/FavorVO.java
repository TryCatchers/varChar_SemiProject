package model;

public class FavorVO {
	private int favorNum;
	private String memberId;
	private int teaNum;
	
	//임시변수
	private String teaName;
	private String imageUrl;
	private int teaPrice;
	
	public FavorVO() {
		this(0, "", 0);
	}
	
	public FavorVO(int favorNum, String memberId, int teaNum) {
		this.favorNum = favorNum;
		this.memberId = memberId;
		this.teaNum = teaNum;
	}

	public int getFavorNum() {
		return favorNum;
	}

	public void setFavorNum(int favorNum) {
		this.favorNum = favorNum;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getTeaNum() {
		return teaNum;
	}

	public void setTeaNum(int teaNum) {
		this.teaNum = teaNum;
	}

	public String getTeaName() {
		return teaName;
	}

	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getTeaPrice() {
		return teaPrice;
	}

	public void setTeaPrice(int teaPrice) {
		this.teaPrice = teaPrice;
	}
	
	
	
	

}
