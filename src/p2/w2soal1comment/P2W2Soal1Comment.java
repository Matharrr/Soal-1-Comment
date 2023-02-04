package p2.w2soal1comment;
import java.io.*;

/**
 *
 * @author Muhamad Mathar Rizqi
 */
public class P2W2Soal1Comment {

    /**
     *
     * @param numA
     * @param numB
     * @return
     */
    public int addNum(int numA, int numB){
        return numA+numB;
    }

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
        P2W2Soal1Comment obj = new P2W2Soal1Comment();
        int sum = obj.addNum(10,20);
        System.out.println("Sum of 10 and 20 is : "+sum);
    }
    
}
