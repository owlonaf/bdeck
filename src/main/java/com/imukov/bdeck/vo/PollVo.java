package com.imukov.bdeck.vo;

import com.imukov.bdeck.domain.PollEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PollVo {
    private Boolean firstVar;
    private Boolean secondVar;
    private Boolean thirdVar;
    private Boolean fourthVar;

    public PollVo(PollEntity pollEntity) {
        this.firstVar = pollEntity.getFirstVar();
        this.secondVar = pollEntity.getSecondVar();
        this.thirdVar = pollEntity.getThirdVar();
        this.fourthVar = pollEntity.getFourthVar();
    }
}
