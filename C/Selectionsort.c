#include<stdio.h>

void swap(int *a,int *b)
{
	int temp;
	temp=*a;
	*a=*b;
	*b=temp;
}

void selection_sort(int A[],int n)
{
	int i,j,k;
	for(i=0;i<n;i++)
	{
		for(j=k=i;j<n;j++)
		{
			if(A[j]<A[k])
			{
				k=j;	
			}
		}
		swap(&A[i],&A[k]);
	}
}

int main()
{
	int A[]={3,56,84,54,7,34,65};
	int n=7;
	printf("before sorting:\n");
	for(int i=0;i<n;i++)
	{
		printf("%d\t",A[i]);	
	}
	selection_sort(A,n);
	printf("\nafter sorting:\n");
	for(int i=0;i<n;i++)
	{
		printf("%d\t",A[i]);
	}
	return 0;
}
