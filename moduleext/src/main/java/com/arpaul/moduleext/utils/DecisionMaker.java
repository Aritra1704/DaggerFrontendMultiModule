package com.arpaul.moduleext.utils;

import com.arpaul.moduleext.common.AppInstance;
import com.arpaul.modulemfe.component.DaggerMFEComponent;
import com.arpaul.modulemfe.contracts.MFEContract;

public class DecisionMaker {

    public String takeDecision() {
        MFEContract contract = AppInstance.getMfeComponent().getMFEContract();
        return contract.buttonAClicked();
    }
}
