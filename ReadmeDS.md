# Find number of digits in a number
## Soln 1 : 
> Check whether the number N is equal to zero.
>
> Increase the count of digits by 1 if N is not zero.
>
> Reduce the number by dividing it by 10.
>
> Repeat the above steps until the number is reduced to zero.

## Soln 2:
> K = floor(log10(N) + 1) // k is number of digits in the number N.


# General Formulas to solve problems related to Arithmetic Progressions: If ‘a’ is the first term and ‘d’ is the common difference:
> nth term of an AP = a + (n-1)*d.
>
> Arithmetic Mean = Sum of all terms in the AP / Number of terms in the AP.
>
> Sum of ‘n’ terms of an AP = 0.5 * n (first term + last term) = 0.5 n [ 2a + (n-1) d ].


# The behaviour of a geometric sequence depends on the value of the common ratio. If the common ratio is:
> Positive, the terms will all be of the same sign as the initial term.
>
> Negative, the terms will alternate between positive and negative.
>
> Greater than 1, there will be exponential growth towards positive or negative infinity (depending on the sign of the initial term).
>
> 1, the progression is a constant sequence.
>
> Between -1 and 1 but not zero, there will be exponential decay towards zero.
>
> -1, the progression is an alternating sequence.
>
> Less than -1, for the absolute values there is exponential growth towards (unsigned) infinity, due to the alternating sign.

# General Formulas to solve problems related to Geometric Progressions:
## If ‘a’ is the first term and ‘r’ is the common ratio:  

> nth term of a GP = a*rn-1.
>
> Geometric Mean = nth root of the product of n terms in the GP.
>
> Sum of ‘n’ terms of a GP (r < 1) = [a (1 – rn)] / [1 – r].
>
> Sum of ‘n’ terms of a GP (r > 1) = [a (rn – 1)] / [r – 1].  
>
> Sum of infinite terms of a GP (r < 1) = (a) / (1 – r).

# Roots of quadratic equation:
> roots = (-b ± √(b2 - 4ac))/2a

## If b2 < 4ac, then roots are complex (not real).
> For example, roots of x2 + x + 1 = 0 are -0.5 + i1.73205 and -0.5 - i1.73205

## If b2 = 4ac, then roots are real and both roots are same.
> For example, roots of x2 - 2x + 1 = 0 are 1 and 1

## If b2 > 4ac, then roots are real and different.
> For example, roots of x2 - 7x + 12 = 0 are 3 and 4

# About Mean and Median
> The mean (or average) is the most popular and well known measure of central tendency.
>
> Mean is the only measure of central tendency where the sum of the deviations of each value from the mean is always zero.
>
> Mean can be used with both discrete and continuous data, although its use is most often with continuous data.
>
> Mean is the only measure of central tendency where the sum of the deviations of each value from the mean is always zero.
>
> Median is the middle value of a set of data. To determine the median value in a sequence of numbers, the numbers must first be arranged in an ascending order.
>
> If the count of numbers in the sequence is ODD, the median value is the number that is in the middle, with the same amount of numbers below and above.
>
> If the count of numbers in the sequence is EVEN, the median is the average of the two middle values.
>
> If the count of numbers is odd: After sorting the sequence,
    ``Median = {(N+1)/2}th value; 
    where N is the number of terms.``
>
> If the count of numbers is even: After sorting the sequence,
    ``Median  =  Average of (N/2)th and {(N/2) + 1}th value;
    where N is the number of terms``
>
>Median is an important measure (compared to mean) for distorted data, because median is not so easily distorted. For example, median of {1, 2, 2, 5, 100) is 2 and mean is 22.
>
> If the user adds a constant to every value, the mean and median increases by the same constant.
>
> If the user multiplies every value by a constant, the mean and the median will also be multiplied by that constant.

# Sieve of Eratosthenes
> https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Mathematics/article/MjIxMA%3D%3D
>
> Using Sieve of Eratosthenes is the most efficient way of generating prime numbers up to a given number N.

## Following is the algorithm to find all the prime numbers less than or equal to a given integer n by Eratosthenes' method:
>Create a list of consecutive integers from 2 to n: (2, 3, 4, ..., n).
>
>Initially, let p equal 2, the first prime number.
>
> Starting from p2, count up in increments of p and mark each of these numbers greater than or equal to p2 itself in the list. These numbers will be p(p+1), p(p+2), p(p+3), etc..
>
> Find the first number greater than p in the list that is not marked. If there was no such number, stop. Otherwise, let p now equal this number (which is the next prime), and repeat from step 3.

