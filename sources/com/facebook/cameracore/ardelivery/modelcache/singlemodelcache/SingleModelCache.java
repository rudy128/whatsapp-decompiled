package com.facebook.cameracore.ardelivery.modelcache.singlemodelcache;

import X.AnonymousClass1A8;
import X.BCL;
import X.C18070vi;
import X.C180809Oa;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.jni.HybridData;

public final class SingleModelCache implements BCL {
    public static final C180809Oa Companion = new Object();
    public final HybridData mHybridData;
    public final ModelPathsHolder modelPathsHolderForLastSavedVersion;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid(int i, ARDFileCache aRDFileCache);

    public final native boolean addModelForVersionIfInCache(int i, String str, String str2);

    public final native ModelPathsHolder getModelPathsHolder(int i);

    public final native ModelPathsHolder getModelPathsHolderForLastSavedVersion();

    public final native void trimExceptLatestSavedVersion();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9Oa, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("single-model-cache-native-android");
    }

    public SingleModelCache(VersionedCapability versionedCapability, ARDFileCache aRDFileCache) {
        C18070vi.A0j(versionedCapability, aRDFileCache);
        this.mHybridData = initHybrid(versionedCapability.getXplatValue(), aRDFileCache);
    }

    public boolean addModelForVersionIfInCache(int i, String str, String str2, VersionedCapability versionedCapability) {
        C18070vi.A0j(str, str2);
        return addModelForVersionIfInCache(i, str, str2);
    }

    public ModelPathsHolder getModelPathsHolder(VersionedCapability versionedCapability, int i) {
        return getModelPathsHolder(i);
    }

    public ModelPathsHolder getModelPathsHolderForLastSavedVersion(VersionedCapability versionedCapability) {
        return getModelPathsHolderForLastSavedVersion();
    }

    public void trimExceptLatestSavedVersion(VersionedCapability versionedCapability) {
        trimExceptLatestSavedVersion();
    }
}
