package com.whatsapp.inappbugreporting;

import X.AnonymousClass00H;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass41S;
import X.AnonymousClass41U;
import X.C133116oC;
import X.C18070vi;
import X.C25357CeG;
import X.C41731wy;
import X.C72473Md;
import X.C83204Ef;
import X.C87224Ut;
import X.C98104qa;
import X.C98274qr;
import android.net.Uri;

public final class InAppBugReportingViewModel extends AnonymousClass1J2 {
    public AnonymousClass1DT A00;
    public AnonymousClass1DT A01;
    public AnonymousClass1DT A02;
    public String A03;
    public C87224Ut[] A04;
    public final AnonymousClass1DS A05;
    public final AnonymousClass1DT A06 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A07 = AnonymousClass3MW.A0L();
    public final C41731wy A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0099, code lost:
        if (r15.length() == 0) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(java.lang.String r15, java.lang.String r16, java.lang.String r17, android.net.Uri[] r18, boolean r19) {
        /*
            r14 = this;
            r4 = 1
            r5 = r16
            r2 = r18
            X.C18070vi.A0e(r5, r4, r2)
            java.lang.String r0 = "[^\\p{L}\\p{N}\\p{P}\\p{Z}]"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r5)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = r1.replaceAll(r0)
            X.C18070vi.A0X(r0)
            int r3 = r0.length()
            r0 = 10
            r9 = r14
            X.1DT r1 = r14.A06
            if (r3 >= r0) goto L_0x0030
            X.41L r0 = X.AnonymousClass41L.A00
        L_0x002c:
            r1.A0F(r0)
            return
        L_0x0030:
            X.41M r0 = X.AnonymousClass41M.A00
            r1.A0F(r0)
            if (r19 != 0) goto L_0x0047
            X.1DS r0 = r14.A05
            java.lang.Object r0 = r0.A06()
            boolean r0 = X.C18070vi.A19(r0, r4)
            if (r0 == 0) goto L_0x0047
            X.1wy r1 = r14.A08
            r0 = 0
            goto L_0x002c
        L_0x0047:
            X.00H r0 = r14.A0C
            X.0vd r3 = X.C17880vN.A0P(r0)
            r1 = 10127(0x278f, float:1.4191E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            r10 = r15
            r11 = r17
            if (r0 == 0) goto L_0x00bd
            X.00H r0 = r14.A09
            java.lang.Object r4 = r0.get()
            X.4X1 r4 = (X.AnonymousClass4X1) r4
            java.lang.String r6 = r14.A03
            X.4Ut[] r0 = r14.A04
            java.util.List r0 = X.C200410p.A0P(r0)
            java.util.List r7 = X.C29431cG.A0t(r0)
            X.1OX r1 = r4.A07
            X.0wl r0 = r4.A04
            r8 = 0
            com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForExternalUsers$1 r3 = new com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForExternalUsers$1
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass3MW.A1X(r0, r3, r1)
            X.1DT r1 = r14.A07
            X.41P r0 = X.AnonymousClass41P.A00
            r1.A0F(r0)
        L_0x0082:
            X.00H r0 = r14.A0D
            java.lang.Object r4 = r0.get()
            X.4Po r4 = (X.C85954Po) r4
            java.util.List r0 = X.C200410p.A0P(r2)
            int r3 = r0.size()
            if (r15 == 0) goto L_0x009b
            int r1 = r15.length()
            r0 = 0
            if (r1 != 0) goto L_0x009c
        L_0x009b:
            r0 = 1
        L_0x009c:
            r2 = r0 ^ 1
            X.3zK r1 = new X.3zK
            r1.<init>()
            java.lang.Integer r0 = X.C17880vN.A0m()
            r1.A01 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r3)
            r1.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A00 = r0
            r1.A04 = r11
            X.18K r0 = r4.A00
            r0.CC4(r1)
            return
        L_0x00bd:
            X.1DT r1 = r14.A07
            X.41Q r0 = X.AnonymousClass41Q.A00
            r1.A0F(r0)
            X.1OX r0 = X.C41561wd.A00(r14)
            r13 = 0
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel$submitBug$1 r8 = new com.whatsapp.inappbugreporting.InAppBugReportingViewModel$submitBug$1
            r12 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            X.AnonymousClass3MX.A1Q(r8, r0)
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.InAppBugReportingViewModel.A0U(java.lang.String, java.lang.String, java.lang.String, android.net.Uri[], boolean):void");
    }

    public static final void A00(C83204Ef r1, InAppBugReportingViewModel inAppBugReportingViewModel, int i) {
        AnonymousClass1DT r0;
        if (i == 0) {
            r0 = inAppBugReportingViewModel.A02;
        } else if (i == 1) {
            r0 = inAppBugReportingViewModel.A00;
        } else if (i == 2) {
            r0 = inAppBugReportingViewModel.A01;
        } else {
            return;
        }
        r0.A0F(r1);
    }

    public final void A0T(Uri uri, int i) {
        A00(AnonymousClass41U.A00, this, i);
        ((C133116oC) this.A0B.get()).A00(uri, i).A09(new C98274qr(this, i));
    }

    public final boolean A0V() {
        Object A062 = this.A02.A06();
        AnonymousClass41U r1 = AnonymousClass41U.A00;
        if (C18070vi.A18(A062, r1) || C18070vi.A18(this.A00.A06(), r1) || C18070vi.A18(this.A01.A06(), r1)) {
            return true;
        }
        return false;
    }

    public InAppBugReportingViewModel(AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0j(r6, r7);
        C72473Md.A1M(r8, r9, r10, 3);
        this.A0C = r6;
        this.A0A = r7;
        this.A0B = r8;
        this.A09 = r9;
        this.A0D = r10;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        AnonymousClass41S r1 = AnonymousClass41S.A00;
        A0L.A0F(r1);
        this.A02 = A0L;
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        A0L2.A0F(r1);
        this.A00 = A0L2;
        AnonymousClass1DT A0L3 = AnonymousClass3MW.A0L();
        A0L3.A0F(r1);
        this.A01 = A0L3;
        this.A05 = C25357CeG.A00(this.A02, this.A00, A0L3, new C98104qa());
        this.A08 = AnonymousClass3MW.A0o();
        this.A04 = new C87224Ut[3];
    }
}
