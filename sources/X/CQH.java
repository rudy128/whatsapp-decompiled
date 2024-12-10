package X;

import android.util.SparseArray;

public final class CQH {
    public final SparseArray A00;
    public final SparseArray A01;
    public final SparseArray A02;

    public CQH(CQH cqh) {
        int i;
        int i2;
        int i3 = 0;
        if (cqh != null) {
            i = cqh.A02.size();
        } else {
            i = 0;
        }
        this.A02 = new SparseArray(i);
        if (cqh != null) {
            i2 = cqh.A00.size();
        } else {
            i2 = 0;
        }
        this.A00 = new SparseArray(i2);
        this.A01 = new SparseArray(cqh != null ? cqh.A01.size() : i3);
    }
}
