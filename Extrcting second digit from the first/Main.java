#include <stdio.h>
int getdigit(int num, int n)
{
    int r, t1, t2;
 
    t1 = pow(10, n+1);
    r = num % t1;
 
    if (n > 0)
    {
        t2 = pow(10, n);
        r = r / t2;
    }
 
    return r;
}
 
int main()
{
   int n, reverse = 0;
 
   
   scanf("%d", &n);
 
   while (n != 0)
   {
      reverse = reverse * 10;
      reverse = reverse + n%10;
      n       = n/10;
   }
 
 
  int num = reverse, pos=1;
 
    
 
    printf("%d", getdigit(num, pos));
 
   return 0;
}