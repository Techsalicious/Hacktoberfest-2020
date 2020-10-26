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
    int A[11] = {3, 5, 19, 27, 30, 43, 99, 187, 234, 351, 990};
    int value;

    printf("Enter the amount you want to search\n");
    scanf("%d", &value);

    printf("%d\n",binarySearch(A, 11, value));
    return 0;
}