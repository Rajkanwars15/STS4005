# CAT-1

## SOLVED 

## [Leaders in an Array](src/leaders.java)
### Concept
To find the leaders in an array. An element is considered a leader if it is greater than all the elements to its right in the array.

### Approach
Iterate from left to right. Check each element, break if you find a larger element

### Complexities
>#### Time
>O(n<sup>2</sup>)
>#### Space
>O(1)

## [Combinations](src/combinations.java)
### Concept
To generate all unique combinations of two elements from an array, excluding combinations where both elements are the same.

### Approach
The provided Java code uses a nested loop to iterate through the array and generate combinations of two elements. It skips combinations where both elements are the same to ensure uniqueness.

<ol>
<li> Initialize a 2D array combinations to store the generated combinations. The size of this array is calculated based on the number of unique combinations (n * (n - 1) / 2), where n is the length of the input array. </li>
<li> Use nested loops to iterate through the input array. The outer loop iterates from the first element to the second last element, and the inner loop iterates from the next element to the last element. </li>
<li> Check if the elements at the current positions (i and j) are different. If they are different, store these elements as a combination in the combinations array. </li>
<li> Increment the index variable to keep track of the number of combinations generated. </li>
<li> After generating all combinations, trim the combinations array to remove any unused slots using Arrays.copyOf. </li>
<li> Return the trimmed combinations array. </li>
</ol>


### Complexities
>#### Time
>O(n<sup>2</sup>)
>#### Space
>O(n<sup>2</sup>)

## [Majority Element](src/mojorityElement.java)
### Concept
The concept of this program is to find the majority element in an array, i.e., an element that appears more than ⌊n/2⌋ times, where n is the length of the array.

### Approach
#### Boyer-Moore Majority Vote Algorithm
<ol>
<li>Initialize two variables, count and ele. count keeps track of the number of occurrences of the current candidate majority element, and ele stores the current candidate majority element. </li>
<li>Iterate through the array: </li>
<ol>
<li> If count is zero, update ele to the current element and set count to 1. </li>
<li> If the current element is equal to ele, increment count. </li>
<li> If the current element is not equal to ele, decrement count. </li>
</ol>
<li> After the first loop, reset count to 0 and iterate through the array again to count the occurrences of the candidate majority element (ele). </li>
<li> If the count of the candidate majority element is greater than ⌊ n/2 ⌋, return the candidate majority element (ele). Otherwise, return -1, indicating that there is no majority element. </li>
</ol>

### Complexities
>#### Time
>O(n)
>#### Space
>O(1)

## [Maneuvering Problem](src/manuvering.java)
### Concept
To find the number of unique paths from the top-left corner to the bottom-right corner of an m×n grid, where each movement can only be either right or down.

### Approach
Three Scenarios

|Case| Function   |
|-|------------|
|Down| >(m-1,n)   |
|Right| >(m,n-1)   |
|Diagonal| >(m-1,n-1) |

Recursive call these scenarios and their sum is the total number of paths.

### Complexities
>#### Time
>O(3<sup>3m+n</sup>)
>#### Space
>O(m+n)

## [Maximum Equilibrium Sum in an Array](src/maxEquilibrium.java)
### Concept
To find the index at which the sum of elements to the left of that index is closest to the sum of elements to the right of that index. This index is considered as the equilibrium index.
 
### Approach
Iterate through the array and calculate the sum of elements to the left and right of each index.
The difference between the sums is then computed, and the index with the minimum absolute difference is recorded. 
This index represents the equilibrium point.

### Complexities
>#### Time
>O(n)
>#### Space
>O(1)

## UNSOLVED
## [Hamiltonian Cycle](src/.java)
### Concept

### Approach

### Complexities
>#### Time
>O()
>#### Space
>O()

## [N-Queens](src/.java)
### Concept

### Approach

### Complexities
>#### Time
>O()
>#### Space
>O()

## [Natural Sort Order](src/.java)
### Concept

### Approach

### Complexities
>#### Time
>O()
>#### Space
>O()

## [Quick Sort](src/.java)
### Concept

### Approach

### Complexities
>#### Time
>O()
>#### Space
>O()

## [Selection Sort](src/.java)
### Concept

### Approach

### Complexities
>#### Time
>O()
>#### Space
>O()

## [Warnsdorff's](src/.java)
### Concept

### Approach

### Complexities
>#### Time
>O()
>#### Space
>O()

# CAT-2

## [Activity Solution Problem](src/activity.java)
16-02-2024

### Description:
Pick index pos as activity name

*Input:*
>String act [] = {"A<sub>1</sub>", "A<sub>2</sub>", "A<sub>3</sub>"}
> 
>Int st [] = {1, 4, 9} //start time
> 
>Int en [] = {9, 5, 10} //end time

*Output:*

A<sub>1</sub> can work 1-9 and A<sub>3</sub> works 9-10. 
List out max number of activities one can perform

*Challenge:* Sort the ending indices and then apply activity solution.
Here use bubble sort.

## [Kruskal's Algo](src/Kruskal.java)
17-02-2024

Graph to minimum spanning tree
Graph: n vertices
MST: n vertices, n-1 edges

## [Double Linked List](src/DLL.java)
01-03-2024

3 objects
