# Judge
Name: Steven Lu
Since every item in the trust array is unique and different, a judge cannot appear in the [0] index of every element and the number of judge appear in [1] index should equal to N-1. Because, the judge trust no one and everyone trust judge. Thus, I created two nested for loop. one to check the possible judge and store them in an Arraylist by checking each trust element's [0] item. Then, use a counter obj to keep track of each possible judge in the Arraylist that appears in the [1] item in the trust elements. 
