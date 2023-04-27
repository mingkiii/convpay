package com.zerobase.convpay.service;

import com.zerobase.convpay.type.CardUseCancelResult;
import com.zerobase.convpay.type.CardUseResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardAdapterTest {

    private CardAdapter cardAdapter = new CardAdapter();

    @Test
    void capture_success() { // 매입 성공
        //given
        Integer payAmount = 99;

        //when
        CardUseResult cardUseResult = cardAdapter.capture(payAmount);

        //then
        assertEquals(CardUseResult.USE_SUCCESS, cardUseResult);
    }

    @Test
    void capture_fail() { // 매입 실패
        //given
        Integer payAmount = 101;

        //when
        CardUseResult cardUseResult = cardAdapter.capture(payAmount);

        //then
        assertEquals(CardUseResult.USE_FAIL, cardUseResult);
    }

    @Test
    void cancel_capture_success() { // 매입 취소 성공
        //given
        Integer cancelAmount = 1001;

        //when
        CardUseCancelResult cardUseCancelResult = cardAdapter.cancelCapture(cancelAmount);

        //then
        assertEquals(CardUseCancelResult.USE_CANCEL_SUCCESS, cardUseCancelResult);

    }

    @Test
    void cancel_capture_fail() { // 매입 취소 실패
        //given
        Integer cancelAmount = 999;

        //when
        CardUseCancelResult cardUseCancelResult = cardAdapter.cancelCapture(cancelAmount);

        //then
        assertEquals(CardUseCancelResult.USE_CANCEL_FAIL, cardUseCancelResult);

    }

}