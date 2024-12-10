package X;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* renamed from: X.5et  reason: invalid class name and case insensitive filesystem */
public class C110075et extends TranslateAnimation {
    public final int A00;
    public final Object A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110075et(X.AnonymousClass75M r10, int r11) {
        /*
            r9 = this;
            r0 = r9
            r9.A00 = r11
            r1 = 1
            r2 = 0
            int r11 = 2 - r11
            if (r11 == 0) goto L_0x0016
            r6 = 1065353216(0x3f800000, float:1.0)
            r9.A01 = r10
            r8 = 0
        L_0x000e:
            r5 = r1
            r7 = r1
            r3 = r1
            r4 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0016:
            r8 = 1065353216(0x3f800000, float:1.0)
            r9.A01 = r10
            r6 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110075et.<init>(X.75M, int):void");
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        super.applyTransformation(f, transformation);
        switch (i) {
            case 0:
                C132406mj r1 = (C132406mj) this.A01;
                r1.A00(C108945cZ.A04(r1.A01) * f);
                return;
            case 1:
                C132406mj r2 = (C132406mj) this.A01;
                r2.A00(C108945cZ.A04(r2.A01) * (1.0f - f));
                return;
            case 2:
                AnonymousClass75M r22 = (AnonymousClass75M) this.A01;
                AnonymousClass75M.A0C(r22, (int) (C108945cZ.A04(r22.A0D) * (1.0f - f)));
                return;
            default:
                AnonymousClass75M r12 = (AnonymousClass75M) this.A01;
                AnonymousClass75M.A0C(r12, (int) (C108945cZ.A04(r12.A0D) * f));
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110075et(X.C132406mj r10, int r11) {
        /*
            r9 = this;
            r0 = r9
            r9.A00 = r11
            r1 = 1
            r2 = 0
            if (r11 == 0) goto L_0x0014
            r8 = 1065353216(0x3f800000, float:1.0)
            r9.A01 = r10
            r6 = 0
        L_0x000c:
            r5 = r1
            r7 = r1
            r3 = r1
            r4 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0014:
            r6 = 1065353216(0x3f800000, float:1.0)
            r9.A01 = r10
            r8 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110075et.<init>(X.6mj, int):void");
    }
}
