package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0pQ  reason: invalid class name and case insensitive filesystem */
public final class C14690pQ extends AnonymousClass11G implements AnonymousClass1OS {
    public static final C14690pQ A00 = new C14690pQ();

    public C14690pQ() {
        super(2);
    }

    public static final List A00(List list, List list2) {
        if (list == null) {
            return list2;
        }
        ArrayList A0m = C29431cG.A0m(list);
        A0m.addAll(list2);
        return A0m;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return A00((List) obj, (List) obj2);
    }
}
