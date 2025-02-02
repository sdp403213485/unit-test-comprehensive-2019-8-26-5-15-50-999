package example;/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.jupiter.api.*;

import tw.Main;
import tw.commands.GuessInputCommand;

import java.util.LinkedList;
import java.util.List;

import javax.print.attribute.standard.OutputDeviceAssigned;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@DisplayName("A special tests collection for junit and mockito")
class LibraryTest {
	@Test
	void should_return_1A_0B_when_GuessInputCommmand_given_1567() {
		//given
		GuessInputCommand guessInputCommand = new GuessInputCommand();
		String input="1567";
		String str ="1234";
		//when
		String result = Main.output(input,str);
		//then
		assertEquals("1A0B", result);
	}
	
		@Test
		void should_return_right_when_GuessInputCommmand_given_1234() {
			//given
			GuessInputCommand guessInputCommand = new GuessInputCommand();
			String input="1234";
			String str ="1234";
			//when
			String result = Main.output(input,str);
			//then
			assertEquals("right", result);
		}
		
		@Test
		void should_return_0A_4B_when_GuessInputCommmand_given_4321() {
			//given
			GuessInputCommand guessInputCommand = new GuessInputCommand();
			String input="4321";
			String str ="1234";
			//when
			String result = Main.output(input,str);
			//then
			assertEquals("0A4B", result);
		}
		
		@Test
		void should_return_2A_2B_when_GuessInputCommmand_given_13245() {
			//given
			GuessInputCommand guessInputCommand = new GuessInputCommand();
			String input="13245";
			String str ="1234";
			//when
			String result = Main.output(input,str);
			//then
			assertEquals("2A2B", result);
		}
	
//    @BeforeAll
//    static void initTestEnv() {
//    }
//
//    @BeforeEach
//    void initEveryMethod() {
//    }
//
//    @Test
//    @DisplayName("someLibraryMethod should return 'true'")
//    void testSomeLibraryMethod() {
//        Library classUnderTest = new Library();
//        Assertions.assertTrue(classUnderTest.someLibraryMethod());
//    }
//
//    @Test
//    @SuppressWarnings("unchecked")
//    void testMockClass() throws Exception {
//        // you can mock concrete classes, not only interfaces
//        LinkedList mockedList = mock(LinkedList.class);
//
//        // stubbing appears before the actual execution
//        String value = "first";
//        when(mockedList.get(0)).thenReturn(value);
//
//        Assertions.assertEquals(value, mockedList.get(0));
//    }
//
//    @Test
//    @SuppressWarnings("unchecked")
//    void test_mock_verify() {
//        // mock creation
//        List<String> mockedList = mock(List.class);
//        // using mock object - it does not throw any "unexpected interaction" exception
//        mockedList.add("one");
//        mockedList.clear();
//        // selective, explicit, highly readable verification
//        verify(mockedList).add("one");
//        verify(mockedList).clear();
//    }
//
//    @Test
//    void groupedAssertions() {
//        // In a grouped assertion all assertions are executed, and any
//        // failures will be reported together.
//        String firstName = "John";
//        String lastName = "Doe";
//
//        assertAll("person",
//                () -> assertEquals("John", firstName),
//                () -> assertEquals("Doe", lastName)
//        );
//    }
//
//    @Test
//    void exceptionTesting() {
//        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
//            throw new IllegalArgumentException("a message");
//        });
//        Assertions.assertEquals("a message", exception.getMessage());
//    }
//
//    @Test
//    @Disabled
//    void timeoutExceeded() {
//        // The following assertion fails with an error message similar to:
//        // execution exceeded timeout of 10 ms by 91 ms
//        assertTimeout(ofMillis(10), () -> {
//            // Simulate task that takes more than 10 ms.
//            Thread.sleep(100);
//        });
//    }
}
