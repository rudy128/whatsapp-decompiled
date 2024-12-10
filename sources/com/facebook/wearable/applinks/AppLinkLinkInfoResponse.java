package com.facebook.wearable.applinks;

import X.AnonymousClass000;
import X.C23646BnF;
import X.C23656BnP;
import X.D3C;
import X.DYP;
import X.EE9;
import android.os.Parcelable;
import java.util.List;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkLinkInfoResponse extends DYP {
    public static final Parcelable.Creator CREATOR = new D3C(AppLinkLinkInfoResponse.class);
    @SafeParcelable.Field(subClass = AppLinkLinkAddress.class, value = 1)
    public List addressList;
    @SafeParcelable.Field(7)
    public byte[] buildFlavor;
    @SafeParcelable.Field(5)
    public byte[] deviceImageAssetURI;
    @SafeParcelable.Field(6)
    public byte[] deviceModelName;
    @SafeParcelable.Field(8)
    public byte[] deviceName;
    @SafeParcelable.Field(4)
    public byte[] deviceSerial;
    @SafeParcelable.Field(3)
    public byte[] firmwareVersion;
    @SafeParcelable.Field(9)
    public byte[] hardwareType;
    @SafeParcelable.Field(10)
    public byte[] macAddress;

    public AppLinkLinkInfoResponse(C23656BnP bnP) {
        EE9<C23646BnF> ee9 = bnP.addresses_;
        this.addressList = AnonymousClass000.A13();
        for (C23646BnF appLinkLinkAddress : ee9) {
            this.addressList.add(new AppLinkLinkAddress(appLinkLinkAddress));
        }
        this.firmwareVersion = bnP.firmwareVersion_.A06();
        this.deviceSerial = bnP.deviceSerial_.A06();
        this.deviceImageAssetURI = bnP.deviceImageAssetURI_.A06();
        this.deviceModelName = bnP.deviceModelName_.A06();
        this.buildFlavor = bnP.buildFlavor_.A06();
        this.deviceName = bnP.deviceName_.A06();
        this.hardwareType = bnP.hardwareType_.A06();
        this.macAddress = bnP.macAddress_.A06();
    }

    public AppLinkLinkInfoResponse() {
    }
}
