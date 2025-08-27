package com.ekudu.eticaretodeme.Service;

import dto.PaymentRequestDto;
import dto.PaymentResponseDto;

public interface PaymentService {
    public PaymentResponseDto payment(PaymentRequestDto paymentRequestDto);

}
