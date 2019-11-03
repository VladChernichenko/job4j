package job4j.loop;

public class PrimeNumber {
    public int calc(int x) {
        int count = 0;
        for(int i = 2; i <= x; i++){//тестовое число
            boolean prime = true;
            for(int j = 2; j <= i; j++){
                   if(i % j == 0 && ( i != j)){
                       prime = false;
                       break;
                   }
               }
            if(prime)
                count ++;

        }
        return count;
    }
}
