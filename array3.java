

// find span of given array
public class array3 {
    public static void main(String[] args) {
        
    
    int arr[] = {10,20,3,11,50};
    int max=arr[0];
    int min=arr[0];
    for(int i=1;i<arr.length;i++) {
        if(arr[i]>max) {
            max=arr[i];
        }
    }
    for(int i=1;i<arr.length;i++) {
        if(arr[i]<min) {
            min=arr[i];
        }
    }
    System.out.println(max-min);
}
}
