//Calculates X mod (Any power of two)
//Ideally, this should throw a divisor not power of two exception of something before actually trying to implement.
//Granted, you  should really just use modulus because there's very little advantage to using bitwise operations

public static int modByPowerOfTwo(int dividend, int divisor){
    int remainder = 0;
    while(divisor!=0){
        remainder+=(dividend&divisor);
        divisor = (divisor>>1);
    }
    return remainder;
}
