package X;

import android.view.View;

/* renamed from: X.1r3  reason: invalid class name and case insensitive filesystem */
public class C38291r3 {
    public C38301r4 A00 = new C38301r4();
    public final C38281r2 A01;

    public View A00(int i, int i2, int i3, int i4) {
        int A0M;
        int i5;
        int A0N;
        C38281r2 r7 = this.A01;
        C65102vq r1 = (C65102vq) r7;
        int i6 = r1.A00;
        C38251qy r6 = (C38251qy) r1.A01;
        if (i6 != 0) {
            A0M = r6.A0O();
        } else {
            A0M = r6.A0M();
        }
        if (i6 != 0) {
            i5 = r6.A00;
            A0N = r6.A0L();
        } else {
            i5 = r6.A03;
            A0N = r6.A0N();
        }
        int i7 = i5 - A0N;
        int i8 = -1;
        if (i2 > i) {
            i8 = 1;
        }
        View view = null;
        while (i != i2) {
            View A0P = r6.A0P(i);
            int BOh = r7.BOh(A0P);
            int BOb = r7.BOb(A0P);
            C38301r4 r2 = this.A00;
            r2.A04 = A0M;
            r2.A03 = i7;
            r2.A02 = BOh;
            r2.A01 = BOb;
            r2.A00 = 0;
            r2.A00 = i3;
            if (r2.A00()) {
                return A0P;
            }
            if (i4 != 0) {
                r2.A00 = 0;
                r2.A00 = i4;
                if (r2.A00()) {
                    view = A0P;
                }
            }
            i += i8;
        }
        return view;
    }

    public boolean A01(View view) {
        int A0M;
        int i;
        int A0N;
        C38301r4 r5 = this.A00;
        C38281r2 r4 = this.A01;
        C65102vq r0 = (C65102vq) r4;
        int i2 = r0.A00;
        C38251qy r02 = (C38251qy) r0.A01;
        if (i2 != 0) {
            A0M = r02.A0O();
        } else {
            A0M = r02.A0M();
        }
        if (i2 != 0) {
            i = r02.A00;
            A0N = r02.A0L();
        } else {
            i = r02.A03;
            A0N = r02.A0N();
        }
        int i3 = i - A0N;
        int BOh = r4.BOh(view);
        int BOb = r4.BOb(view);
        r5.A04 = A0M;
        r5.A03 = i3;
        r5.A02 = BOh;
        r5.A01 = BOb;
        r5.A00 = 0;
        r5.A00 = 24579;
        return r5.A00();
    }

    public C38291r3(C38281r2 r2) {
        this.A01 = r2;
    }
}
