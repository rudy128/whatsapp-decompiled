package X;

import java.util.List;

/* renamed from: X.DrF  reason: case insensitive filesystem */
public final class C28096DrF extends AnonymousClass11G implements C22821Di {
    public static final C28096DrF A00 = new C28096DrF();

    public C28096DrF() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list;
        List list2;
        String str;
        List A13 = BE6.A13(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object obj2 = A13.get(1);
        C16680sp r7 = C25471CgQ.A01;
        List list3 = null;
        if (C18070vi.A18(obj2, false) || obj2 == null) {
            list = null;
        } else {
            list = (List) r7.CFy(obj2);
        }
        Object obj3 = A13.get(2);
        if (C18070vi.A18(obj3, false) || obj3 == null) {
            list2 = null;
        } else {
            list2 = (List) r7.CFy(obj3);
        }
        Object obj4 = A13.get(0);
        if (obj4 != null) {
            str = (String) obj4;
        } else {
            str = null;
        }
        C18070vi.A0b(str);
        if (list == null) {
            list = null;
        } else if (list.isEmpty()) {
            list = null;
        }
        if (list2 == null) {
            list2 = null;
        } else if (list2.isEmpty()) {
            list2 = null;
        }
        Object obj5 = A13.get(3);
        if (!C18070vi.A18(obj5, false) && obj5 != null) {
            list3 = (List) r7.CFy(obj5);
        }
        return new C27069DRu(str, list, list2, list3);
    }
}
