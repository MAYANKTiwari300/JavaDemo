#include <stdio.h>
int main() {
    int year;
    printf("Enter a year");
    scanf("%d",& year);
    //if a year is a leap year it is divisible by 400
    if(year%400==0)
    {
        printf("Leap year=%d", year);
    }
    // a year is a leap year if it is not divisible by 100 but divisile by 400
    else if(year%100==0)
    {
        printf("%d is not a leap year", year);
    }
    else if(year%4==0)
    {
        printf("Leap Year =%d", year);
    }
    else 
    {
        printf("%d is not a Leap Year",year);
    }
}