package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private Map<String, String> dictionary;

    private String file;

    public SaveableDictionary() {

        this.dictionary = new HashMap<>();

    }

    public void add(String words, String translation) {

        this.dictionary.putIfAbsent(words, translation);

    }

    public String translate(String word) {

        String translation = null;

        for (Map.Entry<String, String> e : this.dictionary.entrySet()) {

            if (word.equals(e.getKey())) {

                translation = e.getValue();

            } else if (word.equals(e.getValue())) {

                translation = e.getKey();

            }

        }

        return translation;

    }

    public void delete(String word) {

        if (this.dictionary.containsKey(word)) {

            this.dictionary.remove(word);

        } else if (this.dictionary.containsValue(word)) {

            this.dictionary.remove(this.translate(word));

        }

    }

    public SaveableDictionary(String file) {

        this.file = file;

        this.dictionary = new HashMap<>();

    }

    public boolean load() {

        try ( Scanner fileReader = new Scanner(Paths.get(this.file))) {

            if (fileReader.hasNextLine()) {

                read();

                return true;

            }

        } catch (Exception e) {

            System.out.println(e);

            return false;

        }

        return false;

    }

    void read() {

        try ( Scanner scan = new Scanner(Paths.get(this.file))) {

            while (scan.hasNextLine()) {

                String[] words = scan.nextLine().split(":");

                this.add(words[0], words[1]);

            }

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    public boolean save() {

        try ( PrintWriter writer = new PrintWriter(this.file)) {

            this.dictionary.entrySet().stream().map((e) -> e.getKey() + ":" + e.getValue()).forEachOrdered((words) -> {

                writer.println(words);

            });

            return true;

        } catch (Exception e) {

            System.out.println(e);

            return false;

        }

    }

}
