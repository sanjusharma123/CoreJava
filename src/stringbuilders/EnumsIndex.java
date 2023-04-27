package stringbuilders;

public enum EnumsIndex {
	SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5),
	SATURDAY(6);
	private int dayIndex;
	EnumsIndex (int name){
	this.dayIndex = name;
	}
	public static void main(String[] args) {
	System.out.println(EnumsIndex .MONDAY.getDayIndex());
	System.out.println(EnumsIndex .TUESDAY);
	}
	public int getDayIndex() {
	return dayIndex;
	}
}