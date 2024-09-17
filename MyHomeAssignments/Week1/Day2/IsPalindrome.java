package Assignment_Week1day2;

public class IsPalindrome {

	public static void main(String[] args) {

		int output = 0;
		int num = 1210;
		int input = num;
		for (int i = num; i > 0; i /= 10) {
			output = output * 10 + num % 10;
			num = num / 10;

		}

		if (input == output)
			System.out.println(output + " Is Palindrome: ");

		else
			System.out.println(output + " Is Not A Palindrome: ");

	}

}
