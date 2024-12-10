package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2s4  reason: invalid class name and case insensitive filesystem */
public abstract class C62832s4 {
    public static final boolean A00(Jid jid) {
        C18070vi.A0d(jid, 0);
        if ((jid instanceof C47722Jp) || (jid instanceof C47732Jq)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(Jid jid) {
        C18070vi.A0d(jid, 0);
        if ((jid instanceof C29671cg) || (jid instanceof GroupJid) || (jid instanceof C47712Jo) || (jid instanceof C173408v1)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(Collection collection) {
        C18070vi.A0d(collection, 0);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Jid A0S = C17880vN.A0S(it);
            C18070vi.A0d(A0S, 0);
            if (A00(A0S)) {
                return true;
            }
        }
        return false;
    }
}
