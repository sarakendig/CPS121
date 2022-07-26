## Shipping Cost - Scanner


### Changes in the economy have determined that for the Fed-Ups shipping company, a surcharge will be assessed on all packages that meet certain criteria. The surcharge is a function of the characteristics of the package and the zip code to which it is sent.




1. The regular charges for shipping are calculated as follows:
   1. For all weights five pounds and under, the shipping cost is $12.00.
   2. For all weights over five pounds, the charge is calculated as follows:

- If length * width * height is:
   - o greater than 5 and less than or equal to 15, the shipping cost is 14.00
   - o greater than 15 and less than or equal to 30, the shipping cost is 21.00
   - o greater than 30 and less than or equal to 45, the shipping cost is 34.00
   - o greater than 45 and less than or equal to 60, the shipping cost is 50.00
   - o greater than 60, the shipping cost is 105.00

2. The additional charges are calculated as follows:
   - o If the first digit of the zip code is a "4" then there is an additional surcharge of
5% on the shipping cost.
   - o If the first digit of the zip code is a "6" then there is an additional surcharge of
7% on the shipping cost.
   - o For all other zip codes there is an additional surcharge of 9% on the shipping
cost.

3. Finally:
   - o if the zip code is even, then there is an additional surcharge of 2% of the
shipping cost.

Write a program that allows the user to input (in this order) the length, width, height,
zip code, weight, and height of the package then prints out the following:
1. The surcharge
2. zip code
3. The shipping charges
4. weight
5. The total cost (shipping cost plus surcharge(s))


This program should be well documented (comments for the programmer and user)
both internally and externally.
