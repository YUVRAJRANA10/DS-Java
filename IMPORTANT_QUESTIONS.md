# 🎯 IMPORTANT QUESTIONS - Exam Quick Focus

## Your Completed Concepts (File1_Q1 to File3_Q7)
✅ Array Manipulation (Reverse in blocks, Move Zeroes)  
✅ Hashing / Frequency Arrays (Count Unique, First Unique, Mode)  
✅ String Processing (Clean zeros, Compress, Word Frequency)  
✅ Stack Basics (Push/Pop, Bracket Balancing)  
✅ 2D Array / Matrix (Seat Reservation, Diagonals)  
✅ Binary Search (Last Occurrence, Rotated Array, Decreasing Search)  
✅ Greedy (Maximize Sum)  
✅ Two-Pointer (Merge Sorted Arrays)  
✅ Linked List Basics (Reverse, Add to Tail)  
✅ Sorting (Insertion Sort Energy)  

---

## 🔥 HIGH PRIORITY - NEW CONCEPTS (Must Practice!)

### 1. File3_Q9_BSTOperations.java ⭐⭐⭐
**Concept:** Binary Search Tree (Insert + Inorder Traversal)  
**Why Important:** Trees NOT covered at all! BST is exam favorite.
```
Algorithm: 
- Insert: Compare with root, go left if smaller, right if larger
- Inorder: Left → Root → Right (gives sorted output)
```

### 2. File7_Q7_TreeTraversal.java ⭐⭐⭐
**Concept:** Preorder & Postorder Traversal  
**Why Important:** Complete your tree knowledge!
```
Preorder: Root → Left → Right
Postorder: Left → Right → Root
```

### 3. File5_Q6_SmallestWindowSubstring.java ⭐⭐⭐
**Concept:** Sliding Window  
**Why Important:** Very common pattern, you haven't practiced this!
```
Algorithm: Expand right, contract left with frequency map
Example: S="ADOBECODEBANC", T="ABC" → "BANC"
```

### 4. File5_Q4_MaxProfit.java ⭐⭐⭐
**Concept:** DP / Greedy (Stock Buy-Sell)  
**Why Important:** Classic interview question!
```
Algorithm: Track min price seen so far, max diff at each step
Example: {7,1,5,3,6,4} → 5 (buy at 1, sell at 6)
```

### 5. File4_Q4_SearchMatrix.java ⭐⭐
**Concept:** Matrix Binary Search (Staircase Search)  
**Why Important:** New matrix search technique!
```
Algorithm: Start from top-right corner
- If target < current: move left
- If target > current: move down
```

### 6. File5_Q1_NthFromEnd.java ⭐⭐
**Concept:** Two-Pointer on Linked List  
**Why Important:** Different from simple reversal!
```
Algorithm: Two pointers N steps apart, when fast hits end, slow is answer
```

### 7. File4_Q1_ReverseQueue.java ⭐⭐
**Concept:** Queue Reversal using Stack  
**Why Important:** Stack-Queue interplay!
```
Algorithm: Push all to stack, pop back to queue
```

### 8. File4_Q9_BaseballGame.java ⭐⭐
**Concept:** Stack with Operations  
**Why Important:** Stack application with multiple rules!
```
Rules: 'C' = remove last, 'D' = double last, '+' = sum last two
```

---

## 🟡 MEDIUM PRIORITY - Good to Know

### 9. File4_Q8_MissingNumber.java
**Concept:** Math (Sum Formula / XOR)
```
Formula: n*(n+1)/2 - array_sum = missing
XOR Method: XOR all numbers 1 to n, XOR with array elements
```

### 10. File5_Q5_KthSmallest.java
**Concept:** Heap / Sorting  
**Why Important:** Heap is a new DS!
```
Using Max-Heap of size K to find K-th smallest
```

### 11. File7_Q8_SplitCircularList.java
**Concept:** Circular Linked List  
**Why Important:** Circular list handling is tricky!
```
Algorithm: Fast/Slow pointer to find middle, break and link
```

### 12. File7_Q9_MergeSortedLists.java
**Concept:** Merge Sorted Linked Lists  
**Why Important:** Similar to arrays but with pointers!
```
Algorithm: Compare heads, link smaller one, move pointer
```

---

## 🟢 LOW PRIORITY - Repetitive / Easy

These are similar to what you've already done:
- File3_Q8_OddEvenLinkedList → Similar to linked list manipulation
- File4_Q3_CodeCompilerBrackets → Same as bracket balance (done)
- File4_Q5_UniqueElements → Same as hashing (done)
- File4_Q7_RunLengthEncoding → Same as String Compression (done)
- File5_Q2_RemoveDuplicatesSorted → Simple linked list
- File5_Q3_MatrixMultiplication → Just nested loops
- File6_Q1_PalindromeCheck → Two-pointer easy
- File6_Q2-Q9 → All repetitive concepts
- File7_Q1-Q4 → Basic array/counting
- File8_Q1-Q3 → Basic string/stack

---

## 📝 QUICK REFERENCE ALGORITHMS

### Binary Search Template
```java
int left = 0, right = n - 1;
while (left <= right) {
    int mid = left + (right - left) / 2;
    if (arr[mid] == target) return mid;
    else if (arr[mid] < target) left = mid + 1;
    else right = mid - 1;
}
```

### BST Insert
```java
if (root == null) return new TreeNode(val);
if (val < root.val) root.left = insert(root.left, val);
else root.right = insert(root.right, val);
return root;
```

### Inorder Traversal
```java
void inorder(TreeNode root) {
    if (root == null) return;
    inorder(root.left);
    print(root.val);
    inorder(root.right);
}
```

### Two-Pointer (N-th from End)
```java
ListNode fast = head, slow = head;
for (int i = 0; i < n; i++) fast = fast.next;
while (fast != null) {
    fast = fast.next;
    slow = slow.next;
}
return slow;
```

### Sliding Window Template
```java
int left = 0;
for (int right = 0; right < n; right++) {
    // expand window: add arr[right]
    while (/* condition */) {
        // shrink window: remove arr[left]
        left++;
    }
    // update result
}
```

### Stock Buy-Sell (Max Profit)
```java
int minPrice = Integer.MAX_VALUE, maxProfit = 0;
for (int price : prices) {
    minPrice = Math.min(minPrice, price);
    maxProfit = Math.max(maxProfit, price - minPrice);
}
return maxProfit;
```

---

## ⏰ STUDY ORDER (2-3 hours)

1. **File3_Q9_BSTOperations** (20 min) - Tree insert + inorder
2. **File7_Q7_TreeTraversal** (15 min) - Preorder + Postorder
3. **File5_Q4_MaxProfit** (15 min) - Stock problem
4. **File5_Q6_SmallestWindowSubstring** (25 min) - Sliding window
5. **File4_Q4_SearchMatrix** (15 min) - Matrix search
6. **File5_Q1_NthFromEnd** (15 min) - Two-pointer linked list
7. **File4_Q9_BaseballGame** (15 min) - Stack operations
8. **File4_Q8_MissingNumber** (10 min) - Math formula

**Total: ~2 hours** - Focus on first 5 for trees, DP, sliding window!

---

Good luck on your exam! 🚀
