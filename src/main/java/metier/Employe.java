package metier;

public class Employe {
	
	private String firstName;
	private String lastName;
	private String mailAdresse;
	public Employe(String firstName, String lastName, String mailAdresse) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailAdresse = mailAdresse;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMailAdresse() {
		return mailAdresse;
	}
	public void setMailAdresse(String mailAdresse) {
		this.mailAdresse = mailAdresse;
	}
	@Override
	public String toString() {
		return "Employe [firstName=" + firstName + ", lastName=" + lastName + ", mailAdresse=" + mailAdresse + "]";
	}
	
	
	public void poserConger() {
		System.out.println("L'employer" + toString() + "  a poser conger");
	}
}
