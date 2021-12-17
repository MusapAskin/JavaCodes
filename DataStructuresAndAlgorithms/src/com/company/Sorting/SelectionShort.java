package com.company.Sorting;

public class SelectionShort {
      public static int [] Sort(int [] A) {
          int temp;
          int min;
          for (int i = 0; i < A.length - 1; i++) {
              min = i;
              for (int j = i; j < A.length; j++) {
                  if (A[j] < A[min]) {
                  min = j;
              }
          }
              temp = A[i];
              A[i]=A[min];
              A[min]=temp;
          }
          return A;
      }

    public static void main(String[] args) {
        int[] array ={1,5,4,7,6,8,9,2,3};
        for (int i:array
        ) {
            System.out.print(i+" ");
        }
        System.out.println();
        Sort(array);
        for (int i:array
             ) {
            System.out.print(i+" ");
        }

    }
}
