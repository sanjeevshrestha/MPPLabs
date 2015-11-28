/*
* Name - Sanjeev Shrestha
* ID -984970
**/
package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labs.prob1.RuleSet;
import lesson5.labs.prob1.samplecode.AddrWindow;

final public class AddressRuleSet implements RuleSet {

    //package level access
    AddressRuleSet() {
    }

    @Override
    public void applyRules(Component ob) throws RuleException {
        AddrWindow addr = (AddrWindow) ob;

        emptyRule(addr);
        numericRule(addr);

        String stateVal = addr.getStateValue();
        if (stateVal.length() != 2) {
            throw new RuleException("State should be exactly 2 digits");
        }

        if (!stateVal.matches("[A-Z]{2}" )) {
            throw new RuleException("State should only contain A-Z");
        }
        if (addr.getZipValue().length() != 5) {
            throw new RuleException("Zip should be exactly 5 digits");
        }
        
        if(addr.getZipValue().equals(addr.getIdValue()))
        {
            throw new RuleException("ID and Zip cannot be same");
        }
    }

    private void emptyRule(AddrWindow addr) throws RuleException {
        if (addr.getIdValue().length() == 0) {
            throw new RuleException("ID cannot be empty");
        }

        if (addr.getStreetValue().length() == 0) {
            throw new RuleException("Street cannot be empty!");
        }

        if (addr.getCityValue().length() == 0) {
            throw new RuleException("City cannot be empty!");
        }

        if (addr.getStateValue().length() == 0) {
            throw new RuleException("State cannot be empty!");
        }

        if (addr.getZipValue().length() == 0) {
            throw new RuleException("Zip cannot be empty");
        }
    }

    private void numericRule(AddrWindow addr) throws RuleException {
        String zip = addr.getZipValue();
        String ID = addr.getIdValue();
        try {
            Integer.parseInt(zip);
            Integer.parseInt(ID);
        } catch (NumberFormatException e) {
            throw new RuleException("ID and Zip must be numeric");
        }
    }

}
