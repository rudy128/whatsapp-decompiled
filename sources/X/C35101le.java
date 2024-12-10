package X;

import java.util.Set;

/* renamed from: X.1le  reason: invalid class name and case insensitive filesystem */
public final class C35101le {
    public final C34871lD A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public C35101le(AnonymousClass11S r2, C34871lD r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r7, 4);
        C18070vi.A0d(r8, 5);
        C18070vi.A0d(r3, 6);
        C18070vi.A0d(r2, 7);
        this.A05 = r4;
        this.A01 = r5;
        this.A03 = r6;
        this.A02 = r7;
        this.A06 = r8;
        this.A00 = r3;
        this.A04 = r2;
    }

    public final boolean A01(C35131lh r5) {
        Set set;
        String str;
        if (this.A04.A0N()) {
            if (r5.isEnabledForCompanions) {
                if (C18020vd.A05(C18040vf.A02, ((C26311Rq) this.A02.get()).A00, 9171)) {
                    C34911lH r1 = (C34911lH) this.A06.get();
                    C18070vi.A0d(C35021lW.A09, 0);
                    C34911lH.A00(r1);
                    C33631j8 r0 = (C33631j8) r1.A00.get();
                    r0.A06();
                    set = r0.A00;
                    if (set != null) {
                        str = "waffle_companion";
                    }
                    return false;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Wfal feature: ");
            sb.append(r5);
            sb.append(" is not enabled on companions");
            C17960vV.A0F(false, sb.toString());
            return false;
        }
        C33631j8 r02 = (C33631j8) ((C34991lS) this.A05.get()).A00.get();
        r02.A06();
        set = r02.A00;
        if (set != null) {
            str = "waffle";
        }
        return false;
        if (!set.contains(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.C35131lh r4) {
        /*
            r3 = this;
            X.11S r0 = r3.A04
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x003e
            boolean r0 = r4.isEnabledForCompanions
            if (r0 == 0) goto L_0x007c
            X.00H r0 = r3.A02
            java.lang.Object r0 = r0.get()
            X.1Rq r0 = (X.C26311Rq) r0
            X.0ve r2 = r0.A00
            r1 = 9171(0x23d3, float:1.2851E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x007c
            X.1lD r0 = r3.A00
            X.0vl r0 = r0.A02
            java.lang.Object r2 = r0.getValue()
            X.C18070vi.A0X(r2)
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "is_wfal_paused"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x007a
            boolean r0 = r3.A01(r4)
            if (r0 == 0) goto L_0x0096
        L_0x003c:
            r1 = 2
        L_0x003d:
            return r1
        L_0x003e:
            boolean r0 = r3.A01(r4)
            if (r0 == 0) goto L_0x0096
            X.00H r0 = r3.A03
            java.lang.Object r0 = r0.get()
            com.whatsapp.bridge.wfal.WfalManager r0 = (com.whatsapp.bridge.wfal.WfalManager) r0
            X.00H r0 = r0.A04
            java.lang.Object r0 = r0.get()
            X.1lN r0 = (X.C34951lN) r0
            java.lang.Boolean r1 = r0.A05()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x007a
            X.00H r0 = r3.A01
            java.lang.Object r0 = r0.get()
            X.1lZ r0 = (X.C35051lZ) r0
            android.content.SharedPreferences r2 = X.C35051lZ.A00(r0)
            java.lang.String r1 = "is_wfal_link_active"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            r1 = 1
            if (r0 == 0) goto L_0x003d
            goto L_0x003c
        L_0x007a:
            r1 = 3
            return r1
        L_0x007c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Wfal feature: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " is not enabled on companions"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 0
            X.C17960vV.A0F(r0, r1)
        L_0x0096:
            r1 = 4
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35101le.A00(X.1lh):int");
    }
}
