package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass8BX;
import X.C108955ca;
import X.C179269Hg;

public enum ARRequestAsset$CompressionMethod {
    NONE("NONE"),
    ZIP("ZIP"),
    TAR_BROTLI("TAR_BROTLI");
    
    public String mMethod;

    /* access modifiers changed from: public */
    ARRequestAsset$CompressionMethod(String str) {
        this.mMethod = str;
    }

    public static ARRequestAsset$CompressionMethod fromCompressionType(C179269Hg r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 0) {
            return NONE;
        }
        if (ordinal == 1) {
            return ZIP;
        }
        if (ordinal == 2) {
            return TAR_BROTLI;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("unsupported compression method for CompressionType : ");
        throw AnonymousClass001.A12(r2.name(), A10);
    }

    public static ARRequestAsset$CompressionMethod fromCompressionTypeCppValue(int i) {
        for (C179269Hg r1 : C179269Hg.values()) {
            if (r1.mCppValue == i) {
                return fromCompressionType(r1);
            }
        }
        throw AnonymousClass001.A13("Unsupported compression type : ", AnonymousClass000.A10(), i);
    }

    public static ARRequestAsset$CompressionMethod fromJson(String str) {
        return valueOf(C108955ca.A0y(str));
    }

    public static ARRequestAsset$CompressionMethod fromString(String str) {
        return valueOf(C108955ca.A0y(str));
    }

    public static String toJson(ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod) {
        return aRRequestAsset$CompressionMethod.getCompressionMethod();
    }

    public static C179269Hg toXplatCompressionType(ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod) {
        int ordinal = aRRequestAsset$CompressionMethod.ordinal();
        if (ordinal == 0) {
            return C179269Hg.None;
        }
        if (ordinal == 1) {
            return C179269Hg.Zip;
        }
        if (ordinal == 2) {
            return C179269Hg.TarBrotli;
        }
        throw AnonymousClass8BX.A0V(aRRequestAsset$CompressionMethod, "Unsupported compression method : ", AnonymousClass000.A10());
    }

    public String getCompressionMethod() {
        return this.mMethod;
    }
}
