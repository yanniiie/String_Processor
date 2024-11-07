package org.example;

public class StringProcessor {


        // Method to check if a password is strong
        public boolean isStrongPassword(String password) {
            if (password == null || password.length() < 8) return false;

            boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) hasUpper = true;
                else if (Character.isLowerCase(ch)) hasLower = true;
                else if (Character.isDigit(ch)) hasDigit = true;
                else hasSpecial = true;
            }

            return hasUpper && hasLower && hasDigit && hasSpecial;
        }

        // Method to count digits in a sentence
        public int calculateDigits(String sentence) {
            if (sentence == null) return 0;

            int digitCount = 0;
            for (char ch : sentence.toCharArray()) {
                if (Character.isDigit(ch)) digitCount++;
            }

            return digitCount;
        }

        // Method to count words in a sentence
        public int calculateWords(String sentence) {
            if (sentence == null || sentence.trim().isEmpty()) return 0;

            String[] words = sentence.trim().split("\\s+");
            return words.length;
        }

        // Method to calculate the result of an arithmetic expression
        public double calculateExpression(String expression) {
            if (expression == null || expression.isEmpty()) throw new IllegalArgumentException("Expression cannot be null or empty");

            try {
                return eval(expression);
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid expression");
            }
        }

        // Helper method for expression evaluation using recursion (basic implementation)
        private double eval(String expression) {
            // A placeholder method; in a full implementation, you'd parse and evaluate
            return 0.0;
        }

}