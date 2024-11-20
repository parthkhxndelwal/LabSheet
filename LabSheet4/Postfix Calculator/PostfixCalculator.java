import java.util.Stack;

class PostfixCalculator {

    // Method to evaluate a postfix expression
    public int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();

        // Split the expression into tokens
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            // Check if the token is an operator
            if (isOperator(token)) {
                // Pop the top two elements from the stack
                int b = stack.pop();
                int a = stack.pop();

                // Perform the operation and push the result back onto the stack
                int result = performOperation(a, b, token);
                stack.push(result);
            } else {
                // If the token is a number, push it onto the stack
                stack.push(Integer.parseInt(token));
            }
        }

        // The final result will be the only element left in the stack
        return stack.pop();
    }

    // Helper method to check if a token is an operator
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    // Helper method to perform the operation
    private int performOperation(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        PostfixCalculator calculator = new PostfixCalculator();

        String expression = "5 1 2 + 4 * + 3 -";
        int result = calculator.evaluate(expression);

        System.out.println("Postfix Expression: " + expression);
        System.out.println("Result: " + result);
    }
}
