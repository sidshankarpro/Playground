#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int i =0;
  for(i=1;i<=n;i++)
  {
    if(i%2!=0)
   printf("%d \n",i);
  }
 
	return 0;
}