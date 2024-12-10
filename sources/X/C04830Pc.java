package X;

/* renamed from: X.0Pc  reason: invalid class name and case insensitive filesystem */
public abstract class C04830Pc {
    public static void A03(AnonymousClass0AA r1) {
        r1.A0C = true;
        r1.A03();
    }

    public static final C017009n A02(AnonymousClass0AA r11, AnonymousClass0NK r12, C28644ECa eCa) {
        AnonymousClass09Z r9;
        long A00 = A00(eCa, r12.A01, r12.A00);
        float f = r12.A03;
        float f2 = r12.A02;
        if (Float.isNaN(f)) {
            f = AnonymousClass0QG.A02(A00);
        }
        if (Float.isNaN(f2)) {
            f2 = AnonymousClass0QG.A00(A00);
        }
        long A0p = AnonymousClass001.A0p(f, f2);
        long j = AnonymousClass0QG.A02;
        C017009n r6 = new C017009n(r11);
        long j2 = r12.A06;
        int i = r12.A05;
        if (j2 != C05100Qk.A05) {
            r9 = new AnonymousClass09Z(j2, i);
        } else {
            r9 = null;
        }
        boolean z = r12.A08;
        r6.A05.setValue(new AnonymousClass0QG(A00));
        AnonymousClass000.A1C(r6.A04, z);
        AnonymousClass0A8 r4 = r6.A06;
        r4.A07.setValue(r9);
        r4.A08.setValue(new AnonymousClass0QG(A0p));
        r4.A02 = "";
        return r6;
    }

    public static final long A00(C28644ECa eCa, float f, float f2) {
        long A0p = AnonymousClass001.A0p(eCa.CPQ(f), eCa.CPQ(f2));
        long j = AnonymousClass0QG.A02;
        return A0p;
    }

    public static final C017009n A01(C17130tn r3, AnonymousClass0NK r4) {
        r3.COB(1413834416);
        C28644ECa eCa = (C28644ECa) r3.BFh(AnonymousClass0OD.A01);
        boolean A1Y = AnonymousClass001.A1Y(r3, Integer.valueOf(r4.A04), eCa);
        Object CER = r3.CER();
        if (A1Y || CER == AnonymousClass0MH.A00) {
            AnonymousClass0AA r1 = new AnonymousClass0AA();
            A04(r1, r4.A00());
            CER = A02(r1, r4, eCa);
            r3.CRH(CER);
        }
        AnonymousClass0VR r32 = (AnonymousClass0VR) r3;
        AnonymousClass0VR.A0R(r32, false);
        C017009n r12 = (C017009n) CER;
        AnonymousClass0VR.A0R(r32, false);
        return r12;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.0AA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.0A9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.0AA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.0AA} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.AnonymousClass0AA r8, X.AnonymousClass0AC r9) {
        /*
            int r3 = r9.A08()
            r2 = 0
        L_0x0005:
            if (r2 >= r3) goto L_0x00fe
            X.0Ch r1 = r9.A09(r2)
            boolean r0 = r1 instanceof X.AnonymousClass0AB
            if (r0 == 0) goto L_0x009b
            X.0A9 r4 = new X.0A9
            r4.<init>()
            X.0AB r1 = (X.AnonymousClass0AB) r1
            java.util.List r0 = r1.A0D
            r4.A0C = r0
            r0 = 1
            r4.A0D = r0
            r4.A03()
            int r7 = r1.A07
            X.0te r0 = r4.A0B
            X.0WS r0 = (X.AnonymousClass0WS) r0
            android.graphics.Path r6 = r0.A03
            r5 = 1
            if (r7 != r5) goto L_0x0098
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x002d:
            r6.setFillType(r0)
            r4.A03()
            r4.A03()
            X.0Hv r0 = r1.A0A
            r4.A09 = r0
            r4.A03()
            float r0 = r1.A00
            r4.A00 = r0
            r4.A03()
            X.0Hv r0 = r1.A0B
            r4.A0A = r0
            r4.A03()
            float r0 = r1.A01
            r4.A01 = r0
            r4.A03()
            float r0 = r1.A03
            r4.A03 = r0
            r4.A0E = r5
            r4.A03()
            int r0 = r1.A08
            r4.A07 = r0
            r4.A0E = r5
            r4.A03()
            int r0 = r1.A09
            r4.A08 = r0
            r4.A0E = r5
            r4.A03()
            float r0 = r1.A02
            r4.A02 = r0
            r4.A0E = r5
            r4.A03()
            float r0 = r1.A06
            r4.A06 = r0
            r4.A0F = r5
            r4.A03()
            float r0 = r1.A04
            r4.A04 = r0
            r4.A0F = r5
            r4.A03()
            float r0 = r1.A05
            r4.A05 = r0
            r4.A0F = r5
            r4.A03()
        L_0x0091:
            r8.A07(r4, r2)
        L_0x0094:
            int r2 = r2 + 1
            goto L_0x0005
        L_0x0098:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x002d
        L_0x009b:
            boolean r0 = r1 instanceof X.AnonymousClass0AC
            if (r0 == 0) goto L_0x0094
            X.0AA r4 = new X.0AA
            r4.<init>()
            X.0AC r1 = (X.AnonymousClass0AC) r1
            java.lang.String r0 = r1.A0A()
            r4.A09 = r0
            r4.A03()
            float r0 = r1.A03()
            r4.A02 = r0
            A03(r4)
            float r0 = r1.A04()
            r4.A03 = r0
            A03(r4)
            float r0 = r1.A05()
            r4.A04 = r0
            A03(r4)
            float r0 = r1.A06()
            r4.A05 = r0
            A03(r4)
            float r0 = r1.A07()
            r4.A06 = r0
            A03(r4)
            float r0 = r1.A01()
            r4.A00 = r0
            A03(r4)
            float r0 = r1.A02()
            r4.A01 = r0
            A03(r4)
            java.util.List r0 = r1.A0B()
            r4.A0A = r0
            r0 = 1
            r4.A0B = r0
            r4.A03()
            A04(r4, r1)
            goto L_0x0091
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04830Pc.A04(X.0AA, X.0AC):void");
    }
}
