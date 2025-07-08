public static int parseCharArrayToInt(char[] chars) {
    if (chars == null || chars.length == 0) {
        throw new IllegalArgumentException("Invalid input");
    }
    
    int result = 0;
    int i = 0;
    boolean negative =    false;
    
    if (chars[0] == '-') {
        negative = true;
        i = 1;
    } else if (chars[0] == '+') {
        i = 1;
    }
    
    for (; i < chars.length; i++) {
        if (chars[i] < '0' || chars[i] > '9') {
            throw new IllegalArgumentException("Invalid character");
        }
        result = result * 10 + (chars[i] - '0');
    }
    
    return negative ? -result : result;
}