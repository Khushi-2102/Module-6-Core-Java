package core;
interface Printable {
    void print();
}

// Interface 2
interface Showable {
    void show();
}

// Class implementing both interfaces
class Document implements Printable, Showable {

    String title;

    // Constructor
    public Document(String title) {
        this.title = title;
    }

   
    public void print() {
        System.out.println("Printing document: " + title);
    }

    
    public void show() {
        System.out.println("Showing document: " + title);
    }
}
public class multipleinterfaces {
	public static void main(String[] args) {
        // Create object of Document
        Document doc = new Document("Java Tutorial");

        // Call methods
        doc.print();
        doc.show();
    }
}

