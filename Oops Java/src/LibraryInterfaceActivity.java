
interface LibraryUser{
	public void registerAccount();
	public void requestBook();
}
class KidUsers implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount() {
		if(age<12) 
			System.out.println("You have registered under a kids Account");
		else
			System.out.println("Sorrry, Age must be less than 12 to register as a kid");
	}
	public void requestBook() {
		if(bookType.equals("Kids")) {
			System.out.println("Book issued successfully, please return the book within 10 days");
		}
		else
			System.out.println("oops,you are allowed only to take kids books");
	}
}

class AdultUsers implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount() {
		if(age>12) 
			System.out.println("You have registered under an Adult Account");
		else
			System.out.println("Sorrry, Age must be greater than 12 to register as a kid");
	}
	public void requestBook() {
		if(bookType.equals("Fiction")) {
			System.out.println("Book issued successfully, please return the book within 7 days");
		}
		else
			System.out.println("oops,you are allowed only to take adult Fiction books");
	}
}
	
public interface LibraryInterfaceActivity {
	public static void main(String[] args) {
		KidUsers k1 = new KidUsers();
		k1.age = 10; k1.bookType = "Kids";
		k1.registerAccount();
		k1.requestBook();
		KidUsers k2 = new KidUsers();
		k2.age = 18; k2.bookType = "Fiction";
		k2.registerAccount();
		k2.requestBook();
		System.out.println("\n\n");
		AdultUsers a1 = new AdultUsers();
		a1.age = 5; a1.bookType = "Kids";
		a1.registerAccount();
		a1.requestBook();
		AdultUsers a2 = new AdultUsers();
		a2.age = 18; a2.bookType = "Fiction";
		a2.registerAccount();
		a2.requestBook();
	}
}
