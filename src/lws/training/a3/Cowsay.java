package lws.training.a3;

public class Cowsay {

    public static void draw(String message) {
        boolean wrongmessagelength = true;
        while (wrongmessagelength) {
            if(message.length() <= 19) {
                message = message + " ";
            } else {
                wrongmessagelength = false;
            }
        }
        System.out.println(" ______________________ ");
        System.out.println("< " + message + " >");
        System.out.println(" ---------------------- ");
        System.out.println("  \\\n" +
                "    \\\n" +
                "        .--.\n" +
                "       |o_o |\n" +
                "       |:_/ |\n" +
                "      //   \\ \\\n" +
                "     (|     | )\n" +
                "    /'\\_   _/`\\\n" +
                "    \\___)=(___/");

    }

}
