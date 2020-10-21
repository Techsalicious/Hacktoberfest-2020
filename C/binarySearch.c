#include <stdio.h>

int binarySearch(int *A, int len, int value) {
    int p = 1, r = len, q;
    while(p <= r) {
       q = (p+r)/2; 
       if(A[q] == value) {
           return q;
       }
       else if(A[q] > value) {
           r = q-1;
       }
       else if(A[q] < value) {
           p = q+1;
       }
    }
    return -1;
}

int main(int argc, char const *argv[]){
    int A[9] = {1,2,3,4,5,6,7,8,9};

    printf("%d\n",binarySearch(A, 9, 8));
    return 0;
}