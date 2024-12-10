package X;

import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: X.6wl  reason: invalid class name and case insensitive filesystem */
public final class C138246wl {
    public final SparseArray A00 = new SparseArray();
    public final SparseArray A01 = new SparseArray();
    public final C181089Pc A02;
    public final C181099Pd A03;

    public static final C1404171i A00(C138246wl r5, DOZ doz, int i) {
        String valueOf = String.valueOf(i);
        C1404171i r0 = C1404171i.A06;
        C129566i0 r4 = new C129566i0((Object) null, (Object) null, valueOf);
        WeakReference A0z = AnonymousClass3MW.A0z(doz);
        Map map = (Map) doz.A01.get(2131428252);
        if (map == null) {
            map = C17880vN.A11();
        }
        AnonymousClass7BX r1 = new AnonymousClass7BX(new C126866dQ(r5, i), new C125556bG(map), A0z);
        List list = r4.A01;
        if (list == null) {
            list = AnonymousClass000.A13();
            r4.A01 = list;
        }
        list.add(r1);
        return new C1404171i(r4);
    }

    public C138246wl(C181089Pc r2, C181099Pd r3) {
        this.A03 = r3;
        this.A02 = r2;
    }
}
