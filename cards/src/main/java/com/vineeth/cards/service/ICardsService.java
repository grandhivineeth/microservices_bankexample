package com.vineeth.cards.service;

import com.vineeth.cards.dto.CardsDto;
import jakarta.validation.constraints.Pattern;

public interface ICardsService {
    void createCard(String mobileNumber);

    CardsDto fetchCardDetails(String mobileNumber);

    boolean updateCardDetails(CardsDto cardsDto);

    boolean deleteCardDetails(String mobileNumber);
}
