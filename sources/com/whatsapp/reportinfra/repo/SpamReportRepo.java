package com.whatsapp.reportinfra.repo;

import X.AnonymousClass00H;
import X.AnonymousClass1CJ;
import X.AnonymousClass1M9;
import X.AnonymousClass1Nb;
import X.AnonymousClass1R3;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C26031Qo;
import X.C26061Qr;
import X.C26811To;

public final class SpamReportRepo {
    public final C26811To A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1R3 A03;
    public final C18030ve A04;
    public final C26061Qr A05;
    public final AnonymousClass1Nb A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final C18600wl A0D;
    public final C26031Qo A0E;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass1E7 r20, java.lang.String r21, java.util.List r22, X.C30391dr r23) {
        /*
            r19 = this;
            r4 = r23
            r10 = r21
            boolean r0 = r4 instanceof X.AnonymousClass7UZ
            r9 = r19
            if (r0 == 0) goto L_0x0036
            r0 = r4
            X.7UZ r0 = (X.AnonymousClass7UZ) r0
            int r3 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0036
            int r3 = r3 - r2
            r0.label = r3
        L_0x0018:
            java.lang.Object r7 = r0.result
            X.1g4 r1 = X.C31751g4.COROUTINE_SUSPENDED
            int r2 = r0.label
            r6 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            if (r2 == 0) goto L_0x005d
            if (r2 == r3) goto L_0x0054
            if (r2 == r4) goto L_0x004b
            if (r2 == r5) goto L_0x0041
            if (r2 != r6) goto L_0x003c
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.L$0
            com.whatsapp.reportinfra.repo.SpamReportRepo r9 = (com.whatsapp.reportinfra.repo.SpamReportRepo) r9
            goto L_0x0124
        L_0x0036:
            X.7UZ r0 = new X.7UZ
            r0.<init>(r9, r4)
            goto L_0x0018
        L_0x003c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0041:
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.L$0
            com.whatsapp.reportinfra.repo.SpamReportRepo r9 = (com.whatsapp.reportinfra.repo.SpamReportRepo) r9
            goto L_0x00fc
        L_0x004b:
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.L$0
            com.whatsapp.reportinfra.repo.SpamReportRepo r9 = (com.whatsapp.reportinfra.repo.SpamReportRepo) r9
            goto L_0x00ba
        L_0x0054:
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.L$0
            com.whatsapp.reportinfra.repo.SpamReportRepo r9 = (com.whatsapp.reportinfra.repo.SpamReportRepo) r9
            goto L_0x0092
        L_0x005d:
            X.C30691eM.A01(r7)
            r7 = r20
            com.whatsapp.jid.Jid r8 = X.AnonymousClass3MW.A0g(r7)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            X.C17960vV.A07(r8)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            X.C18070vi.A0X(r8)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            X.1BI r8 = (X.AnonymousClass1BI) r8     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            boolean r2 = X.C22971Dz.A0d(r8)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r11 = r22
            if (r2 == 0) goto L_0x0098
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r0.L$0 = r9     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r0.L$1 = r10     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r0.label = r3     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r12 = 0
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendIndividualSpamReport$2 r13 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendIndividualSpamReport$2     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r13.<init>(r8, r9, r10, r12)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            X.0wl r2 = r9.A0D     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2 r6 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            java.lang.Object r7 = X.C30451dy.A00(r0, r2, r6)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            if (r7 != r1) goto L_0x0095
            return r1
        L_0x0092:
            X.C30691eM.A01(r7)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
        L_0x0095:
            X.6Tk r7 = (X.C123176Tk) r7     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            return r7
        L_0x0098:
            boolean r2 = X.C22971Dz.A0W(r8)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            if (r2 == 0) goto L_0x00c0
            X.1EC r8 = (X.AnonymousClass1EC) r8     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r0.L$0 = r9     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r0.L$1 = r10     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r0.label = r4     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r12 = 0
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendGroupSpamReport$2 r13 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendGroupSpamReport$2     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r13.<init>(r8, r9, r10, r12)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            X.0wl r2 = r9.A0D     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2 r6 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            java.lang.Object r7 = X.C30451dy.A00(r0, r2, r6)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            if (r7 != r1) goto L_0x00bd
            return r1
        L_0x00ba:
            X.C30691eM.A01(r7)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
        L_0x00bd:
            X.6Tk r7 = (X.C123176Tk) r7     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            return r7
        L_0x00c0:
            boolean r2 = X.C22971Dz.A0a(r8)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            if (r2 == 0) goto L_0x0102
            if (r22 == 0) goto L_0x0102
            boolean r2 = r11.isEmpty()     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            if (r2 != 0) goto L_0x0102
            X.1cg r8 = (X.C29671cg) r8     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            java.lang.Object r2 = X.C108955ca.A0p(r11)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r0.L$0 = r9     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r0.L$1 = r10     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r0.label = r5     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            java.util.List r11 = X.C18070vi.A0M(r2)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r12 = 0
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendStatusSpamReport$2 r13 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendStatusSpamReport$2     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r14 = r8
            r15 = r2
            r16 = r9
            r17 = r10
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            X.0wl r2 = r9.A0D     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2 r6 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            java.lang.Object r7 = X.C30451dy.A00(r0, r2, r6)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            if (r7 != r1) goto L_0x00ff
            return r1
        L_0x00fc:
            X.C30691eM.A01(r7)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
        L_0x00ff:
            X.6Tk r7 = (X.C123176Tk) r7     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            return r7
        L_0x0102:
            boolean r2 = X.C22971Dz.A0V(r8)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            if (r2 == 0) goto L_0x012a
            X.1ch r8 = (X.C29681ch) r8     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r0.L$0 = r9     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r0.L$1 = r10     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r0.label = r6     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r12 = 0
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendNewsLetterSpamReport$2 r13 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendNewsLetterSpamReport$2     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r13.<init>(r8, r9, r10, r12)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            X.0wl r2 = r9.A0D     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2 r6 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            java.lang.Object r7 = X.C30451dy.A00(r0, r2, r6)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            if (r7 != r1) goto L_0x0127
            return r1
        L_0x0124:
            X.C30691eM.A01(r7)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
        L_0x0127:
            X.6Tk r7 = (X.C123176Tk) r7     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            return r7
        L_0x012a:
            X.1Qo r1 = r9.A0E     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            X.8oH r0 = X.AnonymousClass8oH.A06     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r1.A00(r0, r10)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            java.lang.String r1 = "SpamReportRepo: unrecognized jid"
            X.11T r0 = new X.11T     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            r0.<init>((java.lang.String) r1)     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
            throw r0     // Catch:{ CancellationException -> 0x0139, Exception -> 0x013b }
        L_0x0139:
            r3 = move-exception
            goto L_0x0143
        L_0x013b:
            r3 = move-exception
            X.1Qo r1 = r9.A0E
            X.8oH r0 = X.AnonymousClass8oH.A05
            r1.A01(r0, r10, r3)
        L_0x0143:
            X.0ve r2 = r9.A04
            r1 = 10008(0x2718, float:1.4024E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0155
            X.6F0 r7 = new X.6F0
            r7.<init>(r3)
            return r7
        L_0x0155:
            X.6F1 r7 = X.AnonymousClass6F1.A00
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reportinfra.repo.SpamReportRepo.A00(X.1E7, java.lang.String, java.util.List, X.1dr):java.lang.Object");
    }

    public SpamReportRepo(C26811To r1, AnonymousClass1M9 r2, C26031Qo r3, AnonymousClass1CJ r4, AnonymousClass1R3 r5, C18030ve r6, C26061Qr r7, AnonymousClass1Nb r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, C18600wl r15) {
        C18070vi.A0w(r6, r4, r9, r2, r3);
        C18070vi.A0x(r5, r8, r1, r7, r10);
        C18070vi.A0y(r11, r12, r13, r14, r15);
        this.A04 = r6;
        this.A02 = r4;
        this.A09 = r9;
        this.A01 = r2;
        this.A0E = r3;
        this.A03 = r5;
        this.A06 = r8;
        this.A00 = r1;
        this.A05 = r7;
        this.A08 = r10;
        this.A0C = r11;
        this.A07 = r12;
        this.A0B = r13;
        this.A0A = r14;
        this.A0D = r15;
    }
}
