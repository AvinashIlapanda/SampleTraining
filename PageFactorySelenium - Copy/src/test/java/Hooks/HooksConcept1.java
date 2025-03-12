package Hooks;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksConcept1 {
@Before
public void method1() {
	System.out.println("Before Execution");
}
@BeforeStep
public void method2() {
	System.out.println("Before step");
}
@AfterStep
public void method3() {
	System.out.println("After Steps");
}

}
