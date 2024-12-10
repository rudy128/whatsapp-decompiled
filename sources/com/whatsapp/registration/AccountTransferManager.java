package com.whatsapp.registration;

import X.AnonymousClass00H;
import X.AnonymousClass19D;
import X.AnonymousClass1PY;
import X.C108965cb;
import X.C17880vN;
import X.C18070vi;
import X.C18600wl;
import X.C188699hq;
import X.C191459md;
import X.C192809p1;
import X.C19830z4;
import java.util.List;

public final class AccountTransferManager {
    public int A00;
    public List A01;
    public final C19830z4 A02;
    public final AnonymousClass19D A03;
    public final C191459md A04;
    public final C18600wl A05;
    public final AnonymousClass1PY A06;
    public final C192809p1 A07;
    public final C188699hq A08;
    public final AnonymousClass00H A09;

    public static final String A00(AccountTransferManager accountTransferManager) {
        List list = accountTransferManager.A01;
        if (list != null) {
            return C17880vN.A0w(list, accountTransferManager.A00 - 1);
        }
        C18070vi.A11("otpList");
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: X.9zb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: X.99E} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r3 >= 100) goto L_0x00f0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C22385B5o r29, X.C30391dr r30) {
        /*
            r28 = this;
            r4 = r30
            r0 = r29
            boolean r1 = r4 instanceof X.C21699AoS
            r10 = r28
            if (r1 == 0) goto L_0x01e2
            r9 = r4
            X.AoS r9 = (X.C21699AoS) r9
            int r3 = r9.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x01e2
            int r3 = r3 - r2
            r9.label = r3
        L_0x0018:
            java.lang.Object r7 = r9.result
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            int r3 = r9.label
            r1 = 5000(0x1388, double:2.4703E-320)
            r11 = 100
            r15 = 0
            r6 = 3
            r5 = 2
            r14 = 12
            r4 = 1
            if (r3 == 0) goto L_0x01dc
            if (r3 == r4) goto L_0x0053
            if (r3 == r5) goto L_0x00ae
            if (r3 != r6) goto L_0x01e9
            int r3 = r9.I$0
            java.lang.Object r0 = r9.L$1
            X.B5o r0 = (X.C22385B5o) r0
            java.lang.Object r10 = r9.L$0
            com.whatsapp.registration.AccountTransferManager r10 = (com.whatsapp.registration.AccountTransferManager) r10
            X.C30691eM.A01(r7)
        L_0x003d:
            if (r3 >= r11) goto L_0x00f0
        L_0x003f:
            java.lang.String r7 = "AccountTransferManager/executeRegisterTask/delay=5000"
            com.whatsapp.util.Log.i((java.lang.String) r7)
            r9.L$0 = r10
            r9.L$1 = r0
            r9.I$0 = r3
            r9.label = r4
            java.lang.Object r7 = X.C62882s9.A00(r9, r1)
            if (r7 != r8) goto L_0x0060
            return r8
        L_0x0053:
            int r3 = r9.I$0
            java.lang.Object r0 = r9.L$1
            X.B5o r0 = (X.C22385B5o) r0
            java.lang.Object r10 = r9.L$0
            com.whatsapp.registration.AccountTransferManager r10 = (com.whatsapp.registration.AccountTransferManager) r10
            X.C30691eM.A01(r7)
        L_0x0060:
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()
            java.lang.String r7 = "AccountTransferManager/executeRegisterTask/try#"
            r12.append(r7)
            int r7 = r3 + 1
            X.C17900vP.A0o(r12, r7)
            r9.L$0 = r10
            r9.L$1 = r0
            r9.I$0 = r3
            r9.label = r5
            X.9md r7 = r10.A04
            r16 = r7
            java.lang.String r19 = A00(r10)
            X.0z4 r12 = r10.A02
            java.lang.String r21 = X.C108955ca.A0t(r12)
            java.lang.String r22 = X.C108955ca.A0u(r12)
            int r13 = r12.A0J()
            X.19D r7 = r10.A03
            java.lang.String r12 = X.A9B.A0F(r12, r7)
            X.99E r7 = new X.99E
            r7.<init>(r13, r12)
            r17 = 0
            java.lang.String r20 = "acc_tr"
            r24 = r17
            r23 = r17
            r25 = r9
            r26 = r15
            r27 = r5
            r18 = r7
            java.lang.Object r7 = r16.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r7 != r8) goto L_0x00bb
            return r8
        L_0x00ae:
            int r3 = r9.I$0
            java.lang.Object r0 = r9.L$1
            X.B5o r0 = (X.C22385B5o) r0
            java.lang.Object r10 = r9.L$0
            com.whatsapp.registration.AccountTransferManager r10 = (com.whatsapp.registration.AccountTransferManager) r10
            X.C30691eM.A01(r7)
        L_0x00bb:
            X.9hy r7 = (X.C188779hy) r7
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            java.lang.String r12 = "AccountTransferManager/executeRegisterTask/verifyCodeResult="
            r13.append(r12)
            java.lang.Integer r12 = r7.A07
            java.lang.String r12 = X.C181679Rk.A00(r12)
            X.C17890vO.A1A(r13, r12)
            java.lang.Integer r12 = r7.A07
            int r13 = r12.intValue()
            if (r13 == r15) goto L_0x0160
            if (r13 == r14) goto L_0x0139
            r12 = 5
            if (r13 == r12) goto L_0x0110
            r12 = 17
            if (r13 == r12) goto L_0x00f3
            int r3 = r3 + 1
            if (r3 != r11) goto L_0x01cd
            java.lang.String r1 = "AccountTransferManager/executeRegisterTask/maxed out retry attempts"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.Ad2 r0 = (X.C21010Ad2) r0
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r0.A00
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A09(r0)
        L_0x00f0:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00f3:
            X.9hq r1 = r10.A08
            X.1CM r3 = r1.A05
            X.8BA r2 = r1.A02
            X.00H r1 = r1.A07
            X.A80.A06(r2, r7, r3, r1)
            X.Ad2 r0 = (X.C21010Ad2) r0
            java.lang.String r1 = "p2p/fpm/ChatTransferViewModel/ onRegistrationSuccess/Continue to Age Consent"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r0.A00
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A09(r0)
            X.1wy r0 = r0.A0L
            X.AnonymousClass3MY.A1M(r0, r4)
            goto L_0x00f0
        L_0x0110:
            X.Ad2 r0 = (X.C21010Ad2) r0
            java.lang.String r1 = "p2p/fpm/ChatTransferViewModel/ onAbandonAccountTransfer/show error dialog"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r1 = r0.A00
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A09(r1)
            X.1DT r0 = r1.A0E
            r8 = 2131886409(0x7f120149, float:1.9407396E38)
            r9 = 2131886410(0x7f12014a, float:1.9407398E38)
            r10 = 2131899286(0x7f123396, float:1.9433514E38)
            X.AWF r6 = new X.AWF
            r6.<init>(r1, r4)
            r7 = 0
            X.9hH r5 = new X.9hH
            r12 = r15
            r11 = r15
            r13 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.A0E(r5)
            goto L_0x00f0
        L_0x0139:
            X.Ad2 r0 = (X.C21010Ad2) r0
            java.lang.String r1 = "p2p/fpm/ChatTransferViewModel/ onRegistrationSuccess/Continue to 2FA"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r0.A00
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A09(r0)
            X.1wy r0 = r0.A0M
            X.AnonymousClass3MY.A1M(r0, r4)
            X.00H r0 = r10.A09
            java.lang.Object r0 = r0.get()
            X.9xw r0 = (X.C198189xw) r0
            X.00H r0 = r0.A01
            X.A8V r2 = X.AnonymousClass8BR.A0q(r0)
            java.lang.String r1 = "qr_code_device_switching"
            java.lang.String r0 = "unknown"
            r2.A0I(r1, r0)
            goto L_0x00f0
        L_0x0160:
            X.00H r1 = r10.A09
            java.lang.Object r1 = r1.get()
            X.9xw r1 = (X.C198189xw) r1
            X.00H r2 = r1.A01
            X.A8V r1 = X.AnonymousClass8BR.A0q(r2)
            r1.A08()
            X.A8V r3 = X.AnonymousClass8BR.A0q(r2)
            java.lang.String r2 = "qr_code_device_switching"
            java.lang.String r1 = "unknown"
            r3.A0I(r2, r1)
            X.9hq r1 = r10.A08
            boolean r12 = r7.A0H
            boolean r13 = r7.A0G
            X.0z4 r5 = r1.A01
            java.lang.String r9 = X.C108955ca.A0t(r5)
            java.lang.String r10 = X.C108955ca.A0u(r5)
            X.1Do r6 = r1.A03
            java.lang.String r11 = r7.A08
            X.ARp r8 = r1.A06
            boolean r14 = r7.A0F
            X.1jT r7 = r1.A04
            X.0zA r4 = r1.A00
            X.A80.A05(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.Ad2 r0 = (X.C21010Ad2) r0
            java.lang.String r1 = "p2p/fpm/ChatTransferViewModel/ onRegistrationSuccess/starting server..."
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r2 = r0.A00
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A09(r2)
            X.5cY r1 = r2.A0S
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.BFN(r0)
            r0 = 3
            r2.A0d(r0)
            X.9xw r1 = com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A04(r2)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x00f0
            X.00H r4 = r1.A01
            X.A8V r3 = X.AnonymousClass8BR.A0q(r4)
            java.lang.String r2 = "chat_transfer_in_progress_landing"
            java.lang.String r1 = "chat_transfer_in_progress"
            java.lang.String r0 = "view"
            X.A8V.A04(r3, r4, r1, r2, r0)
            goto L_0x00f0
        L_0x01cd:
            r9.L$0 = r10
            r9.L$1 = r0
            r9.I$0 = r3
            r9.label = r6
            java.lang.Object r7 = X.C62882s9.A00(r9, r1)
            if (r7 != r8) goto L_0x003d
            return r8
        L_0x01dc:
            X.C30691eM.A01(r7)
            r3 = 0
            goto L_0x003f
        L_0x01e2:
            X.AoS r9 = new X.AoS
            r9.<init>(r10, r4)
            goto L_0x0018
        L_0x01e9:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.AccountTransferManager.A01(X.B5o, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r9, X.C30391dr r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C21630AnL
            if (r0 == 0) goto L_0x007a
            r4 = r10
            X.AnL r4 = (X.C21630AnL) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007a
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r7 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r7) goto L_0x0080
            X.C30691eM.A01(r1)
        L_0x0020:
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x002d
            int r0 = r1.intValue()
        L_0x0028:
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            return r0
        L_0x002d:
            r0 = 2
            goto L_0x0028
        L_0x002f:
            X.C30691eM.A01(r1)
            if (r9 == 0) goto L_0x0078
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0078
            r6 = 0
            X.5WJ r3 = new X.5WJ
            r3.<init>()
            X.A7K r2 = X.A7K.A00()
            X.9ju r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "token"
            X.8Kx r1 = X.C162478Kx.A00(r1, r9, r0)
            java.lang.String r0 = "input"
            X.C108975cc.A0z(r1, r2, r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.registration.RegAccountTransferVerifyTokenMutationResponseImpl> r1 = com.whatsapp.infra.graphql.generated.registration.RegAccountTransferVerifyTokenMutationResponseImpl.class
            java.lang.String r0 = "RegAccountTransferVerifyTokenMutation"
            X.AIj r1 = X.AIj.A00(r2, r1, r0)
            X.1PY r0 = r8.A06
            X.A2g r1 = r0.A01(r1)
            X.82b r0 = new X.82b
            r0.<init>(r8, r3)
            r1.A04(r0)
            com.whatsapp.registration.AccountTransferManager$verifyOtpCode$3 r2 = new com.whatsapp.registration.AccountTransferManager$verifyOtpCode$3
            r2.<init>(r6, r3)
            r4.label = r7
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r1 = X.AnonymousClass4Z5.A01(r4, r2, r0)
            if (r1 != r5) goto L_0x0020
            return r5
        L_0x0078:
            r0 = 3
            goto L_0x0028
        L_0x007a:
            X.AnL r4 = new X.AnL
            r4.<init>(r8, r10)
            goto L_0x0012
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.AccountTransferManager.A02(java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C30391dr r19) {
        /*
            r18 = this;
            r4 = r19
            boolean r0 = r4 instanceof X.C21662Anr
            r1 = r18
            if (r0 == 0) goto L_0x007f
            r13 = r4
            X.Anr r13 = (X.C21662Anr) r13
            int r3 = r13.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x007f
            int r3 = r3 - r2
            r13.label = r3
        L_0x0016:
            java.lang.Object r4 = r13.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r13.label
            r8 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0042
            if (r0 != r2) goto L_0x008b
            java.lang.Object r1 = r13.L$0
            com.whatsapp.registration.AccountTransferManager r1 = (com.whatsapp.registration.AccountTransferManager) r1
            X.C30691eM.A01(r4)
        L_0x0029:
            X.ADN r4 = (X.ADN) r4
            java.lang.String r3 = r4.A0D
            if (r3 == 0) goto L_0x0085
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0085
            java.util.List r0 = X.C108985cd.A0s(r3, r2)
            r1.A01 = r0
            r1.A00 = r2
            java.lang.String r0 = A00(r1)
            return r0
        L_0x0042:
            X.C30691eM.A01(r4)
            X.0z4 r4 = r1.A02
            java.lang.String r9 = X.C108955ca.A0t(r4)
            java.lang.String r10 = X.C108955ca.A0u(r4)
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0090
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0090
            X.9p1 r5 = r1.A07
            X.19D r0 = r1.A03
            X.99F r6 = X.A9B.A0B(r4, r0)
            int r15 = r4.A0A()
            int r16 = r4.A0B()
            int r17 = r4.A09()
            r13.L$0 = r1
            r13.label = r2
            r14 = 0
            java.lang.String r7 = "acc_tr"
            r12 = r8
            r11 = r8
            java.lang.Object r4 = r5.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r4 != r3) goto L_0x0029
            return r3
        L_0x007f:
            X.Anr r13 = new X.Anr
            r13.<init>(r1, r4)
            goto L_0x0016
        L_0x0085:
            java.lang.String r0 = "AccountTransferManager/requestCode/could not fetch otp list"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r8
        L_0x008b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0090:
            java.lang.String r0 = "AccountTransferManager/requestCode/cc or num is missing"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.AccountTransferManager.A03(X.1dr):java.lang.Object");
    }

    public AccountTransferManager(C19830z4 r2, AnonymousClass19D r3, AnonymousClass1PY r4, C192809p1 r5, C191459md r6, C188699hq r7, AnonymousClass00H r8, C18600wl r9) {
        C18070vi.A0o(r4, r3, r2);
        C108965cb.A1P(r9, 7, r8);
        this.A06 = r4;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r6;
        this.A07 = r5;
        this.A08 = r7;
        this.A05 = r9;
        this.A09 = r8;
    }
}
