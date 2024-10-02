public class Practice13_03 {
	public static void main(String[] args) {

		/* Greetingクラスからインスタンスを生成する */
		Greeting greetJapan = new Greeting();
		Greeting greetKorea = new Greeting();
		Greeting greetUnknown = new Greeting();

		String japan = "日本";
    String korea = "韓国";
    String unknown = "その他";

		greetJapan.country = japan;
		greetKorea.country = korea;
		greetUnknown.country = unknown;

		System.out.println(greetJapan.country + "は " + greetJapan.greet(japan));
    System.out.println(greetKorea.country + "は " + greetJapan.greet(korea));
    System.out.println(greetUnknown.country + "は " + greetJapan.greet(unknown));
	}
}

class Greeting {
  String country = "国名";

  public String greet(String country) {
    if(country == "日本") {
      return "こんにちは";
    } else if (country == "韓国") {
      return "アンニョンハセヨ";
    } else if (country == "その他") {
      return "わかりません";
    }
    return country;
  }
}