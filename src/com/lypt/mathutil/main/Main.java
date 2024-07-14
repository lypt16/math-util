/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lypt.mathutil.main;

import com.lypt.mathutil.core.MathUtil;

/**
 *
 * @author THUY PHUNG
 */
public class Main {
  
    public static void main(String[] args) {
        //test hàm tính giai thừa có chạy đúng như thiết kế không
        // đưa ra các tình huống sử dụng hàm trong thực tế
        //vd: -5, 0, 20, 21 => các TESTCASE: tình huống hàm được đưa vào sử dụng, giả lập hành vi dùng của ai đó
        //TESTCASE: là 1 tình huống sử dụng app hay hàm mà nó bao gồm:
        //INPUT:DATA đầu vào
        //OUTPUT: đầu ra ứng với xử lý của hàm/ chức năng của app dùng đầu vào để xử lý
        // SO SÁNH để xem kết quả có như kỳ vọng không
        
        long expected = 120; // hàm trả về 120 nếu tính 5!
        int n = 5; //INPUT 
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected);
        System.out.println("5! =  " + actual + " actual");

        
        
        
    }
    
}
