package klase2Zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {

		Dvorana d1 = new Dvorana("Pionir", "Beograd", 7000);
		Dvorana d2 = new Dvorana("Hala Smederevo", "Smederevo", 2000);
		Dvorana d3 = new Dvorana("Stark arena", "Beograd", 10000);
		
		Event e1 = new Event("25.09.2021.", d1, "Kosarkaska utakmica");
		Event e2 = new Event("30.05.2021.", d2, "Majski turnir u odbojci");
		Event e3 = new Event("25.05.2021.", d3, "Dan mladosti...");
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		
		String eventic = "Nekada je bio ";
		sb.append(eventic);
		System.out.println(sb);
		sb.append(e3.getTipDogadjaja());
		System.out.println(sb);
		e3.setTipDogadjaja("A sada ce biti dan pobede nad koronom!!!");
		sb.append(e3.getTipDogadjaja());
		System.out.println(sb);
		
		sb2.append(d2.getGrad());
		sb2.append(" je domacin ");
		sb2.append(e2.getVreme());
		sb2.append(" Dogadjaj je " + e2.getTipDogadjaja());
		System.out.println(sb2);
		
		sb3.append(e1.getVreme() + " odigrace se ");
		sb3.append(e1.getTipDogadjaja() + " u hali " + d1.getImeDvorane());
		sb3.append(e1.getDvorana().getGrad());
		System.out.println(sb3);
		
	}

}
