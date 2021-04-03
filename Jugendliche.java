package streamingDienst;

public class Jugendliche {

	private StreamingDienst streamingBefehl;

	//Aufrufer wird mit dem konkreten Streamingvefehl über einen Setter geladen
	//Alternative: Konstruktor
	public void setStreamingBefehl(StreamingDienst streamingBefehl) {
		this.streamingBefehl = streamingBefehl;
	}

	public void streamen(String dokument){
		streamingBefehl.streamingService(dokument);
	}
}
