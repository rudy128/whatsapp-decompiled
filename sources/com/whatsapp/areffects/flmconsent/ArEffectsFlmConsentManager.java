package com.whatsapp.areffects.flmconsent;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1G4;
import X.C17900vP;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C37291pH;
import X.C72453Mb;
import X.C97134oy;
import com.whatsapp.util.Log;

public final class ArEffectsFlmConsentManager {
    public boolean A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18100vl A05;
    public final C18600wl A06;
    public final AnonymousClass1G4 A07;
    public final C18600wl A08;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (r0 != r2) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(android.content.Context r14, X.C108195bI r15, X.C30391dr r16) {
        /*
            r13 = this;
            r4 = r16
            r7 = r14
            r9 = r15
            boolean r0 = r4 instanceof X.C100864vC
            if (r0 == 0) goto L_0x002d
            r3 = r4
            X.4vC r3 = (X.C100864vC) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r3.label = r2
        L_0x0016:
            java.lang.Object r6 = r3.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r1 = 3
            r5 = 2
            r4 = 1
            r12 = 0
            if (r0 == 0) goto L_0x004b
            if (r0 == r4) goto L_0x00e1
            if (r0 == r5) goto L_0x0033
            if (r0 == r1) goto L_0x00e1
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002d:
            X.4vC r3 = new X.4vC
            r3.<init>(r13, r4)
            goto L_0x0016
        L_0x0033:
            java.lang.Object r11 = r3.L$4
            X.1pH r11 = (X.C37291pH) r11
            java.lang.Object r8 = r3.L$3
            X.4oy r8 = (X.C97134oy) r8
            java.lang.Object r9 = r3.L$2
            X.5bI r9 = (X.C108195bI) r9
            java.lang.Object r7 = r3.L$1
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r10 = r3.L$0
            com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager r10 = (com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager) r10
            X.C30691eM.A01(r6)
            goto L_0x00bb
        L_0x004b:
            X.C30691eM.A01(r6)
            X.00H r0 = r13.A02
            java.lang.Object r8 = r0.get()
            X.4oy r8 = (X.C97134oy) r8
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ArEffectsFlmConsentManager/maybeShowFlmConsentBottomSheet Disclosure ID: "
            r6.append(r0)
            X.0vl r0 = r8.A01
            int r0 = X.C72453Mb.A0I(r0)
            X.C17900vP.A0o(r6, r0)
            X.0vl r0 = r8.A03
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x0080
            X.0wl r1 = r13.A08
            com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$2 r0 = new com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$2
            r0.<init>(r15, r12)
            r3.label = r4
            java.lang.Object r0 = X.C30451dy.A00(r3, r1, r0)
        L_0x007d:
            if (r0 != r2) goto L_0x00e4
        L_0x007f:
            return r2
        L_0x0080:
            X.1G4 r0 = r13.A07
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x0090
            r15.Bzd()
            goto L_0x00e4
        L_0x0090:
            X.00H r0 = r13.A04
            java.lang.Object r11 = r0.get()
            X.1pH r11 = (X.C37291pH) r11
            boolean r0 = r13.A00
            if (r0 != 0) goto L_0x00df
            java.lang.String r0 = "ArEffectsFlmConsentManager/maybeShowFlmConsentBottomSheet Registering disclosure"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wl r4 = r13.A06
            com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$3 r0 = new com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$3
            r0.<init>(r8, r13, r11, r12)
            r3.L$0 = r13
            r3.L$1 = r14
            r3.L$2 = r15
            r3.L$3 = r8
            r3.L$4 = r11
            r3.label = r5
            java.lang.Object r0 = X.C30451dy.A00(r3, r4, r0)
            if (r0 == r2) goto L_0x007f
            r10 = r13
        L_0x00bb:
            X.0vl r0 = r8.A01
            int r0 = X.C72453Mb.A0I(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.AnonymousClass71X.A02 = r0
            X.0wl r0 = r10.A08
            com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$4 r6 = new com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager$maybeShowFlmConsentBottomSheet$4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r3.L$0 = r12
            r3.L$1 = r12
            r3.L$2 = r12
            r3.L$3 = r12
            r3.L$4 = r12
            r3.label = r1
            java.lang.Object r0 = X.C30451dy.A00(r3, r0, r6)
            goto L_0x007d
        L_0x00df:
            r10 = r13
            goto L_0x00bb
        L_0x00e1:
            X.C30691eM.A01(r6)
        L_0x00e4:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager.A00(android.content.Context, X.5bI, X.1dr):java.lang.Object");
    }

    public final void A01() {
        C97134oy r3 = (C97134oy) this.A02.get();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectsFlmConsentManager/preloadFlmConsentBottomSheet Disclosure ID: ");
        C18100vl r2 = r3.A01;
        C17900vP.A0o(A10, C72453Mb.A0I(r2));
        if (C72453Mb.A1a(r3.A03)) {
            C37291pH r1 = (C37291pH) this.A04.get();
            if (!this.A00) {
                Log.i("ArEffectsFlmConsentManager/preloadFlmConsentBottomSheet Registering disclosure");
                r1.A04(r3.CEA());
                this.A00 = true;
            }
            r1.A03(C18070vi.A0M(Integer.valueOf(C72453Mb.A0I(r2))));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        if (((X.C37291pH) r5.get()).A01.A0A(X.C72453Mb.A0I(r1.A01)) == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ArEffectsFlmConsentManager(X.C18030ve r4, X.AnonymousClass00H r5, X.AnonymousClass00H r6, X.AnonymousClass00H r7, X.C18600wl r8, X.C18600wl r9) {
        /*
            r3 = this;
            X.C18070vi.A0w(r4, r5, r6, r7, r8)
            r0 = 6
            X.C18070vi.A0d(r9, r0)
            r3.<init>()
            r3.A01 = r4
            r3.A04 = r5
            r3.A03 = r6
            r3.A02 = r7
            r3.A08 = r8
            r3.A06 = r9
            java.lang.Object r1 = r7.get()
            X.4oy r1 = (X.C97134oy) r1
            X.0vl r0 = r1.A03
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.Object r2 = r5.get()
            X.1pH r2 = (X.C37291pH) r2
            X.0vl r0 = r1.A01
            int r1 = X.C72453Mb.A0I(r0)
            X.1iv r0 = r2.A01
            boolean r1 = r0.A0A(r1)
            r0 = 1
            if (r1 != 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.1G7 r0 = X.C34071js.A00(r0)
            r3.A07 = r0
            java.lang.Integer r1 = X.C87484Vt.A00(r4)
            r0 = 9
            X.0vl r0 = X.C99144sL.A00(r1, r3, r0)
            r3.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager.<init>(X.0ve, X.00H, X.00H, X.00H, X.0wl, X.0wl):void");
    }
}
