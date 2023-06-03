import java.util.*;

    public class word {
        private String[] l;
        private ArrayList<String> e;

        public word(String[] letters) {
            this.l = letters;
           e = new ArrayList<String>();
            String[] a = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                    "t", "u", "v", "w", "x", "y", "z", };
            for (String temp : a)
                e.add(temp);
        }

        public void remove(String[] letters, ArrayList<String> e) {
            for (int i = 0; i < letters[0].length(); i++) {
                String temp = letters[0].substring(i,i+1);
                for (int j = 0; j < e.size(); j++) {
                    if (e.get(j).equals(temp)) {
                        e.remove(e.get(j));
                    }
                }
            }
            System.out.println(e);

            this.e = e;
        }
        public void display(ArrayList<String> e) {
            System.out.println("Letters that have not been chose yet " + e);
        }

        public void x(String word, String s) {
            ArrayList<String> x = new ArrayList<String>();
            ArrayList<String> y = new ArrayList<String>();

            for (int i = 0; i < word.length(); i++) {
                char temp = word.charAt(i);
                char k = s.charAt(i);
                if (k == temp)
                    y.add(word.substring(i, i+1));
                else
                    y.add(" ");
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == temp) {
                        x.add(s.substring(j,j+1));
                    }

                }

            }
            System.out.println("Right letters " + x);
            System.out.println("These are in the right place " + x);


        }

        public boolean winner(String right, String[] x) {
            for (int i = 0; i < x.length; i++) {
                if (x[i].equals(right)) {
                    return true;
                }
            }
            return false;
        }


        public ArrayList<String> gete() {
            return e;
        }

        public void setAlphabet(ArrayList<String> c) {
            this.e = c;
        }



    }









