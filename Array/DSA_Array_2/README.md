# Multiply Array Elements by 10

## Problem Description
Creates a new array where each element from the input array is multiplied by 10.

## Approach
1. Determine the length of the input array.
2. Allocate a new integer array of the exact same length.
3. Iterate through the input array using a `for` loop.
4. Multiply each element by 10 and store it in the corresponding index of the new array.
5. Return the newly created array.

## Complexity
* **Time Complexity:** `O(N)` — The algorithm traverses the array of size N exactly once.
* **Space Complexity:** `O(N)` — A new array of size N is created to store and return the modified values.

## Example
**Input:** `[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]`
**Output:** `10 20 30 40 50 60 70 80 90 100`
