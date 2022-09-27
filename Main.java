
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//degişken isimlendirmeler, java'da camelCase yazılır
		
				String ortaMetin ="ilginizi çekebilir";
				String altMetin	= "vade süresi";

				System.out.println(ortaMetin);
				
				int vade = 12;
				
				double dolarDun = 18.14;
				double dolarBugun =18.20;
				
				boolean dolarDustuMu = false;
				
				String okYonu = "";
				
				if (dolarBugun<dolarDun){ // true
					okYonu = "down.svg";
					System.out.println(okYonu);
				 
			} else if(dolarBugun>dolarDun){
					okYonu = "up.svg";
					System.out.println(okYonu);
					
			} else {
				okYonu = "equal.svg";
				System.out.println(okYonu);
				
			}
				
					//array
				
				String[] krediler = {"Hızlı kredi","Maaşını Halkbank'tan","Mutlu Emeklikler"};
				
				
				
				for (int i = 0; i < krediler.length; i ++) {
					System.out.println(krediler[i]);
					
				}
				

	}

}
