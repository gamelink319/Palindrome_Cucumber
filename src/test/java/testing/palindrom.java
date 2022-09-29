package testing;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import test.Palindrom;

public class palindrom {
	Palindrom  test = new Palindrom();	
	
	@When("user input text1 {string}")
	public void testpalindrom(String x) {
	new Palindrom().palindrome(x);
	test.palindrome(x);
	System.out.println( x+"Test Berhasil");
	}
	
	@And("user input text2 {string}")
	public void testpalindrom2(String x) {
		new Palindrom().palindrome(x);
		test.palindrome(x);
		System.out.println(x+"Test Berhasil");
	}
	
	@And("user input text3 {string}")
	public void testpalindrom3(String x) {
		new Palindrom().palindrome(x);
		test.palindrome(x);
		System.out.println(x+"Test Berhasil");
	}
}