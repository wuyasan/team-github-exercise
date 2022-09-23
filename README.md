# team-github-exercise
This is the team Github exercise for the speaking portal project group B.
Here we have 4 separate features that can be applied to an array of integers
These are separated on branches, and compiled into the development branch
These features consist of a method to find the average of an array, the variance of the array, the array reversed as well as the array sorted.
---
### Feature 1 - Reversing an Array

This feature reverses the input array by swapping the elements around with the use of a temporary variable. The first element
is swapped with the last one, and the second element is swapped with the second-to-last value(and so on). To make use of this
feature, run 'arrayMain.java', where you will be asked to enter the size and the contents for an array. Then, the method
'getRev()' is called to reverse this array and the output is printed to the console.


### Feature 2 - Calculating the Average of Array Elements

This feature calculates the average of the user-input array by calculating the sum of all elements in a for-loop,
then dividing by number of elements in the array. To make use of this feature, run 'arrayMain.java', where you will 
be asked to enter the size and the contents for an array. Then, the method 'getAvg()' is called to reverse this array 
and the output is printed to the console.

### Feature 3 - Calculating the Variance between Array Elements

This feature calculates the variance between the elements of the input array. The 'getAvg()' method from Feature 2
is used to find the average of all elements. Then, each element's deviation from this average is calculated, squared 
and added. Finally, dividing this sum of squared differences with the number of elements gives us the variance. To 
make use of this feature, run 'arrayMain.java', where you will be asked to enter the size and the contents for an array.
Then, the method 'getVar()' is called to reverse this array and the output is printed to the console.
