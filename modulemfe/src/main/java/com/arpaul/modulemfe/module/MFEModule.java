package com.arpaul.modulemfe.module;

import com.arpaul.modulemfe.contractImpl.MFEContractImpl;
import com.arpaul.modulemfe.contracts.MFEContract;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MFEModule {

    @Provides
    @Singleton
    public MFEContract provideMFEContract() {
        return new MFEContractImpl();
    }
}
