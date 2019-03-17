package structural.facade.example1;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
