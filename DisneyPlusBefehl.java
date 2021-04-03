package streamingDienst;

public class DisneyPlusBefehl implements StreamingDienst{
	private DisneyPlus service;

	public DisneyPlusBefehl(DisneyPlus service) {
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
