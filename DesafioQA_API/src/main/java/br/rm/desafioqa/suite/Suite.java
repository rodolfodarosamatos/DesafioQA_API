package br.rm.desafioqa.suite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import br.rm.desafioqa.rest.core.BaseTest;
import br.rm.desafioqa.test.MainTest;

@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({MainTest.class})
public class Suite extends BaseTest{

	
}
