//Calculates the aboslute value of a signed integer using bitwise operations
public static int absoluteValue(int num){
    if((num&-2147483648) !=0){
        num=~num+1;
    }
    return num;
}
