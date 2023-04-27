package com.zerobase.convpay.service;

import com.zerobase.convpay.type.CardUseCancelResult;
import com.zerobase.convpay.type.CardUseResult;

public class CardAdapter {
    // 1. 인증
    public void authorization() {
        System.out.println("authorization success.");
    }
    // 2. 승인
    public void approval() {
        System.out.println("approval success.");
    }
    // 3. 매입
    public CardUseResult capture(Integer payAmount) {
        if (payAmount > 100) {
            return  CardUseResult.USE_FAIL; // 실패
        }

        return CardUseResult.USE_SUCCESS; // 성공
    }
    // 4. 매입 취소
    public CardUseCancelResult cancelCapture(Integer cancelAmount) {
        if (cancelAmount < 1000) {
            return CardUseCancelResult.USE_CANCEL_FAIL;
        }

        return CardUseCancelResult.USE_CANCEL_SUCCESS;
    }
}
