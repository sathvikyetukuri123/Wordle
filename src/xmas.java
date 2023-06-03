import java.util.*;
public class xmas {




        private String[] letters; // size 5
        private ArrayList<String> alphabet;

        public xmas(String[] letters) {
            this.letters = letters;
            alphabet = new ArrayList<String>();
            String[] x = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                    "t", "u", "v", "w", "x", "y", "z", };
            for (String temp : x)
                alphabet.add(temp);
        }

        public void removeLetters(String[] letters, ArrayList<String> alphabet) {
            for (int j = 0; j < letters[0].length(); j++) {
                String temp = letters[0].substring(j,j+1);
                for (int i = 0; i < alphabet.size(); i++) {
                    if (alphabet.get(i).equals(temp)) {
                        alphabet.remove(alphabet.get(i));
                    }
                }
            }
            System.out.println(alphabet);

            this.alphabet = alphabet;
        }
        public void displayAlphabet(ArrayList<String> alphabet) {
            System.out.println("Remaining letters: " + alphabet);
        }

        public void process(String word, String guess) {
            ArrayList<String> correctLetters = new ArrayList<String>();
            ArrayList<String> correctPositions = new ArrayList<String>();

            for (int i = 0; i < word.length(); i++) {
                char temp = word.charAt(i);
                char temp2 = guess.charAt(i);
                if (temp2 == temp)
                    correctPositions.add(word.substring(i, i+1));
                else
                    correctPositions.add(" ");
                for (int j = 0; j < guess.length(); j++) {
                    if (guess.charAt(j) == temp) {
                        correctLetters.add(guess.substring(j,j+1));
                    }

                }

            }
            System.out.println("Correct letters: " + correctLetters);
            System.out.println("Letters at correct position " + correctPositions);


        }

        public boolean winCondition(String word, String[] letters) {
            for (int i = 0; i < letters.length; i++) {
                if (letters[i].equals(word)) {
                    return true;
                }
            }
            return false;
        }


        public ArrayList<String> getAlphabet() {
            return alphabet;
        }

        public void setAlphabet(ArrayList<String> alphabet) {
            this.alphabet = alphabet;
        }



    }







}
