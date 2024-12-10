package com.whatsapp.dobverification;

import X.AnonymousClass11P;
import X.AnonymousClass1G0;
import X.AnonymousClass1G3;
import X.AnonymousClass1OB;
import X.AnonymousClass3EW;
import X.C122496Qp;
import X.C143937Fj;
import X.C143977Fn;
import X.C143987Fo;
import X.C1595584z;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18110vm;
import X.C18600wl;
import X.C25651Pb;
import X.C25661Pc;
import X.C25671Pd;
import X.C25681Pe;
import X.C25691Pg;
import X.C25701Ph;
import X.C25711Pi;
import X.C27621Wu;
import X.C30391dr;
import X.C30451dy;
import X.C31751g4;
import X.C71023Dm;

public final class DosaRepository extends C25681Pe implements C25671Pd {
    public boolean A00;
    public boolean A01;
    public final C25651Pb A02;
    public final C25661Pc A03;
    public final C18030ve A04;
    public final C18100vl A05 = new C18110vm(new C71023Dm(this, 38));
    public final C18100vl A06 = new C18110vm(new C71023Dm(this, 39));
    public final C18600wl A07;
    public final AnonymousClass1G3 A08;
    public final AnonymousClass1G0 A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DosaRepository(AnonymousClass11P r5, C25651Pb r6, C25661Pc r7, C18030ve r8, C18010vc r9, C18600wl r10) {
        super(r5, r6, r9, r10);
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r9, 2);
        C18070vi.A0d(r8, 3);
        C18070vi.A0d(r10, 5);
        C18070vi.A0d(r7, 6);
        this.A04 = r8;
        this.A02 = r6;
        this.A07 = r10;
        this.A03 = r7;
        C25701Ph r2 = new C25701Ph(C25691Pg.DROP_OLDEST, 1, 1);
        this.A08 = r2;
        this.A09 = new C25711Pi((AnonymousClass1OB) null, r2);
    }

    public Object A07(C122496Qp r5, C30391dr r6) {
        Object obj;
        this.A01 = false;
        AnonymousClass1G3 r3 = (AnonymousClass1G3) this.A05.getValue();
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            obj = C143987Fo.A00;
        } else if (ordinal == 2) {
            obj = new C143937Fj(A02().getString("idv_token", (String) null));
        } else if (ordinal == 1) {
            super.A05("");
            A02().edit().putBoolean("remediation_prevented", true).apply();
            this.A00 = true;
            obj = C143977Fn.A00;
        } else {
            throw new AnonymousClass3EW();
        }
        Object BJt = r3.BJt(obj, r6);
        if (BJt != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        }
        return BJt;
    }

    public Object CRm(C30391dr r8, int i, int i2, int i3) {
        return C30451dy.A00(r8, this.A07, new DosaRepository$verifyDob$2(this, (C30391dr) null, i, i2, i3));
    }

    public static final void A00(DosaRepository dosaRepository, C1595584z r4) {
        String str;
        if ((r4 instanceof C143937Fj) && (str = ((C143937Fj) r4).A00) != null) {
            dosaRepository.A02().edit().putString("idv_token", str).apply();
        }
        dosaRepository.A04((Long) null);
    }

    public Object A08(String str, long j, C30391dr r8) {
        if (!this.A00) {
            boolean z = A02().getBoolean("remediation_prevented", false);
            this.A00 = z;
            if (!z) {
                super.A05(str);
            }
        }
        if (j > 0) {
            A04(new Long((System.currentTimeMillis() + (j * 1000)) - 604800000));
        }
        if (!this.A01) {
            AnonymousClass1G3 r1 = (AnonymousClass1G3) this.A05.getValue();
            if (this.A00) {
                str = null;
            }
            Object BJt = r1.BJt(new C143937Fj(str), r8);
            if (BJt == C31751g4.COROUTINE_SUSPENDED) {
                return BJt;
            }
        }
        return C27621Wu.A00;
    }

    public Object BMf(C30391dr r4) {
        return C30451dy.A00(r4, this.A07, new DosaRepository$getAgeVerificationStatus$2(this, (C30391dr) null));
    }

    public /* bridge */ /* synthetic */ AnonymousClass1G0 BQm() {
        return (AnonymousClass1G0) this.A06.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (X.C30451dy.A00(r6, r3.A03, new com.whatsapp.dobverification.CommonConsentRepository$mintAppealToken$2(r3, (X.C30391dr) null)) != r5) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object COA(X.C30391dr r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.AnonymousClass3FG
            if (r0 == 0) goto L_0x005b
            r6 = r8
            X.3FG r6 = (X.AnonymousClass3FG) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005b
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r2) goto L_0x0041
            if (r0 != r4) goto L_0x0061
            X.C30691eM.A01(r1)
        L_0x0023:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0026:
            X.C30691eM.A01(r1)
            r7.A01 = r2
            X.0vl r0 = r7.A05
            java.lang.Object r1 = r0.getValue()
            X.1G3 r1 = (X.AnonymousClass1G3) r1
            X.7Fx r0 = X.C144077Fx.A00
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r0 = r1.BJt(r0, r6)
            if (r0 == r5) goto L_0x005a
            r3 = r7
            goto L_0x0048
        L_0x0041:
            java.lang.Object r3 = r6.L$0
            X.1Pe r3 = (X.C25681Pe) r3
            X.C30691eM.A01(r1)
        L_0x0048:
            r2 = 0
            r6.L$0 = r2
            r6.label = r4
            X.0wl r1 = r3.A03
            com.whatsapp.dobverification.CommonConsentRepository$mintAppealToken$2 r0 = new com.whatsapp.dobverification.CommonConsentRepository$mintAppealToken$2
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.C30451dy.A00(r6, r1, r0)
            if (r0 != r5) goto L_0x0023
        L_0x005a:
            return r5
        L_0x005b:
            X.3FG r6 = new X.3FG
            r6.<init>(r7, r8)
            goto L_0x0012
        L_0x0061:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dobverification.DosaRepository.COA(X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object COM(X.C30391dr r13, int r14, int r15, int r16, int r17) {
        /*
            r12 = this;
            r11 = r17
            boolean r0 = r13 instanceof X.AnonymousClass3FO
            r6 = r12
            if (r0 == 0) goto L_0x009c
            r7 = r13
            X.3FO r7 = (X.AnonymousClass3FO) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009c
            int r2 = r2 - r1
            r7.label = r2
        L_0x0015:
            java.lang.Object r4 = r7.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r7.label
            r5 = 3
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r0) goto L_0x0048
            if (r1 == r2) goto L_0x0033
            if (r1 != r5) goto L_0x00a3
            java.lang.Object r6 = r7.L$0
            com.whatsapp.dobverification.DosaRepository r6 = (com.whatsapp.dobverification.DosaRepository) r6
            X.C30691eM.A01(r4)
        L_0x002d:
            r0 = 0
            r6.A01 = r0
        L_0x0030:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0033:
            X.C30691eM.A01(r4)
            goto L_0x0030
        L_0x0037:
            X.C30691eM.A01(r4)
            r7.L$0 = r12
            r7.I$0 = r11
            r7.label = r0
            r8 = r14
            r9 = r15
            r10 = r16
            super.COM(r7, r8, r9, r10, r11)
            goto L_0x0051
        L_0x0048:
            int r11 = r7.I$0
            java.lang.Object r6 = r7.L$0
            com.whatsapp.dobverification.DosaRepository r6 = (com.whatsapp.dobverification.DosaRepository) r6
            X.C30691eM.A01(r4)
        L_0x0051:
            r0 = 13
            r4 = 0
            if (r11 < r0) goto L_0x006b
            X.0vl r0 = r6.A05
            java.lang.Object r1 = r0.getValue()
            X.1G3 r1 = (X.AnonymousClass1G3) r1
            X.7Fy r0 = X.C144087Fy.A00
            r7.L$0 = r4
            r7.label = r2
            java.lang.Object r0 = r1.BJt(r0, r7)
            if (r0 != r3) goto L_0x0030
            return r3
        L_0x006b:
            java.lang.String r0 = ""
            super.A05(r0)
            android.content.SharedPreferences r0 = r6.A02()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r0 = "remediation_prevented"
            r1 = 1
            android.content.SharedPreferences$Editor r0 = r2.putBoolean(r0, r1)
            r0.apply()
            r6.A00 = r1
            X.0vl r0 = r6.A05
            java.lang.Object r1 = r0.getValue()
            X.1G3 r1 = (X.AnonymousClass1G3) r1
            X.7Fj r0 = new X.7Fj
            r0.<init>(r4)
            r7.L$0 = r6
            r7.label = r5
            java.lang.Object r0 = r1.BJt(r0, r7)
            if (r0 != r3) goto L_0x002d
            return r3
        L_0x009c:
            X.3FO r7 = new X.3FO
            r7.<init>(r12, r13)
            goto L_0x0015
        L_0x00a3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dobverification.DosaRepository.COM(X.1dr, int, int, int, int):java.lang.Object");
    }
}
