package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6vx  reason: invalid class name and case insensitive filesystem */
public abstract class C137746vx {
    public static final List A00;
    public static final List A01;

    public static final ArrayList A00(String str) {
        C18070vi.A0d(str, 0);
        ArrayList A012 = AnonymousClass73K.A01(str);
        ArrayList A13 = AnonymousClass000.A13();
        int size = A012.size();
        List list = A01;
        int size2 = list.size();
        if (size > size2) {
            size = size2;
        }
        for (int i = 0; i < size; i++) {
            A13.add(new C128446g0(AnonymousClass3MY.A03((Number) ((Pair) list.get(i)).first), AnonymousClass3MY.A03((Number) ((Pair) list.get(i)).second), AnonymousClass000.A0M(A012.get(i))));
        }
        return A13;
    }

    static {
        Pair[] pairArr = new Pair[8];
        pairArr[0] = C17890vO.A0E(2131432960, 2131432969);
        pairArr[1] = C17890vO.A0E(2131432964, 2131432973);
        pairArr[2] = C17890vO.A0E(2131432963, 2131432972);
        pairArr[3] = C17890vO.A0E(2131432959, 2131432967);
        pairArr[4] = C17890vO.A0E(2131432958, 2131432966);
        pairArr[5] = C17890vO.A0E(2131432962, 2131432971);
        pairArr[6] = C17890vO.A0E(2131432961, 2131432970);
        A01 = C18070vi.A0O(C17890vO.A0E(2131432957, 2131432965), pairArr, 7);
        Pair[] pairArr2 = new Pair[6];
        pairArr2[0] = C17890vO.A0E(2131427971, 0);
        pairArr2[1] = C17890vO.A0E(2131428008, 1);
        pairArr2[2] = C17890vO.A0E(2131428006, 2);
        pairArr2[3] = C17890vO.A0E(2131427956, 3);
        pairArr2[4] = C17890vO.A0E(2131427955, 4);
        A00 = C18070vi.A0O(C17890vO.A0E(2131427996, 5), pairArr2, 5);
    }
}
