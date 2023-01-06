class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        
        for (int i=1; i<=count; i++) {
            answer -= price*i;
        }

        return answer<0?-answer:0;
    }
}


/*
정확성  테스트
테스트 1 〉	통과 (0.07ms, 82.6MB)
테스트 2 〉	통과 (0.09ms, 78.6MB)
테스트 3 〉	통과 (0.08ms, 76.4MB)
테스트 4 〉	통과 (0.10ms, 81.1MB)
테스트 5 〉	통과 (0.05ms, 77.4MB)
테스트 6 〉	통과 (0.05ms, 73.5MB)
테스트 7 〉	통과 (0.07ms, 74.3MB)
테스트 8 〉	통과 (0.07ms, 78.7MB)
테스트 9 〉	통과 (0.05ms, 72.5MB)
테스트 10 〉	통과 (0.06ms, 78.1MB)
테스트 11 〉	통과 (0.05ms, 84MB)
테스트 12 〉	통과 (0.08ms, 80.6MB)
테스트 13 〉	통과 (0.05ms, 72.7MB)
테스트 14 〉	통과 (0.05ms, 72.7MB)
테스트 15 〉	통과 (0.08ms, 75.4MB)
테스트 16 〉	통과 (0.06ms, 76.9MB)
테스트 17 〉	통과 (0.07ms, 74.3MB)
테스트 18 〉	통과 (0.07ms, 72.3MB)
테스트 19 〉	통과 (0.08ms, 78.9MB)
테스트 20 〉	통과 (0.08ms, 72.1MB)
테스트 21 〉	통과 (0.10ms, 78.5MB)
테스트 22 〉	통과 (0.07ms, 71MB)
테스트 23 〉	통과 (0.08ms, 77.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

