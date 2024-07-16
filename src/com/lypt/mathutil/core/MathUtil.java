/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lypt.mathutil.core;

/**
 *
 * @author THUY PHUNG
 */
public class MathUtil {
    // trong class này cung cấp cho ai đó nhiều hàm toán học
    //clone class Math của JDK
    //hàm thư viện dùng chung cho ai đó mà không cần lưu lại các giá trị => chọn thiết kế là hàm static
    //hàm tính giai thừa
    
    // n! = 1.2.3.4...n
    //không có giai thừa âm
    //0! = 1! = 1 quy ước
    // tính n! trong khoảng từ 0...20
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
//        if (n == 0 || n == 1)
//            return 1; // có return trong if rồi nên sẽ không dùng else trong trường hợp còn lại
//        
//        long product = 1; //product: tích, tích nhân dồn
//        for (int i = 2; i <= n; i++) 
//            product *= i; 
//        return product;           
//    }
    
    //Đệ quy (Recursion): gọi lại chính mình với 1 quy mô khác
    //n! = 1.2.3.4.5.6. ... . n
    // 6! = 6 x 5!
    // 5! = 5 x 4!
    // 4! = 4 x 3!
    // 3! = 3 x 2!
    // 2! = 2 x 1! // điểm dừng
    // 1! = 1
    
    //quy ước 1! = 0! - 1;
    //=> n! = n * (n - 1)!
    
        public static long getFactorial(int n){
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        if (n == 0 || n == 1)
            return 1; // có return trong if rồi nên sẽ không dùng else trong trường hợp còn lại
       
        return n * getFactorial(n-1); //công thức đệ quy 
    }

}
