package com.keyword;

import java.util.Scanner;

enum Week {SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
int value;
Week(int value)
{
    this.value=value;
}
};
public class EnumValueOfMethod
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Day: ");
        String day = in.next();
        for(Week week : Week.values())
        {
            if(week==Week.valueOf(day))
            {
                System.out.println(week+" has value "+week.value);
            }
        }
    }
}
