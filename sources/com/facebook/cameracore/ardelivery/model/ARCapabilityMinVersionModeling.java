package com.facebook.cameracore.ardelivery.model;

import X.AD6;
import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.C17880vN;
import X.C199610h;
import X.C24604CBi;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Arrays;

public class ARCapabilityMinVersionModeling implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new AD6(9);
    public static final long serialVersionUID = 0;
    public VersionedCapability mCapability;
    public int mMinVersion;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling = (ARCapabilityMinVersionModeling) obj;
            if (!C24604CBi.A00(this.mCapability, aRCapabilityMinVersionModeling.mCapability) || !C24604CBi.A00(Integer.valueOf(this.mMinVersion), Integer.valueOf(aRCapabilityMinVersionModeling.mMinVersion))) {
                return false;
            }
        }
        return true;
    }

    public int getCapabilityXplatValue() {
        return this.mCapability.getXplatValue();
    }

    public boolean isCapabilityBodyTracking() {
        return C24604CBi.A00(this.mCapability, VersionedCapability.BodyTracking);
    }

    public boolean isCapabilityFacetracker() {
        return C24604CBi.A00(this.mCapability, VersionedCapability.Facetracker);
    }

    public boolean isCapabilityGazeCorrection() {
        return C24604CBi.A00(this.mCapability, VersionedCapability.GazeCorrection);
    }

    public boolean isCapabilityHairSegmentation() {
        return C24604CBi.A00(this.mCapability, VersionedCapability.HairSegmentation);
    }

    public boolean isCapabilitySegmentation() {
        return C24604CBi.A00(this.mCapability, VersionedCapability.Segmentation);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCapability.ordinal());
        parcel.writeInt(this.mMinVersion);
    }

    public ARCapabilityMinVersionModeling(int i, int i2) {
        VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(i);
        C199610h.A04(fromXplatValue);
        this.mCapability = fromXplatValue;
        this.mMinVersion = i2;
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.mCapability;
        AnonymousClass000.A1M(A1b, this.mMinVersion);
        return Arrays.hashCode(A1b);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("capability: ");
        A10.append(this.mCapability);
        A10.append(", minVersion:");
        return C17880vN.A0t(A10, this.mMinVersion);
    }

    public ARCapabilityMinVersionModeling(Parcel parcel) {
        this.mCapability = VersionedCapability.values()[parcel.readInt()];
        this.mMinVersion = parcel.readInt();
    }

    public ARCapabilityMinVersionModeling(VersionedCapability versionedCapability, int i) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
    }

    public /* synthetic */ ARCapabilityMinVersionModeling(Parcel parcel, AD6 ad6) {
        this(parcel);
    }

    public ARCapabilityMinVersionModeling() {
    }
}
