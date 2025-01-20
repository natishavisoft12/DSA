public class Jump  {
    static int funn(int arr[]){
        int n=arr.length;
        if(arr[0]==0)
            return -1;
        int maxr=0;
        int curr=0;
        int jump=0;
        for(int i=0;i<n;i++){
            maxr=Math.max(maxr,i+arr[i]);

            
            if(maxr >= n-1){
                return jump+1;

            }
            if(i== curr){
                if(i==maxr){
                    return -1;
                }
                else {
                    jump++;
                    curr=maxr;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[]={2,3,1,1,4};
        System.out.println(funn(arr));
    }

}