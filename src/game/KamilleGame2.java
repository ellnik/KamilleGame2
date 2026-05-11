/*
 * @author Olena Nikolaienko
 * 
 * Diese Klasse implementiert ein einfaches Spiel mit einer "Liebesblume".
 * Der Benutzer wählt ein Blütenblatt (1–6) und erhält ein zufälliges Ergebnis.
 * Nach jeder Runde kann entschieden werden, ob weitergespielt wird.
 */
package game;

import java.util.Random;
import util.MyIO;

public class KamilleGame2 {

    /**
     * Zufallszahlengenerator für die Spielentscheidungen
     */
    Random rand = new Random();

    /**
     * Führt eine Spielrunde aus.
     * - Benutzer gibt eine Zahl ein (1–6)
     * - Eingabe wird geprüft
     * - Zufälliges Ergebnis wird generiert
     * - Ergebnis wird ausgegeben
     * - Benutzer kann erneut spielen
     */
    void round() {

        // Eingabe des Benutzers
        int Blütenblatt = MyIO.readInt("Wähle ein Blütenblatt (1-6): ");

        // Überprüfung der Eingabe
        if (Blütenblatt < 1 || Blütenblatt > 6) {
            MyIO.write("Falsche Eingabe! Bitte Zahl von 1 bis 6.");
            round(); // erneuter Versuch (Rekursion)
            return;
        }

        // Zufallszahl von 1 bis 6
        int randomResult = rand.nextInt(6) + 1;

        /**
         * Ausgabe je nach Ergebnis
         */
        if (randomResult == 1)
            MyIO.write("Deine Vorhersage -> Liebt");

        else if (randomResult == 2)
            MyIO.write("Deine Vorhersage -> Liebt nicht");

        else if (randomResult == 3)
            MyIO.write("Deine Vorhersage -> Spuckt");

        else if (randomResult == 4)
            MyIO.write("Deine Vorhersage -> Küsst");

        else if (randomResult == 5)
            MyIO.write("Deine Vorhersage -> Heiratet");

        else if (randomResult == 6)
            MyIO.write("Deine Vorhersage -> Schickt in die Hölle");

        // Abfrage, ob erneut gespielt werden soll
        if (onceAgain()) {
            round(); // neue Runde starten
        } else {
            MyIO.write("Bye");
            System.exit(0); // Programm beenden
        }
    }

    /**
     * Fragt den Benutzer, ob er nochmal spielen möchte
     * 
     * @return true, wenn der Benutzer "j" eingibt, sonst false
     */
    boolean onceAgain() {

        MyIO.write("Noch einmal spielen? (j = ja)");
        String answer = MyIO.read();

        return answer.equals("j");
    }
}