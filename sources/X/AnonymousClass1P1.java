package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1P1  reason: invalid class name */
public final class AnonymousClass1P1 {
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    public AnonymousClass1P1(C18030ve r2, AnonymousClass00H r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public static final C60002nE A00(C60002nE r2, C49352Qd r3, C49352Qd r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        if (r2.A01 == 1 && r4 == C49352Qd.ENABLED && r3 == C49352Qd.DISABLED) {
            return new AnonymousClass2DV(r2);
        }
        return r2;
    }

    public final C60002nE A01(C60002nE r6) {
        C49352Qd r0;
        C49352Qd r1;
        C18070vi.A0d(r6, 0);
        C18030ve r4 = this.A00;
        AnonymousClass00H r3 = this.A01;
        Object obj = r3.get();
        C18070vi.A0X(obj);
        C63182se r02 = (C63182se) obj;
        C18070vi.A0h(r4, r02);
        if (!r02.A02()) {
            r0 = C49352Qd.DISABLED;
        } else {
            r0 = (C49352Qd) C49352Qd.A00.get(C18020vd.A00(C18040vf.A02, r4, 7820));
        }
        Object obj2 = r3.get();
        C18070vi.A0X(obj2);
        C63182se r12 = (C63182se) obj2;
        C18070vi.A0h(r4, r12);
        if (!r12.A02()) {
            r1 = C49352Qd.DISABLED;
        } else {
            r1 = (C49352Qd) C49352Qd.A00.get(C18020vd.A00(C18040vf.A02, r4, 7821));
        }
        return A00(r6, r0, r1);
    }

    public final List A02(List list) {
        C18070vi.A0d(list, 0);
        ArrayList arrayList = new ArrayList(C29351c6.A0C(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A01((C60002nE) it.next()));
        }
        return arrayList;
    }
}
