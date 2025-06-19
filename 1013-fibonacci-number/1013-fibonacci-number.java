class Solution {
    public int fib(int n) {
        int first=0;
        int second=1;
         int count = 0;
        while (count < n) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            count++;
        }
        return first;
    }
}