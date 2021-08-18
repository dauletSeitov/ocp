package leet.code;

public class GoalParserInterpretation {
    public static void main(String[] args) {

    }

    public String interpret(String command) {
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }
}
