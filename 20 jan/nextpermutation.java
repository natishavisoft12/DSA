import java.util.Arrays;

public class nextpermutation {
    static void permutation(int a[]){
        int n=a.length;
        int i1=1;
        int maxr=-1;
        while(i1<n){
            if(a[i1]>a[i1-1])
                maxr=i1;
            i1++;
        }
        if(maxr ==-1)//desc
        {
            for(int i=0;i<n/2;i++){
                int temp=a[i];
                a[i]=a[n-i-1];
                a[n-i-1]=temp;
            }
        }

        int np=a[maxr];
        int ind=maxr;
        for(int i=maxr;i<n;i++){
            if(a[i]>a[maxr-1] && a[i]<a[maxr]){
                ind=i;
            }
        }
        int temp=a[maxr-1];
        a[maxr-1]=a[ind];
        a[ind]=temp;
        Arrays.sort(a,maxr+1,n);
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,1};
        permutation(arr);
    }
}