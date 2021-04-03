package streamingDienst;

public class AmazonPrimeBefehl implements StreamingDienst{
	private AmazonPrime service;

	public AmazonPrimeBefehl(AmazonPrime service) {
		super();
		this.service = service;
	}

	@Override
	public void streamingService(String film) {
		// TODO Auto-generated method stub
		service.optionAuswaehlen();
		service.ausführen(film);
	}
}
