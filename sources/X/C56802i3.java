package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2i3  reason: invalid class name and case insensitive filesystem */
public final class C56802i3 {
    public final AnonymousClass122 A00;

    public C56802i3(AnonymousClass122 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(AnonymousClass206 r15, String str, String str2) {
        AnonymousClass21K r0;
        C20285AEt BPK;
        if (r15 != null) {
            C20277AEk aEk = null;
            if (!(!(r15 instanceof AnonymousClass21K) || (r0 = (AnonymousClass21K) r15) == null || (BPK = r0.BPK()) == null)) {
                C20277AEk aEk2 = BPK.A06;
                if (aEk2 != null) {
                    ArrayList A0m = C29431cG.A0m(aEk2.A03);
                    Iterator it = A0m.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            AnonymousClass1ZU.A0B();
                            throw null;
                        }
                        C20271AEe aEe = ((C20253ADl) next).A01;
                        if (C18070vi.A18(aEe.A02, str)) {
                            A0m.set(i, new C20253ADl(new C20271AEe(str2, aEe.A00), false));
                        }
                        i = i2;
                    }
                    aEk = new C20277AEk((ADE) null, aEk2.A02, A0m, (List) null, 0);
                }
                BPK.A06 = aEk;
            }
            this.A00.CQw(r15);
        }
    }
}
