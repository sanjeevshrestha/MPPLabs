/*
* Name - Sanjeev Shrestha
* ID -984970
**/
package lesson5.labs.prob1;

import java.awt.Component;

import lesson5.labs.prob1.rulesets.RuleException;

public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
