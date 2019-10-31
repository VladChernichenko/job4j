package job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int test) {
        boolean prime = true;
        for(int i = 2; i < test; i++){
            if(test % i == 0){
//                System.out.println(test + " " + i);
                prime = false;
            }
        }
        return prime;
    }
}