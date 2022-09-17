
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class SaveableDictionary {
    private Map<String, String> firstToSecond;
    private Map<String, String> secondToFirst;
    private String file;
    
    public SaveableDictionary() {
        this.firstToSecond = new HashMap<>();
        this.secondToFirst = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.firstToSecond = new HashMap<>();
        this.secondToFirst = new HashMap<>();
        this.file = file;
    }
    
    public void add(String words, String translation) {
        this.firstToSecond.putIfAbsent(words, translation);
        this.secondToFirst.putIfAbsent(translation, words);
    }
    
    public String translate(String word) {
        String translation = null;
        
        if (this.firstToSecond.containsKey(word)){
            translation = this.firstToSecond.getOrDefault(word, null);
        }
        
        if (this.secondToFirst.containsKey(word)){
            translation = this.secondToFirst.getOrDefault(word, null);
        }
        
        return translation;
    }
    
    public void delete(String word) {        
        String translation = "";
        
        if (this.firstToSecond.containsKey(word)){
            translation = this.firstToSecond.get(word);
            this.firstToSecond.remove(word);
            this.secondToFirst.remove(translation);
            
        } else if (this.secondToFirst.containsKey(word)){
            translation = this.secondToFirst.get(word);
            this.secondToFirst.remove(word);
            this.firstToSecond.remove(translation);
        }
    }
    
    public boolean load() {
         try (Scanner scanner = new Scanner(Paths.get(this.file))) {
             while (scanner.hasNextLine()) {
                 String line = scanner.nextLine();
                 String parts[] = line.split(":");
                 this.add(parts[0], parts[1]);                 
             } 
             return true;
         } catch (Exception e) {
             return false;
         }
    }
    
    public boolean save(){
        try (PrintWriter writer = new PrintWriter(this.file)) {
            for (String key: this.firstToSecond.keySet()) {
                writer.append(key + ":" + this.firstToSecond.get(key) + "\n");
            }        
            return true;
        } catch (Exception e) {
            return false;
        } 
    }
}
