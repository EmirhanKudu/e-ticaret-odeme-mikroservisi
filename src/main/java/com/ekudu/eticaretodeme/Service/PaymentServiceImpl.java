package com.ekudu.eticaretodeme.Service;


import dto.PaymentRequestDto;
import dto.PaymentResponseDto;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public PaymentResponseDto payment(PaymentRequestDto paymentRequestDto) {
       PaymentResponseDto paymentResponseDto = new PaymentResponseDto();
       char [] cardNo = paymentRequestDto.getCard().getCardNumber().toCharArray();
       String cardtoStr = Character.toString(cardNo[cardNo.length-1]);



       if (Integer.parseInt(cardtoStr) % 2 == 0){
            paymentResponseDto.setSuccess(true);
           paymentResponseDto.setMessage("Ödeme gerçekleşti!");
       }
       else {
           paymentResponseDto.setSuccess(false);
           paymentResponseDto.setMessage("Ödeme gerçekleşmedi! Yetersiz bakiye!");
       }


       return paymentResponseDto;
    }

}
