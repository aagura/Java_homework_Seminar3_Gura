import java.util.ArrayList;
import java.util.Random;
public class ht1 {
    public static void main(String[] args) {
 // Пусть дан произвольный список целых чисел.


// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение
// 1) Нужно удалить из него чётные числа
  ArrayList<Integer> ints = new ArrayList<>();
  Random rnd = new Random();
  int min =11;
  int max =0;
  double avarage=0;
  for (int i = 0; i < 10; i++) {
   ints.add(rnd.nextInt(10));
    if (ints.get(i)>max){
       max = ints.get (i);
    }
    if (ints.get(i)<min){
      min = ints.get (i);
    } 
    avarage=avarage+ints.get(i);
  }
   System.out.println(ints); 
  for (int i = 0; i < ints.size(); i++) {
   
    if (ints.get(i)%2==0){
       ints.remove(i);
       i=i-1;
      
    }
  }
    
   System.out.printf("max = %d \n", max);
   System.out.printf("min = %d \n", min);
   System.out.printf("avarage = %f \n", avarage/10);
   System.out.println(ints); 
}
}
