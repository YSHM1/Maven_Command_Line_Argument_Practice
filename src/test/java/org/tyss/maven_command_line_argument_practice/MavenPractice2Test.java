package org.tyss.maven_command_line_argument_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenPractice2Test {
	@Test
	public void mavenPracticeTest1() {
		Reporter.log("Practice1 ===> MavenPractice2Test ",true);
	}

	@Test
	public void mavenPracticeTest2() {
		Reporter.log("Practice2 ===> MavenPractice2Test ",true);
	}

	@Test
	public void mavenPracticeTest3() {
		Reporter.log("Practice3 ===> MavenPractice2Test ",true);
	}
}
