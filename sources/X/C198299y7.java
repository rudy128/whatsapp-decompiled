package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9y7  reason: invalid class name and case insensitive filesystem */
public final class C198299y7 {
    public final AnonymousClass1KB A00;
    public final A08 A01;
    public final C18000vb A02;
    public final AnonymousClass10I A03;

    public static final boolean A00(C22424B7g b7g, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C22424B7g b7g2 = (C22424B7g) it.next();
                if ((b7g2 instanceof C20290AEy) && (b7g instanceof C20290AEy) && C18070vi.A18(((C20290AEy) b7g2).A02, ((C20290AEy) b7g).A02)) {
                    return true;
                }
                if ((b7g2 instanceof C20288AEw) && (b7g instanceof C20288AEw) && C18070vi.A18(((C20288AEw) b7g2).A01, ((C20288AEw) b7g).A01)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C198299y7(AnonymousClass1KB r1, A08 a08, C18000vb r3, AnonymousClass10I r4) {
        C18070vi.A0s(r1, r4, r3, a08);
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = a08;
    }
}
