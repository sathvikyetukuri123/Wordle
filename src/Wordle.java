//Daksh Shekar
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Wordle {
    public static void main(String[] args) {
        Scanner ok = new Scanner(System.in);
        ArrayList<String> p = new ArrayList<String>();
        try {
            File o = new File("/Users/daksh/Downloads/wordle.txt");
            Scanner fr = new Scanner(o);
            while (fr.hasNextLine()) {
                String d = fr.nextLine();
                p.add(d);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, there was an error.");
            e.printStackTrace();
        }
        String[] character = new String[1];
        word game = new word(character);
        String word = p.get(getWord(p));
        Boolean t = false;
        int num = 0;
        while (!t) {
            num++;
            game.display(game.gete());
            System.out.println("Enter your word");
            String k = ok.nextLine();
            character[0] = k;
            game.remove(character, game.gete());
            game.x(word, k);
            if (game.winner(word, character)) {
                System.out.println("Congrats you got the word in " + num + " guesses!");
                t = true;
            }
            if (num == 6) {
                System.out.println("Sorry the word was actually " + word);
                t = true;
            }


        }
        ok.close();


    }

    public static int getWord(ArrayList<String> y) {
        int g = (int) (Math.random() * y.size());
        return g;


    }
}

