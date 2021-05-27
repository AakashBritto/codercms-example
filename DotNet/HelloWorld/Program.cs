using System;

double REAMIN = 10_000000000;

double total = 100000000_000000000;

Console.WriteLine($"Total: {total}");

double tradePercent = 0.8;

int needDays = 1;

while (total > REAMIN)
{
    if (needDays % 90 == 0)
    {
        if(tradePercent < 0.01)
        {
            tradePercent = 0.01;
        }
        else
        {
            tradePercent = tradePercent * 0.91;
        }

        Console.WriteLine($"needDays, tradePercent {needDays}, {tradePercent}");
    }

    if(needDays > 10000)
    {
        Console.WriteLine($"**** needDays is more than 10000");
        break;
    }

    total = total - (total * tradePercent) * 0.02;

    needDays++;
}

Console.WriteLine($"Remain Total: {total}");
Console.WriteLine($"Need Days: {needDays}");