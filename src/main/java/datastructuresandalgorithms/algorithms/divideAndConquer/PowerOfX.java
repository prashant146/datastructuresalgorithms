package datastructuresandalgorithms.algorithms.divideAndConquer;


public class PowerOfX {

    public static void main(String[] args) {
        System.out.println(getPowerOfXToY(2,6));
    }

    public static int getPowerOfXToY(int x, int y){

        if(y==0){
            return 1;
        }

        if(y%2==0){
            return getPowerOfXToY(x, y/2)*getPowerOfXToY(x,y/2);
        }else{
            return x*getPowerOfXToY(x, y/2)*getPowerOfXToY(x,y/2);
        }

    }

}
