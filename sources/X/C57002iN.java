package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2iN  reason: invalid class name and case insensitive filesystem */
public final class C57002iN {
    public final C25161Nd A00;

    public C57002iN(C25161Nd r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final Set A00(Integer num) {
        ArrayList A13;
        C25161Nd r1 = this.A00;
        AnonymousClass1CJ.A01(r1.A02);
        C25171Ne r4 = r1.A01;
        synchronized (r4) {
            A13 = AnonymousClass000.A13();
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI r12 = ((C36311ng) it.next()).A01;
                if (C22971Dz.A0d(r12)) {
                    A13.add((UserJid) r12);
                }
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it2 = A13.iterator();
        while (it2.hasNext()) {
            String rawString = C17880vN.A0S(it2).getRawString();
            if (rawString != null) {
                A132.add(rawString);
            }
        }
        ArrayList A133 = AnonymousClass000.A13();
        for (Object next : A132) {
            if (((String) next).length() > 0) {
                A133.add(next);
            }
        }
        if (num != null) {
            return C29431cG.A12(C29431cG.A0v(A133, num.intValue()));
        }
        return C29431cG.A12(A133);
    }
}
