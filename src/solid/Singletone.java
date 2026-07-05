package solid;

class CodeRunner {

    void runCode() {
        System.out.println("running");
    }
}

class Debugger {

    void debugCode() {
        System.out.println("debugging");
    }
}

class TestCaseExecutor {

    void executeTestCases() {
        System.out.println("executing ");
    }
}

public class Singletone {

    public static void main(String[] args) {

        CodeRunner runner = new CodeRunner();
        Debugger debugger = new Debugger();
        TestCaseExecutor tester = new TestCaseExecutor();

        runner.runCode();
        debugger.debugCode();
        tester.executeTestCases();
    }
}
