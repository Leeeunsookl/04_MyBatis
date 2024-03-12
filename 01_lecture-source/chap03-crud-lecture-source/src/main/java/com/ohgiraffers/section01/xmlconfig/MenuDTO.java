package com.ohgiraffers.section01.xmlconfig;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@Data - 위에 다섯가지 요소를 한 번에 포함하는 어노테이션 / 혹시 모를 에러 때문에 잘 사용하지 않는다.
public class MenuDTO {

    private int code;
    private String name;
    private int price;
    private int categoryCode;
    private String orderableStatus;

}
