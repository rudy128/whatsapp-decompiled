package com.whatsapp.reportinfra.xmpp;

import X.AnonymousClass00H;
import X.C18030ve;
import X.C18070vi;

public final class SpamReportXmppClient {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C29621ca r12, com.whatsapp.reportinfra.xmpp.SpamReportXmppClient r13, java.lang.String r14, X.C30391dr r15, int r16) {
        /*
            r3 = r15
            boolean r0 = r15 instanceof X.AnonymousClass7TW
            if (r0 == 0) goto L_0x0084
            r8 = r3
            X.7TW r8 = (X.AnonymousClass7TW) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0084
            int r2 = r2 - r1
            r8.label = r2
        L_0x0013:
            java.lang.Object r1 = r8.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r3 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 != r3) goto L_0x00a1
            X.C30691eM.A01(r1)
        L_0x0021:
            X.9MQ r1 = (X.AnonymousClass9MQ) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = r1 instanceof X.C173548vG
            if (r0 != 0) goto L_0x0046
            boolean r0 = r1 instanceof X.C173538vF
            if (r0 == 0) goto L_0x008a
            X.8vF r1 = (X.C173538vF) r1
            X.1ca r3 = r1.A00
            java.lang.String r0 = "error"
            X.1ca r2 = r3.A0K(r0)
            r1 = -1
            if (r2 == 0) goto L_0x0091
            java.lang.String r0 = "code"
            int r1 = r2.A0A(r0, r1)
            r0 = 548(0x224, float:7.68E-43)
            if (r1 != r0) goto L_0x0091
        L_0x0046:
            X.6F1 r1 = X.AnonymousClass6F1.A00
            return r1
        L_0x0049:
            X.C30691eM.A01(r1)
            X.0ve r2 = r13.A00
            r1 = 10008(0x2718, float:1.4024E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            X.00H r0 = r13.A03
            java.lang.Object r5 = r0.get()
            r6 = r12
            r7 = r14
            r9 = r16
            if (r1 == 0) goto L_0x0073
            X.C18070vi.A0X(r5)
            X.1OZ r5 = (X.AnonymousClass1OZ) r5
            r8.label = r3
            r10 = 32000(0x7d00, double:1.581E-319)
            r12 = 0
            java.lang.Object r1 = r5.A0A(r6, r7, r8, r9, r10, r12)
            if (r1 != r4) goto L_0x0021
            return r4
        L_0x0073:
            X.1OZ r5 = (X.AnonymousClass1OZ) r5
            r0 = 0
            X.36x r11 = new X.36x
            r11.<init>(r0)
            r15 = 32000(0x7d00, double:1.581E-319)
            r10 = r5
            r13 = r14
            r14 = r9
            r10.A0N(r11, r12, r13, r14, r15)
            goto L_0x0046
        L_0x0084:
            X.7TW r8 = new X.7TW
            r8.<init>(r13, r15)
            goto L_0x0013
        L_0x008a:
            boolean r0 = r1 instanceof X.C173558vH
            if (r0 == 0) goto L_0x009c
            X.6Sk r0 = X.C122916Sk.A00
            goto L_0x0096
        L_0x0091:
            X.6Se r0 = new X.6Se
            r0.<init>(r3)
        L_0x0096:
            X.6F0 r1 = new X.6F0
            r1.<init>(r0)
            return r1
        L_0x009c:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reportinfra.xmpp.SpamReportXmppClient.A00(X.1ca, com.whatsapp.reportinfra.xmpp.SpamReportXmppClient, java.lang.String, X.1dr, int):java.lang.Object");
    }

    public SpamReportXmppClient(C18030ve r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        C18070vi.A0l(r6, r7);
        this.A00 = r1;
        this.A03 = r2;
        this.A05 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A04 = r6;
        this.A06 = r7;
    }
}
