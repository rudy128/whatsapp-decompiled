package X;

import android.text.TextUtils;

/* renamed from: X.9yh  reason: invalid class name and case insensitive filesystem */
public class C198659yh {
    public final C187919ga A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    public static C198659yh A00(C143887Fe r23, C693536w r24, String str, String str2) {
        String str3;
        C187919ga r8;
        byte[] bArr;
        C143887Fe r0 = r23;
        String str4 = r0.A0B;
        String str5 = r0.A0A;
        byte[] bArr2 = r0.A0J;
        String str6 = r0.A08;
        if (r0.A02 == 1) {
            str3 = "video";
        } else {
            str3 = null;
        }
        C693536w r2 = r24;
        if (r24 == null || TextUtils.isEmpty(r2.A05) || TextUtils.isEmpty(r2.A09) || TextUtils.isEmpty(r2.A06) || (bArr = r2.A0B) == null) {
            r8 = null;
        } else {
            String str7 = r2.A05;
            String str8 = r2.A09;
            String str9 = r2.A06;
            long j = r2.A02;
            int i = r2.A01;
            int i2 = i;
            byte[] bArr3 = bArr;
            String str10 = str9;
            String str11 = str8;
            String str12 = str7;
            r8 = new C187919ga(str12, str11, str10, bArr3, i2, r2.A00, j);
        }
        return new C198659yh(r8, str, str4, str5, str6, str2, str3, bArr2);
    }

    public C198659yh(C187919ga r1, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
        this.A06 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A07 = bArr;
        this.A01 = str4;
        this.A03 = str5;
        this.A04 = str6;
        this.A00 = r1;
    }
}
