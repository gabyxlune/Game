
public class FMRadioStation {
	
	public String callSign;
	public float frequency;
	
	
	
	
	public FMRadioStation(String callSign, float frequency) throws FMRadioStationException{
		super();
		
		
		if(callSign.length() == 4 && (callSign.startsWith("A") || callSign.startsWith("K") || callSign.startsWith("N") || callSign.startsWith("W")))   //checking if call sign starts with AKNW and is four characters
		{
				for(int i=0; i<callSign.length(); i++)   	//checking if all characters are lowerCase
				{
					if (Character.isLowerCase(callSign.charAt(i)))
					{
						throw new FMRadioStationException(callSign, frequency);
					} 
								
					
		}// end of for loop
		
		}else
			throw new FMRadioStationException(callSign, frequency);
		
		
		if(frequency >= 88.0 && frequency <= 108.0 ){
			this.callSign = callSign;
			this.frequency = frequency;
		}else 
			throw new FMRadioStationException(callSign, frequency);
	}
		

		@Override
			public String toString() {
				return "FMRadioStation: Callsign [" + callSign + "]     Frequency [" + frequency + "]";
			
			
	}

}
