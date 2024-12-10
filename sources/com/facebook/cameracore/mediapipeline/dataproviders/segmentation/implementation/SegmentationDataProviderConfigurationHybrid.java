package com.facebook.cameracore.mediapipeline.dataproviders.segmentation.implementation;

import X.BQY;
import X.C37;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class SegmentationDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final BQY mSegmentationDataProviderConfiguration;

    public static native HybridData initHybrid(String str, String str2, boolean z, SegmentationRoIDataSourceWrapper segmentationRoIDataSourceWrapper);

    public SegmentationDataProviderConfigurationHybrid(BQY bqy) {
        super(initHybrid(bqy.A00, bqy.A01, false, new SegmentationRoIDataSourceWrapper((C37) null)));
        this.mSegmentationDataProviderConfiguration = bqy;
    }
}
