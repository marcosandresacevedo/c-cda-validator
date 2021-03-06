/**
 This software was developed at the National Institute of Standards and Technology by employees
of the Federal Government in the course of their official duties. Pursuant to title 17 Section 105 of the
United States Code this software is not subject to copyright protection and is in the public domain.
This is an experimental system. NIST assumes no responsibility whatsoever for its use by other parties,
and makes no guarantees, expressed or implied, about its quality, reliability, or any other characteristic.
We would appreciate acknowledgement if the software is used. This software can be redistributed and/or
modified freely provided that any derivative works bear some notice that they are derived from it, and any
modified versions bear some notice that they have been modified.

Project: NWHIN-DIRECT
Author: Frederic de Vaulx
		Diane Azais
		Julien Perugini
 */

package validationTests;

import static org.junit.Assert.assertTrue;
import gov.nist.healthcare.ttt.direct.directValidator.DirectMessageHeadersValidator;
import org.junit.Test;

public class DirectMessageValidatorToTest {
	
	DirectMessageHeadersValidator validator = new DirectMessageHeadersValidator();
	
	// DTS 118, To, Required
	// Result: Success
	@Test
	public void testTo() {
		assertTrue(validator.validateTo("Ashish Rathee <ashish@ssa-w0066.acct04.us.lmco.com>", false).isSuccess());
	}
			
	// Result: Fail
	@Test
	public void testTo2() {
		assertTrue(!validator.validateTo("ashish.ssa-w0066.acct04.us.lmco.com", false).isSuccess());   // Not a valid name
	}
}
