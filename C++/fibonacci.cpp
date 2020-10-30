/*
    A cpp program to generate the sequence of fibonacci numbers.
    It outputs the list to stdout.
*/
#include<iostream>

int main(){
    // Let us ask the user the number of terms he wants ... 
    std::cout << "Enter the number of terms: ";
    int terms;
    std::cin>>terms;

    if(terms <= 0){
        std::cout<<"The number of terms should be greater than 0\n";
        return 1;
    }
    for(int i=0, a = 0, b = 1, c;i<terms;i++){
        std::cout<<a<<" ";
        //generating next term
        a += b;
        // swapping a & b coz we always printing a.
        c = a; a = b; b = c;
    }
    std::cout<<"\n";
    return 0;
}