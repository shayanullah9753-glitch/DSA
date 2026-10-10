# Linear Search

## Problem Description
Searches for a given key in an array and returns the index of its first occurrence. If the key is not present, it returns `-1`.

## Approach
1. Determine the length of the input array.
2. Iterate through the array from index `0` to `n - 1` using a `for` loop.
3. Compare each element with the key.
4. If an element matches the key, return its index immediately.
5. If the loop finishes without a match, return `-1`.
6. In `main`, print the index if the result is not `-1`, otherwise print that the element was not found.

## Complexity
* **Time Complexity:** `O(N)` — In the worst case (key is at the end or not present), the algorithm checks all N elements once. The best case is `O(1)` when the key is at index 0.
* **Space Complexity:** `O(1)` — Only a constant amount of extra space is used, regardless of the array size.

## Example
**Input:** `arr = [10, 20, 30, 40, 50, 60, 70]`, `key = 30`
**Output:** `Element found at index: 2`
