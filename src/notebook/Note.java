package notebook;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author lcavuoti
 *
 */
public class Note {
	// Attribute
	private String text;
	private Date termin;
	private String author;


	// Constructor: Name wie Klasse, kein Rückgabetyp
	public Note() {
		super();
		this.text="";
		this.termin=null;
		this.author="";
	}
	
	public Note(String text, Date termin, String author) {
		this();
		this.text = text;
		this.termin = termin;
		this.author = author;
	}

	public Note(String text, String author) {
		this();
		this.text = text;
		this.termin = new GregorianCalendar().getTime();
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getTermin() {
		return termin;
	}

	public void setTermin(Date termin) {
		this.termin = termin;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		 // (2) create a date "formatter" (the date format we want)
//	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
	    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yy / hh.mm");

	    // (3) create a new String using the date format we want
	    String formattedTermin = formatter.format(termin);
	    
	    // (4) this prints "termin = 2009-09-06-08.23.23"
//	    System.out.println("Termin = " + formattedTermin);
		
		return "Note author = " + author + ", termin = " + formattedTermin + ", text = " + text + "";
	}

	public void print() {
//		System.out.println(" Hello myNotes");
//		System.out.println("Author: " + author);
//		System.out.println("Termin: " + termin);
//		System.out.println("Text: " + text);
		System.out.println(this.toString());

	}

}
