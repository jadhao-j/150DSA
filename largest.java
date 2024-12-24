public class largest {
    public static void main(String[] args) {
        int arr[]={4,7,1,8,5};
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("largest number: "+largest);
        System.out.print("smallest number: "+smallest);
        

    }
    
}
