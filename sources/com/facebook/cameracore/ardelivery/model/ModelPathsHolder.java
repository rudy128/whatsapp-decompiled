package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass8BX;
import X.AnonymousClass9JJ;
import X.C17880vN;
import X.C26294Cx6;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;
import java.util.Map;

public class ModelPathsHolder {
    public static final String TAG = "ModelPathsHolder";
    public static final int UNKNOWN_VERSION = -1;
    public final VersionedCapability mCapability;
    public final Map mModelPaths;
    public final int mVersion;

    public String getModelPath(AnonymousClass9JJ r5) {
        String A0s = C17880vN.A0s(r5, this.mModelPaths);
        if (A0s == null) {
            C26294Cx6.A08(TAG, StringFormatUtil.formatStrLocaleSafe("Failed to get model path for model asset type: %s, for capability: %s", r5.name(), this.mCapability.name()));
        }
        return A0s;
    }

    public boolean modelPathsExists(AnonymousClass9JJ r2) {
        return this.mModelPaths.containsKey(r2);
    }

    public ModelPathsHolder(VersionedCapability versionedCapability, int i, Map map) {
        this.mCapability = versionedCapability;
        this.mVersion = i;
        this.mModelPaths = map;
    }

    public static ModelPathsHolder create(int i, int i2, int[] iArr, String[] strArr) {
        HashMap A11 = C17880vN.A11();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            A11.put(AnonymousClass9JJ.values()[iArr[i3]], strArr[i3]);
        }
        return new ModelPathsHolder(VersionedCapability.fromXplatValue(i), i2, A11);
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ModelPathsHolder{mCapability=");
        A10.append(this.mCapability);
        A10.append(", mVersion=");
        A10.append(this.mVersion);
        A10.append(", mModelPaths=");
        return AnonymousClass8BX.A0c(this.mModelPaths, A10);
    }
}
