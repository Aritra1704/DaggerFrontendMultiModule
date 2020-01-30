package com.arpaul.moduleext.module;

import com.arpaul.moduleext.contractImpl.BOContractImpl;
import com.arpaul.moduleext.contracts.BOContract;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ExtModule {
    @Provides
    @Singleton
    public BOContract provideBOContract() {
        return new BOContractImpl();
    }
}
