package solid;

/*
SINGLE RESPONSIBILITY PRINCIPLE (SRP)


Definition:
A class should have only one responsibility
and only one reason to change.

This example follows SRP by separating:
- Running Code
- Debugging Code
- Executing Test Cases
*/

class CodeRunner {

    // Responsible only for running code
    void runCode() {
        System.out.println("Running Code");
    }
}

class Debugger {

    // Responsible only for debugging
    void debugCode() {
        System.out.println("Debugging Code");
    }
}

class TestCaseExecutor {

    // Responsible only for executing test cases
    void executeTestCases() {
        System.out.println("Executing Test Cases");
    }
}

public class SRP {

    public static void main(String[] args) {

        CodeRunner runner = new CodeRunner();
        Debugger debugger = new Debugger();
        TestCaseExecutor tester = new TestCaseExecutor();

        runner.runCode();
        debugger.debugCode();
        tester.executeTestCases();
    }
}

