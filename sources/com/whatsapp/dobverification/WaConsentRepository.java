package com.whatsapp.dobverification;

import X.AnonymousClass000;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass190;
import X.AnonymousClass1CM;
import X.AnonymousClass1G0;
import X.AnonymousClass1G3;
import X.AnonymousClass1OB;
import X.AnonymousClass8BA;
import X.C108995ce;
import X.C125846bm;
import X.C130896kB;
import X.C143907Fg;
import X.C143967Fm;
import X.C17880vN;
import X.C18010vc;
import X.C18070vi;
import X.C18600wl;
import X.C19830z4;
import X.C19880zA;
import X.C21468AkZ;
import X.C25681Pe;
import X.C25691Pg;
import X.C25701Ph;
import X.C25711Pi;
import X.C27621Wu;
import X.C30391dr;
import X.C30451dy;
import X.C33841jT;
import X.C62922sD;
import X.C72473Md;
import android.content.Context;
import com.whatsapp.util.Log;

public final class WaConsentRepository extends C25681Pe implements AnonymousClass8BA {
    public final C125846bm A00;
    public final C130896kB A01;
    public final C143907Fg A02;
    public final AnonymousClass1CM A03;
    public final AnonymousClass1G3 A04;
    public final C18600wl A05;
    public final AnonymousClass1G3 A06;
    public final AnonymousClass1G0 A07;
    public final AnonymousClass1G0 A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaConsentRepository(AnonymousClass11P r5, C125846bm r6, C130896kB r7, C143907Fg r8, C18010vc r9, AnonymousClass1CM r10, C18600wl r11) {
        super(r5, r8, r9, r11);
        C18070vi.A0d(r7, 1);
        C72473Md.A1M(r10, r5, r9, 3);
        C18070vi.A0l(r6, r11);
        this.A01 = r7;
        this.A02 = r8;
        this.A03 = r10;
        this.A00 = r6;
        this.A05 = r11;
        C25691Pg r1 = C25691Pg.DROP_OLDEST;
        C25701Ph A012 = C62922sD.A01(r1, 1, 0);
        this.A04 = A012;
        C25701Ph A013 = C62922sD.A01(r1, 1, 0);
        this.A06 = A013;
        this.A07 = new C25711Pi((AnonymousClass1OB) null, A012);
        this.A08 = new C25711Pi((AnonymousClass1OB) null, A013);
    }

    public static final void A01(WaConsentRepository waConsentRepository, String str, int i) {
        waConsentRepository.A04((Long) null);
        if (str != null) {
            C17880vN.A1E(waConsentRepository.A02().edit(), "idv_token", str);
            C17880vN.A1D(C108995ce.A0E(waConsentRepository.A00.A00), "idv_token_refresh_end_time_secs", AnonymousClass11P.A00(waConsentRepository.A00) + 2592000);
        }
        waConsentRepository.A01.A08.A01(i);
    }

    public Object CRm(C30391dr r8, int i, int i2, int i3) {
        return C30451dy.A00(r8, this.A05, new WaConsentRepository$verifyDob$2(this, (C30391dr) null, i, i2, i3));
    }

    public static final void A00(WaConsentRepository waConsentRepository, C143967Fm r13) {
        C130896kB r2 = waConsentRepository.A01;
        String str = r13.A00;
        if (str == null) {
            str = C17880vN.A0r(waConsentRepository.A02(), "registration_login");
        }
        boolean z = r13.A03;
        boolean z2 = r13.A02;
        boolean z3 = r13.A01;
        AnonymousClass10I r3 = r2.A0A;
        Context context = r2.A04.A00;
        AnonymousClass190 r12 = r2.A01;
        AnonymousClass11P r8 = r2.A03;
        AnonymousClass11S r9 = r2.A02;
        C19830z4 r10 = r2.A05;
        Log.i("BackupTokenUtils/updateBackupTokenOnSuccessfullRegistration");
        r3.CGF(new C21468AkZ(r8, r9, r10, context, r12, 27));
        C33841jT r32 = r2.A07;
        r32.A0C.A1d(str);
        r10.A23(z);
        r10.A22(z2);
        r10.A2B(z3);
        C19880zA r1 = r2.A00;
        if (r1.A07()) {
            r1.A03();
            throw AnonymousClass000.A0s("setVNameCertSetInRegistration");
        }
        r32.A05();
        r10.A12();
        r2.A09.A00();
        r2.A06.A00(false, 0);
        C17880vN.A1B(C19830z4.A00(r10), "2fa");
        r2.A08.A01(2);
    }

    public void A06() {
        C17880vN.A1F(C108995ce.A0E(this.A00.A00), "idv_token_refresh_started", true);
        this.A03.A01(33);
    }

    public Object BMf(C30391dr r4) {
        return C30451dy.A00(r4, this.A05, new WaConsentRepository$getAgeVerificationStatus$2(this, (C30391dr) null));
    }

    public Object COA(C30391dr r3) {
        this.A03.A01(32);
        return C27621Wu.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object COM(X.C30391dr r12, int r13, int r14, int r15, int r16) {
        /*
            r11 = this;
            r10 = r16
            boolean r0 = r12 instanceof X.AnonymousClass7UL
            r5 = r11
            if (r0 == 0) goto L_0x0077
            r6 = r12
            X.7UL r6 = (X.AnonymousClass7UL) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0077
            int r2 = r2 - r1
            r6.label = r2
        L_0x0015:
            java.lang.Object r2 = r6.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r6.label
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r0) goto L_0x0039
            if (r1 != r3) goto L_0x007d
            X.C30691eM.A01(r2)
        L_0x0026:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0029:
            X.C30691eM.A01(r2)
            r6.L$0 = r11
            r6.I$0 = r10
            r6.label = r0
            r7 = r13
            r8 = r14
            r9 = r15
            super.COM(r6, r7, r8, r9, r10)
            goto L_0x0042
        L_0x0039:
            int r10 = r6.I$0
            java.lang.Object r5 = r6.L$0
            com.whatsapp.dobverification.WaConsentRepository r5 = (com.whatsapp.dobverification.WaConsentRepository) r5
            X.C30691eM.A01(r2)
        L_0x0042:
            r0 = 13
            if (r10 < r0) goto L_0x006f
            android.content.SharedPreferences r1 = r5.A02()
            java.lang.String r0 = "minted_idv_token"
            r2 = 0
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 == 0) goto L_0x005d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x005d
            r5.A06()
            goto L_0x0026
        L_0x005d:
            r6.L$0 = r2
            r6.label = r3
            X.0wl r1 = r5.A03
            com.whatsapp.dobverification.CommonConsentRepository$mintAppealToken$2 r0 = new com.whatsapp.dobverification.CommonConsentRepository$mintAppealToken$2
            r0.<init>(r5, r2)
            java.lang.Object r0 = X.C30451dy.A00(r6, r1, r0)
            if (r0 != r4) goto L_0x0026
            return r4
        L_0x006f:
            X.1CM r1 = r5.A03
            r0 = 41
            r1.A01(r0)
            goto L_0x0026
        L_0x0077:
            X.7UL r6 = new X.7UL
            r6.<init>(r11, r12)
            goto L_0x0015
        L_0x007d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dobverification.WaConsentRepository.COM(X.1dr, int, int, int, int):java.lang.Object");
    }

    public AnonymousClass1G0 BQm() {
        return this.A07;
    }
}
