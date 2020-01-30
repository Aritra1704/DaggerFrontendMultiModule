package com.arpaul.moduleext.component;

import com.arpaul.moduleext.contracts.BOContract;
import com.arpaul.moduleext.module.ExtModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ExtModule.class})
public interface ExtComponent {
    BOContract getBOContract();
}
