package com.facebook.cameracore.ardelivery.model;

import X.A6K;
import X.AnonymousClass000;
import X.AnonymousClass8BX;
import X.C20282AEq;
import X.C26208Cuj;

public enum XplatAssetType {
    Unknown(0),
    AREffect(1),
    Async(2),
    StyleTransferEffect(3),
    LegacyEffect(4),
    ARLink(5),
    Remote(6),
    FaceTrackerModel(7),
    HairSegmentationModel(8),
    SegmentationModel(9),
    XRayModel(10),
    FittedExpressionTrackerModel(11),
    MSuggestionsCoreModel(12),
    NametagModel(13),
    PyTorchModel(14),
    Caffe2Model(15),
    MulticlassSegmentationModel(16),
    ScriptingPackage(17),
    Ocr2goCreditCardModel(18),
    RecognitionModel(19),
    AR3DObject(20),
    SparkVision(21),
    FittedExpressionTrackerRuntimeRigRetargetingConfig(22),
    BodyTracking3DModel(23);
    
    public static final XplatAssetType[] cppValueToEnumArray = null;
    public final int mCppValue;

    /* access modifiers changed from: public */
    static {
        int i;
        cppValueToEnumArray = new XplatAssetType[values().length];
        for (XplatAssetType xplatAssetType : values()) {
            cppValueToEnumArray[xplatAssetType.mCppValue] = xplatAssetType;
        }
    }

    public static XplatAssetType fromARRequestAsset(C20282AEq aEq) {
        A6K a6k = aEq.A01;
        ARAssetType aRAssetType = a6k.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal == 0) {
            return AREffect;
        }
        if (ordinal == 2) {
            return Async;
        }
        if (ordinal == 3) {
            return Remote;
        }
        if (ordinal == 4) {
            return ScriptingPackage;
        }
        if (ordinal == 1) {
            VersionedCapability A02 = a6k.A02();
            C26208Cuj.A02(A02, "SUPPORT ARRequestAsset should have versioned capability field");
            return fromVersionedCapability(A02);
        }
        throw AnonymousClass8BX.A0V(aRAssetType, "Unknown ARRequestAsset type : ", AnonymousClass000.A10());
    }

    public static XplatAssetType ofCppValue(int i) {
        if (i >= 0 && i < values().length) {
            return cppValueToEnumArray[i];
        }
        throw AnonymousClass000.A0k("Invalid cpp value for AssetType");
    }

    /* access modifiers changed from: public */
    XplatAssetType(int i) {
        this.mCppValue = i;
    }

    public static XplatAssetType fromVersionedCapability(VersionedCapability versionedCapability) {
        return versionedCapability.getXplatAssetType();
    }

    public int getValue() {
        return this.mCppValue;
    }
}
