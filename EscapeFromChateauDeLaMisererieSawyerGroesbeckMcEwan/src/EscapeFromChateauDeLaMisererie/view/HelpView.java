/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscapeFromChateauDeLaMisererie.view;

import java.util.Scanner;

/**
 *
 * @author sudo
 */
public class HelpView extends View {

    /**
     *
     * @author Tim McEwan
     */
    private final String helpmenu;

    public HelpView() {
        this.helpmenu = "\n"
                + "\n------------------------------"
                + "\n | Help                  |"
                + "\n------------------------------"
                + "\n  Escape is your overall objective."
                + "\n  Solve problems to get through "
                + "\n  the next area.  Keep an eye out"
                + "\n  though because the Warden is out"
                + "\n  to get you. Good luck"
                + "\n------------------------------"
                + "\n------------------------------"
                + "\n | Go back to main menu?      |"
                + "\n------------------------------"
                + "\n Y for yes"
                + "\n N for no";

    }

    public boolean doAction(String input) {

        input = input.toUpperCase();

        switch (input) {
            case "N":
                this.stayOnHelp();
                break;
            case "Y":
                this.stayMainMenu();
                break;

            default:
                System.out.println("\n*** Invalid Key *** Try again");
        }
        return false;
    }

    private void stayOnHelp() {
        HelpView helpMenuView = new HelpView();

        helpMenuView.display();
    }

    private void stayMainMenu() {
        EscapeFromChateauDeLaMisererie.view.MainMenuView mainMenuView = new EscapeFromChateauDeLaMisererie.view.MainMenuView();

        mainMenuView.display();
    }
}
/*private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";

        value = keyboard.nextLine();
        value = value.trim();

        return value;
    }

    

}
 */
