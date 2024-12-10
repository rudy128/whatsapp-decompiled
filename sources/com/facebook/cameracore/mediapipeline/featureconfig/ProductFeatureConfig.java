package com.facebook.cameracore.mediapipeline.featureconfig;

import X.AnonymousClass1A8;
import X.C185349cR;
import com.facebook.jni.HybridData;

public final class ProductFeatureConfig {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);

    static {
        AnonymousClass1A8.A06("featureconfig");
    }

    public ProductFeatureConfig(C185349cR r9) {
        this.mHybridData = initHybrid(true, r9.A02, 0, false, false, false, r9.A01, r9.A00);
    }

    public ProductFeatureConfig(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public ProductFeatureConfig() {
        this(new C185349cR());
    }
}
