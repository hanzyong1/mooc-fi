
package mooc.logic;

import mooc.ui.TextInterface;
import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface temp;
    
    public ApplicationLogic(UserInterface ui) {
        this.temp = new TextInterface();
    }
    
    public void execute(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Application logic is working");
            temp.update();
        }
    }
}
