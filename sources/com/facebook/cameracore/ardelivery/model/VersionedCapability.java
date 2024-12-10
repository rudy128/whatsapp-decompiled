package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass8BV;
import X.C108955ca;
import X.C17880vN;
import X.C179289Hj;
import X.C26294Cx6;
import android.util.SparseArray;
import java.util.Map;

public enum VersionedCapability {
    ;
    
    public static final String TAG = "VersionedCapability";
    public static final Map UPPER_STRING_TO_CAPABILITY_MAP = null;
    public static final SparseArray XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP = null;
    public final XplatAssetType mAssetType;
    public final C179289Hj mMLFrameworkType;
    public final int mXplatValue;

    /* access modifiers changed from: public */
    static {
        XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP = new SparseArray(values().length + 1);
        UPPER_STRING_TO_CAPABILITY_MAP = C17880vN.A11();
        for (VersionedCapability versionedCapability : values()) {
            UPPER_STRING_TO_CAPABILITY_MAP.put(C108955ca.A0y(versionedCapability.name()), versionedCapability);
            XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.put(versionedCapability.getXplatValue(), versionedCapability);
        }
    }

    public static VersionedCapability fromServerValue(String str) {
        VersionedCapability versionedCapability = (VersionedCapability) UPPER_STRING_TO_CAPABILITY_MAP.get(C108955ca.A0y(str));
        if (versionedCapability != null) {
            return versionedCapability;
        }
        C26294Cx6.A0H(TAG, "Unsupported capability: %s", AnonymousClass8BV.A1b(str));
        return null;
    }

    public static VersionedCapability fromXplatValue(int i) {
        return (VersionedCapability) XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.get(i);
    }

    /* access modifiers changed from: public */
    VersionedCapability(C179289Hj r3, int i, XplatAssetType xplatAssetType) {
        this.mMLFrameworkType = r3;
        this.mXplatValue = i;
        this.mAssetType = xplatAssetType;
    }

    public C179289Hj getMLFrameworkType() {
        return this.mMLFrameworkType;
    }

    public XplatAssetType getXplatAssetType() {
        return this.mAssetType;
    }

    public int getXplatValue() {
        return this.mXplatValue;
    }

    public String toServerValue() {
        return name();
    }
}
