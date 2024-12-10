package X;

import android.graphics.Bitmap;

/* renamed from: X.0Pb  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C04820Pb {
    public static /* synthetic */ void A00(C03380Hv r6, C17040te r7, C17770vC r8, C02000Cg r9, float f, int i) {
        C02000Cg r3 = r9;
        float f2 = f;
        int i2 = 0;
        if ((i & 4) != 0) {
            f2 = 1.0f;
        }
        if ((i & 8) != 0) {
            r3 = C016909m.A00;
        }
        if ((i & 32) != 0) {
            i2 = 3;
        }
        r8.BJe(r6, r7, r3, f2, i2);
    }

    public static /* synthetic */ void A04(C17770vC r11, C02000Cg r12, float f, int i, long j, long j2) {
        C02000Cg r3 = r12;
        long j3 = j2;
        float f2 = f;
        C17770vC r2 = r11;
        if ((i & 2) != 0) {
            f2 = AnonymousClass0QG.A01(r11.BZL()) / 2.0f;
        }
        if ((i & 4) != 0) {
            j3 = r11.BOQ();
        }
        float f3 = 0.0f;
        if ((i & 8) != 0) {
            f3 = 1.0f;
        }
        if ((i & 16) != 0) {
            r3 = C016909m.A00;
        }
        int i2 = 0;
        if ((i & 64) != 0) {
            i2 = 3;
        }
        r2.BJQ(r3, f2, f3, i2, j, j3);
    }

    public static /* synthetic */ void A01(AnonymousClass0HD r6, C16980tX r7, C17770vC r8) {
        AnonymousClass0HD r1 = r6;
        C16980tX r2 = r7;
        C17770vC r0 = r8;
        r0.BJW(r1, r2, C016909m.A00, AnonymousClass0QY.A03);
    }

    public static /* synthetic */ void A02(AnonymousClass0HD r16, C16980tX r17, C17770vC r18, float f, int i, int i2, long j, long j2, long j3) {
        long j4;
        int i3 = i;
        AnonymousClass0HD r3 = r16;
        float f2 = f;
        long j5 = j3;
        long j6 = j2;
        long j7 = j;
        C016909m r5 = null;
        int i4 = i2;
        if ((i2 & 2) != 0) {
            j7 = C79.A00();
        }
        C16980tX r4 = r17;
        if ((i2 & 4) != 0) {
            Bitmap bitmap = ((AnonymousClass0WQ) r4).A00;
            j6 = C25293Ccv.A00(bitmap.getWidth(), bitmap.getHeight());
        }
        if ((i2 & 8) != 0) {
            j4 = C79.A00();
        } else {
            j4 = 0;
        }
        if ((i2 & 16) != 0) {
            j5 = j6;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 64) != 0) {
            r5 = C016909m.A00;
        }
        if ((i4 & 128) != 0) {
            r3 = null;
        }
        int i5 = 0;
        if ((i4 & 256) != 0) {
            i5 = 3;
        }
        if ((i4 & 512) != 0) {
            i3 = 1;
        }
        r18.BJU(r3, r4, r5, f2, i5, i3, j7, j6, j4, j5);
    }

    public static /* synthetic */ void A03(C17770vC r12, int i, long j, long j2, long j3) {
        long j4 = j3;
        long j5 = j2;
        C016909m r3 = null;
        if ((i & 2) != 0) {
            j5 = AnonymousClass0QY.A03;
        }
        C17770vC r2 = r12;
        if ((i & 4) != 0) {
            j4 = AnonymousClass0LH.A01(r12.BZL(), j5);
        }
        float f = 0.0f;
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        if ((i & 16) != 0) {
            r3 = C016909m.A00;
        }
        int i2 = 0;
        if ((i & 64) != 0) {
            i2 = 3;
        }
        r2.BJi(r3, f, i2, j, j5, j4);
    }
}
