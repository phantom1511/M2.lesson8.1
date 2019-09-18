import com.sun.xml.internal.stream.Entity;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("big", new String[]{"bigger", "the biggest", "huge", "giant"});
        dictionary.put("home", new String[]{"house", "flat", "apartment"});
        dictionary.put("beautiful", new String[]{"pretty", "cute", "handsome", "attractive"});
        dictionary.put("person", new String[]{"people", "individual", "man", "woman"});

        System.out.println("Please input your word: ");
        Scanner scanner = new Scanner(System.in);
        String sentences = scanner.nextLine();
        String[] words = sentences.split(" ");
        Random random = new Random();
        for (int i = 0; i < words.length; i++) {
            String[] synonyms = dictionary.get(words[i]);
            if (synonyms != null) {
                int randomNumber = random.nextInt(synonyms.length);
                System.out.println(synonyms[randomNumber] + " ");
            } else {
                System.out.println("Excuse me, i did not get your input");
            }

        }

        HashMap<String, String[]> bigDictionary = new HashMap<>();

        Set<String> keys = dictionary.keySet();
        Collection<String[]> values = dictionary.values();
        for (int j = 0; j < words.length; j++) {
            String key = dictionary.toString();
            String[] value = dictionary.get(key);
            bigDictionary.put(key, value);
            for (int k = 0; k < value.length; k++) {
                String newKey = value[k];
                ArrayList<String> newDictionary = new ArrayList<>(value.length);
                newDictionary.addAll(Arrays.asList(value));
                newDictionary.remove(newKey);
                newDictionary.add(key);
            }

            /*if (bigDictionary = scanner) {
                int randomNumber = random.nextInt(words.length);
                dictionary.replace(sentences, words);
                System.out.println(words[randomNumber] + " ");
                /*dictionary.keySet(synonyms);
                dictionary.remove(sentences);
                dictionary.values(sentences);
                System.out.println(synonyms);
            }*/
        }
    }
}
