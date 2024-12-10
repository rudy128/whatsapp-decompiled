package X;

import com.facebook.wearable.applinks.AppLinkLinkAddress;
import com.facebook.wearable.applinks.AppLinkLinkInfoResponse;
import java.util.List;
import java.util.UUID;

public final class BWD extends C22610BFq {
    public final /* synthetic */ BTW A00;
    public final /* synthetic */ Cw1 A01;
    public final /* synthetic */ UUID A02;
    public final /* synthetic */ C22821Di A03;

    public void Bsn(int i, String str) {
        C18070vi.A0d(str, 1);
        Object A0w = AnonymousClass000.A0w(C24361Bzw.A00, i);
        if (A0w == null) {
            A0w = C24361Bzw.UNKNOWN;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("getDeviceLinkInfo: onError ");
        A10.append(A0w);
        A10.append(". ");
        A10.append(str);
        C26294Cx6.A09("lam:LinkedAppManager", C17890vO.A0c(A10, '.'), (Throwable) null);
        C22821Di r0 = this.A01.A03;
        if (r0 != null) {
            r0.invoke(A0w);
        }
    }

    public void C3b(AppLinkLinkInfoResponse appLinkLinkInfoResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        AppLinkLinkInfoResponse appLinkLinkInfoResponse2 = appLinkLinkInfoResponse;
        C18070vi.A0d(appLinkLinkInfoResponse2, 0);
        List list = appLinkLinkInfoResponse2.addressList;
        C18070vi.A0W(list);
        AppLinkLinkAddress appLinkLinkAddress = (AppLinkLinkAddress) C29431cG.A0c(list);
        byte[] bArr = appLinkLinkInfoResponse2.macAddress;
        if (bArr != null) {
            str = C108955ca.A13(bArr);
        } else {
            str = null;
        }
        UUID uuid = this.A02;
        BTW btw = this.A00;
        if (appLinkLinkAddress == null || appLinkLinkAddress.addressType != C24376C0v.BTC.BVW()) {
            str2 = null;
        } else {
            str2 = appLinkLinkAddress.address;
        }
        byte[] bArr2 = appLinkLinkInfoResponse2.firmwareVersion;
        if (bArr2 != null) {
            str3 = C108955ca.A13(bArr2);
        } else {
            str3 = null;
        }
        String str10 = "";
        if (str3 == null) {
            str3 = str10;
        }
        byte[] bArr3 = appLinkLinkInfoResponse2.deviceSerial;
        if (bArr3 != null) {
            str4 = C108955ca.A13(bArr3);
        } else {
            str4 = str10;
        }
        if (appLinkLinkAddress == null || appLinkLinkAddress.addressType != C24376C0v.IPV4.BVW()) {
            str5 = null;
        } else {
            str5 = appLinkLinkAddress.address;
        }
        byte[] bArr4 = appLinkLinkInfoResponse2.deviceImageAssetURI;
        if (bArr4 != null) {
            str6 = C108955ca.A13(bArr4);
        } else {
            str6 = str10;
        }
        byte[] bArr5 = appLinkLinkInfoResponse2.deviceModelName;
        if (bArr5 != null) {
            str7 = C108955ca.A13(bArr5);
        } else {
            str7 = str10;
        }
        byte[] bArr6 = appLinkLinkInfoResponse2.buildFlavor;
        if (bArr6 != null) {
            str8 = C108955ca.A13(bArr6);
        } else {
            str8 = str10;
        }
        byte[] bArr7 = appLinkLinkInfoResponse2.deviceName;
        if (bArr7 != null) {
            str9 = C108955ca.A13(bArr7);
        } else {
            str9 = str10;
        }
        byte[] bArr8 = appLinkLinkInfoResponse2.hardwareType;
        if (bArr8 != null) {
            str10 = C108955ca.A13(bArr8);
        }
        if (str == null || AnonymousClass1YF.A0T(str)) {
            str = null;
        }
        this.A03.invoke(new C22868BTc(btw, str2, str3, str4, str5, str6, str7, str8, str9, str10, str, uuid));
    }

    public BWD(BTW btw, Cw1 cw1, UUID uuid, C22821Di r4) {
        this.A02 = uuid;
        this.A00 = btw;
        this.A03 = r4;
        this.A01 = cw1;
    }
}
