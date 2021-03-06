import java.util.*;
import java.util.Scanner;
class insertion_binaryinsertion{
    static int[] nums;
    public void bubblesort(int[] nums){
        for(int i=0;i<nums.length;i++){
            boolean x=true;
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    nums[j+1]+=nums[j];
                    nums[j]=nums[j+1]-nums[j];
                    nums[j+1]-=nums[j];
                    x=false;
                }
            }
            if(x==true) return;
        }
    }
    public void insertionsort(int [] nums){
        for(int i=1;i<nums.length;i++){
            int key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
    }
    public void binaryinsertion(int [] nums){
        for(int i=1;i<nums.length;i++){
            int temp=nums[i];
            int j=Math.abs(Arrays.binarySearch(nums,0,i,temp)+1);
            System.arraycopy(nums,j,nums,j+1,i-j);
            nums[j]=temp;
        }
    }
    public void printArray(int [] nums){
        for(int i : nums)
            System.out.print(i+" ");
        System.out.println("\n");
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("Enter array size: ");
        n=scan.nextInt();
        System.out.println("Enter elements: ");
        int i=0;
        nums=new int[n];
        while(i<n){
           nums[i]=scan.nextInt();
           i++;
        } 
        insertion_binaryinsertion th=new insertion_binaryinsertion();
        th.binaryinsertion(nums);
        th.printArray(nums);
    }
}
