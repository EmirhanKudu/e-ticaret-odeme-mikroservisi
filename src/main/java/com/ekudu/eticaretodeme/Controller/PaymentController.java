package com.ekudu.eticaretodeme.Controller;

import com.ekudu.eticaretodeme.Service.PaymentService;
import com.ekudu.eticaretodeme.Service.PaymentServiceImpl;
import dto.PaymentRequestDto;
import dto.PaymentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {

     private final PaymentService paymentService;

    @PostMapping("/pay")
    public ResponseEntity<PaymentResponseDto> payment(@RequestBody PaymentRequestDto paymentRequestDto) {
         PaymentResponseDto paymentResponseDto = paymentService.payment(paymentRequestDto);


        return ResponseEntity.ok(paymentResponseDto);
    }
}
