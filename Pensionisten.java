package streamingDienst;



public class Pensionisten {
	private StreamingDienst streamingBefehl;

	//Aufrufer wird mit dem konkreten Streamingvefehl über einen Setter geladen
	//Alternative: Konstruktor
	public void setStreamingBefehl(StreamingDienst streamingBefehl) {
		this.streamingBefehl = streamingBefehl;
	}

	public void streamen(String dokument){
		
		if (main.uhrzeit < 22 ) {
		streamingBefehl.streamingService(dokument);
		}
		else {
			System.out.println(" Tut uns leid, bitte gians pennen");
		}
	}

	
}
