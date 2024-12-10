package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2Mc  reason: invalid class name and case insensitive filesystem */
public abstract class C48342Mc extends C48382Mg {
    public final HashSet A1E() {
        ArrayList A1C = A1C(2);
        ArrayList A0D = C29351c6.A0D(A1C);
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            C59632md r0 = (C59632md) it.next();
            GroupJid groupJid = r0.A02;
            String str = r0.A03;
            if (str == null) {
                str = "";
            }
            A0D.add(new A2B(groupJid, (Integer) null, (Integer) null, (Long) null, str, 2, 0));
        }
        return C29431cG.A0n(A0D);
    }

    public final void A1F(Set set) {
        ArrayList A0D = C29351c6.A0D(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A2B a2b = (A2B) it.next();
            A0D.add(new C59632md(a2b.A02, a2b.A06, a2b.A00, 0));
        }
        A1D(A0D);
    }
}
