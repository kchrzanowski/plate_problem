package pl.codemode;

import org.apache.commons.lang.StringUtils;

public class PlateUtils {
    private static final String[] CHARACTERS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
        "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static String generate(int length, int index) {
        int charactersLength = CHARACTERS.length;
        validateInputArguments(length, index, charactersLength);
        if (index < charactersLength) {
            return StringUtils.leftPad(CHARACTERS[index], length, '0');
        }
        int currentSignIndex = index % (charactersLength - 1);
        int divisor = index / (charactersLength - 1);
        var plate = "";
        var padLength = 0;
        if (currentSignIndex == 0) {
            plate = "Z";
            padLength = divisor;
        } else {
            plate = CHARACTERS[currentSignIndex];
            padLength = divisor + 1;
        }
        plate = StringUtils.rightPad(plate, padLength, 'Z');
        plate = StringUtils.leftPad(plate, length, '0');
        return plate;
    }

    private static void validateInputArguments(int length, int index, int charactersLength) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be a positive number!");
        }
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative number!");
        }
        int maxIndex = length * charactersLength;
        if (index >= maxIndex) {
            throw new IllegalArgumentException("Index cannot be greater than possible combinations!");
        }
    }
}
