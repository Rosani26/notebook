package notebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NoteBook {
    private ArrayList<Note> notes;

    public NoteBook() {
        this.notes = new ArrayList<>();
    }

    public void storeNotes(Note note) {
        notes.add(note);
    }

    public void removeNote(int noteNumber) {
        if (noteNumber < 0) {
            // do nothing
        } else if (noteNumber < numberOfNotes()) {
            notes.remove(noteNumber);
        } else {
            // do nothing
        }
    }

    public int numberOfNotes() {
        return notes.size();
    }

    public void showNote(int noteNumber) {
        if (noteNumber < 0) {
            // do nothing
        } else if (noteNumber < numberOfNotes()) {
            System.out.println(notes.get(noteNumber));
        } else {
            // do nothing
        }
    }

    public void printAllNotes() {
        System.out.println("PRINT ALL NOTES ...");

        // FOR SCHLEIFE
//        for (int i = 0; i < notes.size(); i++) {
//            System.out.println(i + ": " + notes.get(i));
//        }

        // WHILE SCHLEIFE: im schlechtesten Fall nie aufgerufen (wenn Bedingung von Anfang an nicht erfüllt)
//        int i = 0;
//        while (i < notes.size()) {
//            System.out.println(i + ": " + notes.get(i));
//            i++;
//        }

        // FOREACH SCHLEIFE
//        for (String note : notes) {
//            System.out.println(note);
//        }

        // DO-WHILE Schliefe: im schlechtesten Fall einmal aufgerufen (da Bedingung am Ende der Schleife)
//        int i = 0;
//        do {
//            System.out.println(i + ": " + notes.get(i));
//            i++;
//        } while (i < notes.size());

        // Lambda Schreibweisen
//        notes.forEach((String note) -> {
//            System.out.println(note);
//        });

//        notes.forEach(note -> {
//            System.out.println(note);
//        });

//        notes.forEach(note -> System.out.println(note));

        // Anstatt Lambda Methoden Referenz
//        notes.forEach(System.out::println);


        Iterator<Note> it = getIterator();
        while (it.hasNext()) {
            Note note = it.next();
            System.out.println(note);
        }

        System.out.println("... PRINT ALL NOTES");
    }

    /**
     *
     * @return die liste notes
     */
    public List<Note> getNotes() {
        return notes;
    }


    /**
     * see: https://www.w3schools.com/java/java_iterator.asp
     * @return den iterator der liste notes
     */
    public Iterator<Note> getIterator() {
        return notes.iterator();
    }
}
