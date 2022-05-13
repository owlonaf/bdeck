package com.imukov.bdeck.deprecated;

import com.imukov.bdeck.deprecated.PollEntity;
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
