public class Palindromes {
    public String checker(String userInput) {
        StringBuilder holder = new StringBuilder();
        for (int index = userInput.length()-1; index >= 0; index--) {
            holder.append(userInput.charAt(index));
        }
        return holder.toString().toLowerCase();
    }
    public boolean isPalindromes(String userInput) {
        StringBuilder holder = new StringBuilder();
        for (int index = userInput.length() - 1; index >= 0; index--) {
            holder.append(userInput.charAt(index));
        }
        return holder.toString().equalsIgnoreCase(userInput);
    }
}