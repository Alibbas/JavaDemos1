
public class Main {

	public static void main(String[] args) {
		findNumber();
	}

	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int search = 7;
		boolean isNumber = false;

		for (int number : numbers) {
			if (number == search) {
				isNumber = true;
				break;
			}
		}

		if (isNumber) {
			giveMessage("Say� mevcuttur: "+ search);
		} else {
			giveMessage("Say� mevcut de�ildir: "+ search);
		}

	}

	public static void giveMessage(String message) {
		System.out.println(message );
	}
}