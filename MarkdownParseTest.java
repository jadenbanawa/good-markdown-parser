//compiling:
//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Files;

public class MarkdownParseTest {

   @Test
   public void test1(){
       assertEquals(2+2,4);
   }
   }