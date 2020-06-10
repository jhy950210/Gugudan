
public class Util {
	// 메서드 - 출력(디버깅)
	public String gugudan(int startDan, int endDan) {
		String result = "";
		
		for(int dan=startDan; dan<=endDan; dan++) {
			for(int col=1; col<=9; col++) {
				result += dan + "X" + col + "=" + (dan*col) + "\t";
			}
			result += "\n";
		}
		return result;
	}
}
