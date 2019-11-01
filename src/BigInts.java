import java.math.BigInteger;

public class BigInts {

    public static void main(String[] args){
        BigInteger x = new BigInteger("1234545555");
        BigInteger y = new BigInteger("1234545555");
        System.out.println(add(x, y));

    }

    static BigInteger add(BigInteger x, BigInteger y){

        return x.add(y);

    }

}
