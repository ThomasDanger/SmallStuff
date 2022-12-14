public static boolean isSameSign(int num1, int num2){ return (num1&-2147483648) == (num2&-2147483648); }
public static boolean isOppSign(int num1, int num2){ return (num1&-2147483648) != (num2&-2147483648); }
