public class les_operateurs_arithmetiques
{
	public static void main(String[] args) {
        int val1, val2, res;
        val1 = 0;val2 = 1;
        
        res = val1+val2;
        System.out.println(res);    //1
        
        res = val1-val2;
        System.out.println(res);    //-1
        
        res = val1*val2;
        System.out.println(res);    //0
        
        res = val1/val2;
        System.out.println(res);    //0
        
        res = val1++;               //first res = val1 = 0 then val1 +=1
        System.out.println(res);    //0 
        System.out.println(val1);   //1
        
        res = ++val1;               //first val1 +=1 = 2 then res = val1 = 2
        System.out.println(res);    //2
        System.out.println(val1);   //2
	}
}