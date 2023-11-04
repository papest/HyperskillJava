package repetition.logger;

import java.util.logging.Logger;

class Util {
    static Logger logger = Logger.getLogger(Util.class.getName());

    public static String capitalize(String str) {
        String result = str;
        logger.info(String.format("Before: %s", str));

        try {
            if (str == null || str.isBlank()) {
                return result;
            }

            if (str.length() == 1) {
                result = str.toUpperCase();
                return result;
            }

            result = Character.toUpperCase(str.charAt(0)) + str.substring(1);
            return result;

        } finally {
            logger.info(String.format("After: %s", result));
        }
    }

    public static void main(String[] args) {
        capitalize("string");
        capitalize(null);
        capitalize("g");
        capitalize("STRING");
        capitalize("");
    }
}
