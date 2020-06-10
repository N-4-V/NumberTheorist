import java.io.*;
class The_Number_Theory
{
  BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
 
 void Optimus_Prime()throws IOException
 {
    // Prime Number or not.
    int z  = 0;
    System.out.println("");
    for (int a = 1;a <= 100;a ++)
    {
      System.out.println("Enter the Number.");
      int n = Integer.parseInt(x.readLine());
      for(int i = 1;i<=n;i++)
      {
        if(n% i == 0)
        {
          z = z + 1;
        }
      }
    if(z==2)
    {
      System.out.println("");
      System.out.println("I don't Believe it!!!  It IS the Great Optimus Prime.");
    }
    else
    {
      System.out.println("");
      System.out.println("This is the Registration Number of just a Common Sparring-Bot.");
    }
    z = 0;
  } 
 }
 
 void Neil_Armstrong()throws IOException
 {
 /* If the Sum of Cubes of each Digit of a Number is Equal to the Number
  * itself , the Number is an Armstrong Number.
  * For Example , 153 is an Armstrong Number.
  */
    System.out.println("This Program will check and tell you Whether the Number you Enter is Neil Armstrong , Ahem!I meant an Armstrong Number or not.");
    System.out.println("So,what are you waiting for ?? Enter the Number.");
    int n = Integer.parseInt(x.readLine());
    int c = n;
    int r , s = 0;
    while(n!=0)
    {
      r = n%10;
      s = s + (r * r * r);
      n = n/10;
    }
    if(s == c)
    {
      System.out.println("");
      System.out.println("It is Neil Armstrong !!! , I mean an Armstrong Number.");
    }
    else
    {
      System.out.println(""); 
      System.out.println("It is NOT Neil Armstrong.Neither a Small step for Man nor a Giant Leap for Mankind....");
    }
  }
 
 void Palindrome()throws IOException
 {
 // Palindrome Number or not.For Example , 121 and 1234321 are Palindromic.
    System.out.println("This Program will tell You Whether the Number You Enter is Palindromic or not.");
    System.out.println("So , Enter the Number.");
    long n = Long.parseLong(x.readLine());
    long c = n ;
    long r = 0 , v;
    while(n > 0) // 121
    {
      v = n%10; // 1 , 2 , 1
      r = r * 10 + v; // 121
      n = n/10; // 1
    }
    if(c==r)
    {
      System.out.println(c + " is a Palindromic Number.");
    }
    else
    {
      System.out.println("Bad News!!");
      System.out.println(c + " is NOT a Palindromic Number.");
    }
 }
 
