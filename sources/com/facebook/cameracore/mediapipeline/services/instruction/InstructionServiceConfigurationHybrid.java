package com.facebook.cameracore.mediapipeline.services.instruction;

import X.BQU;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class InstructionServiceConfigurationHybrid extends ServiceConfiguration {
    public final BQU mConfiguration;

    public static native HybridData initHybrid(InstructionServiceListenerWrapper instructionServiceListenerWrapper);

    public InstructionServiceConfigurationHybrid(BQU bqu) {
        super(initHybrid(bqu.A00));
        this.mConfiguration = bqu;
    }
}
