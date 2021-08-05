package lib

import static org.junit.Assert.*

import gradle.project.FizzBuzz
import org.junit.Before
import org.junit.Test

class FizzBuzzTest {
	
	def fizzBuzz
	
	@Before
	void before() {
		fizzBuzz = new FizzBuzz()
	}

	@Test
	public void 'should  be fizz'() {
		assert fizzBuzz.play(3) == 'Fizz'
	}

}
