package customcode;

import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

/**
 * @author unknown
 */
public class PrintArgs implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public PrintArgs() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		tes.getTestLogManager().reportMessage("Args is " + args[0]);
		return null;
	}

}
