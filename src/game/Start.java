/*
 * @author Olena Nikolaienko
 * 
 * Diese Klasse dient als Einstiegspunkt des Programms.
 * Sie startet das Spiel KamilleGame2.
 */
package game;

public class Start {

    /**
     * Hauptmethode des Programms (Startpunkt)
     * 
     * @param args Kommandozeilenargumente (werden hier nicht verwendet)
     */
    public static void main(String[] args) {

        // Erzeugt ein neues Spielobjekt
        KamilleGame2 game = new KamilleGame2();

        // Startet die erste Spielrunde
        game.round();
    }
}