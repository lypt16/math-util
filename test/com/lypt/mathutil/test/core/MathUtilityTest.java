/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.lypt.mathutil.test.core;

import com.lypt.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;


/**
 *
 * @author THUY PHUNG
 */
public class MathUtilityTest {
    // Đây là class sử dụng các hàm của thư viện/framework JUnit để kiểm tra code chính - hàm getFactorial
    // class core.MathUtil
    //Viết code để test code chính

    //Có nhiều quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ là nói lên mục đích của các case/ tình huống kiểm thử
    //tình huống sd hàm theo kiểu thành công và thất bại
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm nàu
    //@Test phía hậu trường chính là public ststic void main()
    //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tihs giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; // test thử tình huống well => chạy đúng
        long expected = 1; // hi vọng 0! = 1
        // long actual = ; // gọi hàm cần test bên core/app chính/ code chính 
        long actual = MathUtil.getFactorial(n);

        // so sánh expected với actual dùng framework
        // hàm giúp so sánh 2 giá trị có giống nhau không 
        // giống nhau => thấy màu xanh - code oke ít nhất là với case đang test
        //              thấy màu đỏ => khi EX và AC không giống nhau 
        Assert.assertEquals(expected, actual);

        //Gộp thêm vài case thành công/đưa đầu vào well => hàm phải tính oke
        Assert.assertEquals(1, MathUtil.getFactorial(1)); // 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); // 2! = 2
        Assert.assertEquals(6, MathUtil.getFactorial(3)); // 3! = 6
        Assert.assertEquals(120, MathUtil.getFactorial(6)); // 6! = 720
    }

    //hàm getF() thiết kế có 2 tình huống xử lý
    //1: đưa data chuẩn 0-20 => tính được n!
    //2: đưa data vào không mong muốn => thiết kế của hàm là ném ra ngoại lệ
    //=> mong ngoại lệ sẽ xuất hiện với n này 
    
    // nếu hàm nhận vào n < 0 hoặc n > 20 và hàm ném ra ngoại lệ
    // HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> XANH PHẢI XUẤT HIỆN
    
    // nếu hàm nhận vào n < 0 hoặc n > 20 và hàm không ném ra ngoại lệ
    // -> HÀM CHẠY SAI THIẾT KẾ, SAI KỲ VỌNG, MÀU ĐỎ
    
    //Test case:
    //input: -5, expected: IllegalArgumentException xuất hiện
    // tình huống ngoại lệ, ngoài dự tings, dự liệu => không thể so sánh theo kiểu value mà chỉ đo lường = cách chúng có xuất hiện hay không
    //assertEquals() ko dùng để so sánh 2 ngoại lệ
    //      equals() là dùng bằng nhau hay không trên value 
  
    
 // Màu đỏ, có ngoại lệ, nhưng không phải ngoại lệ như kỳ vộng => kỳ vọng ngoại lệ sai, không phải hàm sai 
//     @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5); //Hàm @Test chạy => ném ra ngoại lệ NumberFormat
//        
//    }
    @Test (expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
       MathUtil.getFactorial(-5); //Hàm @Test chạy => ném ra ngoại lệ NumberFormat
        
    }
    
    //junit5
    //Assert.assertThreows(IllegalArgumentException.class,
    //                      ()-> MathUtil.getFactorial(-5)));
                            
    
    //cách khác để bắt ngoại lệ xuất hiện
    // dùng lamda 
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21 
  
    
    //Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay không 
    // có ném => hàm chạy đúng thiết kế => xanh
   @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
       //Chủ đông kiểm soát ngoại lệ 
        try {
             MathUtil.getFactorial(-5);

       } catch (Exception e) {
           //Bắt try-catch là JUnit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ
           //nhưng không chắc ngoại lệ mình cần có xh hay không
           //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xh        
           Assert.assertEquals("Invalid argument. N must be between 0..20",e.getMessage());
           
       }
       
    } 
}


