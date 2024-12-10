package X;

import android.util.SparseIntArray;

/* renamed from: X.2kX  reason: invalid class name and case insensitive filesystem */
public abstract class C58342kX {
    public final SparseIntArray A00 = new SparseIntArray();
    public final SparseIntArray A01 = new SparseIntArray();

    public int A00(int i) {
        if (!(this instanceof AnonymousClass28B)) {
            return 1;
        }
        AnonymousClass28B r1 = (AnonymousClass28B) this;
        C112365lM r0 = r1.A01.A0N;
        if (r0 != null) {
            switch (r0.getItemViewType(i)) {
                case 42:
                case 43:
                case 44:
                    return 1;
            }
        }
        return r1.A00;
    }

    public int A01(int i, int i2) {
        if (this instanceof AnonymousClass28A) {
            return i % i2;
        }
        int A002 = A00(i);
        if (A002 != i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int A003 = A00(i4);
                i3 += A003;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = A003;
                }
            }
            if (A002 + i3 <= i2) {
                return i3;
            }
        }
        return 0;
    }
}
