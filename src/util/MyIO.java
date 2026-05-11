/*
 * @author Olena Nikolaienko
 * 
 * Diese Klasse stellt Hilfsmethoden für die Konsoleneingabe und -ausgabe bereit.
 * Sie vereinfacht das Lesen und Schreiben von Daten über die Konsole.
 */
package util;

import java.util.Scanner;

public class MyIO {

    /**
     * Scanner-Objekt zum Einlesen von Benutzereingaben
     */
    public static Scanner scan = new Scanner(System.in);

    /**
     * Gibt einen Text auf der Konsole aus
     * 
     * @param arg Text, der ausgegeben werden soll
     */
    public static void write(String arg) {
        System.out.println(arg);
    }

    /**
     * Liest einen String von der Konsole ein
     * 
     * @return eingegebener Text
     */
    public static String read() {
        String text = scan.next();
        return text;
    }

    /**
     * Liest eine Ganzzahl von der Konsole ein
     * 
     * @return eingegebene Zahl
     */
    public static int readInt() {
        int number = scan.nextInt();
        return number;
    }

    /**
     * Gibt eine Nachricht aus und liest anschließend eine Ganzzahl ein
     * 
     * @param info Hinweistext für den Benutzer
     * @return eingegebene Zahl
     */
    public static int readInt(String info) {
        write(info); // Ausgabe der Eingabeaufforderung
        int number = scan.nextInt();
        return number;
    }
}