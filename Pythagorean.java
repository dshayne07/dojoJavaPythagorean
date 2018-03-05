import java.lang.Math;
public class Pythagorean{
    public static double calculateHypotenuse(int legA, int legB) {
        double result = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        return result;
    }
    public static void main(String[] args){
        System.out.println(calculateHypotenuse(4,6));
    }
}