# LCM and HCF
## LCM
> LCM stands for Least Common Multiple. The lowest number that is exactly divisible by each of the given numbers is called the least common multiple of those numbers. For example, consider the numbers 3, 31, and 62 (2 x 31). The LCM of these numbers would be 2 x 3 x 31 = 186.
>
>To find the LCM of the given numbers, express each number as its prime factors. The product of the highest power of the prime numbers that appear in the prime factorization of any of the numbers gives us the LCM.
>
> For example, consider the numbers 2, 3, 4 (2 x 2), 5, 6 (2 x 3). The LCM of these numbers is 2 x 2 x 3 x 5 = 60. The highest power of 2 comes from prime factorization of 4, the highest power of 3 comes from prime factorization of 3 and prime factorization of 6, and the highest power of 5 comes from prime factorization of 5.

## HCF
> The term HCF stands for Highest Common Factor. HCF is also known as Greatest Common Divisor (GCD). The largest number that divides two or more numbers is the highest common factor (HCF) for those numbers. 
>
> For example, consider the numbers 30 (2 x 3 x 5), 36 (2 x 2 x 3 x 3), 42 (2 x 3 x 7), 45 (3 x 3 x 5). 3 is the largest number that divides each of these numbers, and hence, is the HCF for these numbers.
>
>To find the HCF of two or more numbers, express each number as its prime factors. The product of the minimum powers of common prime terms in both of the prime factorization gives the HCF. This is the method we illustrated in the above step.
>
> Also, for finding the HCF of two numbers, we can proceed by the long division method. We divide the larger number by the smaller number (divisor). Now, we divide the divisor by the remainder obtained in the previous stage. We repeat the same procedure until we get zero as the remainder. At that stage, the last divisor would be the required HCF.

### Euclidean algorithm for HCF. It is based upon below facts:
> If we subtract the smaller number from larger (we reduce larger number), GCD doesn't change. So if we keep subtracting repeatedly the larger of two, we end up with GCD.
> Now instead of subtraction, if we divide the smaller number, the algorithm stops when the remainder is found to be 0.
> below is the recursive function for finding GCD using Euclidean's algorithm:
       
    gcd(a, b)
    {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }
> Time Complexity: O(log(min(a, b)))

## Important properties of LCM and HCF:
> **For two numbers say, 'a' and 'b', LCM x HCF = a x b.**
>
> HCF of co-primes = 1.
>
>For two fractions,
>> HCF = HCF (Numerators) / LCM (Denominators)
>>
>> LCM = LCM (Numerators) / HCF (Denominators)

# Given a number N, the task is to count number of trailing zeroes in factorial of N. That is, number of zeroes at the end in the number N!
> An efficient way to solve this problem is to observe the properties of prime factorization. Consider prime factors of N!. A trailing zero is always produced by the prime factors 2 and 5. If we can count the number of 5s and 2s in prime factorization of N!, our task is done.
>
> Consider the following examples:
>> N = 5: There is one 5 and 3 2s in prime factors of 5! (2 * 2 * 2 * 3 * 5). So count of trailing 0s is 1.
>>
>> N = 11: There are two 5s and three 2s in prime factors of 11! (2 8 * 34 * 52 * 7). So count of trailing 0s is 2.
>
> We can easily observe that the number of 2s in prime factors is always more than or equal to the number of 5s. So if we count 5s in prime factors, we are done.
>
> Now, how to count the total number of 5s in prime factors of N!? A simple way is to calculate floor(N/5). For example, 7! has one 5, 10! has two 5s. It is not done yet, there is one more thing to consider. Numbers like 25, 125, etc have more than one 5. For example, if we consider 28!, we get one extra 5, and the number of 0s becomes 6. Handling this is simple, first divide N by 5 and remove all single 5s, then divide by 25 to remove extra 5s, and so on. Following is the summarized formula for counting trailing 0s.

    Trailing 0s in N! = Count of 5s in prime factors of n!
                  = floor(n/5) + floor(n/25) + floor(n/125) + ....

# Permutation
> Permutation with repetition allowed: The number of permutation or arrangements of N numbers with repetition allowed will be N^N. For Example, permutaions of {1,2} with repetitions will be {{1,1}, {1,2}, {2,1},{2,2}}.
> Permutation with duplicates: The number of permutations or arrangements of N objects of which p1 are of one kind, p2 are of second kind, ..., pk are of k-th kind and the rest if any, are of different kinds is: N! / (p1! * p2! *....*pk!).