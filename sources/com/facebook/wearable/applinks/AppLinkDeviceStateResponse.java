package com.facebook.wearable.applinks;

import X.D3C;
import X.DYP;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkDeviceStateResponse extends DYP {
    public static final Parcelable.Creator CREATOR = new D3C(AppLinkDeviceStateResponse.class);
    @SafeParcelable.Field(2)
    public AppLinkDeviceConnectionStatus deviceConnectionStatus;
    @SafeParcelable.Field(3)
    public AppLinkDeviceHardwareState deviceHardwareState;
    @SafeParcelable.Field(5)
    public AppLinkDeviceMountState deviceMountState;
    @SafeParcelable.Field(4)
    public AppLinkDevicePeakPowerState devicePeakPowerState;
    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkDeviceStateResponse(byte[] bArr, AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus, AppLinkDeviceHardwareState appLinkDeviceHardwareState) {
        this.serviceUUID = bArr;
        this.deviceConnectionStatus = appLinkDeviceConnectionStatus;
        this.deviceHardwareState = appLinkDeviceHardwareState;
    }

    public AppLinkDeviceStateResponse(byte[] bArr, AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus, AppLinkDeviceHardwareState appLinkDeviceHardwareState, AppLinkDevicePeakPowerState appLinkDevicePeakPowerState, AppLinkDeviceMountState appLinkDeviceMountState) {
        this.serviceUUID = bArr;
        this.deviceConnectionStatus = appLinkDeviceConnectionStatus;
        this.deviceHardwareState = appLinkDeviceHardwareState;
        this.devicePeakPowerState = appLinkDevicePeakPowerState;
        this.deviceMountState = appLinkDeviceMountState;
    }

    public AppLinkDeviceStateResponse(byte[] bArr, AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus) {
        this.serviceUUID = bArr;
        this.deviceConnectionStatus = appLinkDeviceConnectionStatus;
    }

    public AppLinkDeviceStateResponse(byte[] bArr, AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus, AppLinkDeviceHardwareState appLinkDeviceHardwareState, AppLinkDevicePeakPowerState appLinkDevicePeakPowerState) {
        this.serviceUUID = bArr;
        this.deviceConnectionStatus = appLinkDeviceConnectionStatus;
        this.deviceHardwareState = appLinkDeviceHardwareState;
        this.devicePeakPowerState = appLinkDevicePeakPowerState;
    }

    public AppLinkDeviceStateResponse() {
    }
}
