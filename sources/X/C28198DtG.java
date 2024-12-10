package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DtG  reason: case insensitive filesystem */
public final class C28198DtG extends AnonymousClass11G implements AnonymousClass1OS {
    public static final C28198DtG A00 = new C28198DtG();

    public C28198DtG() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C15760rA r6 = (C15760rA) obj;
        List list = (List) obj2;
        ArrayList A14 = AnonymousClass000.A14(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A14.add(C25471CgQ.A00(C25471CgQ.A02, r6, list.get(i)));
        }
        return A14;
    }
}
