package com.tjoeun.dto;

import java.time.LocalDateTime;

import com.tjoeun.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ItemDto extends BaseEntity{

	private Long id; // 상품 코드

	private String itemNm; // 상품 이름

	private int price; // 상품 가격

	private int stockNumber; // 재고 수량

	private String itemDetail; // 상품 상세 설명

	private String itemSellStatus;  // 판매 상태

	/*
	BaseEntity 에 있는 regTime 과 updateTime 을 사용함
	
	private LocalDateTime regTime; // 등록 시간

	private LocalDateTime updateTime; // 수정 시간
	*/
}
