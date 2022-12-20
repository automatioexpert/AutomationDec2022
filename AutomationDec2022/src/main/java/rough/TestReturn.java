package rough;

public class TestReturn {

	public static boolean check() {
		boolean flag = false;
		try {
			flag = true;
			throw new Exception("Throw exception");
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println(TestReturn.check());
	}
}
