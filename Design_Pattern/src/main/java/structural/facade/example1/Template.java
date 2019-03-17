package structural.facade.example1;

public abstract class Template {

	public enum TemplateType {Email, NewsLetter};
	
	public abstract String format(Object obj);
	
}
