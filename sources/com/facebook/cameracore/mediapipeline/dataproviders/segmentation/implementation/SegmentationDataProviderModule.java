package com.facebook.cameracore.mediapipeline.dataproviders.segmentation.implementation;

import X.AnonymousClass1A8;
import X.BQY;
import X.C0M;
import X.C25480Cgb;
import X.CXC;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;
import java.util.Collections;
import java.util.Map;

public class SegmentationDataProviderModule extends ServiceModule {
    public static native HybridData initHybrid();

    static {
        AnonymousClass1A8.A06("segmentationdataprovider");
    }

    public ServiceConfiguration createConfiguration(CXC cxc) {
        Map map = cxc.A00;
        if (Collections.unmodifiableMap(map) != null && Collections.unmodifiableMap(map).get(C0M.A12) != null) {
            return null;
        }
        C25480Cgb cgb = BQY.A03;
        if (cxc.A06.containsKey(cgb)) {
            return new SegmentationDataProviderConfigurationHybrid((BQY) cxc.A00(cgb));
        }
        return null;
    }

    public SegmentationDataProviderModule() {
        this.mHybridData = initHybrid();
    }
}
