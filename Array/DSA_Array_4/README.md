# Find Maximum Element in an Array
 
## Problem Description
Finds the largest element in an array and returns it. If the array is empty, it returns `-1`.
 
## Approach
1. Determine the length of the input array.
2. If the array is empty, return `-1`.
3. Initialize `highest` with the first element of the array.
4. Iterate through the array from index `0` to `n - 1` using a `for` loop.
5. Compare each element with `highest`.
6. If an element is greater than `highest`, update `highest` to that element.
7. After the loop finishes, return `highest`.
8. In `main`, print the highest element if the result is not `-1`, otherwise print that the array is empty.
## Complexity
* **Time Complexity:** `O(N)` — Every element is checked exactly once, so the running time is the same in the best, average, and worst cases.
* **Space Complexity:** `O(1)` — Only a constant amount of extra space is used (the `highest` variable), regardless of the array size.
## Example
**Input:** `arr = [10, 20, 30, 40, 100, 110, 90]`
**Output:** `Highest Element in Array: 110`
 
