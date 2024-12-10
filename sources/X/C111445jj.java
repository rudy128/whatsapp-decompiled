package X;

import android.util.SparseIntArray;

/* renamed from: X.5jj  reason: invalid class name and case insensitive filesystem */
public class C111445jj extends C24490C6i {
    public final C147387Sy A00;
    public final C147387Sy A01;
    public final String A02;
    public final String A03;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        Object obj;
        Object obj2;
        C39611tM r4 = (C39611tM) this.A01.get(i);
        C39611tM r3 = (C39611tM) this.A00.get(i2);
        int i3 = r3.A00;
        if (i3 == 1 || i3 == 12 || i3 == 4 || i3 == 6 || i3 == 3 || i3 == 2 || i3 == 38 || C39611tM.A00(i3)) {
            int i4 = r4.A00;
            if (C39611tM.A00(i4) || C39611tM.A00(i3)) {
                obj = Integer.valueOf(i4);
                obj2 = Integer.valueOf(i3);
            } else if (i4 == 4 && i3 == 4) {
                SparseIntArray sparseIntArray = (SparseIntArray) r4.A01;
                SparseIntArray sparseIntArray2 = (SparseIntArray) r3.A01;
                if (sparseIntArray.size() != sparseIntArray2.size()) {
                    return false;
                }
                for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                    if (sparseIntArray.keyAt(i5) != sparseIntArray2.keyAt(i5) || sparseIntArray.valueAt(i5) != sparseIntArray2.valueAt(i5)) {
                        return false;
                    }
                }
                return true;
            } else {
                obj = r4.A01;
                obj2 = r3.A01;
            }
            return C42171xk.A00(obj, obj2);
        } else if (!C42171xk.A00(Integer.valueOf(r4.A00), Integer.valueOf(i3)) || !C42171xk.A00(this.A03, this.A02)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean A04(int i, int i2) {
        Object obj;
        Object obj2;
        C39611tM r5 = (C39611tM) this.A01.get(i);
        C39611tM r4 = (C39611tM) this.A00.get(i2);
        int i3 = r5.A00;
        if (!C39611tM.A00(i3)) {
            int i4 = r4.A00;
            if (!C39611tM.A00(i4)) {
                if (i3 == 4) {
                    return AnonymousClass000.A1T(i4, 4);
                }
                if (!this.A03.equals(this.A02)) {
                    obj = Integer.valueOf(i3);
                    obj2 = Integer.valueOf(i4);
                    return C42171xk.A00(obj, obj2);
                }
            }
        }
        obj = r5.A01;
        obj2 = r4.A01;
        return C42171xk.A00(obj, obj2);
    }

    public C111445jj(C147387Sy r1, C147387Sy r2, String str, String str2) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = str;
        this.A02 = str2;
    }
}
