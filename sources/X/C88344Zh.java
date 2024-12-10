package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.4Zh  reason: invalid class name and case insensitive filesystem */
public class C88344Zh {
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;
    public final long A06;
    public final C62142qr A07;
    public final DeviceJid A08;
    public final AnonymousClass2RG A09;
    public final String A0A;
    public final boolean A0B;

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C88344Zh r7 = (C88344Zh) obj;
        return this.A08.equals(r7.A08) && this.A09.equals(r7.A09) && AnonymousClass1EG.A0I(this.A0A, r7.A0A) && this.A06 == r7.A06 && this.A05 == r7.A05 && this.A0B == r7.A0B && TextUtils.equals(this.A03, r7.A03);
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.A08;
        objArr[1] = this.A09;
        objArr[2] = this.A0A;
        objArr[3] = Long.valueOf(this.A06);
        AnonymousClass3Ma.A1T(objArr, this.A05);
        objArr[5] = Boolean.valueOf(this.A0B);
        return AnonymousClass000.A0P(this.A03, objArr, 6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        return X.C17880vN.A0q(r4, r5.A0A, new java.lang.Object[1], 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return r4.getString(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.Context r4, X.C88344Zh r5) {
        /*
            X.2RG r0 = r5.A09
            int r1 = r0.ordinal()
            r3 = 0
            r0 = 1
            switch(r1) {
                case 1: goto L_0x0043;
                case 2: goto L_0x003f;
                case 3: goto L_0x0037;
                case 4: goto L_0x0033;
                case 5: goto L_0x003b;
                case 6: goto L_0x002f;
                case 7: goto L_0x000b;
                case 8: goto L_0x000b;
                case 9: goto L_0x002b;
                case 10: goto L_0x0027;
                case 11: goto L_0x0023;
                case 12: goto L_0x001f;
                case 13: goto L_0x001b;
                case 14: goto L_0x000b;
                case 15: goto L_0x000b;
                case 16: goto L_0x002b;
                case 17: goto L_0x002b;
                case 18: goto L_0x000b;
                case 19: goto L_0x000b;
                case 20: goto L_0x000b;
                case 21: goto L_0x000b;
                case 22: goto L_0x0017;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r0 = r5.A0A
            if (r0 != 0) goto L_0x0016
            r0 = 2131891680(0x7f1215e0, float:1.9418087E38)
        L_0x0012:
            java.lang.String r0 = r4.getString(r0)
        L_0x0016:
            return r0
        L_0x0017:
            r0 = 2131891679(0x7f1215df, float:1.9418085E38)
            goto L_0x0012
        L_0x001b:
            r0 = 2131891677(0x7f1215dd, float:1.941808E38)
            goto L_0x0012
        L_0x001f:
            r0 = 2131891670(0x7f1215d6, float:1.9418067E38)
            goto L_0x0012
        L_0x0023:
            r0 = 2131891668(0x7f1215d4, float:1.9418063E38)
            goto L_0x0012
        L_0x0027:
            r0 = 2131891675(0x7f1215db, float:1.9418077E38)
            goto L_0x0012
        L_0x002b:
            r2 = 2131891669(0x7f1215d5, float:1.9418065E38)
            goto L_0x0046
        L_0x002f:
            r2 = 2131891672(0x7f1215d8, float:1.941807E38)
            goto L_0x0046
        L_0x0033:
            r2 = 2131891676(0x7f1215dc, float:1.9418079E38)
            goto L_0x0046
        L_0x0037:
            r2 = 2131891674(0x7f1215da, float:1.9418075E38)
            goto L_0x0046
        L_0x003b:
            r2 = 2131891678(0x7f1215de, float:1.9418083E38)
            goto L_0x0046
        L_0x003f:
            r2 = 2131891673(0x7f1215d9, float:1.9418073E38)
            goto L_0x0046
        L_0x0043:
            r2 = 2131891671(0x7f1215d7, float:1.9418069E38)
        L_0x0046:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r5.A0A
            java.lang.String r0 = X.C17880vN.A0q(r4, r0, r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88344Zh.A00(android.content.Context, X.4Zh):java.lang.String");
    }

    public static String A01(Context context, C88344Zh r4, C18030ve r5) {
        String str = r4.A03;
        if (TextUtils.isEmpty(str) || !C18020vd.A05(C18040vf.A02, r5, 4757)) {
            return A00(context, r4);
        }
        return str;
    }

    public C88344Zh(C62142qr r2, DeviceJid deviceJid, AnonymousClass2RG r4, String str, String str2, String str3, String str4, int i, long j, long j2, long j3, boolean z) {
        C17960vV.A07(deviceJid);
        this.A08 = deviceJid;
        this.A09 = r4;
        this.A0A = C24605CBj.A00(str) ? null : str;
        this.A00 = j;
        this.A06 = j2;
        this.A01 = j3;
        this.A05 = i;
        this.A0B = z;
        this.A04 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A07 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Device jid: ");
        A10.append(this.A08);
        A10.append(", Platform type: ");
        A10.append(this.A09);
        A10.append(", Device OS: ");
        A10.append(this.A0A);
        A10.append(", Last active: ");
        A10.append(this.A00);
        A10.append(", Login time: ");
        A10.append(this.A06);
        A10.append(", Logout time: ");
        A10.append(this.A01);
        A10.append(", ADV Key Index: ");
        A10.append(this.A05);
        A10.append(", full sync required: ");
        A10.append(this.A0B);
        A10.append(", Place Name: ");
        A10.append(this.A04);
        A10.append(", History sync config info: ");
        A10.append(this.A07);
        A10.append(", Nickname: ");
        return AnonymousClass000.A0y(this.A03, A10);
    }
}
