// Program to find first and last 
// digits of a number 
#include <stdio.h> 

  
// Find the first digit 
int firstDigit(int n) 
{ 
    // Remove last digit from number 
    // till only one digit is left 
    while (n >= 10)  
        n /= 10; 
      
    // return the first digit 
    return n; 
} 
  
// Find the last digit 
int lastDigit(int n) 
{ 
    // return the last digit 
    return (n % 10); 
} 
  
// Driver program 
int main() 
{ 
    int n;
  scanf("%d",&n);
    printf("%d",firstDigit(n) +lastDigit(n)); 
    return 0; 
} 