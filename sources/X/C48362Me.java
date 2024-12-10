package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2Me  reason: invalid class name and case insensitive filesystem */
public abstract class C48362Me extends C48382Mg {
    public final List A1E(int i) {
        List list = this.A00;
        C18070vi.A0X(list);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (((C59632md) next).A00 == 2) {
                A13.add(next);
            }
        }
        List<C59632md> A0v = C29431cG.A0v(C29431cG.A0y(A13, new C21486Akr(46)), i);
        ArrayList A0D = C29351c6.A0D(A0v);
        for (C59632md r0 : A0v) {
            GroupJid groupJid = r0.A02;
            String str = r0.A03;
            if (str == null) {
                str = "";
            }
            A0D.add(new A2B(groupJid, (Integer) null, (Integer) null, (Long) null, str, 2, 0));
        }
        return A0D;
    }

    public final void A1F(GroupJid groupJid) {
        if (groupJid != null) {
            this.A00.add(new C59632md(groupJid, (String) null, 1, 0));
        }
    }

    public final void A1G(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A2B a2b = (A2B) it.next();
            this.A00.add(new C59632md(a2b.A02, a2b.A06, 2, 0));
        }
    }
}
