package com.facebook.cameracore.mediapipeline.services.persistence.implementation;

import X.AnonymousClass000;
import X.AnonymousClass1A8;
import X.BQP;
import X.C24534C8f;
import X.C25480Cgb;
import X.CXC;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

public final class PersistenceServiceModule extends ServiceModule {
    public static final C24534C8f Companion = new Object();

    public static final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C8f, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("arpersistenceservice");
    }

    public ServiceConfiguration createConfiguration(CXC cxc) {
        C25480Cgb cgb = BQP.A00;
        if (!cxc.A06.containsKey(cgb)) {
            return null;
        }
        cxc.A00(cgb);
        throw AnonymousClass000.A0s("getUserScopeDelegate");
    }

    public PersistenceServiceModule() {
        this.mHybridData = initHybrid();
    }
}
