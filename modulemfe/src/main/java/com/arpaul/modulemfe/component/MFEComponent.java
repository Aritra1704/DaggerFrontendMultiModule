package com.arpaul.modulemfe.component;

import com.arpaul.modulemfe.contracts.MFEContract;
import com.arpaul.modulemfe.module.MFEModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MFEModule.class})//, dependencies = {ExtComponent.class}
public interface MFEComponent {
    MFEContract getMFEContract();
}
