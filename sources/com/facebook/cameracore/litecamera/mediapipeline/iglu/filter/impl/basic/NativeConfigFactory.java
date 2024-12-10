package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.basic;

import X.AnonymousClass1A8;
import android.content.res.AssetManager;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;

public class NativeConfigFactory {
    public static native IgluConfigHolder create(AssetManager assetManager, boolean z);

    public static native IgluConfigHolder createFbAssetConfig(AssetManager assetManager, boolean z);

    public static native IgluConfigHolder createIgAssetConfig(AssetManager assetManager, boolean z);

    static {
        AnonymousClass1A8.A06("mediapipeline-iglufilter-impl-basic");
    }
}
