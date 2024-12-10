package com.whatsapp.chatlock.passcode;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1OX;
import X.AnonymousClass1TK;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass4EG;
import X.C18070vi;
import X.C18600wl;
import X.C22821Di;
import X.C30391dr;
import X.C41661wr;
import X.C41911xI;
import X.C59992nD;
import X.C76903om;
import X.C76923oo;
import X.C83084Dt;
import X.C83104Dv;
import com.whatsapp.util.Log;

public final class ChatLockPasscodeManager {
    public C83084Dt A00 = C83084Dt.UTF8;
    public C83104Dv A01 = C83104Dv.PBKDF2_HMAC_SHA512;
    public final AnonymousClass1TK A02;
    public final C59992nD A03;
    public final C41911xI A04;
    public final C18600wl A05;
    public final C18600wl A06;
    public final AnonymousClass1OX A07;
    public final AnonymousClass11S A08;

    public final void A04(String str, C22821Di r6) {
        Log.i("ChatLockPasscodeManager/validatePasscode");
        if ((new C41661wr("\\p{So}").A03(str) || str.length() >= 4) && str.length() <= 1000) {
            AnonymousClass3MW.A1X(this.A06, new ChatLockPasscodeManager$validatePasscode$1(this, str, (C30391dr) null, r6), this.A07);
            return;
        }
        r6.invoke(new C76903om(1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        if (r1 == r6.A01) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.chatlock.passcode.ChatLockPasscodeManager r6, X.C165328ax r7, java.lang.String r8, X.C30391dr r9) {
        /*
            boolean r0 = r9 instanceof X.C100334uL
            if (r0 == 0) goto L_0x006f
            r5 = r9
            X.4uL r5 = (X.C100334uL) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006f
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r2) goto L_0x0075
            java.lang.Object r6 = r5.L$0
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager r6 = (com.whatsapp.chatlock.passcode.ChatLockPasscodeManager) r6
            X.C30691eM.A01(r1)
        L_0x0024:
            X.1xI r0 = r6.A04
            r0.A00()
        L_0x0029:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002c:
            X.C30691eM.A01(r1)
            X.11S r0 = r6.A08
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0029
            int r0 = r7.encoding_
            if (r0 == 0) goto L_0x006c
            if (r0 != r2) goto L_0x006c
            X.4Dt r1 = X.C83084Dt.UTF8_BROKEN
        L_0x003f:
            X.4Dt r0 = r6.A00
            if (r1 != r0) goto L_0x0052
            int r1 = r7.transformer_
            if (r1 == 0) goto L_0x0069
            if (r1 == r2) goto L_0x0066
            r0 = 2
            if (r1 != r0) goto L_0x0069
            X.4Dv r1 = X.C83104Dv.PBKDF2_HMAC_SHA384
        L_0x004e:
            X.4Dv r0 = r6.A01
            if (r1 == r0) goto L_0x0029
        L_0x0052:
            r5.L$0 = r6
            r5.label = r2
            r3 = 0
            X.0wl r2 = r6.A05
            r1 = 0
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$3 r0 = new com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$3
            r0.<init>(r6, r8, r1, r3)
            java.lang.Object r0 = X.C30451dy.A00(r5, r2, r0)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x0066:
            X.4Dv r1 = X.C83104Dv.PBKDF2_HMAC_SHA512
            goto L_0x004e
        L_0x0069:
            X.4Dv r1 = X.C83104Dv.NONE
            goto L_0x004e
        L_0x006c:
            X.4Dt r1 = X.C83084Dt.UTF8
            goto L_0x003f
        L_0x006f:
            X.4uL r5 = new X.4uL
            r5.<init>(r6, r9)
            goto L_0x0012
        L_0x0075:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatlock.passcode.ChatLockPasscodeManager.A00(com.whatsapp.chatlock.passcode.ChatLockPasscodeManager, X.8ax, java.lang.String, X.1dr):java.lang.Object");
    }

    public final AnonymousClass4EG A02(String str) {
        int i;
        Log.i("ChatLockPasscodeManager/validateIfPasscodeMeetsRequirements");
        if (!C18070vi.A18(AnonymousClass1YF.A0I(str), str)) {
            i = 5;
        } else {
            int length = str.length();
            if (length > 1000) {
                i = 6;
            } else if (new C41661wr("\\p{So}").A03(str) || length >= 4) {
                return C76923oo.A00;
            } else {
                Log.e("ChatLockPasscodeManager/validateIfPasscodeMeetsRequirements: Failed Validation");
                i = 1;
            }
        }
        return new C76903om(i);
    }

    public final void A03() {
        AnonymousClass3MW.A1X(this.A05, new ChatLockPasscodeManager$markPasscodeWithBrokenEncoding$1(this, (C30391dr) null), this.A07);
    }

    public final void A05(C22821Di r5) {
        Log.i("ChatLockPasscodeManager/clearPasscode");
        AnonymousClass3MW.A1X(this.A06, new ChatLockPasscodeManager$clearPasscode$1(this, (C30391dr) null, r5), this.A07);
    }

    public ChatLockPasscodeManager(AnonymousClass11S r2, AnonymousClass1TK r3, C59992nD r4, C41911xI r5, C18600wl r6, C18600wl r7, AnonymousClass1OX r8) {
        C18070vi.A0w(r2, r4, r5, r3, r6);
        C18070vi.A0l(r7, r8);
        this.A08 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A06 = r6;
        this.A05 = r7;
        this.A07 = r8;
    }

    public static boolean A01(AnonymousClass00H r0) {
        return ((ChatLockPasscodeManager) r0.get()).A02.A05();
    }
}
