package com.facebook.cameracore.mediapipeline.dataproviders.segmentation.implementation;

import X.AnonymousClass000;
import X.C37;
import com.facebook.jni.HybridData;

public class SegmentationRoIDataSourceWrapper {
    public C37 mDataSource;
    public final HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    private native void setPoseBoxes(float[] fArr, long j);

    private native void setRoI(float[] fArr, long j);

    public void destroy() {
        this.mHybridData.resetNative();
    }

    public SegmentationRoIDataSourceWrapper(C37 c37) {
        if (c37 != null) {
            this.mDataSource = c37;
            throw AnonymousClass000.A0s("attach");
        }
    }
}
