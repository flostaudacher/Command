package streamingDienst;

public class ARDBefehl implements StreamingDienst{
	private ARD service;

	public ARDBefehl(ARD service) {
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
