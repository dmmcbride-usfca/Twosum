# Two Sum

Foobar is a Python library for dealing with word pluralization.
## Usage

```java
    public static void main(String [] args)
    {
        int arr[] = new int[]{4, 5, 3, 2, 1};
        Twosum newSum = new Twosum(arr, 3);
        System.out.println(newSum);
    }
```

## Analysis

### Time Complexity
findSum() uses one single for-loop, which in the worst case scenario runs at O(n) time complexity. It also employs a HashMap which runs at constant time O(1). In a worst case scenario, findSum() runs at O(n) and in a best case scenario, where the first two elements of the int list sum to the target, it runs at constant time O(1).

### Space Complexity
findSum() stores a value diff which is simply overwritten each loop, so it remains constant at O(1). It uses an int array that is constant at 2 elements, so has a space complexity of O(1). It also uses a hash map which grows linearly with each addition, that in the worst case scenario means O(n) in memory. 

## Contributers
Dunham McBride
