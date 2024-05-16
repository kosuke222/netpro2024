public class Renshu {

    public int doubleValue(int x) {
        return x * 2;
    }
    public int sumUpToN(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
        sum+=i;
        }
        return sum;
    }
    public int sumFromPtoQ(int p, int q){
        int sum=0;
        for(int i=p;i<=q;i++){
        sum+=i;
        }
        if(p>=q){
            sum=-1;
        }
        return sum;
    }
    public int sumFromArrayIndex(int[] a, int index){
        int sum=0;
        for(int i=index;i<a.length;i++){
        sum+=a[i];
        }
        if(index<0||index>=a.length){
            sum=-1;
        }
        return sum;
    }
    public int selectMaxValue(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<=a[i]){
            max=a[i];
            }
        }
        return max;
    }
    public int selectMinValue(int[] a){
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(min>=a[i]){
            min=a[i];
            }
        }
        return min;
    }
    public int selectMaxIndex(int[] a){
        int max=a[0];
        int index=0;
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
            max=a[i];
            index=i;
            }
        }
        return index;
    }
    public int selectMinIndex(int[] a){
        int min=a[0];
        int index=0;
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
            min=a[i];
            index=i;
            }
        }
        return index;
    }
    void swapArrayElements(int[] p, int i, int j){
        int x= p[i];
        p[i]=p[j];
        p[j]=x;
    }
    boolean swapTwoArrays(int[] a, int[] b){
        if(a.length == b.length){
        for(int i=0;i<a.length;i++){
        int temp=a[i];
        a[i]=b[i];
        b[i]=temp;
        }
        return true;
        }else{
        return false;
        }
    }
}

