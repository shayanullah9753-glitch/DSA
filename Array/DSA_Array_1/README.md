# Find Average of Array Elements

## Problem Description
Calculates the integer average of all elements present in a given array.

## Approach
1. Initialize a `sum` variable to `0`.
2. Iterate through the array using a `for` loop, adding each element to the sum.
3. Divide the total sum by the length of the array to compute the average.
4. Return the final result.

## Complexity
* **Time Complexity:** `O(N)` — The algorithm traverses the array of size N exactly once.
* **Space Complexity:** `O(1)` — Only a constant amount of extra space is used for storing primitive variables (`sum`, `n`, `avg`).

## Example
**Input:** `[10, 20, 30, 40, 50, 60]`
**Output:** `35`
