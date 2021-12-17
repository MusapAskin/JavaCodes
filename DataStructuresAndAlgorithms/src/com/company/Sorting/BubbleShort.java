package com.company.Sorting;
/*Kabarcık sıralamasını göstermek amacıyla tasarlanmış program örneği.*/
public class BubbleShort {
    public static void Sort(int[] A){
        int temp;
        for (int i=0; i<A.length;i++){
            boolean inLine=true;
            //for(int j=1;j<A.length-i+1;j++) şeklinde de döngü yazılabilir.
            for (int j=A.length-1;j>i;j--){
                if (A[j-1]>A[j]){
                    inLine=false;
                    temp=A[j-1];
                    A[j-1]=A[j];
                    A[j]=temp;
                }
            }
            if (inLine)break;
        }
    }
    public static void main(String[] args) {
        int[] A={2,4,3,5,1,0};
        Sort(A);
        for (int element:A
             ) {
            System.out.print(element+" ");
        }
    }
}

