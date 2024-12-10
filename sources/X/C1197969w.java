package X;

import android.graphics.Point;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.69w  reason: invalid class name and case insensitive filesystem */
public final class C1197969w extends C121956Md {
    public final AnonymousClass1UD A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1197969w(android.content.Context r44, X.AnonymousClass1UD r45, X.AnonymousClass73D r46, X.AnonymousClass1BI r47, X.AnonymousClass8B4 r48, java.util.List r49, java.util.Map r50, boolean r51, boolean r52) {
        /*
            r43 = this;
            r2 = 1
            r7 = r44
            X.C18070vi.A0d(r7, r2)
            r3 = r45
            r1 = r47
            X.C18070vi.A0k(r3, r1)
            r0 = 9
            r4 = r50
            X.C18070vi.A0d(r4, r0)
            java.util.List r26 = X.C18070vi.A0M(r1)
            r11 = r46
            java.util.ArrayList r0 = r11.A04()
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.util.Iterator r5 = r0.iterator()
        L_0x0026:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r5.next()
            X.72S r0 = (X.AnonymousClass72S) r0
            java.io.File r0 = r0.A0C()
            if (r0 == 0) goto L_0x0026
            r1.add(r0)
            goto L_0x0026
        L_0x003c:
            java.util.HashSet r24 = X.C17880vN.A12()
            java.util.HashMap r29 = X.C17880vN.A11()
            r37 = 0
            java.lang.Integer r18 = java.lang.Integer.valueOf(r37)
            java.util.HashSet r0 = new java.util.HashSet
            r5 = r49
            r0.<init>(r5)
            java.lang.Long r19 = X.C17890vO.A0L()
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r37)
            r8 = 0
            r31 = 0
            r30 = 12
            r33 = -1
            r6 = r43
            r10 = r8
            r12 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r21 = r19
            r22 = r8
            r40 = r37
            r41 = r37
            r42 = r37
            r13 = r48
            r35 = r51
            r38 = r52
            r9 = r8
            r20 = r19
            r23 = r1
            r25 = r0
            r27 = r5
            r28 = r4
            r36 = r2
            r39 = r37
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r36, r37, r38, r39, r40, r41, r42)
            r6.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1197969w.<init>(android.content.Context, X.1UD, X.73D, X.1BI, X.8B4, java.util.List, java.util.Map, boolean, boolean):void");
    }

    public ArrayList A0J(Void... voidArr) {
        int i;
        C18070vi.A0d(voidArr, 0);
        int A002 = C18020vd.A00(C18040vf.A01, this.A00.A00, 9714);
        if (A002 > 0) {
            Iterator it = this.A0R.A04().iterator();
            while (it.hasNext()) {
                AnonymousClass72S r4 = (AnonymousClass72S) it.next();
                boolean z = true;
                r4.A0I();
                if (!(r4.A02() == 90 || r4.A02() == 270)) {
                    z = false;
                }
                File A09 = r4.A09();
                String str = null;
                if (A09 != null) {
                    str = A09.getAbsolutePath();
                }
                C134746r5 A0D = AnonymousClass204.A0D(str, z);
                if (A0D != null && ((i = A0D.A01) > A002 || A0D.A00 > A002)) {
                    int i2 = A0D.A00;
                    float max = ((float) A002) / ((float) Math.max(i, i2));
                    r4.A0K(new Point((int) (((float) i) * max), (int) (((float) i2) * max)));
                }
            }
        }
        return super.A0J((Void[]) Arrays.copyOf(voidArr, voidArr.length));
    }
}
