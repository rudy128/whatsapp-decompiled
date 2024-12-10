package X;

import android.net.Uri;
import com.whatsapp.jid.UserJid;
import java.io.File;

/* renamed from: X.2rZ  reason: invalid class name and case insensitive filesystem */
public class C62542rZ {
    public final C218617r A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1QQ A02;
    public final C18030ve A03;
    public final AnonymousClass1T6 A04;
    public final AnonymousClass11E A05;
    public final C26421Sb A06;
    public final C36181nT A07;
    public final AnonymousClass10I A08;

    public static C63722ta A00(C1418377d r14, String str) {
        File file;
        Uri uri;
        C1418377d r4 = r14;
        String str2 = r14.A0B;
        if (str2 != null) {
            if (r14.A01 == 3) {
                uri = Uri.parse(str2);
                file = null;
            } else {
                file = new File(str2);
                uri = null;
            }
            if (uri != null) {
                return C63722ta.A00(uri, (C61382pa) null, (AnonymousClass6nF) null, new C62022qf(true, false, true), C26551So.A0j, r4.A04, str, 0, false, true, true);
            }
            if (file != null) {
                return C63722ta.A02((AnonymousClass6nF) null, new C62022qf(true, false, true), C26551So.A0j, r4.A04, file, (String) null, r4.A0F, r4.A0E, true);
            }
        }
        return null;
    }

    public C21132Af0 A01(AEX aex, AnonymousClass1BI r13, UserJid userJid, AnonymousClass206 r15, C1418377d r16, Integer num) {
        C21132Af0 af0 = new C21132Af0();
        if (!this.A05.A09()) {
            af0.A0B(new C55032f6());
            return af0;
        }
        AnonymousClass206 r4 = r15;
        Integer num2 = num;
        this.A08.CGF(new C70723Cg(this, aex, r4, num2, userJid, af0, r13, r16, 1));
        return af0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C441322g A02(X.AnonymousClass1BI r19, com.whatsapp.jid.UserJid r20, X.AnonymousClass206 r21, X.C1418377d r22, java.lang.Integer r23) {
        /*
            r18 = this;
            X.2rc r5 = new X.2rc
            r5.<init>()
            r2 = r22
            java.lang.String r3 = r2.A0B
            if (r3 == 0) goto L_0x0060
            int r1 = r2.A01
            r0 = 3
            if (r1 != r0) goto L_0x0059
            android.net.Uri r4 = android.net.Uri.parse(r3)
        L_0x0014:
            int r0 = r2.A03
            r5.A08 = r0
            int r0 = r2.A02
            r5.A06 = r0
            r0 = r18
            X.1Sb r3 = r0.A06
            r14 = 0
            r8 = 0
            r13 = 20
            r10 = r8
            r11 = r8
            r12 = r8
            r16 = r14
            r17 = r14
            r6 = r19
            r7 = r21
            r9 = r8
            r15 = r14
            X.21V r1 = r3.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.22g r1 = (X.C441322g) r1
            boolean r0 = X.C22971Dz.A0e(r6)
            if (r0 == 0) goto L_0x0042
            r0 = r20
            r1.A0d(r0)
        L_0x0042:
            java.lang.String r0 = r2.A0F
            r1.A05 = r0
            java.lang.String r0 = r2.A0E
            r1.A06 = r0
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "image/webp"
            r1.A06 = r0
        L_0x0050:
            X.73B r0 = r2.A04
            r1.A05 = r0
            r0 = r23
            r1.A06 = r0
            return r1
        L_0x0059:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r5.A0G = r0
        L_0x0060:
            r4 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62542rZ.A02(X.1BI, com.whatsapp.jid.UserJid, X.206, X.77d, java.lang.Integer):X.22g");
    }

    public void A03(AEX aex, AnonymousClass2L3 r32) {
        C36181nT r12 = this.A07;
        C26551So r14 = C26551So.A0f;
        AEX aex2 = aex;
        String str = aex2.A0F;
        String str2 = aex2.A04;
        String str3 = aex2.A03;
        String str4 = aex2.A02;
        String str5 = aex2.A0G;
        byte[] bArr = aex2.A08;
        String str6 = str5;
        byte[] bArr2 = bArr;
        String str7 = str4;
        String str8 = str3;
        String str9 = str2;
        String str10 = str;
        r12.A0A(new AnonymousClass348(this, r32, aex2, 2), r14, (AnonymousClass1TI) null, (AnonymousClass1TI) null, str10, str9, str8, (String) null, str7, str6, bArr2, 3, 1, 1, 0, aex2.A0E);
    }

    public C62542rZ(C218617r r1, AnonymousClass11E r2, AnonymousClass11P r3, AnonymousClass1QQ r4, C18030ve r5, C26421Sb r6, AnonymousClass1T6 r7, C36181nT r8, AnonymousClass10I r9) {
        this.A01 = r3;
        this.A03 = r5;
        this.A08 = r9;
        this.A00 = r1;
        this.A06 = r6;
        this.A04 = r7;
        this.A07 = r8;
        this.A02 = r4;
        this.A05 = r2;
    }
}
