package problem2;

public class IntegerList
{
    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    int currentNumber;
    int currentSize;
    public IntegerList(int size)
    {
        list = new int[size];
        currentSize = size;
        currentNumber = size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    
    public int[] increaseSize(){
        int n = 2*currentSize;
        int[] L1 = new int[n];
        for(int i=0;i<currentSize;i++){
            L1[i]=list[i];
        }
        list = L1;
        currentSize=n;
        return L1; 
    }
    public void addElement(int newVal){
        if (currentNumber == currentSize) {
            increaseSize();
        }
        list[currentNumber] = newVal;
        currentNumber++;
    }
    public void removeFirst(int newValue){
        int n = list.length;
        for(int i=0;i<currentNumber;i++){
            if(list[i] == newValue){
                for(int j=i;j<currentNumber-1;j++){
                    list[j]=list[j+1];
                }
                list[currentNumber-1]=0;
                currentNumber--;
                break;
            }
        }
    }
    public void removeAll(int newValue){
        int n = currentNumber;
        for(int i=0;i<n;i++){
            removeFirst(newValue);
        }

    }
}