package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.3UB  reason: invalid class name */
public final class AnonymousClass3UB extends AnonymousClass1J2 {
    public int A00 = -1;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final C41111vp A02 = AnonymousClass3MW.A0n(C18460wS.A00);
    public final C41731wy A03 = AnonymousClass3MW.A0o();

    public final void A0T(C107265Za r10, C87564Wb r11, Collection collection) {
        int i;
        C18070vi.A0j(r10, r11);
        C18100vl r5 = r11.A00;
        Set keySet = AnonymousClass3MW.A12(r5).keySet();
        C18070vi.A0d(keySet, 0);
        List A002 = C98974s1.A00(keySet, new AnonymousClass5W7((C95134lk) r10), 9);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            C108445bi r0 = (C108445bi) AnonymousClass000.A0w(AnonymousClass3MW.A12(r5), C72453Mb.A0H(it));
            if (r0 != null) {
                A13.add(r0);
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        for (Object next : A13) {
            if (((C108445bi) next).CMC(collection)) {
                A132.add(next);
            }
        }
        C41111vp r6 = this.A02;
        ArrayList A133 = AnonymousClass000.A13();
        AnonymousClass4Q9 r7 = null;
        for (C108445bi r4 : C98974s1.A00(A132, r10, 11)) {
            boolean z = false;
            if (r7 != null) {
                i = r7.A00.size();
            } else {
                i = 0;
            }
            if (A133.size() == 1 && i > 0 && r10.BXA(r4.getId()) == AnonymousClass00R.A0C) {
                z = true;
            }
            if (r7 == null || i == 7 || z) {
                r7 = new AnonymousClass4Q9(this);
                A133.add(r7);
            }
            C18070vi.A0d(r4, 0);
            boolean A003 = r7.A00();
            LinkedList linkedList = r7.A00;
            int size = linkedList.size();
            if (A003) {
                size = Math.max(0, size - 1);
            }
            linkedList.add(size, r4);
        }
        if (!A133.isEmpty() && A133.size() <= 2) {
            AnonymousClass4Q9 r72 = (AnonymousClass4Q9) C29431cG.A0b(A133);
            if (A133.size() == 1) {
                if (r72.A00() && r72.A00()) {
                    r72.A00.removeLast();
                }
            } else if (A133.size() == 2) {
                AnonymousClass4Q9 r1 = (AnonymousClass4Q9) A133.get(1);
                if (r1.A00()) {
                    LinkedList linkedList2 = r1.A00;
                    if (linkedList2.size() <= 2 && !(C29431cG.A0b(linkedList2) instanceof C95004lX)) {
                        if (r72.A00()) {
                            r72.A00.removeLast();
                        }
                        Object A0b = C29431cG.A0b(linkedList2);
                        C18070vi.A0d(A0b, 0);
                        boolean A004 = r72.A00();
                        LinkedList linkedList3 = r72.A00;
                        int size2 = linkedList3.size();
                        if (A004) {
                            size2 = Math.max(0, size2 - 1);
                        }
                        linkedList3.add(size2, A0b);
                        C50582Uz.A00(A133);
                    }
                }
            }
        }
        r6.A0F(A133);
        this.A00 = 0;
        this.A01.A0F(AnonymousClass3MW.A10(r6).get(0));
    }
}
