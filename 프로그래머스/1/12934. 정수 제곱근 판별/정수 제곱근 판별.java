import java.util.*;
import java.io.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        //제곱근 저장
        long x = (long)Math.sqrt(n);
        if(x*x == n){ // 양의 정수 x의 제곱일 경우
            answer = (long)((x+1) * (x+1)); 
        } else{
            answer = -1;            
        }
        return answer;
        
    }
}