package X;

import java.util.UUID;

/* renamed from: X.BTc  reason: case insensitive filesystem */
public final class C22868BTc extends C3J {
    public final BTW A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final UUID A09;
    public final String A0A;
    public final String A0B;

    public C22868BTc(BTW btw, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, UUID uuid) {
        C18070vi.A0d(uuid, 1);
        this.A09 = uuid;
        this.A00 = btw;
        this.A01 = str;
        this.A06 = str2;
        this.A0A = str3;
        this.A08 = str4;
        this.A03 = str5;
        this.A04 = str6;
        this.A02 = str7;
        this.A05 = str8;
        this.A07 = str9;
        this.A0B = str10;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22868BTc) {
                C22868BTc bTc = (C22868BTc) obj;
                if (!C18070vi.A18(this.A09, bTc.A09) || !C18070vi.A18(this.A00, bTc.A00) || !C18070vi.A18(this.A01, bTc.A01) || !C18070vi.A18(this.A06, bTc.A06) || !C18070vi.A18(this.A0A, bTc.A0A) || !C18070vi.A18(this.A08, bTc.A08) || !C18070vi.A18(this.A03, bTc.A03) || !C18070vi.A18(this.A04, bTc.A04) || !C18070vi.A18(this.A02, bTc.A02) || !C18070vi.A18(this.A05, bTc.A05) || !C18070vi.A18(this.A07, bTc.A07) || !C18070vi.A18(this.A0B, bTc.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((AnonymousClass000.A0L(this.A09) + AnonymousClass001.A0k(this.A00)) * 31) + C17900vP.A00(this.A01)) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A0A)) * 31) + C17900vP.A00(this.A08)) * 31) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A07)) * 31) + C108955ca.A06(this.A0B);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkedDeviceConfig(serviceUUID=");
        A10.append(this.A09);
        A10.append(", linkSecurity=");
        A10.append(this.A00);
        A10.append(", BtcAddress=");
        A10.append(this.A01);
        A10.append(", firmwareVersion=");
        A10.append(this.A06);
        A10.append(", deviceSerial=");
        A10.append(this.A0A);
        A10.append(", ipAddress=");
        A10.append(this.A08);
        A10.append(", deviceImageAssetURI=");
        A10.append(this.A03);
        A10.append(", deviceModelName=");
        A10.append(this.A04);
        A10.append(", buildFlavor=");
        A10.append(this.A02);
        A10.append(", deviceName=");
        A10.append(this.A05);
        A10.append(", hardwareType=");
        A10.append(this.A07);
        A10.append(", macAddress=");
        return C17900vP.A0B(this.A0B, A10);
    }
}
