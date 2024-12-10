package X;

import android.util.SparseArray;

/* renamed from: X.1rI  reason: invalid class name and case insensitive filesystem */
public class C38441rI {
    public int A00 = 0;
    public SparseArray A01 = new SparseArray();

    public void A01() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A01;
            if (i < sparseArray.size()) {
                ((C42001xS) sparseArray.valueAt(i)).A03.clear();
                i++;
            } else {
                return;
            }
        }
    }

    public static C42001xS A00(C38441rI r1, int i) {
        SparseArray sparseArray = r1.A01;
        C42001xS r0 = (C42001xS) sparseArray.get(i);
        if (r0 != null) {
            return r0;
        }
        C42001xS r02 = new C42001xS();
        sparseArray.put(i, r02);
        return r02;
    }
}
