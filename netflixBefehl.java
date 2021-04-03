package streamingDienst;

public class netflixBefehl implements StreamingDienst{
	private netflix service;

	public netflixBefehl(netflix service) {
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
