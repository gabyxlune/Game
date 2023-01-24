
public class Mainclass {

	public static void main(String[] args) {

		//Arrays of the fields
		String[] callSigns = {"ACVD", "GNOE", "NVTS", "WnwT", "NASA", "GT10","WINK","Nktl","TBDF","RTBD","KSGT","ARGT","KPOP","AGTV","dNUN","WTFG","200f","NANT","KSIS","estf"};
		float[] frequencies ={80.2f,50.5f,100.0f,105.2f,86.9f,99.9f,70.1f,96.2f,101.0f,63.8f,105.8f,108.0f,88.5f,102.3f,202.5f,92.5f,2.05f,89.1f,91.0f,92.7f};
		FMRadioStation radioStations[]= new FMRadioStation[8];
		int count = 0;
		
		
		for(int i=0;i<callSigns.length;i++)
		{
			try
			{
				FMRadioStation station= new FMRadioStation(callSigns[i], frequencies[i]); //create stations using arrays
				System.out.println("-_-NEW STATION FOUND-_-");
				radioStations[count]= station;
				count++;
				if(count==8)
					break;
			}
			catch (FMRadioStationException e) {
				System.out.print("ATTENTION----");
				System.out.println(e.getMessage()); 
			}
		}

		System.out.println("\n ~~~~~~~~~~ FMRADIO STATIONS ~~~~~~~~~~~\n");
		System.out.println("         ~~~~~~~~~~~~~~~~~~~~~\n");
		for(FMRadioStation station: radioStations)
		{
			System.out.println(station.toString());
		}//end of for loop
		System.out.println("\n ~~~~~~~~~~ END OF PROGRAM ~~~~~~~~~~~\n");
	}
	

}
