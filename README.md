# Harbol Code
A collection of [LeetCode](https://leetcode.com/) and similar problems solved with the [best java build tool](https://gradle.org/) on the market.

To keep the project available to many problems with reusable components (and just to learn), I turned this into a
[multi-project build](https://docs.gradle.org/current/userguide/multi_project_builds.html).
The project currently has a `leet-code` subproject for LeetCode problems specifically and a `utilities` subproject for utils available to anyone.

## [LeetCode 19 - Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/EndOfLinkedList.java)
traverses the entire length of the linked list while maintaining an offset (`n`) from which to progress the dropped node.
After walking the length of the linked list, the method can drop the correct node in a simple step.
Maintaining the offset lets this solution achieve a $O(n)$ runtime while iterating over the list only once.

## [LeetCode 21 - Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/MergeTwoSortedLists.java)
follows pretty easy steps.
We first find an item to assign as the first spot in out return `ListNode` then iteratively compare the two nexts heads to find the next item while progressing
the respective list head as needed.
Once one (or both) have been exhausted, we fill the remainder of our merge with the surviving list.

## [LeetCode 37 - Sudoku Solver](https://leetcode.com/problems/sudoku-solver/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/SudokuSolver.java)
is the classic backtracking solution.
Make a guess, confirm the puzzle is valid at that guess, see if it is still valid in the future.
To keep it a little interesting I made a cool bitwise mechanism to check which numbers had been placed in a row, column, or subsquare.

## [LeetCode 49 - Group Anagrams](https://leetcode.com/problems/group-anagrams/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/GroupAnagrams.java)
uses a `Map<String, List<String>>` to find the anagrams.
The keys are the alphabetize version of the input String and the values are the words whose letters match the keys.

Note: updated solution uses an inner `AnagramComparitor` class and therefore `Map<AnagramComparitor, List<String>>` that works *slightly* better.

## [LeetCode 60 - Permutation Sequence](https://leetcode.com/problems/permutation-sequence/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/PermutationSequence.java)
was a cool one to work on.
For any $n$ the permutations in order will consist of $(n - 1)!$ starting with 1, $(n - 1)!$ starting with 2, and so on.
The pattern holds if you take a group with the same leading digit and remove it from each of them, and it keeps going all the way in.
I called each of these subsets with the same positional digit "permutation groups."
I go down as far as I can to the start of each permutation group swapping the front digit with the next until I cannot step any farther down without stepping out.
From there, I go in one level of digits and keep doing the process until I am finally at the index of the permutation I want.
Probably owe a better explanation eventually.

## [LeetCode 94 - Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/InorderTreeTraversal.java)
follows basic principles from CS class.
We use recursion to traverse left, own value, then right and return the result at each node; at each step we just add the current `val`.
Sometimes basic is fast.

## [LeetCode 111 - Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/MinDepthBinTree.java)
is pretty basic recursion; go down to the leaf, get the depth, return the min, recurse up.
Worked alright and passed, not in the mood to make it super mega fast this evening.

## [LeetCode 112 - Path Sum](https://leetcode.com/problems/path-sum/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/PathSum.java)
is your basic tree traversal.
Subtract the node value from the given target value,
if it is a leaf node return if the difference is zero,
otherwise recursively call on the left and right nodes.
Tried to be clever and cut it short if the target sum was less than 0 at any non-leaf, but the values can be negative.

## [LeetCode 128 - Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/)
[Our solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/LongestConsecutiveSequence.java)
was originally inspired and come up with by my colleague.
In this case we put all the numbers into a set, pop a number from the set, and see how far right and left we can go (removing visited items each time).
This outperformed [the Neet Code solution](https://www.youtube.com/watch?v=P6RZZMu_maU), but the LeetCode servers might have been a little stressed
when I ran it because after a few more runs they were about neck and neck.

## [LeetCode 136 - Single Number](https://leetcode.com/problems/single-number/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/SingleNumber.java)
came about because I got bored and decided to do a problem.
Just xor the numbers together and there you go.

## [LeetCode 150 - Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/EvaluateReversePolishNotation.java)
makes easy use of a `Stack` to keep track of the calculation.
When we encounter a number, we push it onto the stack, when we encounter an operator, we pop the top two values, execute the operation,
and push the result back on the stack.

## [LeetCode 155 - MinStack](https://leetcode.com/problems/min-stack/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/MinStack.java)
uses two parallel stacks to make the `MinStack` data structure.
One stack is a traditional stack to keep track of the integers while the other keeps track of the minimum value at the current position of the two stacks.
Doing it this way allows the structure to have $O(1)$ complexity for `push()`, `pop()`, `top()`, and `getMin()` operations.

## [LeetCode 189 - Rotate Array](https://leetcode.com/problems/rotate-array/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/ShiftArray.java)
uses the classic solution of making a `temp` array to shift the elements right by `k` and then replaces them in the original (can't reassign the object).
This gives me a $O(n)$ runtime and $O(n)$ space complexity, but I want to do it in place as well.
Working on a solution where I don't have to iterate over the array `k` times to shift everything to the right/left one at a time.

On a small redux, made the `rotateArrayByOne()` method to do a poor attempt of running the code in constant space.
While this works, it is terribly efficient as the code has to shift right up to `length - 1` times.
This ultimately timed out the massive case in LeetCode. Time to work on the one pass in place approach.

Hopefully the final installment. This came from one of my coworkers.
For this solution we reverse the array so that the "chunks" that need to be on the left and right hand sides of the array are on the
correct sides but just in the reverse order of what they should be.
From there we reverse the two slices (all in place) and our rotation is made in two passes.
<details>
    <summary>More complete example:</summary>

For this example we will use an array of length 5 and `k = 2` (if `k > nums.length` then we just mod it down to size).
First we reverse the entire array.
```
[ 1 2 3 4 5 ]
  <--------
[ 5 4 3 2 1 ]
```
Then we reverse the chunk of the first `k` followed by the remaining elements.
```
[ 5 4 3 2 1 ]
  <-- <----
[ 4 5 1 2 3 ]
```
And there we have an array rotated by `k`.
</details>

## [LeetCode 202 - Happy Number](https://leetcode.com/problems/happy-number/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/HappyNumbers.java)
was slightly rigged since I published a paper on these numbers previously.
I saw an annoying YouTube short code an overly complicated version of this using `Set`s to determine if the sequence repeats.
I know that all integers will either go to 1 or 4 following the Happy Function.
All I really have to do then is return `true` when I hit 1 or `false` when I hit 4 (...and 0 as a catch-all).

## [LeetCode 224 - Basic Calculator](https://leetcode.com/problems/basic-calculator/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/BasicCalculator.java)
is able to execute the calculation in one pass from left to right.
The `calculate()` method keeps an accumulator which is added to an subtracted from as the index moves from left to right.
Whenever the index reaches an open parenthesis, we kick off a new calculation to evaluate that quantity.
Returns are only ever called when the index reaches the end of the string (this will be the return from the root calculation)
or when we encounter a closing parenthesis.
Carefully placing our `calculate()` calls ensures we do not return early and allows us to nest as many parentheses as we want.
The `parseNumber()` and `progressIndex()` methods were real heroes in making this solution a lot cleaner to read.

## [LeetCode 227 - Basic Calculator II](https://leetcode.com/problems/basic-calculator-ii/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/BasicCalculator2.java)
takes a different approach from the first one.
Here we can take advantage of the order of operations and use a `Stack<Integer>` to make the `calculate()` method work.
If the operation is an addition, we push the number onto the stack; subtraction pushes the negative number onto the stack.
In the case of a multiplication, we pop off the stack to make that value the left operand and push its product with the right operand.
We follow the same logic for division.
Once done, we sum all of the values in the stack and return the result.
Effectively, we evaluate all the chunks of multiplication first so that the only operation left is addition and subtraction.

## [LeetCode 263 - Ugly Number](https://leetcode.com/problems/ugly-number/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/UglyNumber.java)
was pretty simple; pretty much used some while loops to progressively divide out the prime factors until they were eliminated;
added the bitwise power of two check for flair.
My gripe with this problem was that the definition was not well defined.
One, for instance, "1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5."
But that is also the case for zero which is not an ugly number.
There were also no clarification on negatives.
Although the [OEIS page](https://oeis.org/A051037) does offer a solution in Python, it would be nice to give it a nod in these
integer sequence problems.

## [LeetCode 342 - Power of Four](https://leetcode.com/problems/power-of-four/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/PowerOfFour.java)
uses a bitwise solution to solve the problem in $O(1)$ time and space.
The first part `n > 0 && (n & (n - 1)) == 0` is a power of two check.
If `n` is a power of two, then the minus one will flip all the bits. Bitwise and-ing with the original will turn all bits to zero
only if `n` is a power of two. Once we pass this, that means `n` has only one bit as 1, the rest are 0.
For a power of four, the number will have a single 1 bit in an even position which is complimented by hex `0xaaaaaaaa`
(the single 1 will slip through the cracks, so to speak, of the zeros in `1010...10`).
A bitwise and between that value and `n` gives us 0 if the single 1 bit is in a valid position.

## [LeetCode 641 - Design Circular Deque](https://leetcode.com/problems/design-circular-deque/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/CircularDeque.java)
was a simple exercise in modular arithmetic.
As easy as it would be to use a doubly linked list, I followed the name of the problem and actually made it "circular" with an array and mods.
Everything is in reference to the front index which goes left for `insertFront()` and right for `deleteFront()`.
Operations for `insertLast()` and `getLast()` just use the current number of items to find the end.
These are all done mod `k` to not get an out of bounds index.

## [LeetCode 1551 - Minimum Operations to Make Array Equal](https://leetcode.com/problems/minimum-operations-to-make-array-equal/)
[The best solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/MinOpArr.java)
requires a lot of math.
In short, we proved a closed form for if there were an even or odd number of items in the array;
once that was determined, we applied the closed form for the given case.
<details>
    <summary>See the full details:</summary>

### Some proofs to start (this may seem silly, but it is important):
#### Proof (by induction) that the sum of the first $n$ odd numbers is $n^2$.
First, we let $a_n = 1 + 3 + 5 + ... + (2n - 1)$ be the sum of the first $n$ odd numbers.
We assert that $a_n = n^2$.
We know this is true for $n = 1$ (the base case); $a_1 = 1$.
The value of $a_n$ can be recursively defined in terms of the previous value, $a_n = a_{n - 1} + (2n - 1)$.
This definition shows that the current sum is equal to the previous sum plus the next odd number in the sequence.
We use these definitions and assumption to prove the assumption is true for the next case.
Let $k + 1$ represent the index of the next value in the sequence.
This means that $a_{k + 1} = a_k + 2(k + 1) - 1$.
If we substitute $a_k = k^2$ (our assertion), then $a_{k + 1} = k^2 + 2k + 2 - 1 = k^2 + 2k + 1 = (k + 1)^2$,
which is the same as the initial assumption in the $k + 1$ case.

#### Proof that the sum of the first $n$ even numbers is $n(n + 1)$.
This can be proven in a similar way as before.
Let $a_n = 2 + 4 + ... + 2n$.
We assert that $a_n = n(n + 1)$. This assertion is true for $n = 1$.
We know the sum can be recursively defined as $a_n = a_{n - 1} + 2n$.
Using this definition and our assertion for the next case,
$a_{k + 1} = a_k + 2(k + 1) = k(k + 1) + 2(k + 1) = (k + 2) (k + 1)$
which is the same as the initial assumption for the $k + 1$ case.

### The average value of the array:
By the definitions of the array values in the problem, the array of length $n$ is the first $n$ odd numbers.
This means that the sum of the numbers in the array is $n^2$ and the average value is $n$.
Because the "operation" adds one and subtracts one at each step, the total value (and therefore average) does not change.
This means that if the conditions of problem are met - all values are the same - then all values must equal the initial average value at the end.

### The first few arrays:
The method displayed in the example is the optimal way to bring all values down to the average.
Each value's mirroring counterpart is equidistant from the average in the opposite operation.
The first few cases are displayed below, `+x` refers to the number of add operations that need to be applied
while `-y` refers to the total number of subtractions. Notice that the +/- pairs mirror each other.
```
n | array                           | minOp
--+---------------------------------+-------
1 | [ 1 ]                           | 0
  |                                 |
--+---------------------------------+-------
2 | [ 1   3 ]                       | 1
  |  +1  -1                         |
--+---------------------------------+-------
3 | [ 1   3   5 ]                   | 2
  |  +2      -2                     |
--+---------------------------------+-------
4 | [ 1   3   5   7 ]               | 4
  |  +3  +1  -1  -3                 |
--+---------------------------------+-------
5 | [ 1   3   5   7   9 ]           | 6
  |  +4  +2      -2  -4             |
--+---------------------------------+-------
6 | [ 1   3   5   7   9   11 ]      | 9
  |  +5  +3  +1  -1  -3  -5         |
--+---------------------------------+-------
7 | [ 1   3   5   7   9   11   13 ] | 12
  |  +6  +4  +2      -2  -4   -6    |
```
When the $n$ value is even, the `minOp` is the sum of the first $n/2$ odd numbers.
When the $n$ value is odd, the `minOp` is the sum of the first $(n - 1) / 2$ even numbers.
Since we know these sums from earlier, the problem becomes almost trivial.
```java
int half = n / 2; // integer division
if (n % 2 == 0)
    return half * half;
else
    return half * (half + 1);
```

</details>

## The Jump Game Saga
All of these deserve to be grouped together.
These were a load of fun to work along with some friends from work.
### [LeetCode 55 - Jump Game](https://leetcode.com/problems/jump-game/)
[Our solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/jumpgame/JumpGame1.java)
starts at the end of the array and looks for the next zero (the next "obstacle" to jump over).
Once we get there, we spawn a pointer just left of the zero to look for the nearest position which can jump the zero.
After this position is found, we set `zeroPointer` to the last jumpable position and keep moving to the end.
If `zeroPointer` makes it to the start of the array, then the array is jumpable.
If the pointer looking for the next jumpable point falls off the array, then it is not jumpable.

### [LeetCode 45 - Jump Game II](https://leetcode.com/problems/jump-game-ii/)
[Our solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/jumpgame/JumpGame2.java)
uses a similar approach as the first game.
We start off from where we want to go and dispatch a pointer to find the farthest left position where we can get there.
Since making it to the end is assured, we can afford this lax approach to finding the optimal path to the end.

### [LeetCode 1306 - Jump Game III](https://leetcode.com/problems/jump-game-iii/)
[My solution](https://github.com/mharbol/harbol-code/blob/master/leet-code/src/main/java/io/github/mharbol/leetcode/jumpgame/JumpGame3.java)
is a fun recursive solution.
Since all the entries of `arr` are non-negative, I made them -1 if they were already visited.
Base cases are if the value at index are zero or less than zero, otherwise I send the jumper left and right.
Because each entry can only be visited one time before a decision is made and the recursion completes,
this solution has $O(n)$ time and space complexity.

