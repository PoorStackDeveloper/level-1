class Solution {
    public long solution(int a, int b) {
        return gaussianFormula(Math.min(a, b), Math.max(b, a));
    }
    private long gaussianFormula(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    } 
}