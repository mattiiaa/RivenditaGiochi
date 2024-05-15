public class App {
    public static void main(String[] args) throws Exception {
        Gioco[] giochi = { new Gioco("Monopoli", "tavolo"),
                new Gioco("Gioco dell'oca", "tavolo"),
                new Gioco("Briscola", "carte"),
                new Gioco("Risiko", "tavolo"),
                new Gioco("Minecraft", "videogame") };

        /*
         * Gioco[] giochi2 = { new Gioco("Monopoli", "tavolo"),
         * new Gioco("Scala40", "carte"),
         * new Gioco("Briscola", "carte"),
         * new Gioco("Risiko", "tavolo"),
         * new Gioco("Call of Duty", "videogame") };
         */

        Negozio scaffale = new Negozio(giochi, 10);
        // Negozio scaffale2 = new Negozio(giochi2, 100);

        /*
         * if (scaffale.equals(scaffale2) == true) {
         * System.out.println("I due scaffali sono uguali");
         * } else {
         * System.out.println("I due scaffali sono diversi");
         * }
         */

        scaffale.aggiungiGioco("Scopa", "carte");
        scaffale.eliminaGioco("Risiko", "tavolo");
        System.out.println(scaffale.contaTipo());
        System.out.println("Il tuo scaffale è composto da: \n" + scaffale);
    }
}
