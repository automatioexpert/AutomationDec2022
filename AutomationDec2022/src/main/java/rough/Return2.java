package rough;

public class Return2 {

	public static boolean checks() {
		boolean flag = false;
		try {
			flag = true;
			return flag;

		} catch (Exception e) {
			flag = false;
			return flag;
		}
		//return flag; Unreachable code
	}

	public static void main(String[] args) {
		System.out.println(Return2.checks());
	}
}
