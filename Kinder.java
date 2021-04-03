package streamingDienst;

public class Kinder {
	private StreamingDienst streamingBefehl;

	//Aufrufer wird mit dem konkreten Streamingvefehl über einen Setter geladen
	//Alternative: Konstruktor
	public static void setStreamingBefehl(StreamingDienst streamingBefehl) {
		streamingBefehl = streamingBefehl;
	}

	public void streamen(String dokument){
		streamingBefehl.streamingService(dokument);
	}
}
