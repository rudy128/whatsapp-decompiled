package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: X.4ZT  reason: invalid class name */
public final class AnonymousClass4ZT {
    public final C41111vp A00 = AnonymousClass3MW.A0n(AnonymousClass000.A0h());
    public final HashMap A01 = C17880vN.A11();
    public final PriorityQueue A02 = new PriorityQueue(AnonymousClass4DV.A00.size(), new C98974s1((Object) new AnonymousClass5W8(this), 10));
    public final C87444Vp A03;

    public final void A02(AnonymousClass4DV r4, boolean z) {
        C108455bj r0;
        C18070vi.A0d(r4, 0);
        C108455bj r2 = (C108455bj) this.A01.get(r4);
        if (r2 != null) {
            PriorityQueue priorityQueue = this.A02;
            if (r2.equals(C72473Md.A0i(priorityQueue))) {
                do {
                    priorityQueue.poll();
                    r0 = (C108455bj) C72473Md.A0i(priorityQueue);
                    if (r0 == null || r0.BEB()) {
                        C108455bj r02 = (C108455bj) C72473Md.A0i(priorityQueue);
                    }
                    priorityQueue.poll();
                    r0 = (C108455bj) C72473Md.A0i(priorityQueue);
                    break;
                } while (r0.BEB());
                C108455bj r022 = (C108455bj) C72473Md.A0i(priorityQueue);
                if (r022 != null) {
                    r022.BJu();
                    r022.CMX();
                }
                A00((C108455bj) C72473Md.A0i(priorityQueue), r2, this, C100975Al.A00);
                r2.Bcx(z);
                r2.BJu();
            } else if (priorityQueue.remove(r2)) {
                r2.Bcx(z);
            }
        }
    }

    public static final void A00(C108455bj r5, C108455bj r6, AnonymousClass4ZT r7, C22821Di r8) {
        Collection values = r7.A01.values();
        C18070vi.A0X(values);
        ArrayList<Object> A13 = AnonymousClass000.A13();
        for (Object next : values) {
            C108455bj r1 = (C108455bj) next;
            if (!r7.A02.contains(r1)) {
                if (r5 != null) {
                    C18070vi.A0b(r1);
                    if (C87444Vp.A00(r1, r5) <= 0) {
                    }
                }
                C18070vi.A0b(r1);
                if (C87444Vp.A00(r1, r6) < 0) {
                    A13.add(next);
                }
            }
        }
        for (Object invoke : A13) {
            r8.invoke(invoke);
        }
    }

    public static boolean A01(AnonymousClass4aY r0) {
        return !((AnonymousClass4ZT) r0.A5p.get()).A02.isEmpty();
    }

    public AnonymousClass4ZT(C87444Vp r5) {
        this.A03 = r5;
    }
}
