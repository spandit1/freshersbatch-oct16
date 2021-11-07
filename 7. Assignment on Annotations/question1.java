package assignment7;

@interface Test{
	String test_case();
	}

@Test(test_case = "1")
class Example1{
	//@Test is implying one method "test_case"
}

@Test(test_case = "2")
class Example2{
	//Again @Test is implying one method "test_case"
}