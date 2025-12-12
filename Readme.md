# Java Development Assessment - Pivotrics

This repository contains solutions for the technical assessment for the Java Development Internship at Pivotrics.
Each solution is implemented in **Java** with a focus on **clean code**, **efficiency (Time/Space Complexity)**, and **readability**.

## Project Structure

| File | Problem | Approach | Complexity |
| :--- | :--- | :--- | :--- |
| `Solution01_ProductArray.java` | **Product of Array Except Self** | Prefix & Suffix Products | Time: O(N) \| Space: O(1) |
| `Solution02_SortCharactersByFrequency.java` | **Sort Character By Frequency** | HashMap & Sorting | Time: O(N log K) |
| `Solution03_TwoSum.java` | **Two Sum** | HashMap (One Pass) | Time: O(N) |
| `Solution04_LastStoneWeight.java` | **Last Stone Weight** | PriorityQueue (Max-Heap) | Time: O(N log N) |
| `Solution05_SearchRotatedArray.java` | **Search in Rotated Sorted Array** | Modified Binary Search | Time: O(log N) |
| `Solution06_LongestSubstring.java` | **Longest Substring No Repeats** | Sliding Window + HashMap | Time: O(N) |
| `Solution07_JumpGame.java` | **Jump Game (Min Jumps)** | Dynamic Programming | Time: O(N^2) |
| `Solution08_AddTwoNumbers.java` | **Add Two Numbers** | Linked List Traversal | Time: O(max(N, M)) |

## How to Run

Each file is self-contained with a `main` method including test cases.
You can run any solution directly from the terminal:

```bash
javac Solution01_ProductArray.java
java Solution01_ProductArray