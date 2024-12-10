package com.whatsapp.areffects.arclass;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass191;
import X.AnonymousClass1OX;
import X.AnonymousClass3MX;
import X.C17890vO;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C87484Vt;
import X.C99144sL;

public final class ArClassManager implements AnonymousClass191 {
    public int A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final C18100vl A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass1OX A06;

    public /* synthetic */ void Blg() {
    }

    public final int A00() {
        int A002 = C18020vd.A00(C18040vf.A02, this.A01, 10907);
        if ((A002 >= 0 && A002 > 0) || (A002 = this.A00) > 0 || (A002 = C17890vO.A00(C18070vi.A03(this.A03), "pref_key_ar_class")) <= 0) {
            return A002;
        }
        C17900vP.A0j("ArClassManager/getArClass AR class retrieved from cache: ", AnonymousClass000.A10(), A002);
        this.A00 = A002;
        return A002;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C30391dr r8, X.C18600wl r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C100134u1
            if (r0 == 0) goto L_0x009b
            r5 = r8
            X.4u1 r5 = (X.C100134u1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009b
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L_0x0077
            if (r0 != r4) goto L_0x00a7
            java.lang.Object r3 = r5.L$0
            com.whatsapp.areffects.arclass.ArClassManager r3 = (com.whatsapp.areffects.arclass.ArClassManager) r3
            X.C30691eM.A01(r1)
        L_0x0024:
            X.4E3 r1 = (X.AnonymousClass4E3) r1
            boolean r0 = r1 instanceof X.C75463hZ
            if (r0 == 0) goto L_0x0043
            X.3hZ r1 = (X.C75463hZ) r1
            long r0 = r1.A00
            int r2 = (int) r0
            r3.A00 = r2
            X.0vl r0 = r3.A03
            android.content.SharedPreferences r0 = X.C18070vi.A03(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_key_ar_class"
            X.C17880vN.A1C(r1, r0, r2)
        L_0x0040:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0043:
            boolean r0 = r1 instanceof X.C75473ha
            java.lang.String r6 = "ArClassManager/refreshArClass/onResult"
            if (r0 == 0) goto L_0x0068
            X.3ha r1 = (X.C75473ha) r1
            java.lang.String r5 = r1.A01
            X.00H r0 = r3.A05
            java.lang.Object r3 = r0.get()
            X.190 r3 = (X.AnonymousClass190) r3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            long r0 = r1.A00
            r2.append(r0)
            r0 = 47
            java.lang.String r0 = X.C17890vO.A0Z(r5, r2, r0)
        L_0x0064:
            r3.A0G(r6, r0, r4)
            goto L_0x0040
        L_0x0068:
            boolean r0 = r1 instanceof X.C75483hb
            if (r0 == 0) goto L_0x00a2
            X.00H r0 = r3.A05
            java.lang.Object r3 = r0.get()
            X.190 r3 = (X.AnonymousClass190) r3
            java.lang.String r0 = "DeliveryFailure"
            goto L_0x0064
        L_0x0077:
            X.C30691eM.A01(r1)
            int r0 = r7.A00()
            if (r0 > 0) goto L_0x0040
            X.00H r0 = r7.A04
            java.lang.Object r2 = r0.get()
            X.4Kb r2 = (X.C84584Kb) r2
            r5.L$0 = r7
            r5.label = r4
            r1 = 0
            com.whatsapp.areffects.arclass.ArClassProtocolApi$getArClass$2 r0 = new com.whatsapp.areffects.arclass.ArClassProtocolApi$getArClass$2
            r0.<init>(r2, r1)
            java.lang.Object r1 = X.C30451dy.A00(r5, r9, r0)
            if (r1 != r3) goto L_0x0099
            return r3
        L_0x0099:
            r3 = r7
            goto L_0x0024
        L_0x009b:
            X.4u1 r5 = new X.4u1
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x00a2:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.arclass.ArClassManager.A01(X.1dr, X.0wl):java.lang.Object");
    }

    public void Ba9() {
    }

    public void Blf() {
        if (C18020vd.A05(C18040vf.A02, this.A01, 9137)) {
            AnonymousClass3MX.A1Q(new ArClassManager$onAsyncInitAnyUserState$1(this, (C30391dr) null), this.A06);
        }
    }

    public ArClassManager(C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass1OX r7) {
        C18070vi.A0w(r3, r4, r5, r7, r6);
        this.A01 = r3;
        this.A05 = r4;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r6;
        this.A03 = C99144sL.A00(C87484Vt.A00(r3), this, 2);
    }
}
