package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Cnt  reason: case insensitive filesystem */
public abstract class C25882Cnt {
    public static int A00(E6I e6i, List list) {
        for (int i = 0; i < list.size(); i++) {
            DFL A0G = AnonymousClass8BR.A0G(list, i);
            if (A0G.A0C() != null && e6i.CP3(A0G)) {
                return i;
            }
        }
        return -1;
    }

    public static Pair A01(DFL dfl, E6I e6i) {
        Object obj;
        int i;
        int[] A00 = C25995CqB.A01().A00(dfl.A05);
        int length = A00.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                obj = Collections.EMPTY_LIST;
                i = -1;
                break;
            }
            int i3 = A00[i2];
            List A0F = dfl.A0F(i3);
            i = A00(e6i, A0F);
            if (i >= 0) {
                obj = C17880vN.A10(A0F);
                dfl.A0H(i3, obj);
                break;
            }
            i2++;
        }
        return C17890vO.A0E(obj, i);
    }

    public static ArrayList A02(DFL dfl, List list) {
        ArrayList A14 = AnonymousClass000.A14(list);
        for (int i = 0; i < list.size(); i++) {
            DFL A0G = AnonymousClass8BR.A0G(list, i);
            if (A0G != null) {
                if (A0G.A05 == 13346) {
                    List A0G2 = A0G.A0G(32);
                    for (int i2 = 0; i2 < A0G2.size(); i2++) {
                        DFL A0G3 = AnonymousClass8BR.A0G(A0G2, i2);
                        A14.add(CC3.A00(dfl.A01, new DNT(dfl.A02, A0G3), A0G3));
                    }
                } else {
                    A14.add(CC3.A00(dfl.A01, new DNT(dfl.A02, A0G), A0G));
                }
            }
        }
        return A14;
    }
}
