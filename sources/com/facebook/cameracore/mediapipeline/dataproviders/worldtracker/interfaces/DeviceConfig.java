package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces;

import X.AnonymousClass000;
import X.AnonymousClass3Ma;
import X.D3B;
import X.D3Q;
import android.os.Parcel;
import android.os.Parcelable;

public class DeviceConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(31);
    public final double attitudeTimeDelay;
    public final double imuFromLandscapeCameraX;
    public final double imuFromLandscapeCameraY;
    public final double imuFromLandscapeCameraZ;
    public final boolean isCalibratedDeviceConfig;
    public final boolean isSlamCapable;
    public D3Q mCameraConfig;
    public final boolean skipAttitudeInput;
    public final String slamConfigurationParams;
    public final boolean useVisionOnlySlam;

    public int describeContents() {
        return 0;
    }

    public D3Q getCameraConfig() {
        return this.mCameraConfig;
    }

    public double getCameraDistortion1() {
        return this.mCameraConfig.A00;
    }

    public double getCameraDistortion2() {
        return this.mCameraConfig.A01;
    }

    public double getCameraFocalLength() {
        return this.mCameraConfig.A02;
    }

    public double getCameraPrincipalPointX() {
        return this.mCameraConfig.A03;
    }

    public double getCameraPrincipalPointY() {
        return this.mCameraConfig.A04;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.imuFromLandscapeCameraX);
        parcel.writeDouble(this.imuFromLandscapeCameraY);
        parcel.writeDouble(this.imuFromLandscapeCameraZ);
        parcel.writeByte(this.skipAttitudeInput ? (byte) 1 : 0);
        parcel.writeDouble(this.attitudeTimeDelay);
        parcel.writeByte(this.useVisionOnlySlam ? (byte) 1 : 0);
        parcel.writeByte(this.isSlamCapable ? (byte) 1 : 0);
        parcel.writeString(this.slamConfigurationParams);
        parcel.writeParcelable(this.mCameraConfig, i);
        parcel.writeByte(this.isCalibratedDeviceConfig ? (byte) 1 : 0);
    }

    public DeviceConfig(Parcel parcel) {
        this.imuFromLandscapeCameraX = parcel.readDouble();
        this.imuFromLandscapeCameraY = parcel.readDouble();
        this.imuFromLandscapeCameraZ = parcel.readDouble();
        boolean z = true;
        this.skipAttitudeInput = AnonymousClass000.A1O(parcel.readByte());
        this.attitudeTimeDelay = parcel.readDouble();
        this.useVisionOnlySlam = AnonymousClass000.A1O(parcel.readByte());
        this.isSlamCapable = AnonymousClass000.A1O(parcel.readByte());
        this.slamConfigurationParams = parcel.readString();
        this.mCameraConfig = (D3Q) AnonymousClass3Ma.A08(parcel, D3Q.class);
        this.isCalibratedDeviceConfig = parcel.readByte() == 0 ? false : z;
    }
}
