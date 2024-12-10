package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.9zr  reason: invalid class name and case insensitive filesystem */
public final class C199359zr {
    public final C18000vb A00;
    public final LinkedList A01 = AnonymousClass8BR.A14();
    public final LinkedList A02 = AnonymousClass8BR.A14();
    public final LinkedList A03 = AnonymousClass8BR.A14();

    public C199359zr(C18000vb r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A01(C188619hi r6) {
        List list = r6.A09;
        C18070vi.A0W(list);
        A00(this.A01, list);
        List list2 = r6.A0C;
        C18070vi.A0W(list2);
        A00(this.A03, list2);
        List list3 = r6.A0A;
        C18070vi.A0W(list3);
        for (Object next : list3) {
            LinkedList linkedList = this.A02;
            if (!linkedList.contains(next)) {
                if (linkedList.size() >= 100) {
                    linkedList.removeLast();
                }
                linkedList.addFirst(next);
            }
        }
    }

    public static final void A00(LinkedList linkedList, List list) {
        for (Object next : list) {
            if (linkedList.contains(next)) {
                linkedList.remove(next);
            }
            if (linkedList.size() >= 100) {
                linkedList.removeLast();
            }
            linkedList.addFirst(next);
        }
    }
}
