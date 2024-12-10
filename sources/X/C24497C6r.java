package X;

import java.util.List;

/* renamed from: X.C6r  reason: case insensitive filesystem */
public abstract class C24497C6r {
    public static /* synthetic */ C26594D5i A00(C26251Cvq cvq, E3V e3v, C28644ECa eCa, String str, List list, int i, int i2, long j) {
        int i3 = i;
        List list2 = list;
        C18460wS r6 = null;
        if ((i2 & 32) != 0) {
            list2 = C18460wS.A00;
        }
        if ((i2 & 64) != 0) {
            r6 = C18460wS.A00;
        }
        if ((i2 & 128) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new C26594D5i(new C26596D5k(cvq, e3v, eCa, str, list2, r6), i3, j, false);
    }
}
