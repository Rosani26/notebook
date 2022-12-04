package notebook;

import java.util.Date;
import java.util.Iterator;

public class NoteBookApp {

    public static void main(String[] args) {

        String text = "My mpotwsoijf";
        Date termin = new Date();
        String author = "Rosani";
        Note noteTest = new Note(text, termin, author);

        System.out.println(noteTest);


        NoteBook noteBook = new NoteBook(); // new NoteBook => Aufruf eines Konstruktors
        noteBook.storeNotes(createNewNote("My first Note."));
        noteBook.storeNotes(createNewNote("My sec Note."));
        noteBook.storeNotes(createNewNote("My 3 Note."));
        noteBook.storeNotes(createNewNote("My 4 Note."));
        noteBook.storeNotes(createNewNote("My 5 Note."));

        int nrOfNotes = noteBook.numberOfNotes();
        System.out.println("Number of notes are " + nrOfNotes);


        noteBook.showNote(3);
        noteBook.showNote(5);
        noteBook.showNote(6);
        noteBook.showNote(100);
        noteBook.showNote(-1);
        noteBook.showNote(0);

        System.out.println("===============================");

        noteBook.printAllNotes();

        System.out.println("===============================");

        noteBook.removeNote(1);
        noteBook.removeNote(10);
        noteBook.removeNote(0);

        noteBook.printAllNotes();

        System.out.println("===============================");

        Iterator<Note> noteBookIterator = noteBook.getIterator();

        while (noteBookIterator.hasNext()) {
            Note next = noteBookIterator.next();
            System.out.println(next);
        }

        System.out.println("===============================");

        for (Note note : noteBook.getNotes()) {
            System.out.println(note);
        }

        // Wir sind böse und manipulieren die geschütze Liste in der Klasse NoteBook
        for (int i = 0; i < noteBook.getNotes().size(); i++) {
                noteBook.getNotes().set(i, createNewNote("BlaBlabLa"));
        }

        for (Note note : noteBook.getNotes()) {
            System.out.println(note);
        }

        System.out.println("===============================");

        System.out.println("Programm ENDE");
    }

    private static Note createNewNote(String text) {
        return new Note (text, new Date(), "Rosani");
    }
}
