/**
 * Name - Sanjeev Shrestha
 * Student ID - 984970
 * @author sanjeev
 */
package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labs.prob1.RuleSet;
import lesson5.labs.prob1.samplecode.AddrWindow;
import lesson5.labs.prob1.samplecode.ProfileWindow;

final public class ProfileRuleSet implements RuleSet {

    //package level access
    ProfileRuleSet() {
    }

    @Override
    public void applyRules(Component ob) throws RuleException {
        ProfileWindow prof = (ProfileWindow) ob;
        emptyRule(prof);

        if (prof.getFavoriteMovieValue().equals(prof.getFavoriteRestaurantValue())) {
            throw new RuleException("Favorite Movie and Favorite Restaurant cannot be same");
        }

//        if (!Pattern.matches("[a-zA-Z]*", prof.getFirstNameValue())) {
//            throw new RuleException("First Name cannot contain spaces or special characters other than a-Z or A-Z");
//        }
        
        if (!prof.getFirstNameValue().matches("[a-zA-Z]*")) {
            throw new RuleException("First Name cannot contain spaces or special characters other than a-Z or A-Z");
        }

        if (!prof.getLastNameValue().matches("[a-zA-Z]*" )) {
            throw new RuleException("Last Name cannot contain spaces or special characters other than a-Z or A-Z");
        }

    }

    private void emptyRule(ProfileWindow prof) throws RuleException {
        if (prof.getIdValue().length() == 0) {
            throw new RuleException("ID cannot be empty");
        }

        if (prof.getFirstNameValue().length() == 0) {
            throw new RuleException("First Name cannot be empty!");
        }

        if (prof.getLastNameValue().length() == 0) {
            throw new RuleException("Last Name cannot be empty!");
        }

        if (prof.getFavoriteMovieValue().length() == 0) {
            throw new RuleException("Favorite Movie cannot be empty!");
        }

        if (prof.getFavoriteRestaurantValue().length() == 0) {
            throw new RuleException("Favorite Restaurant cannot be empty");
        }
    }

    private void numericRule(AddrWindow addr) throws RuleException {
        String ID = addr.getIdValue();
        try {
            Integer.parseInt(ID);
        } catch (NumberFormatException e) {
            throw new RuleException("ID must be numeric");
        }
    }
}
