import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    double avg=0;
    for(int row=0; row<ray.length; row++){
      avg=0;
      for(int col=0; col<ray[row].length; col++){
        avg+=ray[row][col];
      }
      avg = avg / ray[row].length;
      System.out.println(avg);
    }
  }

  public void columnAverages(){
    double avg=0;
    for(int col=0; col<ray[0].length; col++){
      avg=0;
      for(int row=0; row<ray.length; row++){
        avg+=ray[row][col];
      }
      avg = avg / ray[col].length;
      System.out.println(avg);
    }
  }

  public void arrayAverage(){
    double avg=0;
    for(int row=0; row<ray.length; row++){
      for(int col=0; col<ray[row].length; col++){
        avg+=ray[row][col];
      }
    }
     avg = avg / ray[ray.length-1][ray[0].length-1];
    System.out.println(avg);
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    return"";
  }
}
