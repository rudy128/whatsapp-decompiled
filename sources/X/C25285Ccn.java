package X;

import java.util.List;

/* renamed from: X.Ccn  reason: case insensitive filesystem */
public abstract class C25285Ccn {
    public static final int A00(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C25227CbO A0S = BE6.A0S(list, i3);
            if (A0S.A05 > i) {
                size = i3 - 1;
            } else if (A0S.A04 > i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void A01(List list, C22821Di r6, long j) {
        int A00 = A00(list, C26260Cw5.A02(j));
        int size = list.size();
        while (A00 < size) {
            C25227CbO A0S = BE6.A0S(list, A00);
            if (A0S.A05 < C26260Cw5.A01(j)) {
                if (A0S.A05 != A0S.A04) {
                    r6.invoke(A0S);
                }
                A00++;
            } else {
                return;
            }
        }
    }
}
