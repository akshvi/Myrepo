package ClassPrograms;

public class Encapsulation {

	private int NRN;
	public String Name;
	private int GSM;
	private String Email;

	public static void main(String[] args) {

	Encapsulation obj = new Encapsulation();
	System.out.println(obj.NRN);
	System.out.println(obj.Name);
	System.out.println(obj.GSM);
	System.out.println(obj.Email);

	}

	public int getNRN() {
	return NRN;
	}

	public void setNRN(int nRN) {
	NRN = nRN;
	}

	public int getGSM() {
	return GSM;
	}

	public void setGSM(int gSM) {
	GSM = gSM;
	}

	public String getEmail() {
	return Email;
	}

	public void setEmail(String email) {
	Email = email;
	}

}
