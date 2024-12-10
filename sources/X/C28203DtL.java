package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DtL  reason: case insensitive filesystem */
public final class C28203DtL extends AnonymousClass11G implements AnonymousClass1OS {
    public static final C28203DtL A00 = new C28203DtL();

    public C28203DtL() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C15760rA r7 = (C15760rA) obj;
        List list = ((DUE) obj2).A01;
        ArrayList A14 = AnonymousClass000.A14(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A14.add(C25471CgQ.A00(C25471CgQ.A06, r7, list.get(i)));
        }
        return A14;
    }
}
