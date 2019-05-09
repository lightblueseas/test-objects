/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.test.objects.exceptions;

import static org.testng.Assert.assertNotNull;

import org.meanbean.test.BeanTester;
import org.testng.annotations.Test;

import de.alpharogroup.evaluate.object.verifier.ContractVerifier;

/**
 * The unit test class for the class {@link ExceptionEvent}.
 */
public class ExceptionEventTest
{

	/**
	 * Test method for {@link ExceptionEvent} constructors
	 */
	@Test
	public final void testConstructors()
	{
		ExceptionEvent model = new ExceptionEvent();
		assertNotNull(model);
		model = new ExceptionEvent(new NullPointerException());
		assertNotNull(model);
		model = ExceptionEvent.builder().build();
		assertNotNull(model);
	}

	/**
	 * Test method for {@link ExceptionEvent}
	 */
	@Test
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(ExceptionEvent.class);
	}

	/**
	 * Test method for {@link ExceptionEvent#equals(Object)} , {@link ExceptionEvent#hashCode()} and
	 * {@link ExceptionEvent#toString()}
	 */
	@Test
	public void verifyEqualsHashcodeAndToStringContracts()
	{
		ContractVerifier.of(ExceptionEvent.class).verify();
	}
}
