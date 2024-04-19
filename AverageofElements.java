public class AverageofElements {
    public static void main(String[] args) {
        int arr[]={1,5,8,6,9,7,2,3};
        int n=arr.length;
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        double average=sum/n;
        System.out.println("average is: "+average);
    }
}