 void FiboGen()throws IOException
 {
 //Fibonacci series
    System.out.println("This Program will Print the Fibonacci series up till the Limit you enter.");
    System.out.println("The INITIAL LIMIT is 1.");
    System.out.println("Enter the FINAL LIMIT.");
    System.out.println("");
    int n = Integer.parseInt(x.readLine());
    int i = 1 , s = 0 , m = 1;
    while(i<= n)
    {
      System.out.println(s);
      int a = s + m;
      s = m;
      m = a;
      i++;
    }
  }
 
void Buzz()throws IOException
{
 /* If a Number is Divisible by 7 or its Last Digit is 7 , it
 * is a Buzz Number.
 */   
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  int q = n % 10;
  if(n % 7 == 0 || q == 7)
  {
    System.out.println("The Number is a Buzz Number.");
  }
  else
  {
    System.out.println("The Number ain't a Buzz Number.So,Please stop Buzzing Me since I'm Vey Bizzy !");
  }
}

void Mr_Perfect()throws IOException
{
// If the Sum of all the Factors of a Number excluding itself is 
// Equal to the Number itself , the Number is a Perfect Number. 

  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  int i , s =0;
  for(i = 1;i < n;i ++)
  {
    if(n% i == 0)
    {
      s = s + i;
    }
  } 
  if(s == n)
  {
    System.out.println("");
    System.out.println(n + " is a Perfect Number. ");
  }
  else
  {
    System.out.println("");
    System.out.println(n + " ain't a Perfect Number.");
  }
}

void The_Prime_Palindromus()throws IOException
{
// If the Square of a Prime Number is Palindromic,
// it's a Prime - Palindromic Number.
  System.out.println("This Program will Check and tell You the Prime - Palindrome");
  System.out.println("Numbers present in the Range Specified by You.");
  System.out.println("");
  System.out.println("Enter the Initial Limit.");
  int m = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("Enter the Final Limit.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  System.out.println("");
  int i , j , c  = 0 , t = 0;
  String s = "" , r = "";
  for(i = m;i<= n;i ++)
  {
    s = String.valueOf(i);
    int l = s.length();
    for(j = l - 1;j>= 0;j --)
    {
      r = r + s.charAt(j);
    }
    if(r == s)
    {
      for(j = 1;j<=i;j ++)
      {
        if(i% j == 0)
        {
          c ++;
        }
      }
      if(c == 2)
      {
        System.out.println(i);
      }
      t ++;
    }
  }
  if(t == 0)
  {
    System.out.println("There are No Prime Palindromic Numbers within the Specified Range.");
  }
}

void Special_Two_Digits()throws IOException
{
// A Special Two - Digit Number is one whose Sum of the sum of its Digits and the Product of 
// its Digits is Equal To the Number.
 
  System.out.println("Enter a Two - digit Number.");
  int n = Integer.parseInt(x.readLine());
  int a , b , s = 0 , p = 1;
  int y = 0;
  a = n/10;
  b = n % 10;
  System.out.println("");
  s = a + b;
  p = a * b;
  y = s + p;
  System.out.println("");
  if(y == n)  
  {
    System.out.println(n + " is a Special 2-digit Number.");
  }
  else
  {
    System.out.println(n  +" is not a Special 2-digit Number.");
  }
}

void Automorphism()throws IOException
{
// An Automorphic Number is one which is contained in the last digit(s) of its Square.
//For eg , 25 is an Automorphic Number since it is present in the last digits of its square , i.e. 625.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  int sq = n * n;
  String s = String.valueOf(n);
  String sq = String.valueOf(sq);
  if(s.endsWith(sq))
  {
    System.out.println("");
    System.out.println(n + " is an Automorphic Number.");
  }
  else
  {
    System.out.println(n + " is NOT an Automorphic Number.");
  }
}

void Quite_Sunny()throws IOException
{
// A Number is a Sunny Number if after adding 1 , the number becomes a perfect square.
//For example, 24 is a Sunny Number as 24 + 1 = 25 , which is a perfect square.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  int u = n + 1 , c = 0;
  for(int i = 1;i<= u;i++)
  {
    if(Math.pow(i , 2) == u)
    {
      c ++;
    }
    else
    {
      continue;
    }
  }
  if(c == 1)
  {
    System.out.println(n + " is a Sunny Number.");
  }
  else
  {
    System.out.println(n + " is NOT a Sunny Number.");
  }
}

void Max_Strength()throws IOException
{
// A Strong Number is a Number whose sum of factorials is equal to the Number Itself.
// For Example , 145 [ since , 1! + 4! + 5! = 1 + 24 + 120 = 145]
// It is also known as Krishna Murthy Number.
// It is also known as Special Number.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int a = n , v , s = 0 , p = 1;
  while(a != 0)
  {
    v = a % 10;
    for(int i = v;i >= 1;i --)
    {
      p = p * i;
    }
    s = s + p;
    a = a / 10;
  }
  if(p == n)
  {
    System.out.println(n + " is Very Strong Indeed.After all ,It's a Strong Number.");
  }
  else
  {
    System.out.println(n + " is NOT a Strong Number.It's a Weakling...");
  }
}

void Die_Sure_ium()throws IOException
{
// A Number is a Disarium Number if the Sum of its Digits powered with their Respective Position , is Equal to the Number.
// For Example , 135 [ 1^1 + 3^2 + 5^3 = 135] , 89 , 175 , 518
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  int k = n , r ;
  double p , sum = 0.0;
  String s = String.valueOf(n);
  int l = s.length();
  System.out.println("");
  for(int i = l;i >= 1;i--)
  {
    r = n%10;
    p = Math.pow(r,i);
    sum = p + sum;
    n = n / 10;
    System.out.println(sum);
    System.out.println("");
  }
  if(sum == k)
  {
    System.out.println(k + " is a Disarium Number.");
  }
  else
  {
    System.out.println(k + " is NOT a Disarium Number.");
  }
}

void It_is_Magical()throws IOException
{
// A Number is a Magic Number if the Sum of the Digits reduced to a Single Digit becomes 1.
// For Example , 199 [1 + 9 + 9 = 19 : 1 + 9 = 10 : 1 + 0 = 1] 
  System.out.println("Enter the Number.");
  int n = Integer.parseInt(x.readLine()); 
  if(n % 9 == 1)
  {
    System.out.println(n + " is a Magical Number.Abracadabra !!! Hocus !! Pocus !!");
  }
  else
  {
    System.out.println(n + " is NOT a Magic Number.");
  }
}

void Primal_Objective()throws IOException
{
// Primorial of a number is defined as the product of the prime numbers less than or equal to the number.
// For example , 4# = 2 * 3 = 6 and 5# = 2 * 3 * 5 [ where # represents the Number. ]
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  int i , j , c = 0 , p = 1;
  for(i = 1;i <= n;i ++)
  {
    for(j = 1;j <= i;j ++)
    {
      if(i % j == 0)
      {
        c ++;
      }
    }
    if(c == 2)
    {
      p = p * i;
      c = 0;
    }
    else
    {
      c = 0;
      continue;
    } 
  }
  System.out.println("");
  System.out.println("");
  System.out.println("The Primorial of the Number is : " + p);
}

void Quack_Quack()throws IOException
{
// A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number. 
// For example 3210, 7056, 8430709 are all duck numbers whereas 08237, 04309 are not.
  System.out.println("Enter a Number.");
  String s = x.readLine(); // The Statement on which the Entire Program Works...
  int l = s.length();
  int c = 0;
  System.out.println("");
  for(int i = 0;i < l;i ++)
  {
    char ch = s.charAt(i);
    if(ch == '0')
    {
      c ++;
    }
  }
  char f = s.charAt(0);
  if(f != '0' && c > 0)
  {
    System.out.println(s + " is a Duck Number i.e. it can go QUACK - QUACK.");
  }
  else
  { 
    System.out.println(s + " is Not a Duck Number.");
  }
}

void Is_it_Harshad()throws IOException
{
// In Recreational Mathematics, a Harshad number (or Niven number), is an integer (in base 10) that is divisible by the sum of its digits.
// The number 18 is a Harshad number in base 10, because the sum of the digits 1 and 8 is 9 (1 + 8 = 9), 
// and 18 is divisible by 9 (since 18 % 9 = 0) 
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  int v , a = n , s = 0 ;
  System.out.println("");
  while(n != 0)
  {
    v = n%10;
    s = s + v;
    n = n/10;
  }
  if(a % s == 0)
  {
    System.out.println(a + " is a Harshad Number.");
  }
  else
  {
    System.out.println("Nope , " + a + " is Not a Harshad Number.");
  }
}

void Mr_Kaprekar()throws IOException
{
// A positive whole number ‘n’ that has ‘d’ number of digits is squared and split into two pieces, 
// a right-hand piece that has ‘d’ digits and a left-hand piece that has remaining ‘d’ or ‘d-1’ digits.
// If the sum of the two pieces is equal to the number, then ‘n’ is a Kaprekar number. 
// Example : 9
// 9 * 9  = 81, right-hand piece of 81 = 1 and left-hand piece of 81 = 8
// Sum = 1 + 8 = 9, i.e. equal to the number. Hence, 9 is a Kaprekar number.
  int sq = 1 ; 
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  sq = n * n;
  String s = Integer.toString(sq);
  if(sq <= 9)
  {
    s = "0" + s;
  }
  int l = s.length();
  int mid = l / 2;
  System.out.println("");
  String left = s.substring(0 , mid);
  String right = s.substring(mid);
  System.out.println("");
  int a = Integer.parseInt(left);
  int b = Integer.parseInt(right);
  if(a + b == n)
  {
    System.out.println(n + " is a Kaprekar Number.");
  }
  else
  {
    System.out.println(n + " is Not a Kaprekar Number.");
  }
}

void Abhinav_Number()throws IOException
{
// A Unique number is a positive integer (without leading zeros) with no duplicate digits.
// For example 7, 135, 214 are all unique numbers whereas 33, 3121, 300 are not.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  String s = Integer.toString(n);
  int l = s.length();
  int i ,j ,c = 0;
  System.out.println("");
  System.out.println("");
  for(i = 0;i < (l-1); i ++)
  {
    if(s.charAt(i) == s.charAt(i + 1))
    {
      c = 1;
      break;
    }
  }
  if(c == 0)
  {
  System.out.println(n + " is Unique/Abhinav i.e it is One of its Kind.");
  }
  else
  {
    System.out.println(n + " is Not at All Unique.");
  }
}

void Prime_Factors() throws IOException
{
  System.out.println("Enter a Number. ");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  System.out.print("The Prime Factors of " + n + " are as Follows : ");
  System.out.println(""); 
  int p = 2 , s = 0;
  while(n > 1)
  {
    if(n % p == 0)
    {
      System.out.print(p + " ");
      s = s + p;
      n = n / p;
    }
    else
    { 
      p ++;
    }  
  }
  System.out.println("");
  System.out.println("Sum of Prime Factors : " + s);
}

int Greatest_Carnage_Dinosaur(int m, int n)throws Exception // used for next function
{
  int r; 
  while(m != 0)
  { 
    r = n % m; 
    n = m; 
    m = r;
  }
  System.out.println("");
  System.out.println("");
  return n
}
void Prime_Commanders()throws IOException
{
// 2 Numbers are said to be Co-prime Numbers if both are relatively prime i.e. their GCD is 1. 
  System.out.println("Enter the First Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("Enter the Second Number.");
  int m = Integer.parseInt(x.readLine());
  if(Greatest_Carnage_Dinosaur(n,m) != 1)
  {
    System.out.println(n +" and " + m + " are Not Co-Prime Numbers.");
  }
  else
  {
    System.out.println(n + " and " +  m + " are Co-Prime Numbers.");
  }
}

void Ne_Number()throws IOException
{
// A Number is said to be a Neon Number if the Sum of the Digits of the Square of the Number is Equal to the Number itself.
// For Example , 9 is a Neon Number [ since , 9 * 9 = 81 => 8 + 1 = 9 ].
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  int w = n * n;
  int r , s = 0 , z;
  while(w != 0)
  {
    z = w % 10;
    s = s + z;
    w = w/10;
  }
  if(s == n)
  {
    System.out.println(n + " is a Neon Number.");
  }
  else
  {
    System.out.println(n + " is Not a Neon Number.");
  }
}

void Pure_Evil()throws IOException
{
// An Evil number is a positive whole number which has even number of 1’s in its binary equivalent.
// Example: Binary equivalent of 9 is 1001, which contains even number of 1’s.
// A few evil numbers are 3, 5, 6, 9….
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  int a = n;
  String s = "";
  char d[] = { '0' , '1' };
  int i , j , c = 0 , k = 0 , h;

  while(a > 0)
  {
    h = a% 2;
    s = d[h] + s;
    a = a/2;  
  }
  System.out.println(s);

  int l = s.length();
  for(i = 0;i < l;i ++)
  {
    char ch = s.charAt(i);
    if(ch == '1')
    {
      c ++;
    }
  }
  if(c % 2 == 0)
  {
    System.out.println(n + " is Pure Evil.........");
    System.out.println("It's an Evil Number.");
  }
  else
  {
    System.out.println(n + " is Not at all Evil.");
    System.out.println("He's a Good Guy.");
  }
}

void SMITHereens()throws IOException 
{
// A  Smith number is a composite number, the sum of whose digits is the sum of the digits of its prime factors 
// obtained as a result of prime factorization (excluding 1).
// The first few such numbers are 4, 22, 27, 58, 85, 94 and 121.
// For Example , 666
// Prime factors are 2, 3, 3, and 37 [i.e. 2 x 3 x 3 x 37 = 666]
// Sum of the digits are (6+6+6) = 18
// Sum of the digits of the factors (2+3+3+(3+7)) = 18
  System.out.println("Enter a Composite Number[i.e. a Non-prime Number].");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int p = 2 , a = n , c = 0 , i , j , s1 = 0 ,s2 = 0, v;
  int y[] = new int[100];
  while(a != 1)
  {
    if(a % p == 0)  
    {
      y[c] = p;
      a = a/p;
      c ++;
    }
    else
    {
      p ++;
    }
  }
  String s = String.valueOf(n);
  for(i = 0;i < s.length();i ++)
  {
    s1 = s1 + Integer.parseInt(String.valueOf(s.charAt(i)));
  }

  for(i = 0;i < y.length;i ++)
  {
    int z = y[i];
    while(z != 0)
    {
      v = z % 10;
      s2 = s2 + v;
      z = z / 10;
    }
  }
  if(s1 == s2)
  {
    System.out.println(n + " is a Relation to Harold Smith.");
    System.out.println("Its a Smith Number !!!");
  }
  else
  {
    System.out.println(n + " is NOT a Smith Number.");
    System.out.println("So , It's Not Related to Harold Smith at all ...");
  }
}

void HLCFM()throws IOException
{
  System.out.println("Enter 2 Numbers.");
  long a = Long.parseLong(x.readLine());
  long b = Long.parseLong(x.readLine());
  long h = 1;
  long p = a * b;
  for(long i = 2;i < p; i++)
  {
    if((a % i == 0) && (b % i == 0))
    {
      h = i;
    }
  }
  System.out.println("");
  System.out.println("");
  long l = p / h;
  System.out.println("The HCF is : " + h );
  System.out.println("");
  System.out.println("The LCM is : " + l );
}

void Nelson_But_Not_Mandela()throws IOException
{
// A Nelson Number is one which has all its Digits same , provided it has atleast 3 digits.
// For Example , 55555 is a Nelson Number.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  String s = String.valueOf(n);
  int l = s.length();
  int c = 0 , k = 0 , a= n;
  while(a != 0)
  {
    a = a/10;
    k ++;
  }
  for(int i = 0;i < l - 1;i ++)
  {
    if(s.charAt(i) == s.charAt(i + 1))
    {
      c ++;  
    }
  }
  if(c == (k - 1) && k >= 3)
  {
    System.out.println(n + " is a Nelson Number.");
  }
  else
  {
    System.out.println(n + " is NOT a Nelson Number.");
  }
}

void Amicable_Buddies()throws IOException
{
// Two Numbers will be called as an Amicable Pair if the Sum of the Factors excluding itself
// of the first number is equal to the second one and vice-versa
// For Example , 220 and 284 are an Amicable Pair. 
// Sum of Factors of 220 = 284 , and , Sum of Factors of 284 = 220.
  System.out.println("Enter the First Number.");
  int a = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("Enter the Second Number.");
  int b = Integer.parseInt(x.readLine());               
  System.out.println("");
  System.out.println("");
  int i , s1 = 0 , s2 = 0;
  for(i = 1;i < a;i ++)
  {
    if(a % i == 0)
    {
      s1 += i;
    }
  }
  for(i = 1;i < b;i ++)
  {
    if(b % i == 0)
    {
      s2 +=i;
    }
  }
  if(s1 == b && s2 == a)
  {
    System.out.println(a + " and " + b + " are an Amicable Pair.");
  }
  else
  {
    System.out.println(a + " and " + b + " are NOT an Amicable Pair."); 
  }
}

void Twin_Primes()throws IOException
{
// Two Numbers will be called as Twin Primes if both are Prime and their Difference is 2.
// For Example : 3 and 5 , 5 and 7 ,and, 11 and 13.
System.out.println("Enter the First Number.");
  int a = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("Enter the Second Number.");
  int b = Integer.parseInt(x.readLine());
  System.out.println("");
  int i , j , c1 = 0 ,c2 = 0;
  for(i = 1;i <= a;i ++)
  {
    if(a % i == 0)
    c1 ++;
  }
  for(j = 1;j <= b;j ++)
  {
    if(b % j == 0)
    c2 ++;  
  }
  int u = Math.max(a , b) - Math.min(a , b);
  if(c1 == 2 && c2 == 2 && u == 2)
  {
    System.out.println(a + " and " + b + " are Twin Primes.");
  }
  else  
  {
    System.out.println(a + " and " + b + " are NOT Twin Primes.");
  }
}

void Keith_Number()throws IOException
{
//If a Fibonacci-like sequence (in which each term in the sequence is the sum of the n previous terms) is formed,
// with the first n terms being the decimal digits of the number N, then N itself occurs as a term in the sequence.
// For example, 197 is a Keith number since it Generates the sequence
// 1, 9, 7, 17, 33, 57, 107, 197, ...
  System.out.println("Enter the Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  String e = String.valueOf(n);
  int l = e.length();
  int a[] = new int[l];
  int s = 0 , i , j , y = 0;
  for(i = 0;i < l;i ++)
  {
    a[i] = Integer.parseInt(String.valueOf(e.charAt(i)));
  }

  while(y != 1)
  {
    for(i = 0;i < l;i ++)
    {
      s = s + a[i];
    }
    if(s == n)
    {
      y = 1;
      break;
    }
    else if(s < n)
    {
      for(i = 0;i < l - 1;i ++) // 197 = 1 9 7 17
      {
        a[i] = a[i + 1];
      }
      a[l - 1] = s;
      s = 0;
    }
    else
    {
      break;
    }
  }

  if(y == 1)
  {
    System.out.println(n + " is a Keith Number.");
  }
  else
  {
    System.out.println(n + " is NOT a Keith Number.");
  }
}

void Lychrel_Number()throws IOException
{
// Take an integer n, greater than zero.
// Form the next n of its series by reversing the digits of the current n and adding the result to the current n.
// Stop when n becomes palindromic - i.e. the digits of n in reverse order == n.
// These numbers that do not end in a palindrome are called Lychrel numbers.
// For the purposes of this task a Lychrel number is any starting number that does not form a palindrome within 500 (or more) iterations.
// 196 , 879 , 1997 are Lychrel Numbers [though 'SCIENTISTS' are Not fully sure...,but'll work for this program]
System.out.println("Enter a Number.");
int n = Integer.parseInt(x.readLine());
System.out.println("");
System.out.println("");
}

void Self_Description()throws IOException
{
// An integer is said to be "self-describing" if it has the property that, when digit positions are labeled 0 to N-1, 
// the digit in each position is equal to the number of times that that digit appears in the number.
// For example, 2020 is a four-digit self describing number:
// position 0 has value 2 and there are two 0s in the number;
// position 1 has value 0 and there are no 1s in the number;
// position 2 has value 2 and there are two 2s;
// position 3 has value 0 and there are zero 3s.
// Self-describing numbers < 100,000,000 : 1210 , 2020 , 21200 , 3211000 , 42101000.
  System.out.println("Enter the Number.");
  long n = Long.parseLong(x.readLine());
  String s = String.valueOf(n);
  int l = s.length();
  System.out.println("");
  System.out.println("");
  int i , j , c = 0 , v , k = 0;
  for(i = 0;i < l; i ++) 
  {
    char ch = s.charAt(i); // 2
    v = Integer.parseInt(String.valueOf(ch));  // 2
    for(j = 0;j < l;j ++)
    {
      char ch1 = s.charAt(j);  // 2
      if((Integer.parseInt(String.valueOf(ch1))) == i) // 2 , 0 , 2 , 0 == 0
      {
        c ++;
      }
    }
    if(c == v) // 0 == 2
    {
      k ++; 
    }
    c = 0;
  }
  if(k == l)
  {
    System.out.println(n + " is a Self-Describing Number.");
    System.out.println("It Just Loves to Speak About Itself.");
  }
  else
  {
    System.out.println(n + " is NOT a Self-Describing Number.");
    System.out.println("It Atleast Pays Attention to Other Things Rather");
    System.out.println("than , Talking about Itself ,  All the Time.");
  }
}

void Pretty_Heavy()throws IOException
{
// A Heavy Number is one whose sum of digits divided by no. of digits is greater than 7.
// For Example , 
//              8996 is a Heavy Number because (8 + 9 + 9 + 6)/ 4 = 8 [8 > 7].
  System.out.println("This Brilliant Program Displays the Heavy Numbers in the Given Range");
  System.out.println("");
  System.out.println("");
  System.out.print("Enter the Initial Limit : ");
  int a = Integer.parseInt(x.readLine());
  System.out.print("Enter the Final Limit : ");
  int b = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int i , j , c = 0 , s = 0;
  double d = 0.0;
  for(i = a;i <= b;i ++)
  {
    String w = String.valueOf(i);
    int l = w.length();
    for(j = 0;j < l;j ++)
    {
      char ch = w.charAt(j);
      s = s + Integer.parseInt(String.valueOf(ch));
    }
    d = s / l;
    if(d > 7)
    {
      System.out.println(i + " is a Heavy Number.");
      c ++;
    }
    d = 0.0;
    s = 0;
  } 
  System.out.println("");
  System.out.println("Total Number of Heavy Numbers in the Given Range : " + c);
}

void Really_Powerful()throws IOException
{
// A powerful number is a positive integer m such that for every prime number p dividing m,
// p2 also divides m. Equivalently, a powerful number is the product of a square and a cube, 
// that is, a number m of the form m = a2b3, where a and b are positive integers. 
// Powerful numbers are also known as squareful, square-full, or 2-full. 
// 1, 4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 72, 81, 100, 108, 121, 125, 128, 144, 
// 169, 196, 200, 216, 225, 243, 256, 288, 289, 324, 343, 361, 392, 400, 432, 441, 484, 500, 
// 512, 529, 576, 625, 648, 675, 676, 729, 784, 800, 841, 864, 900, 961, 968, 972, 1000.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int t1 = 0 , t2 = 0 , c1 = 0 , c2 = 0,c = 0, i , j , p , y;
  // First Way : 
  for(i = 1;i < n;i ++)
  {
    for(j = 1;j <= i;j ++)
    {
      if(i % j == 0)
      {
        c ++ ;
      }
    }
    if(c == 2)
    {
      if(n % i == 0)
      {
        c1 ++;
        p = i * i;
        if(n % p == 0)
        {
          c2 ++;
        }
        c = 0;
      }
    }
  }
  if(c1 == c2)
  {
    t1 = 1;
  }
  // Second Way :
  for(i = 1;i < n;i ++)
  {
    p = i * i;
    for(j = 1;j < n;j ++)
    {
      y = j * j * j;
      if((p * y) == n)  
      {
        t2 = 1;
        break;
      }
    }
  }  
  if(t1 == 1 && t2 == 1)
  { 
    System.out.println(n + " is a Powerful Number.");
  }
  else
  {
    System.out.println(n + " is NOT a Powerful Number.");
    System.out.println("It's rather a Weakling...");
  }
}
 
void Ramanujan_Interest()throws IOException
{
// A Number expressible as the Sum of two [positive] cubes in two different ways is Known as a Ramanujan Number.It's actually
// called Taxi-cab numbers too,cuz it was the number of the taxi in which Hardy came,and said that it was a dull number.
// THat's when the Big guy said : 1729 is a really interesting number.In fact,it is the smallest number expressible as 
// the sum of 2 cubes in 2 different ways.
  int i , j , ch , c = 0;
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  for(i = 1;i < n;i ++)
  {
    for(j = 1;j < n;j ++)
    {
      ch = (int)(Math.pow(i , 3) + Math.pow(j , 3));
      if(ch == n)
      {
        c ++;
      }
    }
  }
  if(c == 4)
  {
    System.out.println(n + " is a Ramanujan Number.");
  }
  else
  {
    System.out.println(n + " is NOT a Ramanujan Number.");
  }
  if(n == 1729)
  {
    System.out.println("In Fact , " + n + " is the Smallest Number which is the Sum of Cubes of");
    System.out.println("2 Distinct Positive Numbers.");
    System.out.println("This was the Number on Professor G.H.Hardy's Taxicab. ^^ "); 
  }
}

void Bouncing_like_a_Ball()throws IOException
{
// Working from left-to-right if no digit is exceeded by the digit to its left it is called an increasing number; for example, 134468.
// Similarly if no digit is exceeded by the digit to its right it is called a decreasing number; for example, 66420.
// We shall call a positive integer that is neither increasing nor decreasing a “bouncy” number; for example, 155349.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  String s = String.valueOf(n);
  System.out.println("");
  System.out.println("");
  int l = s.length();
  int a , b , i , c1 = 0 , c2 = 0;
  for(i = 1;i < l;i ++)
  {
    a = Integer.parseInt(String.valueOf(s.charAt(i - 1))); 
    b = Integer.parseInt(String.valueOf(s.charAt(i)));
    if(a < b || a == b)
    {
      c1 ++;
    }
    if(a > b || a == b)
    {
      c2 ++;
    }
  }
  if(c1 == (l - 1))
  {
    System.out.println(n + " is NOT a Bouncy Number , but an Increasing Number.");
  }
  else if(c2 == (l - 1))
  {
    System.out.println(n + " is NOT a Bouncy Number , but a Decreasing Number.");
  }
  else
  {
    System.out.println(n + " can Bounce like a Ball.");
    System.out.println("After all , It's a Bouncy Number.");
  }
}

void Emirp()throws IOException 
{
// An emirp (prime spelled backwards) is a prime number that results in a different prime when its decimal digits are reversed.
// This definition excludes the related palindromic primes. The term reversible prime may be used to mean the same as emirp, 
// but may also, ambiguously, include the palindromic primes.
//The sequence of emirps begins as :
// 13, 17, 31, 37, 71, 73, 79, 97, 107, 113, 149, 157, 167, 179, 199, 311, 337, 347, 359, 389, 701, 709, 733, 739, 743, 751, 761,
// 769, 907, 937, 941, 953, 967, 971, 983, 991, ... 
// Basically , All non-palindromic permutable primes are emirps.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  StringBuffer a = new StringBuffer(String.valueOf(n));
  int r = Integer.parseInt(String.valueOf(a.reverse()));
  int i , c1 = 0 , c2 = 0;
  for(i = 1;i <= n;i ++)
  {
    if(n % i == 0)
    {
      c1 ++;
    }
  }
  for(i = 1;i <= r;i ++)
  {
    if(r % i == 0)
    {
      c2 ++;
    }
  }
  if(c1 == 2 && c2 == 2)
  {
    System.out.println(n + " is an Emirp , as :");
    System.out.println("");
    System.out.println(n + " is Prime , and ,");
    System.out.println(r + " is Also Prime.");
  }
  else if(c1 == 2 && c2 != 2) 
  {
    System.out.println(n + " is Not an Emirp ,but , Just a Prime.");  
  }
  else  
  {
    System.out.println(n + " is Not Even Prime...");
  }
}

void In_Abundance()throws IOException
{
// In number theory, an abundant number or excessive number is a number for which the sum of its proper divisors
// is greater than the number itself. 
// The amount by which the sum exceeds the number is the abundance.
// The integer 12 is the first abundant number. 
// Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16. 
// The number 12 has an abundance of 4, for example.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int i , s = 0;
  for(i = 1;i < n;i ++)
  {
    if(n % i == 0)  
    {  
      s = s + i;
    }
  }
  if(s > n)
  {
    System.out.println(n + " is an Abundant Number.");
    System.out.println("It has an Abundance of " + (s - n) + ".");
  }
  else
  {
    System.out.println(n + " is NOT an Abundant Number.");
  }
}

void Sphenic()throws IOException
{
// In number theory, a sphenic number (from Ancient Greek: ?????, 'wedge') is a positive integer that is
// the product of three distinct prime numbers.
// A sphenic number is a product pqr where p, q, and r are three distinct prime numbers. 
// This definition is more stringent than simply requiring the integer to have exactly three prime factors.
// For instance, 60 = 2^2 × 3 × 5 has exactly 3 prime factors, but is not sphenic.
// The first few sphenic numbers are : 
// 30, 42, 66, 70, 78, 102, 105, 110, 114, 130, 138, 154, 165, ...
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int p = 2 , a = n , c , f = 0, k = 0;
  while(a > 1) 
  {
    c = 0;
    while(a % p == 0)   
    {
      c ++; 
      f ++; 
      a = a / p;
    }
    p ++;
    if(c > 1) 
    {
      k = 1;
    }
  }
  if(k == 1)
  {
    System.out.println(n + " is NOT a Sphenic Number.");
  }
  else if(k != 1 && f == 3)
  {
    System.out.println(n + " is a Sphenic Number.");
  }
  else if(k != 1 && f != 3)
  {
    System.out.println(n + " is NOT a Sphenic Number.");
  } 
}

void The_Aliquot_Sequence()throws IOException
{
// In mathematics, an aliquot sequence is a sequence of positive integers in which each term
// is the sum of the proper divisors of the previous term. If the sequence reaches the number 1,
// it ends, since the sum for 1 is 0.
// For example, the aliquot sequence of 10 is 10, 8, 7, 1, 0 because:
// ?1(10) ? 10 = 5 + 2 + 1 = 8,
// ?1(8) ? 8 = 4 + 2 + 1 = 7,
// ?1(7) ? 7 = 1,
// ?1(1) ? 1 = 0.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int i , s = 0 , a = n , c = 0;
  System.out.println("The Aliquot Sequence of " + n + " is :");
  System.out.print(a + " ");
  while(a != 1)
  {
    for(i = 1;i < a;i ++)
    {
      if(a % i == 0)
      {
        s = s + i;
      }
    }
    a = s;
    s = 0;
    System.out.print(a + " ");
    c ++;
    if(c > 50)
    {
      break;
    }
  }
  if(a == 1)
  {
    System.out.print("0");
  }
}

void Being_Social()throws IOException
{
// Sociable numbers are numbers whose aliquot sums form a cyclic sequence that begins and ends with the same number.
// For 1264460 , 
// The sum of the proper divisors of 1264460 is = 1547860
// The sum of the proper divisors of 1547860 is = 1727636
// The sum of the proper divisors of 1727636 is = 1305184
// And , The sum of the proper divisors of 1305184 is = 1264460.
  System.out.println("Enter a Number.");
  long n = Long.parseLong(x.readLine());
  System.out.println("");
  System.out.println("");
  long i , s = 0 , a = n , c = 0 , t = 0;
  while(a != 1)
  {
    for(i = 1;i < a;i ++)
    {
      if(a % i == 0)
      {
        s = s + i;
      } 
    }
    a = s;
    if(a == n)
    {
      System.out.println(n + " is Very Social.");
      System.out.println("After all , it's a Sociable Number.");
      t = 1;
      break;
    }
    s = 0;
    c ++;
    if(c > 50)
    {
      break;
    }
  }
  if(t == 0)
  {
    System.out.println(n + " is NOT a Sociable Number.");
    System.out.println("It's Heart is Like an Island Cut Off from the");
    System.out.println("Rest of the World.");
  }
}

void Chen_Primes()throws IOException
{
// A prime number p is called a Chen prime if p + 2 is either a prime or a product of two primes.
// The even number 2p + 2 therefore satisfies Chen's theorem.
// The Chen primes are named after Chen Jingrun, who proved in 1966 that there are infinitely many such primes.
// This result would also follow from the truth of the twin prime conjecture.
// The first few Chen primes are : 
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 47, 53, 59, 67, 71, 83, 89, 101, …
// The first few non-Chen primes are :
// 43, 61, 73, 79, 97, 103, 151, 163, 173, 193, 223, 229, 241, …
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int i , j , c = 0 , c1 = 0 , t1 = 0 , t2 = 0 ,p , ci = 0 , cj = 0 , k , l;
  for(i = 1;i <= n;i ++)  
  {
    if(n % i == 0)
    {
      c ++;
    }
  }
  p = n + 2;
  if(c == 2)
  {
    for(i = 1;i <= p;i ++)
    {
      if(i % p == 0)
      {
        c1 ++;
      } 
    }
    if(c1 == 2)
    {
      t1 = 1;
    }
  }
  else
  {
    System.out.println(n + " is NOT Even a Prime Number.");
    System.out.println("Then , How Can It Be a Chen Prime Number ???");
  }

  for(i = 1;i < p;i ++)
  {
    for(k = 1;k <= i;k ++)
    {
      if(i % k == 0)
      {
        ci ++;
      }
    }
    if(ci == 2)
    {
      for(j = 1;j < p;j ++)
      {
        for(l = 1;l <= j;l ++)
        {
          if(j % l == 0)
          {
            cj ++;
          } 
        }
        if(cj == 2)
        {
          if((i * j) == p)
          {
            t2 = 1;
            break;
          }
          else
          {
            ci = 0;
            cj = 0;
          }
        }
      }
    }
  }
  if(t1 == 1 || t2 == 1)
  {
    System.out.println(n + " is a Chen Prime Number.");
  }
  else
  {
    System.out.println(n + " is NOT a Chen Prime Number.");
  }
}

void Leyland()throws IOException
{
// In number theory, a Leyland number is a number of the form :
//  x^y + y^x
// where x and y are integers greater than 1.
// They are named after the mathematician Paul Leyland.
//  The first few Leyland numbers are
// 8, 17, 32, 54, 57, 100, 145, 177, 320, 368, 512, 593, 945, 1124.
// The requirement that x and y both be greater than 1 is important, since without it every positive integer
// would be a Leyland number of the form x1 + 1x. Also, because of the commutative property of addition, the
// condition x ? y is usually added to avoid double-covering the set of Leyland numbers (so we have 1 < y ? x).

// A Leyland number of the second kind is a number of the form
// x^y - y^x
// where x and y are integers greater than 1.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int i , j , a , b , t = 0;
  for(i = 2;i < n;i ++)
  {
    for(j = 2;j < n;j ++)
    {
      a = (int)Math.pow(i , j);
      b = (int)Math.pow(j , i);
      if(a + b == n || a - b == n)
      {
        t = 1;
        break;
      }
    }
  }
  if(t == 1)
  {
    System.out.println(n + " is a Leyland Number.");
  }
  else
  {
    System.out.println(n + " is Not a Leyland Number.");
  }
}

void Prime_Safety()throws IOException
{
// A safe prime is a prime number of the form 2p + 1, where p is also a prime.
// (Conversely, the prime p is a Sophie Germain prime.) The first few safe primes are :
//  5, 7, 11, 23, 47, 59, 83, 107, 167, 179, 227, 263, 347, 359, 383, 467, 479, 503, 563,
//  587, 719, 839, 863, 887, 983, 1019, 1187, 1283, 1307, 1319, 1367, 1439, 1487, 1523, 1619, 1823, 1907, ... 
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int i , j , a , c1 = 0 , c0 = 0 , t = 0;
  for(i = 1;i <= n;i ++)
  {
    if(n % i == 0)
    {
      c0 ++;
    }
  }
  if(c0 == 2)
  {
    for(i = 2;i < n - 1;i ++) 
    {
      for(j = 1;j<= i;j ++)
      {
        if(i % j == 0)
        {
          c1 ++;
        }
      }
      if(c1 == 2)
      {
        a = (2 * i) + 1;
        if(a == n)  
        {
          t = 1;
          break;
        }
      }
    }
  }
  if(t == 1)
  {
    System.out.println(n + " is a Safe Prime.");
    System.out.println("There is No Risk to It's Life...");
  }
  else
  {
    System.out.println(n + " is Not a Safe Prime.");
    System.out.println("It is Highly Unsafe and hence , Needs Protection.");
  }
}

void Simply_Fascinating()throws IOException
{
// Some numbers of 3 digits or more exhibit a very interesting property. The property is such that,
// when the number is multiplied by 2 and 3, and both these products are concatenated with the original
// number, all digits from 1 to 9 are present exactly once, regardless of the number of zeroes.
// Let’s understand the concept of Fascinating Number through the following example:
// Consider the number 192,
// 192 x 1 = 192
// 192 x 2 = 384
// 192 x 3 = 576
// Concatenating the results : 192384576
// It could be observed that ‘192384576’ consists of all digits from 1 to 9 exactly once.
//  Hence, it could be concluded that 192 is a Fascinating Number.
// Some examples of fascinating Numbers are : 192, 219, 273, 327, 1902, 1920, 2019 etc.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  if(n < 100)
  {
    System.out.println(n + " is Not Even a 3-digit Number.");
    System.out.println("How Can You Expect it to be Fascinating in any Way ???"); 
  }
  else
  {
    String a = String.valueOf(n * 2);
    String b = String.valueOf(n * 3);
    String s = String.valueOf(n) + a + b;
    int i , j , t = 0, c;
    for(i = 1;i <= 9;i ++)
    {
      c = 0;
      for(j = 0;j < s.length();j ++)
      {
        if(Integer.parseInt(String.valueOf(s.charAt(j))) == i)
        {
          c ++;
        }
      }
      if(c != 1)
      {
        t = 1;
        break;
      }
    }
    if(t == 1)
    {
      System.out.println(n + " Fails to Fascinate Me.");
      System.out.println("It's Just Not a Fascinating Number.");  
    }
    else
    {
      System.out.println(n + " is Simply Fascinating.");
      System.out.println("After all , It's a Fascinating Number[Quite Literally].");
    }
  }
}

void Woodall()throws IOException
{
// In number theory, a Woodall number (Wn) is any natural number of the form
//  Wn = n*(2^n) - 1
// for some natural number n. The first few Woodall numbers are:
// 1, 7, 23, 63, 159, 383, 895, … .
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int i , v , t = 0;
  for(i = 1;i < n;i ++)
  {
    v = (i * (int)(Math.pow(2 , i))) - 1;
    if(v == n)
    {
      System.out.println(n + " is a Woodall Number , for the Number , " + i + ".");
      t = 1;
      break;
    }
  }
  if(t == 0)
  {
    System.out.println(n + " is NOT a Woodall Number.");
  }
}

void Hopefully_not_a_Dud()throws IOException
{
// A Deudeney Number is a positive integer that is a perfect cube such that the sum of its decimal digits
// is equal to the cube root of the number.There are only 7 such integers :
//     0 = 0 x 0 x 0 ; 0 = 0
//     1 = 1 x 1 x 1 ; 1 = 1
//   512 = 8 x 8 x 8 ; 8 = 5 + 1 + 2 
//  4913 = 17 x 17 x 17 ; 17 = 4 + 9 + 1 + 3 
//  5832 = 18 x 18 x 18 ; 18 = 5 + 8 + 3 + 2
// 17576 = 26 x 26 x 26 ; 26 = 1 + 7 + 5 + 7 + 6
// 19683 = 27 x 27 x 27 ; 27 = 1 + 9 + 6 + 8 + 3
// The name Derives from Henry Dudeney.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int i , s = 0 , v , t = 0;
  for(i = 0;i <= n;i ++)
  {
    v = i * i * i;
    if(v == n)  
    {
      t = 1;
    }
    while(v != 0)
    {
      s = s + (v % 10);
      v = v / 10;
    }
    if(t == 1 && s == i)
    {
      System.out.println(n + " is a Dudeney Number.");
      t = -1;
      break;
    }
    t = 0;
    s = 0;
  }
  if(t > -1)
  {
    System.out.println(n + " is NOT a Dudeney Number.");
    System.out.println("It's just a Dud..."); 
  }
}

void Thabit__not_Rabbit()throws IOException // I know its kind-a lame....
{
// In Number theory , a Thabit Number / Thabit ibn Kurrah Number , or 321 Number is an integer
// of the form : 3 x 2^n - 1 for a non-negative integer n.
// The First few Thabit numbers are : 
// 2 , 5 , 11 , 47 , 95 , 191 , 382 , 767 , ... , 786431 , 1572863 , ...
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  if(n > 0)
  {
    int i , v , t = 0;
    for(i = 1;i <= n;i ++)
    {
      v = (3 * ((int)Math.pow(2 , i))) - 1;
      if(v == n)
      {
        System.out.println(n + " is A Thabit Number.");
        System.out.println("In Case you Don't Know , It's Pronounced the Same");
        System.out.println("Way as the Words Rabbit , Habit , etc.");
        t = 1;
        break;
      }
    }
    if(t == 0)
    {
      System.out.println(n + " is NOT a Thabit Number.");
    }
  }
  else
  {
    System.out.println(n + " is Not Even a Positive Number...");
    System.out.println("Then , How can You Expect it to be a Thabit Number ????");
  }
}

void Happy()throws IOException
{
  System.out.println("Enter the Number.");
  int n = Integer.parseInt(x.readLine()); 
  int v , s , a = n; 
  while(a > 9) // 10 
  {
    v = a; // 10
    s = 0; 
    while(v != 0)
    {
      s = s + (int)Math.pow((v % 10) , 2);   
      v = v / 10;
    }
    a = s; // a = 1
  }
  if(a == 1)
  {
    System.out.println(n + " is a Happy Number.");
  }
  else
  {
    System.out.println(n + " is a Sad Number.");
  }
}

void The_Golden_Ratio()throws IOException // NOT DONE YET
{
// 2 Numbers a and b (a > b > 0) are said to be in the golden ratio if (a + b)/a = a/b = {phi} [Value : (1 + root5)/2]
System.out.println("Enter the Two Numbers.");
int a = Integer.parseInt(x.readLine());
int b = Integer.parseInt(x.readLine());
System.out.println("");
System.out.println("");
}

void Being_Pernicious()throws IOException
{
// A Pernicious Number is One whose Population Count is a Prime.
// The Population count is the Number of 1's in the Binary Representation of a Non-negative Integer.
// 22 is a Pernicious Number as : 10110 has 3 1's                              
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  if(n < 0) 
  {
    System.out.println("The Value Cannot be Negative.");
    System.out.println("Please Try Again...");
    Being_Pernicious();
  }
  int a = n , c = 0 , i;
  String z = "";
  while(a != 0) 
  {
    z = (a % 2) + z;
    a = a / 2;
  }
  for(i = 0;i < z.length();i ++)
  {
    if(z.charAt(i) == '1')
    {
      c ++;
    }
  }
  a = 0;
  for(i = 1;i <= c;i ++)
  {
    if(c % i == 0)
    {
      a ++;
    }
  }
  if(a == 2)
  {
    System.out.println(n + " is a Pernicious Number.");
  }
  else
  {
    System.out.println(n + " is NOT a Pernicious Number.");
  }
}

void Devlali_from_Colombia()throws IOException
{
// A self number, Colombian number or Devlali number is an integer that cannot be written
// as the sum of any other integer n and the individual digits of n.
// This property is specific to the base used to represent the integers.
// For Example , 20 is a self number (in base 10), because no such combination can be found 
// (all n < 15 give a result < 20; all other n give a result > 20). 
// 21 is not, because it can be written as 15 + 1 + 5 using n = 15.
// These numbers were first described in 1949 by the Indian mathematician D. R. Kaprekar.
// The first few base 10 self numbers are:
// 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97, 108, 110, 121, 132, 143, 154, 165, 176,
// 187, 198, 209, 211, 222, 233, 244, 255, 266, 277, 288, 299, 310, 312, 323, 334, 345, 356,
// 367, 378, 389, 400, 411, 413, 424, 435, 446, 457, 468, 479, 490, ... 
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int t = 0 , s , a;
  for(int i = 1;i <= n;i ++)
  {
    s = 0;
    a = i;
    s = s + a;
    while(a != 0)
    {
      s = s + (a % 10);
      a = a / 10;
    }
    if(s == n)
    {
      System.out.println(n + " is Not a Self/Colombian/Devlali Number.");
      t = 1;  
      break;
    }
  }
  if(t == 0)
  {
    System.out.println(n + " is  a Self/Colombian/Devlali Number.");
  }
}

void Sierpinski()throws IOException // NOT DONE YET
{
// In number theory, a Sierpinski Number is an odd natural number k such that
// k x 2^n + 1 is composite, for all natural numbers n.
// 1960, Wac?aw Sierpi?ski proved that there are infinitely many odd integers k which have this property.
// The sequence of currently known Sierpi?ski numbers begins with:
// 78557, 271129, 271577, 322523, 327739, 482719, 575041, 603713, 903983, 934909, 965431, 1259779, 1290677,
// 1518781, 1624097, 1639459, 1777613, 2131043, 2131099, 2191531, 2510177, 2541601, 2576089, 2931767, 2931991, ... 
}

void Markov()throws IOException
{
// A Markov number or Markoff number is a positive integer x, y or z that is part of a solution to the Markov Diophantine equation
// x^2 + y^2 + z^2 = 3xyz
// studied by Andrey Markoff (1879, 1880).
// The first few Markov numbers are
// 1, 2, 5, 13, 29, 34, 89, 169, 194, 233, 433, 610, 985, 1325, ... 
// appearing as coordinates of the Markov triples : 
// (1, 1, 1), (1, 1, 2), (1, 2, 5), (1, 5, 13), (2, 5, 29),
//  (1, 13, 34), (1, 34, 89), (2, 29, 169), (5, 13, 194), (1, 89, 233),
//  (5, 29, 433), (1, 233, 610), (89, 233, 62210), etc.
// There are infinitely many Markov numbers and Markov triples.
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int i , j , k , l , r , t = 0;
  for(i = 1;i <= n;i ++)
  {
    for(j = 1;j <= n;j ++)
    {
      for(k = 1;k <= n;k ++)
      {
        l = (i * i) + (j * j) + (k * k);
        r = 3 * i * j * k;
        if(l == r && (n == i || n == j || n == k))
        {
          System.out.println(n + " is a Markov Number.");
          System.out.println("The First Triple Formed ,  is : " + "(" + i + " , " + j + " , " + k + ")");
          t = 1;
          break;
        }
      }
      if(t == 1)
      break;
    }
    if(t == 1)
    break;
  }
  if(t == 0)  
  {
    System.out.println(n + " is Not a Markov Number.");
  }
}

void Narcissism()throws IOException
{
// In recreational number theory, a narcissistic number (also known as a pluperfect digital invariant
// (PPDI),an Armstrong number (after Michael F. Armstrong) or a plus perfect number)is a 
// number that is the sum of its own digits each raised to the power of the number of digits.
// This definition depends on the base b of the number system used, e.g., b = 10 for the decimal system or b = 2 for the binary system.
// The sequence of base 10 narcissistic numbers starts: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153,
//  370, 371, 407, 1634, 8208, 9474, ...
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int a = n , s = 0;
  while(a != 0)
  {
    s = s + (int)(Math.pow(a % 10 , (String.valueOf(n)).length()));
    a = a / 10;
  }
  if(s == n)
  {
    System.out.println(n + " is a Narcissistic Number.");
  }
  else  
  {
    System.out.println(n + " is Not a Narcissistic Number.");
  }
}

void Super_Star()throws IOException
{
// A star number is a centered figurate number that represents a centered hexagram (six-pointed star),
// such as the one that Chinese checkers is played on.
// The nth star number is given by the formula Sn = 6n(n ? 1) + 1. The first 43 star numbers are
// 1, 13, 37, 73, 121, 181, 253, 337, 433, 541, 661, 793, 937, 1093, 1261, 1441, 1633, 1837, 2053,
// 2281, 2521, 2773, 3037, 3313, 3601, 3901, 4213, 4537, 4873, 5221, 5581, 5953, 6337, 6733, 7141,
// 7561, 7993, 8437, 8893, 9361, 9841, 10333, 10837
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  System.out.println("");
  int a , t = 0;
  for(int i = 1;i <= n;i ++)
  {
    a = ((6 * i) * (i - 1)) + 1;
    if(a == n)
    {
      System.out.println(n + " is a Star Number.");
      t = 1;
      break;
    }
  }
  if(t == 0)
  {
    System.out.println(n + " is Not a Star Number.");
  }
}

void Ugly_Uglier_Ugliest()throws IOException
{
// Hamming numbers are numbers of the form  
//   H  =  2^i × 3^j × 5^k 
// where
//         i, j, k  ?  0 
// Hamming numbers   are also known as   ugly numbers   and also   
// 5-smooth numbers   (numbers whose prime divisors are less or equal to 5).They are Also Known as Regular Numbers.
// 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18, 20, 24, 25, 27, 30, 32, 36, 40, 45, 48, 50, 54, 60, ... 
  System.out.println("Enter a Number.");
  int n = Integer.parseInt(x.readLine());
  int i , j , k , a , t = 0;
  System.out.println("");
  System.out.println("");
  for(i = 1;i <= n;i ++)
  {
    for(j = 1;j <= n;j ++)
    {
      for(k = 1;k <= n;k ++)
      {
        a = (int)(Math.pow(2 , i) + Math.pow(3 , j) + Math.pow(5 , k));
        if(a == n)
        {
          System.out.println(n + " is a Hamming Number.");
          System.out.println("It is Also the Most Ugliest Number I've Seen till Date...");
          t = 1;
          break;
        }
      }
    }
  }
  if(t == 0)
  {
    System.out.println(n + " is NOT a Hamming Number.");
    System.out.println("It's Beautiful though... :P");
  }
}

private int Odd_Primes(int n) // This was created for the next Function
{
  int i , j = 0;
  for(i = 1;i <= n;i ++)
  {
    if(n % i == 0)
    {
      j++;
    }
  }
  if(j == 2 && n % 2 == 1)
  {
    return 1;
  }
  else
  {
    return 0;
  }
}
void Golden_n_Shiny()throws IOException
{
/*A Goldbach number is a positive even integer that can be expressed as the sum of two odd primes.
[4] Since four is the only even number greater than two that requires the even prime 2 in order to be written
as the sum of two primes, another form of the statement of Goldbach's conjecture is that all even integers greater 
than 4 are Goldbach numbers.
The expression of a given even number as a sum of two primes is called a Goldbach partition of that number.
The following are examples of Goldbach partitions for some even numbers:
6 = 3 + 3
8 = 3 + 5
10 = 3 + 7 = 5 + 5 */
  System.out.println("Enter a Positive Even Number.");
  int n = Integer.parseInt(x.readLine());
  System.out.println("");
  int i , j , s = 0;
  if(n % 2 == 1 || n <= 0)
  {
    System.out.println("The Input was Invalid, and for No Other REason than the Fact");
    System.out.println(" that You're either Impatient or have Reading issues.... ");
  }
  else if(n <= 4)
  {
    System.out.println(n + " is NOT a Goldbach Number.");
  }
  else
  {
    System.out.println("Following are the Prime Pairs : ");
    for(i = 0;i < n/2;i ++)
    {
      s = i + (n - i); 
      if(Odd_Primes(i) == 1 && Odd_Primes(n - i) == 1 && s == n)
      {
        System.out.println(i + " , " + (n - i));
      }
    }
    System.out.println("");
    System.out.println(n + " is thus, a Goldbach Number with above Prime Pairs.");
  }
}
} // end of class
