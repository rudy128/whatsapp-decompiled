package com.whatsapp.spamreport;

import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DT;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass3MW;
import X.AnonymousClass7RS;
import X.AnonymousClass8FK;
import X.C108945cZ;
import X.C136876uY;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C24921Me;
import X.C26031Qo;
import X.C36401np;
import android.app.Application;
import android.text.SpannableStringBuilder;

public final class ReportSpamDialogViewModel extends AnonymousClass8FK {
    public final Application A00;
    public final AnonymousClass1DT A01 = C108945cZ.A0S();
    public final AnonymousClass1DT A02 = C108945cZ.A0S();
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final C136876uY A05;
    public final AnonymousClass11P A06;
    public final C18000vb A07;
    public final C26031Qo A08;
    public final AnonymousClass1CJ A09;
    public final AnonymousClass1MZ A0A;
    public final C18030ve A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final C18600wl A0F;
    public final C36401np A0G;

    public static final SpannableStringBuilder A00(ReportSpamDialogViewModel reportSpamDialogViewModel, int i) {
        C36401np r4 = reportSpamDialogViewModel.A0G;
        Application application = reportSpamDialogViewModel.A00;
        SpannableStringBuilder A052 = r4.A05(application, new AnonymousClass7RS(reportSpamDialogViewModel), C17880vN.A0q(application, "learn-more", AnonymousClass3MW.A1a(), 0, i), "learn-more");
        C18070vi.A0X(A052);
        return A052;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.AnonymousClass1BI r6, com.whatsapp.spamreport.ReportSpamDialogViewModel r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.AnonymousClass7TX
            if (r0 == 0) goto L_0x0038
            r5 = r8
            X.7TX r5 = (X.AnonymousClass7TX) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0038
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0024
            if (r0 != r3) goto L_0x003e
            X.C30691eM.A01(r1)
        L_0x0020:
            X.C18070vi.A0a(r1)
            return r1
        L_0x0024:
            X.C30691eM.A01(r1)
            X.0wl r2 = r7.A0F
            r1 = 0
            com.whatsapp.spamreport.ReportSpamDialogViewModel$getContact$2 r0 = new com.whatsapp.spamreport.ReportSpamDialogViewModel$getContact$2
            r0.<init>(r6, r7, r1)
            r5.label = r3
            java.lang.Object r1 = X.C30451dy.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0020
            return r4
        L_0x0038:
            X.7TX r5 = new X.7TX
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x003e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogViewModel.A03(X.1BI, com.whatsapp.spamreport.ReportSpamDialogViewModel, X.1dr):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogViewModel(Application application, AnonymousClass1M9 r3, C24921Me r4, C136876uY r5, AnonymousClass11P r6, C18000vb r7, C26031Qo r8, AnonymousClass1CJ r9, AnonymousClass1MZ r10, C18030ve r11, C36401np r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, C18600wl r16) {
        super(application);
        C18070vi.A0w(application, r6, r11, r12, r9);
        C18070vi.A0x(r3, r13, r4, r7, r8);
        C18600wl r0 = r16;
        C18070vi.A0y(r14, r5, r15, r10, r0);
        this.A00 = application;
        this.A06 = r6;
        this.A0B = r11;
        this.A0G = r12;
        this.A09 = r9;
        this.A03 = r3;
        this.A0E = r13;
        this.A04 = r4;
        this.A07 = r7;
        this.A08 = r8;
        this.A0D = r14;
        this.A05 = r5;
        this.A0C = r15;
        this.A0A = r10;
        this.A0F = r0;
    }
}
