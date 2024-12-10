package com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache;

import X.AnonymousClass000;
import X.AnonymousClass1A8;
import X.BCL;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C180819Ob;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.jni.HybridData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class VersionedModelCache implements BCL {
    public static final C180819Ob Companion = new Object();
    public final HybridData mHybridData;

    private final native boolean addModelForVersionIfInCache(int i, int i2, String str, String str2);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native ModelPathsHolder getModelPathsHolder(int i, int i2);

    public static final native HybridData initHybrid(ARDFileCache aRDFileCache, List list);

    public final native ModelPathsHolder getModelPathsHolderForLastSavedVersion(int i);

    public ModelPathsHolder getModelPathsHolderForLastSavedVersion(VersionedCapability versionedCapability) {
        C18070vi.A0d(versionedCapability, 0);
        return getModelPathsHolderForLastSavedVersion(versionedCapability.getXplatValue());
    }

    public final native void trimExceptLatestSavedVersion(int i);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9Ob] */
    static {
        AnonymousClass1A8.A06("versioned-model-cache-native-android");
    }

    public ModelPathsHolder getModelPathsHolder(VersionedCapability versionedCapability, int i) {
        if (versionedCapability != null) {
            return getModelPathsHolder(versionedCapability.getXplatValue(), i);
        }
        throw C17880vN.A0g();
    }

    public void trimExceptLatestSavedVersion(VersionedCapability versionedCapability) {
        if (versionedCapability != null) {
            trimExceptLatestSavedVersion(versionedCapability.getXplatValue());
            return;
        }
        throw C17880vN.A0g();
    }

    public VersionedModelCache(ARDFileCache aRDFileCache, List list) {
        C18070vi.A0j(aRDFileCache, list);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17890vO.A1D(A13, ((VersionedCapability) it.next()).getXplatValue());
        }
        this.mHybridData = initHybrid(aRDFileCache, A13);
    }

    public boolean addModelForVersionIfInCache(int i, String str, String str2, VersionedCapability versionedCapability) {
        C18070vi.A0j(str, str2);
        if (versionedCapability != null) {
            return addModelForVersionIfInCache(versionedCapability.getXplatValue(), i, str, str2);
        }
        throw C17880vN.A0g();
    }
}
