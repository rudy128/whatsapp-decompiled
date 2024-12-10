package com.facebook.cameracore.mediapipeline.arengineservices.modules;

import X.AnonymousClass000;
import X.C28428E0t;
import X.C28429E0u;
import X.CJZ;
import X.CXC;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

public class DynamicServiceModule extends ServiceModule {
    public ServiceModule mBaseModule;
    public final CJZ mModule;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(3:4|5|6)|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule getBaseInstance() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule r0 = r2.mBaseModule     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "com.facebook.cameracore.mediapipeline.dataproviders.segmentation.implementation.SegmentationDataProviderModule"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0019 }
            java.lang.Class<com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule> r0 = com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule.class
            java.lang.Class r0 = r1.asSubclass(r0)     // Catch:{ Exception -> 0x0019 }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ Exception -> 0x0019 }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule r0 = (com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule) r0     // Catch:{ Exception -> 0x0019 }
            r2.mBaseModule = r0     // Catch:{ Exception -> 0x0019 }
        L_0x0019:
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule r0 = r2.mBaseModule     // Catch:{ all -> 0x001d }
            monitor-exit(r2)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.modules.DynamicServiceModule.getBaseInstance():com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule");
    }

    private native HybridData initHybrid(int i);

    public ServiceConfiguration createConfiguration(CXC cxc) {
        ServiceModule baseInstance;
        if (!AnonymousClass000.A1O(cxc.A06.containsKey(this.mModule.A00) ? 1 : 0) || (baseInstance = getBaseInstance()) == null) {
            return null;
        }
        return baseInstance.createConfiguration(cxc);
    }

    public DynamicServiceModule(CJZ cjz, C28428E0t e0t, C28429E0u e0u) {
        this.mModule = cjz;
        this.mHybridData = initHybrid(cjz.A00.A00.mCppValue);
    }
}
