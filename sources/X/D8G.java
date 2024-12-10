package X;

import android.view.View;

public final class D8G implements E7K {
    public static final D8G A00 = new Object();

    public C16930tS BhM(AnonymousClass0IV r13, C05050Qf r14, DFL dfl, DFL dfl2, int i, int i2) {
        C04220Mi r2;
        int i3;
        DFL A0O;
        DFL dfl3 = dfl2;
        C18070vi.A0d(dfl3, 5);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        DFL A09 = dfl3.A09(36);
        C04240Mk r5 = null;
        AnonymousClass0IV r6 = r13;
        int i4 = i;
        if (A09 == null || (A0O = BE7.A0O(A09)) == null) {
            r2 = null;
        } else {
            C16930tS BDo = A0O.BDo(r13, i4, makeMeasureSpec);
            C18070vi.A0X(BDo);
            r2 = AnonymousClass0OS.A00(r6, BDo, A0O, (Object) null, C02740Fe.A00(i4, makeMeasureSpec));
        }
        int size = View.MeasureSpec.getSize(i2);
        if (r2 != null) {
            i3 = BE8.A0A(r2.A01);
        } else {
            i3 = 0;
        }
        C16930tS BDo2 = dfl.BDo(r13, i4, View.MeasureSpec.makeMeasureSpec(size - i3, Integer.MIN_VALUE));
        C18070vi.A0X(BDo2);
        int size2 = View.MeasureSpec.getSize(i4);
        int height = BDo2.getHeight() + i3;
        if (r2 != null) {
            r5 = r2.A01;
        }
        return new DFK(BDo2, r14, r5, size2, height, 0, i3);
    }

    public boolean CMU(DFL dfl, DFL dfl2, Object obj, Object obj2) {
        C24724CHl.A01.get();
        if (!C25337Cdw.A00(dfl.A09(35), dfl2.A09(35)) || obj != obj2) {
            return true;
        }
        return false;
    }
}
