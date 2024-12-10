package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9my  reason: invalid class name and case insensitive filesystem */
public final class C191669my {
    public long A00;
    public final AnonymousClass1CJ A01;
    public final C18030ve A02;
    public final C193919qs A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05 = C217517g.A00(16487);
    public final List A06 = AnonymousClass000.A13();
    public final AnonymousClass11P A07;

    public C191669my(AnonymousClass11P r2, AnonymousClass1CJ r3, C18030ve r4, C193919qs r5, AnonymousClass00H r6) {
        C18070vi.A0w(r2, r4, r3, r5, r6);
        this.A07 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
    }

    public final List A00(List list) {
        ArrayList A0s = C72463Mc.A0s(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29691ci A0A = this.A01.A0A(((C29691ci) it.next()).A08());
            if ((A0A instanceof C46162Dk) && A0A != null) {
                A0s.add(A0A);
            }
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : A0s) {
            if (AnonymousClass000.A1Z(((C46162Dk) next).A02, C179509Ig.GUEST)) {
                A13.add(next);
            }
        }
        A13.size();
        return A13;
    }
}
