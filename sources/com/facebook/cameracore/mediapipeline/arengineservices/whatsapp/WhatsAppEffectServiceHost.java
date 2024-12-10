package com.facebook.cameracore.mediapipeline.arengineservices.whatsapp;

import X.C8U;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.jni.HybridData;
import java.util.List;

public final class WhatsAppEffectServiceHost extends EffectServiceHost {
    public static final C8U Companion = new Object();
    public static boolean isLibraryLoaded;
    public final AnalyticsLogger analyticsLogger;
    public final ARExperimentConfig arExperimentConfig;
    public final Context context;
    public final NetworkClient networkClient;

    private final native HybridData initHybrid(EffectServiceHostConfig effectServiceHostConfig, AnalyticsLogger analyticsLogger2, NetworkClient networkClient2, ARExperimentConfig aRExperimentConfig, ARClass aRClass, List list);

    /* JADX WARNING: type inference failed for: r5v0, types: [X.C8T, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WhatsAppEffectServiceHost(android.content.Context r11, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig r12, X.E94 r13, com.facebook.cameracore.mediapipeline.arclass.common.ARClass r14, X.C28426E0r r15, X.C28423E0o r16) {
        /*
            r10 = this;
            X.C8T r5 = new X.C8T
            r5.<init>()
            boolean r0 = isLibraryLoaded
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "graphicsengine-arengineservices-whatsappservicehost-native"
            X.AnonymousClass1A8.A06(r0)
            java.lang.String r0 = "dynamic_pytorch_impl"
            r1 = 16
            X.AnonymousClass1A8.A07(r0, r1)     // Catch:{ all -> 0x001a }
            java.lang.String r0 = "torch-code-gen"
            X.AnonymousClass1A8.A07(r0, r1)     // Catch:{ all -> 0x001a }
        L_0x001a:
            r0 = 1
            isLibraryLoaded = r0
        L_0x001d:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            X.Cgb r0 = X.BQY.A03
            r7 = 0
            X.CJZ r1 = new X.CJZ
            r1.<init>(r0)
            com.facebook.cameracore.mediapipeline.arengineservices.modules.DynamicServiceModule r0 = new com.facebook.cameracore.mediapipeline.arengineservices.modules.DynamicServiceModule
            r0.<init>(r1, r7, r7)
            r6.add(r0)
            r2 = r10
            r3 = r11
            r4 = r12
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.context = r11
            X.BzF r0 = X.C24318BzF.OVERRIDE_DISABLE_OPTIMIZED
            com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl r5 = new com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl
            r1 = r16
            r5.<init>(r1, r7, r0)
            r10.analyticsLogger = r5
            com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl r7 = new com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl
            r7.<init>(r13)
            r10.arExperimentConfig = r7
            com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl r6 = new com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl
            r6.<init>(r15)
            r10.networkClient = r6
            java.util.List r9 = r10.mServiceModules
            r8 = r14
            r3 = r10
            com.facebook.jni.HybridData r0 = r3.initHybrid(r4, r5, r6, r7, r8, r9)
            r10.mHybridData = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost.<init>(android.content.Context, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig, X.E94, com.facebook.cameracore.mediapipeline.arclass.common.ARClass, X.E0r, X.E0o):void");
    }

    public void destroy() {
        super.destroy();
        HybridData hybridData = this.arExperimentConfig.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
        AnalyticsLoggerImpl analyticsLoggerImpl = (AnalyticsLoggerImpl) this.analyticsLogger;
        analyticsLoggerImpl.mHybridData.resetNative();
        analyticsLoggerImpl.mCameraARAnalyticsLogger = null;
        HybridData hybridData2 = this.networkClient.mHybridData;
        if (hybridData2 != null) {
            hybridData2.resetNative();
        }
    }
}
