package X;

import java.util.List;

/* renamed from: X.0Iu  reason: invalid class name and case insensitive filesystem */
public final class C03570Iu {
    public C15670r0 A00;
    public final AnonymousClass0Q3 A01 = AnonymousClass0MV.A00(0.0f);
    public final C16300s2 A02;
    public final List A03 = AnonymousClass000.A13();
    public final boolean A04;

    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C15670r0 r8, X.AnonymousClass1OX r9) {
        /*
            r7 = this;
            boolean r1 = r8 instanceof X.C05430Ue
            if (r1 != 0) goto L_0x00cc
            boolean r0 = r8 instanceof X.C05470Ui
            if (r0 == 0) goto L_0x009d
            java.util.List r2 = r7.A03
            r0 = r8
            X.0Ui r0 = (X.C05470Ui) r0
            X.0Ue r0 = r0.A00
        L_0x000f:
            r2.remove(r0)
        L_0x0012:
            java.lang.Object r5 = X.C29431cG.A0e(r2)
            X.0r0 r5 = (X.C15670r0) r5
            X.0r0 r0 = r7.A00
            boolean r0 = X.C18070vi.A18(r0, r5)
            if (r0 != 0) goto L_0x0052
            r4 = 0
            if (r5 == 0) goto L_0x0076
            if (r1 == 0) goto L_0x0056
            X.0s2 r0 = r7.A02
            java.lang.Object r0 = r0.getValue()
            X.0K3 r0 = (X.AnonymousClass0K3) r0
            float r6 = r0.A02
        L_0x002f:
            X.0Tx r0 = X.C04020Ln.A00
            boolean r0 = r5 instanceof X.C05430Ue
            if (r0 != 0) goto L_0x0053
            boolean r0 = r5 instanceof X.C05420Ud
            if (r0 != 0) goto L_0x003d
            boolean r0 = r5 instanceof X.C05410Uc
            if (r0 == 0) goto L_0x0053
        L_0x003d:
            X.0ra r2 = X.C02980Gd.A02
            r1 = 45
            r0 = 0
            X.0Tx r3 = new X.0Tx
            r3.<init>(r2, r1, r0)
        L_0x0047:
            androidx.compose.material.ripple.StateLayer$handleInteraction$1 r1 = new androidx.compose.material.ripple.StateLayer$handleInteraction$1
            r1.<init>(r3, r7, r4, r6)
            r0 = 3
            X.AnonymousClass4Z4.A02(r4, r4, r1, r9, r0)
        L_0x0050:
            r7.A00 = r5
        L_0x0052:
            return
        L_0x0053:
            X.0Tx r3 = X.C04020Ln.A00
            goto L_0x0047
        L_0x0056:
            boolean r0 = r8 instanceof X.C05420Ud
            if (r0 == 0) goto L_0x0065
            X.0s2 r0 = r7.A02
            java.lang.Object r0 = r0.getValue()
            X.0K3 r0 = (X.AnonymousClass0K3) r0
            float r6 = r0.A01
            goto L_0x002f
        L_0x0065:
            boolean r0 = r8 instanceof X.C05410Uc
            if (r0 == 0) goto L_0x0074
            X.0s2 r0 = r7.A02
            java.lang.Object r0 = r0.getValue()
            X.0K3 r0 = (X.AnonymousClass0K3) r0
            float r6 = r0.A00
            goto L_0x002f
        L_0x0074:
            r6 = 0
            goto L_0x002f
        L_0x0076:
            X.0r0 r1 = r7.A00
            X.0Tx r0 = X.C04020Ln.A00
            boolean r0 = r1 instanceof X.C05430Ue
            if (r0 != 0) goto L_0x009a
            boolean r0 = r1 instanceof X.C05420Ud
            if (r0 != 0) goto L_0x009a
            boolean r0 = r1 instanceof X.C05410Uc
            if (r0 == 0) goto L_0x009a
            X.0ra r2 = X.C02980Gd.A02
            r1 = 150(0x96, float:2.1E-43)
            r0 = 0
            X.0Tx r3 = new X.0Tx
            r3.<init>(r2, r1, r0)
        L_0x0090:
            androidx.compose.material.ripple.StateLayer$handleInteraction$2 r1 = new androidx.compose.material.ripple.StateLayer$handleInteraction$2
            r1.<init>(r3, r7, r4)
            r0 = 3
            X.AnonymousClass4Z4.A02(r4, r4, r1, r9, r0)
            goto L_0x0050
        L_0x009a:
            X.0Tx r3 = X.C04020Ln.A00
            goto L_0x0090
        L_0x009d:
            boolean r0 = r8 instanceof X.C05420Ud
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r8 instanceof X.C05460Uh
            if (r0 == 0) goto L_0x00ae
            java.util.List r2 = r7.A03
            r0 = r8
            X.0Uh r0 = (X.C05460Uh) r0
            X.0Ud r0 = r0.A00
            goto L_0x000f
        L_0x00ae:
            boolean r0 = r8 instanceof X.C05410Uc
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r8 instanceof X.C05450Ug
            if (r0 == 0) goto L_0x00bf
            java.util.List r2 = r7.A03
            r0 = r8
            X.0Ug r0 = (X.C05450Ug) r0
            X.0Uc r0 = r0.A00
            goto L_0x000f
        L_0x00bf:
            boolean r0 = r8 instanceof X.C05440Uf
            if (r0 == 0) goto L_0x0052
            java.util.List r2 = r7.A03
            r0 = r8
            X.0Uf r0 = (X.C05440Uf) r0
            X.0Uc r0 = r0.A00
            goto L_0x000f
        L_0x00cc:
            java.util.List r2 = r7.A03
            r2.add(r8)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03570Iu.A00(X.0r0, X.1OX):void");
    }

    public final void A01(C17770vC r18, float f, long j) {
        float CPQ;
        float f2 = f;
        C17770vC r9 = r18;
        if (Float.isNaN(f2)) {
            CPQ = AnonymousClass0E9.A00(r9, r9.BZL(), this.A04);
        } else {
            CPQ = r9.CPQ(f2);
        }
        float A05 = AnonymousClass001.A05(this.A01.A04.A05);
        if (A05 > 0.0f) {
            long A052 = AnonymousClass0Oy.A03(AnonymousClass001.A11(j), C05100Qk.A04(j), C05100Qk.A03(j), C05100Qk.A02(j), A05);
            if (this.A04) {
                long BZL = r9.BZL();
                float A022 = AnonymousClass0QG.A02(BZL);
                float A002 = AnonymousClass0QG.A00(BZL);
                AnonymousClass0t6 BQs = r9.BQs();
                long BZL2 = BQs.BZL();
                AnonymousClass0WZ.A00(BQs).BF0(0.0f, 0.0f, A022, A002, 1);
                C04820Pb.A04(r9, (C02000Cg) null, CPQ, 124, A052, 0);
                AnonymousClass001.A1P(BQs, BZL2);
                return;
            }
            C04820Pb.A04(r9, (C02000Cg) null, CPQ, 124, A052, 0);
        }
    }

    public C03570Iu(C16300s2 r2, boolean z) {
        this.A04 = z;
        this.A02 = r2;
    }
}
