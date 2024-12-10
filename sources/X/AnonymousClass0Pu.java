package X;

import androidx.compose.ui.graphics.BlockGraphicsLayerElement;

/* renamed from: X.0Pu  reason: invalid class name */
public abstract class AnonymousClass0Pu {
    public static final AnonymousClass07W A00 = AnonymousClass0PZ.A00(AnonymousClass0Q9.A06(), C08940fu.A00);

    public static final C17090tj A01(C17090tj r9, C16370s9 r10, float f, long j, long j2) {
        float f2 = f;
        if (Float.compare(f, 0.0f) <= 0) {
            return r9;
        }
        return AnonymousClass0O1.A00(r9, A02(C17090tj.A00, new C11480k6(r10, f2, j, j2)), AnonymousClass0O1.A01());
    }

    public static final void A04(AnonymousClass0JY r13, C17130tn r14, C17090tj r15, C16370s9 r16, AnonymousClass1OS r17, float f, float f2, int i, int i2, long j, long j2) {
        AnonymousClass0JY r5 = r13;
        float f3 = f2;
        long j3 = j2;
        long j4 = j;
        C16370s9 r7 = r16;
        C17090tj r6 = r15;
        r14.COB(-513881741);
        if ((i2 & 1) != 0) {
            r6 = C17090tj.A00;
        }
        if ((i2 & 2) != 0) {
            r7 = AnonymousClass0GC.A00;
        }
        if ((i2 & 4) != 0) {
            j4 = AnonymousClass000.A0V(((AnonymousClass0OR) r14.BFh(AnonymousClass0QB.A00)).A0O);
        }
        if ((i2 & 8) != 0) {
            j3 = AnonymousClass0QB.A04(r14, j4);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            r5 = null;
        }
        AnonymousClass07W r4 = A00;
        float A02 = ((DSH) r14.BFh(r4)).A02() + f;
        C03230Hd[] r2 = new C03230Hd[2];
        AnonymousClass0OI.A01(AnonymousClass0G4.A00, r2, j3);
        r2[1] = r4.A03(DSH.A00(A02));
        AnonymousClass0PZ.A04(r14, AnonymousClass0LC.A00(r14, new C13630ni(r5, r6, r7, r17, A02, f3, i, j4), -70914509), r2, 56);
        AnonymousClass0VR.A0T(r14);
    }

    public static final C17090tj A02(C17090tj r1, C22821Di r2) {
        return r1.CP5(new BlockGraphicsLayerElement(r2));
    }

    public static final long A00(C17130tn r4, float f, long j) {
        r4.COB(-2079918090);
        AnonymousClass07W r3 = AnonymousClass0QB.A00;
        long A0V = AnonymousClass000.A0V(((AnonymousClass0OR) r4.BFh(r3)).A0O);
        C02540Ek r0 = C05100Qk.A06;
        if (j == A0V) {
            j = AnonymousClass0QB.A00((AnonymousClass0OR) r4.BFh(r3), f);
        }
        AnonymousClass0VR.A0T(r4);
        return j;
    }

    public static final void A03(AnonymousClass0JY r20, C17210uI r21, C17130tn r22, C17090tj r23, C16370s9 r24, C18090vk r25, AnonymousClass1OS r26, float f, float f2, int i, int i2, long j, long j2, boolean z) {
        C17210uI r11 = r21;
        float f3 = f2;
        AnonymousClass0JY r10 = r20;
        long j3 = j2;
        long j4 = j;
        C16370s9 r13 = r24;
        boolean z2 = z;
        C17090tj r12 = r23;
        C17130tn r6 = r22;
        r6.COB(-789752804);
        int i3 = i2;
        if ((i2 & 2) != 0) {
            r12 = C17090tj.A00;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            r13 = AnonymousClass0GC.A00;
        }
        if ((i2 & 16) != 0) {
            j4 = AnonymousClass000.A0V(((AnonymousClass0OR) r6.BFh(AnonymousClass0QB.A00)).A0O);
        }
        if ((i2 & 32) != 0) {
            j3 = AnonymousClass0QB.A04(r6, j4);
        }
        if ((i2 & 64) != 0) {
            f = 0.0f;
        }
        if ((i3 & 128) != 0) {
            f3 = 0.0f;
        }
        if ((i3 & 256) != 0) {
            r10 = null;
        }
        if ((i3 & 512) != 0) {
            Object A03 = AnonymousClass002.A03(r6);
            AnonymousClass0VR.A0U(r6);
            r11 = (C17210uI) A03;
        }
        AnonymousClass07W r7 = A00;
        float A02 = ((DSH) r6.BFh(r7)).A02() + f;
        C03230Hd[] r5 = new C03230Hd[2];
        AnonymousClass07W.A00(AnonymousClass0G4.A00, new C05100Qk(j3), r5, 0);
        r5[1] = r7.A03(DSH.A00(A02));
        AnonymousClass0PZ.A04(r6, AnonymousClass0LC.A00(r6, new C13830o2(r10, r11, r12, r13, r25, r26, A02, f3, i, j4, z2), 1279702876), r5, 56);
        AnonymousClass0VR.A0U(r6);
    }
}
