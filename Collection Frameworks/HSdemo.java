import java.util.*;
class HSdemo
{
public static void main (String[] args )
{
HashSet<Integer> h = new HashSet<>();
HashSet<Integer> duplicate = new HashSet<>();
int[] arr ={1,2,3,2,4,3,5,4,6};
for(int num:arr)
{
if(!h.add(num))
{
duplicate.add(num);
}
}

       ArrayList a = new ArrayList(duplicate);
      System.out.println(a);

}


}




