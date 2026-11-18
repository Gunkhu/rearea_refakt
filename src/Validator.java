public class Validator {
    public static boolean isValidInput(String input) {
        String sample = "[0-9]+";
        if (input.matches(sample)) {
            if (!isValidNumber(input)) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    private static boolean isValidNumber(String input) {
        Double num = Double.parseDouble(input);
        if (num <= 0) {
            return false;
        }
        return true;
    }
}
