package streamingDienst;

public class main {
	public static int uhrzeit = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		netflix Netflix = new netflix();
		ARD ard = new ARD();
		DisneyPlus disney = new DisneyPlus();
		AmazonPrime amazonPrime = new AmazonPrime();
		uhrzeit = 22;
		Kinder kind = new Kinder();
		Kinder.setStreamingBefehl(new netflixBefehl(Netflix));
		
		/*
		 * Nutzung
		 */
		kind.streamen("Naruto");//Das Command Pattern ist super!

		//ggf. dynamische Umkonfiguration zur Laufzeit
		kind.setStreamingBefehl(new AmazonPrimeBefehl(amazonPrime));

		kind.streamen("Breaking Bad");
	}

}
